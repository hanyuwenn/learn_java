package com.baozi.direct;

import com.baozi.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Send {

    private static final String EXCHANGE_NAME = "direct";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "direct");
        String msg = "商品新增了， id = 1001";
        channel.basicPublish(EXCHANGE_NAME, "insert", null, msg.getBytes());
        System.out.println(" [商品服务：] Sent '" + msg + "'");
        msg = "商品更新了， id = 1001";
        channel.basicPublish(EXCHANGE_NAME, "update", null, msg.getBytes());
        System.out.println(" [商品服务：] Sent '" + msg + "'");
        channel.close();
        connection.close();
    }

}
