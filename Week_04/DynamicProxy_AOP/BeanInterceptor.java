package io.kimmking.spring01.DynamicProxy_AOP;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/15 6:46 下午
 */
public class BeanInterceptor implements InvocationHandler {
    Object delegate;

    public BeanInterceptor() {
    }

    public BeanInterceptor(Object delegate){
        this.delegate = delegate;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        Object result;

        System.out.println("方法前——————增加实现");
        try {
            result = method.invoke(delegate,args);
        }catch (Exception e){
            e.printStackTrace();
            System.out.println("Occurred Exception" + e);
        }
        System.out.println("方法后——————增加实现");

        return null;
    }
}
