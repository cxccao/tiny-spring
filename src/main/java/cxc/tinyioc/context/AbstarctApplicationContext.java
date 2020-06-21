package cxc.tinyioc.context;

import cxc.tinyioc.factory.AbstractBeanFactory;

/**
 * Created by cxc Cotter on 2020/6/21.
 */
public class AbstarctApplicationContext implements ApplicationContext {
    protected AbstractBeanFactory abstractBeanFactory;

    public AbstarctApplicationContext(AbstractBeanFactory abstractBeanFactory) {
        this.abstractBeanFactory = abstractBeanFactory;
    }

    @Override
    public Object getBean(String name) throws Exception {
        return abstractBeanFactory.getBean(name);
    }

    public void refresh() throws Exception {
    }

}
