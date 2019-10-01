package com.baozi;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

public class JedisPoolDemo {

    public static void main(String[] args) {
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxTotal(50);
        JedisPool pool = new JedisPool(config, "192.168.32.131", 6379);
        Jedis jedis = null;
        try {
            jedis = pool.getResource();
            String key = "scoreboard";
            System.out.println(jedis.zrange(key, 0, -1));
        } catch (Exception e) {
            e.printStackTrace();
        } finally {

        }
    }

}
