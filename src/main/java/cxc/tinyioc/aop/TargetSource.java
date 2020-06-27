package cxc.tinyioc.aop;

/**
 * 被代理的对象
 * Created by cxc Cotter on 2020/6/22.
 */
public class TargetSource {
    private Object target;

    private Class<?> targetClass;

    private Class<?>[] interfaces;

    public TargetSource(Object target, Class<?> targetClass, Class<?>... interfaces) {
        this.target = target;
        this.targetClass = targetClass;
        this.interfaces = interfaces;
    }

    public Class<?> getTargetClass() {
        return targetClass;
    }

    public Object getTarget() {
        return target;
    }

    public Class<?>[] getInterfaces() {
        return interfaces;
    }
}
