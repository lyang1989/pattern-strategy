package com.princeli.pattern.strategy.pay;

/**
 * @author : princeli
 * @version 1.0
 * @className MsgResult
 * @date 2019-09-01 21:13
 * @description: TODO
 */
public class MsgResult {

    private int code;

    private Object data;

    private String msg;

    public MsgResult(int code, String msg, Object data) {
        this.code = code;
        this.msg = msg;
        this.data = data;

    }

    @Override
    public String toString() {
        return "支付状态：["+code+"]," +msg+
                "交易详情: " + data ;
    }
}
