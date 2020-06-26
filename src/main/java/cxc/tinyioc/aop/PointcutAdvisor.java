package cxc.tinyioc.aop;

/**
 * Created by cxc Cotter on 2020/6/26.
 */
public interface PointcutAdvisor extends Advisor {
    Pointcut getPointcut();
}
