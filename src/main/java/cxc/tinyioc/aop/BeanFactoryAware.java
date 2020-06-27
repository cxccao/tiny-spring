package cxc.tinyioc.aop;

import cxc.tinyioc.beans.factory.BeanFactory;

/**
 * Created by cxc Cotter on 2020/6/26.
 */
public interface BeanFactoryAware {
    void setBeanFactory(BeanFactory beanFactory) throws Exception;
}
