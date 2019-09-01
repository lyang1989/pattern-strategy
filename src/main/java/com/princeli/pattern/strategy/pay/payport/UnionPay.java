package com.princeli.pattern.strategy.pay.payport;

/**
 * @author : princeli
 * @version 1.0
 * @className UnionPay
 * @date 2019-09-01 21:25
 * @description: TODO
 */
public class UnionPay extends Payment {
    @Override
    public String getName() {
        return "银联支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 110;
    }
}
