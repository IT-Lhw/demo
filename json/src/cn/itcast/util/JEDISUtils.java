package cn.itcast.util;

import redis.clients.jedis.Jedis;
import redis.clients.jedis.JedisPool;
import redis.clients.jedis.JedisPoolConfig;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class JEDISUtils {
    /**
     * host=127.0.0.1
     * port=6379
     * maxTotal=50
     * maxIdle=10
     */
    //定义一个静态的jedis连接池
    private static JedisPool jedisPool;
    //使用静态代码块给静态变量赋值
    static {
        //创建一个properties读取配置文件
        Properties ps = new Properties();
        try {
            ps.load(JEDISUtils.class.getClassLoader().getResourceAsStream("jedis.properties"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        JedisPoolConfig config = new JedisPoolConfig();
        config.setMaxIdle(Integer.parseInt(ps.getProperty("maxIdle")));
        config.setMaxTotal(Integer.parseInt(ps.getProperty("maxTotal")));
        new JedisPool(config,ps.getProperty("host"),Integer.parseInt(ps.getProperty("port")));
    }
    //定义获取jedis的方法
    public static Jedis getJedis(){
        return jedisPool.getResource();
    }
}
