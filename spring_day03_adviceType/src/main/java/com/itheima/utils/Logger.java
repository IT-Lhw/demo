package com.itheima.utils;

import org.aspectj.lang.ProceedingJoinPoint;

public class Logger {
    /**
     * 前置通知
     */
    public void beforePrintLog(){
        System.out.println("前置通知Logger中的beforePrintLog方法开始记录日志啦。。。");
    }
    /**
     * 后置通知
     */
    public void afterReturningPrintLog(){
        System.out.println("后置通知Logger中的afterReturningPrintLog方法开始记录日志啦。。。");
    }
    /**
     * 异常通知
     */
    public void afterThrowingPrintLog(){
        System.out.println("异常通知Logger中的afterThrowingPrintLog方法开始记录日志啦。。。");
    }

    /**
     * 最终通知
     */
    public void afterPrintLog(){
        System.out.println("最终通知Logger中的afterPrintLog方法开始记录日志啦。。。");
    }
    /**
     * 环绕通知
     * 问题：
     *      当我们配置了环绕通知之后，切入点方法没有执行，而通知方法执行了
     * 分析：
     *      通过对比动态代理中的环绕通知代码，发现动态代理的环绕通知有明确的切入点方法调用，而我们的代码没有
     * 解决：
     *      spring框架我们提供了一个接口：ProceedingJoinPoint。该接口有一个方法proceed()，此方法就相当于明确调用切入点方法
     *      该接口可以作为环绕通知的方法参数，在程序执行时，spring框架会为我们提供该接口的实现类供我们使用
     * spring中的环绕通知：
     *      他是spring框架为我们提供的一种可以在代码中手动控制增强方法何时执行的方式。
     */
    public Object aroundPringLog(ProceedingJoinPoint pjp){
        Object rtValue = null;
        Object[] args = pjp.getArgs();
        try {
            System.out.println("环绕通知Logger中的aroundPringLog方法开始记录日志啦。。。  前置");
            rtValue = pjp.proceed(args);
            System.out.println("环绕通知Logger中的aroundPringLog方法开始记录日志啦。。。  后置");
        } catch (Throwable throwable) {
            System.out.println("环绕通知Logger中的aroundPringLog方法开始记录日志啦。。。  异常");
            throwable.printStackTrace();
        }
        finally {
            System.out.println("环绕通知Logger中的aroundPringLog方法开始记录日志啦。。。  最终");
        }
        return rtValue;
    }
}