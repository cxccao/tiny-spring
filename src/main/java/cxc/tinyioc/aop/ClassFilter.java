package cxc.tinyioc.aop;

/**
 * Created by cxc Cotter on 2020/6/24.
 */
public interface ClassFilter {
    boolean matches(Class<?> targetClass);
}
