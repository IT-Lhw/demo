package working;

import java.util.HashMap;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Demo01 {
    public static void main(String[] args) {
        HashMap<String, String> str = new HashMap<String, String>();
//        往集合中添加元素
        str.put("高富帅","嫐" );
        str.put("白富美","嬲" );
        str.put("矮矬穷","挊" );
//        获取
        String value = str.get("高富帅");
        System.out.println(value);
//        判断是否包涵某个键
        boolean flag = str.containsKey("高富帅");
        System.out.println(flag);
//        根据键删除指定数据，返回被删除值
        String s = str.remove("矮矬穷");
        System.out.println(s);
//        修改
        str.put("高富帅", "穷");
        System.out.println(str.get("高富帅"));
//        遍历Map第一次
        Set<String> set = str.keySet();
        for (String s1 : set) {
            String s2 = str.get(s1);
            System.out.println(s1+"="+s2);
        }
        System.out.println("==========");
//        遍历Map第二次
        Set<String> set1 = str.keySet();
        for (String s1 : set1) {
            String s2 = str.get(s1);
            System.out.println(s1+"="+s2);
        }
        System.out.println("==========");
//        entry遍历
        Set<Map.Entry<String, String>> en = str.entrySet();
        for (Map.Entry<String, String> entry : en) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
//        entry遍历
        Set<Map.Entry<String, String>> entries = str.entrySet();
        for (Map.Entry<String, String> entry : entries) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
//        entry遍历
        Set<Map.Entry<String, String>> entries1 = str.entrySet();
        for (Map.Entry<String, String> entry : entries1) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
//        entry遍历
        Set<Map.Entry<String, String>> entries2 = str.entrySet();
        for (Map.Entry<String, String> entry : entries2) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }
//        Properties演示
        Properties properties = new Properties();
        properties.put("姓名", "熊阿大");
        properties.put("年龄", 8);
        properties.put("品种", "棕熊");
        Set<Map.Entry<Object, Object>> entries3 = properties.entrySet();
        for (Map.Entry<Object, Object> entry : entries3) {
            System.out.println(entry.getKey()+":"+entry.getValue());
        }

    }

}
