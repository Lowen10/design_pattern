package com.lowen.design.ProxyPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:05 27/03/2019
 */
public class Main {

    public static void main(String[] args) {
        staticProxy();
        dynamicProxy();
    }

    private static void staticProxy() {
        System.out.println("=============静态代理============");
        StationBuyTicket stationBuyTicket = new StationBuyTicket();
        ProxyBuyTicket proxyBuyTicket = new ProxyBuyTicket(stationBuyTicket);
        proxyBuyTicket.buyTicket(4.3);
    }

    private static void dynamicProxy() {
        System.out.println("=============动态代理============");
        IBuyTicket stationBuyTicket = new StationBuyTicket();
        DynamicBuyTicket dynamicBuyTicket = new DynamicBuyTicket(stationBuyTicket);
        IBuyTicket iBuyTicket = dynamicBuyTicket.getProxyInstance();
        iBuyTicket.buyTicket(5.4);
    }
}
