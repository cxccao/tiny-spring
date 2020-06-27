package cxc.tinyioc.aop;

/**
 * Created by cxc Cotter on 2020/6/27.
 */
public abstract class AbstractAopProxy implements AopProxy {
    protected AdvisedSupport advised;

    public AbstractAopProxy(AdvisedSupport advised) {
        this.advised = advised;
    }
}
