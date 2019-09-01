package com.princeli.pattern.strategy.pay;

import com.princeli.pattern.strategy.pay.payport.PayStrategy;
import com.princeli.pattern.strategy.pay.payport.Payment;

/**
 * @author : princeli
 * @version 1.0
 * @className Order
 * @date 2019-09-01 21:09
 * @description: TODO
 */
public class Order {

    private String uid;

    private String orderId;

    private double amount;

    public Order(String uid, String orderId, double amount) {
        this.uid = uid;
        this.orderId = orderId;
        this.amount = amount;
    }

    public MsgResult pay(String payKey){
        Payment payment = PayStrategy.get(payKey);
        System.out.println("欢迎使用"+payment.getName());
        System.out.println("本次交易金额为："+amount+"，开始扣款...");
        return payment.pay(uid,amount);
    }
}
