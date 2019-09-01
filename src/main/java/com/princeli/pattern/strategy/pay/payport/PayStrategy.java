package com.princeli.pattern.strategy.pay.payport;

import java.util.HashMap;
import java.util.Map;

/**
 * @author : princeli
 * @version 1.0
 * @className PayStrategy
 * @date 2019-09-01 21:29
 * @description: TODO
 */
public class PayStrategy {

    public static final String ALI_PAY = "Alipay";

    public static final String JD_PAY = "JdPay";

    public static final String WECHAT_PAY = "WechatPay";

    public static final String UNION_PAY = "UnionPay";

    public static final String DEFAULT_PAY = "Alipay";

    private static Map<String,Payment> payStrategy = new HashMap<String, Payment>();

    static {

        payStrategy.put(ALI_PAY,new AliPay());
        payStrategy.put(JD_PAY,new JDPay());
        payStrategy.put(WECHAT_PAY,new WechatPay());
        payStrategy.put(UNION_PAY,new UnionPay());
        payStrategy.put(DEFAULT_PAY,new AliPay());

    }

    public static Payment get(String payKey){
        if(!payStrategy.containsKey(payKey)){
            return payStrategy.get(DEFAULT_PAY);
        }
        return payStrategy.get(payKey);
    }





}
