package com.princeli.pattern.strategy.promotion;

/**
 * @author : princeli
 * @version 1.0
 * @className CouponStrategy
 * @date 2019-08-31 21:05
 * @description: TODO
 */
public class CouponStrategy implements PromotionStrategy{
    @Override
    public void doPromotion() {
        System.out.println("领取优惠券，课程价格直接减去优惠券面值抵扣");
    }
}
