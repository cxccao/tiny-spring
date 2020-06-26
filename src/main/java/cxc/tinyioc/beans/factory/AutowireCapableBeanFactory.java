package cxc.tinyioc.beans.factory;

import cxc.tinyioc.beans.BeanDefinition;
import cxc.tinyioc.beans.BeanReference;
import cxc.tinyioc.beans.PropertyValue;

import java.lang.reflect.Field;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public class AutowireCapableBeanFactory extends AbstractBeanFactory{
    @Override
    protected void applyPropertyValues(Object bean, BeanDefinition beanDefinition) throws Exception {
        for (PropertyValue propertyValue : beanDefinition.getPropertyValues().getPropertyValueList()) {
            Field declaredField = bean.getClass().getDeclaredField(propertyValue.getName());
            declaredField.setAccessible(true);
            Object value = propertyValue.getValue();
            if (value instanceof BeanReference) {
                BeanReference beanReference = (BeanReference) value;
                value = getBean(beanReference.getName());
            }
            declaredField.set(bean, value);
        }
    }
}
