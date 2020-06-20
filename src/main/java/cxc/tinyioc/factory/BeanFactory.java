package cxc.tinyioc.factory;

import cxc.tinyioc.BeanDefinition;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public interface BeanFactory {
    Object getBean(String name);
    void registerBeanDefinition(String name, BeanDefinition definition) throws Exception;
}
