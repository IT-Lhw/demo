package cn.itcast.test;

import org.junit.Test;
import redis.clients.jedis.Jedis;

import java.util.Map;
import java.util.Set;

public class Demo01 {
    @Test
    public void demoText(){
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.set("username", "cuihua" );
        String username = jedis.get("username");
        System.out.println(username);
        jedis.setex("activecode", 20, "hehe");
        jedis.close();
    }
    @Test
    public void demoText1(){
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.hset("user","name" ,"lisi" );
        jedis.hset("user","age" ,"23" );
        jedis.hset("user","gender" ,"nan" );
        Map<String, String> user = jedis.hgetAll("user");
        Set<String> keySet = user.keySet();
        for (String s : keySet) {
            System.out.println(s+":"+user.get(s));
        }
        jedis.hdel("user","gender");
        jedis.close();
    }
    @Test
    public void demoText2(){
        Jedis jedis = new Jedis("localhost", 6379);
        jedis.zadd("mm", 55, "后羿");
        jedis.zadd("mm", 10, "阿狸");
        jedis.zadd("mm", 20, "诺手");
        jedis.zadd("mm", 60, "韩信");
        Set<String> mm = jedis.zrange("mm", 0, -1);
        System.out.println(mm);
        jedis.close();
    }
}
