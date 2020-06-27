package cxc.tinyioc.beans.factory;

import cxc.tinyioc.aop.BeanFactoryAware;
import cxc.tinyioc.beans.BeanDefinition;
import cxc.tinyioc.beans.BeanReference;
import cxc.tinyioc.beans.PropertyValue;

import java.lang.reflect.Field;
import java.lang.reflect.Method;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory {
    @Override
    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        if (bean instanceof BeanFactoryAware) {
            ((BeanFactoryAware) bean).setBeanFactory(this);
        }
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            try {
                Method declaredMethod = bean.getClass().getDeclaredMethod("set"
                                + propertyValue.getName().substring(0, 1).toUpperCase()
                                + propertyValue.getName().substring(1)
                        , value.getClass());
                declaredMethod.setAccessible(true);
                declaredMethod.invoke(bean, value);
            } catch (NoSuchMethodException e) {
                Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
                declaredField.setAccessible(true);
                declaredField.set(bean, value);
            }
        }
    }
}
