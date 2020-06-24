package cxc.tinyioc.context;

import cxc.tinyioc.beans.factory.AbstractBeanFactory;

/**
 * Created by cxc Cotter on 2020/6/21.
 */
public class AbstractApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory abstractBeanFactory;

    public AbstractApplicationContext(AbstractBeanFactory abstractBeanFactory) {
        this.abstractBeanFactory = abstractBeanFactory;
    }

    @Override
    public Object getBean(String name) throws Exception {
        return abstractBeanFactory.getBean(name);
    }

    public void refresh() throws Exception {
    }

}
