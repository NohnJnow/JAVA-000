package io.kimmking.spring01.DynamicProxy_AOP;

/**
 * @author Wu YuHao thecoco
 * @date 2020/11/15 7:26 下午
 */
public class LogTestImpl implements LogTest{
    @Override
    public void process() {
        System.out.println("本类方法前");
        System.out.println("业务处理…记日志…………………");
        System.out.println("本类方法后");
    }
}
