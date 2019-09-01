package com.princeli.pattern.strategy.pay.payport;

/**
 * @author : princeli
 * @version 1.0
 * @className JDPay
 * @date 2019-09-01 21:24
 * @description: TODO
 */
public class JDPay extends Payment {
    @Override
    public String getName() {
        return "京东白条";
    }

    @Override
    protected double queryBalance(String uid) {
        return 500;
    }
}
