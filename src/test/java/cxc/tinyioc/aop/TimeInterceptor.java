package cxc.tinyioc.aop;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

/**
 * Created by cxc Cotter on 2020/6/22.
 */
public class TimeInterceptor implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        long time = System.currentTimeMillis();
        System.out.println("Invocation of Method " + methodInvocation.getMethod().getName() + " start!");
        Object proceed = methodInvocation.proceed();
        System.out.println("Invocation of Method " + methodInvocation.getMethod().getName()
                + " end! tasks " + (System.currentTimeMillis() - time) + " milliseconds.");
        return proceed;
    }
}
