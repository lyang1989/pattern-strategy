package com.princeli.pattern.strategy.promotion;

/**
 * @author : princeli
 * @version 1.0
 * @className CashbackStrategy
 * @date 2019-08-31 21:07
 * @description: TODO
 */
public class CashbackStrategy implements PromotionStrategy {
    @Override
    public void doPromotion() {
        System.out.println("返现促销，返回到金额转到支付宝账号");
    }
}
