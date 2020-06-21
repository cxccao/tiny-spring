package cxc.tinyioc;

import cxc.tinyioc.context.ApplicationContext;
import cxc.tinyioc.context.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

/**
 * Created by cxc Cotter on 2020/6/21.
 */
public class ApplicationContextTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        helloService.helloworld("hello ApplicationContext");
        OutputService outputService = (OutputService) applicationContext.getBean("outputService");
        outputService.output("ref ref ref");
    }
}
