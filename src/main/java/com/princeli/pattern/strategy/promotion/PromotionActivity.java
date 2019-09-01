package com.princeli.pattern.strategy.promotion;

/**
 * @author : princeli
 * @version 1.0
 * @className PromotionActivity
 * @date 2019-08-31 21:09
 * @description: TODO
 */
public class PromotionActivity {

    PromotionStrategy promotionStrategy;

    public PromotionActivity(PromotionStrategy promotionStrategy){
        this.promotionStrategy = promotionStrategy;
    }

    public void execute(){
        this.promotionStrategy.doPromotion();
    }
}
