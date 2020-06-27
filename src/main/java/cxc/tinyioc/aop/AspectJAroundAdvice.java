package cxc.tinyioc.aop;

import cxc.tinyioc.beans.factory.BeanFactory;
import org.aopalliance.aop.Advice;
import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

import java.lang.reflect.Method;

/**
 * 环绕通知拦截器
 * Created by cxc Cotter on 2020/6/26.
 */
public class AspectJAroundAdvice implements Advice, MethodInterceptor {
    private BeanFactory beanFactory;
    private Method aspectJAdviceMethod;
    private String aspectJInstanceName;

    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        return aspectJAdviceMethod.invoke(beanFactory.getBean(aspectJInstanceName), methodInvocation);
    }

    public BeanFactory getBeanFactory() {
        return beanFactory;
    }

    public void setBeanFactory(BeanFactory beanFactory) {
        this.beanFactory = beanFactory;
    }

    public Method getAspectJAdviceMethod() {
        return aspectJAdviceMethod;
    }

    public void setAspectJAdviceMethod(Method aspectJAdviceMethod) {
        this.aspectJAdviceMethod = aspectJAdviceMethod;
    }

    public String getAspectJInstanceName() {
        return aspectJInstanceName;
    }

    public void setAspectJInstanceName(String aspectJInstanceName) {
        this.aspectJInstanceName = aspectJInstanceName;
    }
}
