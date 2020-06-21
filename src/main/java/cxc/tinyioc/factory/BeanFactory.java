package cxc.tinyioc.factory;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public interface BeanFactory {
    Object getBean(String name) throws Exception;
}
