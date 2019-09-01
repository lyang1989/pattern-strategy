package com.princeli.pattern.strategy.promotion;

/**
 * @author : princeli
 * @version 1.0
 * @className GroupbuyStrategy
 * @date 2019-08-31 21:08
 * @description: TODO
 */
public class GroupbuyStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("拼团，满20成团，全团享受团购价");
    }
}
