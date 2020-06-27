package cxc.tinyioc.context;

import cxc.tinyioc.beans.BeanPostProcessor;
import cxc.tinyioc.beans.factory.AbstractBeanFactory;

import java.util.List;

/**
 * Created by cxc Cotter on 2020/6/21.
 */
public abstract class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory beanFactory;

    public AbstractApplicationContext(AbstractBeanFactory abstractBeanFactory) {
        this.beanFactory = abstractBeanFactory;
    }

    @Override
    public Object getBean(String name) throws Exception {
        return beanFactory.getBean(name);
    }

    public void refresh() throws Exception {
        loadBeanDefinitions(beanFactory);
        registerBeanPostProcessor(beanFactory);
        onRefresh();
    }

    protected void registerBeanPostProcessor(AbstractBeanFactory beanFactory) throws Exception {
        List beanPostProcessors = beanFactory.getBeansForType(BeanPostProcessor.class);
        for (Object beanPostProcessor : beanPostProcessors) {
            beanFactory.addBeanPostProcessor((BeanPostProcessor) beanPostProcessor);
        }
    }

    protected void onRefresh() throws Exception {
        beanFactory.preInstantiateSingletons();
    }

    protected abstract void loadBeanDefinitions(AbstractBeanFactory beanFactory) throws Exception;

}
