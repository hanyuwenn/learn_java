package com.baozi.simple;

import com.baozi.util.ConnectionUtil;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;

public class Send {

    private static final String QUEUE_NAME = "simple_queue";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        String msg = "hello rabbit mq";
        channel.basicPublish("", QUEUE_NAME, null, msg.getBytes());
        System.out.println(" [x] Sent '" + msg + "'");
        channel.close();
        connection.close();
    }

}
