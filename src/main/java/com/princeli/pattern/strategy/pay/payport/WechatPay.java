package com.princeli.pattern.strategy.pay.payport;

/**
 * @author : princeli
 * @version 1.0
 * @className WechatPay
 * @date 2019-09-01 21:24
 * @description: TODO
 */
public class WechatPay extends Payment {
    @Override
    public String getName() {
        return "微信支付";
    }

    @Override
    protected double queryBalance(String uid) {
        return 256;
    }
}
