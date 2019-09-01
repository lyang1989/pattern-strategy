package com.princeli.pattern.strategy.promotion;

/**
 * @author : princeli
 * @version 1.0
 * @className EmptyStrategy
 * @date 2019-08-31 21:03
 * @description: TODO
 */
public class EmptyStrategy implements  PromotionStrategy {

    @Override
    public void doPromotion() {
        System.out.println("无促销优惠");
    }
}
