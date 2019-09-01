package com.princeli.pattern.strategy.pay;

import com.princeli.pattern.strategy.pay.payport.PayStrategy;

/**
 * @author : princeli
 * @version 1.0
 * @className PayStrategyTest
 * @date 2019-09-01 21:26
 * @description: TODO
 */
public class PayStrategyTest {

    public static void main(String[] args) {
        Order order = new Order("1","20190808000001",324.5);



        //MsgResult result = order.pay(PayStrategy.ALI_PAY);

        MsgResult result = order.pay(PayStrategy.UNION_PAY);

        System.out.println(result);
    }
}
