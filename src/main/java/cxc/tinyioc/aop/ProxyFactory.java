package cxc.tinyioc.aop;

/**
 * Created by cxc Cotter on 2020/6/27.
 */
public class ProxyFactory extends AdvisedSupport implements AopProxy {
    @Override
    public Object getProxy() {
        return createAopProxy().getProxy();
    }

    protected final AopProxy createAopProxy() {
        return new Cglib2AopProxy(this);
    }
}
