package cxc.tinyioc.aop;

import cxc.tinyioc.HelloService;
import cxc.tinyioc.context.ApplicationContext;
import cxc.tinyioc.context.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

/**
 * Created by cxc Cotter on 2020/6/22.
 */
public class JdkDynamicAopProxyTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        // 设置代理对象
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloService, HelloService.class);
        advisedSupport.setTargetSource(targetSource);
        // 设置拦截器
        TimeInterceptor timeInterceptor = new TimeInterceptor();
        advisedSupport.setMethodInterceptor(timeInterceptor);
        // 创建代理
        JdkDynamicAopProxy jdkDynamicAopProxy = new JdkDynamicAopProxy(advisedSupport);
        HelloService helloServiceProxy = (HelloService) jdkDynamicAopProxy.getProxy();
        // 基于aop调用
        helloServiceProxy.helloworld("hello aop ");
    }
}
