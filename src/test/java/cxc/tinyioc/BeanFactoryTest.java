package cxc.tinyioc;

import cxc.tinyioc.factory.AutowireCapableBeanFactory;
import cxc.tinyioc.factory.BeanFactory;
import cxc.tinyioc.io.ResourceLoader;
import cxc.tinyioc.xml.XmlBeanDefinitionReader;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * Created by cxc Cotter on 2020/6/19.
 */
public class BeanFactoryTest {
    @Test
    public void test() throws Exception {
        // 初始化工厂
        BeanFactory beanFactory= new AutowireCapableBeanFactory();
        // 读取xml
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
        // 注入Bean
        for (Map.Entry<String, BeanDefinition> beanDefinitionEntry : xmlBeanDefinitionReader.getRegistry().entrySet()) {
            beanFactory.registerBeanDefinition(beanDefinitionEntry.getKey(), beanDefinitionEntry.getValue());
        }
        // 获取Bean
        HelloService helloService = (HelloService) beanFactory.getBean("helloService");
        helloService.helloworld("haha");
        OutputService outputService = (OutputService) beanFactory.getBean("outputService");
        outputService.output("hoho");
    }
}
