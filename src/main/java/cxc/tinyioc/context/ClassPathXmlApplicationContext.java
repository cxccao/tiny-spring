package cxc.tinyioc.context;

import cxc.tinyioc.beans.BeanDefinition;
import cxc.tinyioc.beans.factory.AbstractBeanFactory;
import cxc.tinyioc.beans.factory.AutowireCapableBeanFactory;
import cxc.tinyioc.beans.io.ResourceLoader;
import cxc.tinyioc.beans.xml.XmlBeanDefinitionReader;

import java.util.Map;

/**
 * Created by cxc Cotter on 2020/6/21.
 */
public class ClassPathXmlApplicationContext extends AbstractApplicationContext {
    private String configLocation;

    public ClassPathXmlApplicationContext(String configLocation) throws Exception {
        this(configLocation, new AutowireCapableBeanFactory());
    }

    public ClassPathXmlApplicationContext(String configLocation, AbstractBeanFactory abstractBeanFactory) throws Exception {
        super(abstractBeanFactory);
        this.configLocation = configLocation;
        refresh();
    }

    @Override
    protected void loadBeanDefinitions(AbstractBeanFactory beanFactory) throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions(configLocation);
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            this.beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
    }
}
