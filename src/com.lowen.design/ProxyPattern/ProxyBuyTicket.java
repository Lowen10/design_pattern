package com.lowen.design.ProxyPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:01 27/03/2019
 */
public class ProxyBuyTicket implements IBuyTicket {

    private IBuyTicket iBuyTicket;

    public ProxyBuyTicket(IBuyTicket iBuyTicket) {
        this.iBuyTicket = iBuyTicket;
    }

    @Override
    public void buyTicket(double price) {
        //买票日志处理
        System.out.println("Log: start by ticket.");
        iBuyTicket.buyTicket(price);
        System.out.println("Log: end by ticket.");
    }
}
