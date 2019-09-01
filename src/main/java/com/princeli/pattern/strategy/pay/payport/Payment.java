package com.princeli.pattern.strategy.pay.payport;

import com.princeli.pattern.strategy.pay.MsgResult;

/**
 * @author : princeli
 * @version 1.0
 * @className Payment
 * @date 2019-09-01 21:16
 * @description: TODO
 */
public abstract class Payment {

    public abstract String getName();

    protected abstract double queryBalance(String uid);

    public MsgResult pay(String uid,double amount){
        if (queryBalance(uid) < amount){
            return new MsgResult(500,"支付失败","余额不足");
        }

        return new MsgResult(200,"支付成功","支付金额："+amount);
    }
}
