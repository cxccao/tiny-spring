package cxc.tinyioc.beans;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public interface BeanDefinitionReader {
    void loadBeanDefinitions(String location) throws Exception;
}
