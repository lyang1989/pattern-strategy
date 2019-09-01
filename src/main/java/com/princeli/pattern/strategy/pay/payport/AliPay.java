package com.princeli.pattern.strategy.pay.payport;

/**
 * @author : princeli
 * @version 1.0
 * @className AliPay
 * @date 2019-09-01 21:17
 * @description: TODO
 */
public class AliPay extends Payment{
    @Override
    public String getName() {
        return "支付宝";
    }

    @Override
    protected double queryBalance(String uid) {
        return 900;
    }
}
