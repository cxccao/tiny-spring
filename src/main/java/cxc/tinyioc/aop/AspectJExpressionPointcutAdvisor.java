package cxc.tinyioc.aop;

import org.aopalliance.aop.Advice;

/**
 * Created by cxc Cotter on 2020/6/26.
 */
public class AspectJExpressionPointcutAdvisor implements PointcutAdvisor {
    private AspectJExpressionPointcut pointcut = new AspectJExpressionPointcut();
    private Advice advice;

    public void setExpression(String expression) {
        this.pointcut.setExpression(expression);
    }

    public void setAdvice(Advice advice) {
        this.advice = advice;
    }

    @Override
    public Pointcut getPointcut() {
        return pointcut;
    }

    @Override
    public Advice getAdvice() {
        return advice;
    }
}
