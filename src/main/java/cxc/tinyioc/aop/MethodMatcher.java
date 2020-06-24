package cxc.tinyioc.aop;

import java.lang.reflect.Method;

/**
 * Created by cxc Cotter on 2020/6/24.
 */
public interface MethodMatcher {
    boolean matches(Method method, Class targetClass);
}
