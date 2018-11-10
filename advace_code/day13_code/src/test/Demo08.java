package test;

import java.util.stream.Stream;

public class Demo08 {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("喜洋洋", "美洋洋", "懒洋洋", "沸羊羊", "灰太狼");
        Stream<String> stream2 = Stream.of("张三丰", "赵敏", "张无忌", "周芷若", "张翠山");
        Stream<String> concat = Stream.concat(stream1, stream2);
        concat.forEach((name)-> System.out.println(name));
    }
}
