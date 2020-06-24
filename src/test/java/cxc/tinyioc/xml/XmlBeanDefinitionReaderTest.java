package cxc.tinyioc.xml;

import cxc.tinyioc.beans.BeanDefinition;
import cxc.tinyioc.beans.io.ResourceLoader;
import cxc.tinyioc.beans.xml.XmlBeanDefinitionReader;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Map;

/**
 * Created by cxc Cotter on 2020/6/20.
 */
public class XmlBeanDefinitionReaderTest {
    @Test
    public void test() throws Exception {
        XmlBeanDefinitionReader xmlBeanDefinitionReader = new XmlBeanDefinitionReader(new ResourceLoader());
        xmlBeanDefinitionReader.loadBeanDefinitions("tinyioc.xml");
        Map<String, BeanDefinition> registry = xmlBeanDefinitionReader.getRegistry();
        Assertions.assertTrue(registry.size()>0);
    }
}
