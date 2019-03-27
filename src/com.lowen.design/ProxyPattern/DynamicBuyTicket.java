package com.lowen.design.ProxyPattern;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:23 27/03/2019
 */
public class DynamicBuyTicket {

    private IBuyTicket iBuyTicket;

    public DynamicBuyTicket(IBuyTicket iBuyTicket) {
        this.iBuyTicket = iBuyTicket;
    }

    public IBuyTicket getProxyInstance() {
        return (IBuyTicket) Proxy.newProxyInstance(iBuyTicket.getClass().getClassLoader(), iBuyTicket.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                //买票日志处理
                System.out.println("DynamicProxy Log: start Buy Ticket.");
                Object result = method.invoke(iBuyTicket, args);
                System.out.println("DynamicProxy Log: end Buy Ticket.");
                return result;
            }
        });
    }

}
