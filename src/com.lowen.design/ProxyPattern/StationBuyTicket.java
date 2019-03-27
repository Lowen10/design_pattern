package com.lowen.design.ProxyPattern;

/**
 * @Author ：Lowen
 * @Date ：Created in 15:03 27/03/2019
 */
public class StationBuyTicket implements IBuyTicket {

    @Override
    public void buyTicket(double price) {
        System.out.println(price + " yuan for a ticket");
    }
}
