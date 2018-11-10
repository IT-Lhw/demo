package test;

import java.util.stream.Stream;

public class Demo06 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("喜洋洋", "美洋洋", "懒洋洋", "沸羊羊", "灰太狼");
        Stream<String> stream1 = stream.limit(4);
        stream1.forEach(name-> System.out.println(name));
    }
}
