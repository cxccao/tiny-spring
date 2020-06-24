package cxc.tinyioc.aop;

/**
 * Created by cxc Cotter on 2020/6/24.
 */
public interface Pointcut {
    ClassFilter getClassFilter();

    MethodMatcher getMethodMatcher();
}
