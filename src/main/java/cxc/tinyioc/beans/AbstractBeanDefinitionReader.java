package cxc.tinyioc.beans;

import cxc.tinyioc.beans.io.ResourceLoader;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public abstract class AbstractBeanDefinitionReader implements BeanDefinitionReader {
    private Map<String, BeanDefinition> registry;
    private ResourceLoader resourceLoader;

    public AbstractBeanDefinitionReader(ResourceLoader resourceLoader) {
        this.registry = new HashMap<>();
        this.resourceLoader = resourceLoader;
    }

    public Map<String, BeanDefinition> getRegistry() {
        return registry;
    }

    public ResourceLoader getResourceLoader() {
        return resourceLoader;
    }
}
