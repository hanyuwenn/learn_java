package com.baozi;

import redis.clients.jedis.Jedis;

public class SimpleJedisDemo {

    public static void main(String[] args) {
        Jedis jedis = new Jedis("192.168.32.131", 6379);
        jedis.set("jedis:demo:string", "hello, jedis");
        System.out.println(jedis.get("jedis:demo:string"));
        jedis.close();
    }

}
