package a.b.c;

import redis.clients.jedis.Jedis;

import java.util.Set;

public class MainApplication {

    public static void main(String[] args) throws Exception {

        Jedis jedis = new Jedis("localhost");
        String ping = jedis.ping();

        jedis.set("key", "value");
        String value = jedis.get("key");

        jedis.lpush("list", "value");
        jedis.rpush("list", "value");

        Set<String> keys = jedis.keys("*");
        System.out.println();
    }
}
