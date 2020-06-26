package cxc.tinyioc.beans;

/**
 * Created by cxc Cotter on 2020/6/26.
 */
public interface BeanPostProcessor {
    Object postProcessBeforeInitialization(Object bean, String beanName) throws Exception;

    Object postProcessAfterInitialization(Object bean, String beanName) throws Exception;
}
