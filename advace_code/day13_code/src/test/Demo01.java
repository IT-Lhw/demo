package test;

import java.util.*;
import java.util.stream.Stream;

public class Demo01 {
    public static void main(String[] args) {
///        把集合转换成Stream流
        ArrayList<String> list = new ArrayList<>();
        Stream<String> stream1 = list.stream();
//
        HashSet<String> set = new HashSet<>();
        Stream<String> stream2 = set.stream();

        HashMap<String, String> map = new HashMap<>();
//        获取键存储到一个Set集合中
        Set<String> keySet = map.keySet();
        Stream<String> stream3 = keySet.stream();

//        获取值，存储到一个Collection集合中
        Collection<String> values = map.values();
        Stream<String> stream4 = values.stream();

//        获取键值对（键与值的映射关系 entrySet）
        Set<Map.Entry<String, String>> entries = map.entrySet();
        Stream<Map.Entry<String, String>> stream5 = entries.stream();

    }
}
