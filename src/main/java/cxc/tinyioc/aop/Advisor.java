package cxc.tinyioc.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by cxc Cotter on 2020/6/26.
 */
public interface Advisor {
    Advice getAdvice();
}
