package com.baozi.simple;

import com.baozi.util.ConnectionUtil;
import com.rabbitmq.client.*;

import java.io.IOException;

public class Recv {

    private static final String QUEUE_NAME = "simple_queue";

    public static void main(String[] args) throws Exception {
        Connection connection = ConnectionUtil.getConnection();
        Channel channel = connection.createChannel();
        channel.queueDeclare(QUEUE_NAME, false, false, false, null);
        DefaultConsumer consumer = new DefaultConsumer(channel) {
            @Override
            public void handleDelivery(String consumerTag, Envelope envelope,
                                       AMQP.BasicProperties properties, byte[] body) throws IOException {
                String msg = new String(body);
                System.out.println(" [x] received : " + msg + "!");
            }
        };
        // 自动ACK，Rabbit MQ 收到ACK之后将该消息从队列中删除
        channel.basicConsume(QUEUE_NAME, true, consumer);
    }

}
