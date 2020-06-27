package cxc.tinyioc.aop;

import cxc.tinyioc.Book;
import cxc.tinyioc.HelloService;
import cxc.tinyioc.HelloServiceImpl;
import cxc.tinyioc.context.ApplicationContext;
import cxc.tinyioc.context.ClassPathXmlApplicationContext;
import org.junit.jupiter.api.Test;

/**
 * Created by cxc Cotter on 2020/6/27.
 */
public class Cglib2AopProxyTest {
    @Test
    public void test() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc.xml");
        HelloService helloService = (HelloService) applicationContext.getBean("helloService");
        // 设置代理对象
        AdvisedSupport advisedSupport = new AdvisedSupport();
        TargetSource targetSource = new TargetSource(helloService, HelloServiceImpl.class, HelloService.class);
        advisedSupport.setTargetSource(targetSource);
        // 设置拦截器
        TimeInterceptor timeInterceptor = new TimeInterceptor();
        advisedSupport.setMethodInterceptor(timeInterceptor);
        // 创建代理
        Cglib2AopProxy cglib2AopProxy = new Cglib2AopProxy(advisedSupport);
        HelloService helloServiceProxy = (HelloService) cglib2AopProxy.getProxy();
        // 基于aop调用
        helloServiceProxy.helloworld("hello cglibProxy");
    }

    @Test
    public void testAutoProxy() throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("tinyioc-classproxy.xml");
        Book book = (Book) applicationContext.getBean("book");
        book.bookInfo();
    }
}
