package com.baozi.topic;

import com.baozi.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Send {

    private static final String EXCHANGE_NAME = "topic";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.exchangeDeclare(EXCHANGE_NAME, "topic");
        String msg = "新增商品 : id = 1001";
        channel.basicPublish(EXCHANGE_NAME, "item.insert", null, msg.getBytes());
        System.out.println(" [商品服务：] Sent '" + msg + "'");
        msg = "更新商品 : id = 1001";
        channel.basicPublish(EXCHANGE_NAME, "item.update", null, msg.getBytes());
        System.out.println(" [商品服务：] Sent '" + msg + "'");
        channel.close();
        connection.close();
    }

}
