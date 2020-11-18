package io.kimmking.spring01.DynamicProxy_AOP;

import sun.rmi.runtime.Log;

import java.lang.reflect.Proxy;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/15 7:21 下午
 */
public class DoInterceptor {

    public static void main(String[] args) {

        LogTest logTest = new LogTestImpl();
        BeanInterceptor beanInterceptor = new BeanInterceptor(logTest);

        logTest.process();
        /*
            基于动态代理简单实现AOP
         */
        LogTest proxy = (LogTest) Proxy.newProxyInstance(
                LogTestImpl.class.getClassLoader(),
                LogTestImpl.class.getInterfaces(),
                beanInterceptor);
        proxy.process();
    }
}
