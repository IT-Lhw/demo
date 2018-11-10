package test;

import java.util.stream.Stream;

public class Demo03 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("张三丰", "赵敏", "张无忌", "周芷若", "张翠山");
        Stream<String> stream1 = stream.filter((name) -> name.startsWith("张"));
        stream1.forEach((name)-> System.out.println(name));

    }
}
