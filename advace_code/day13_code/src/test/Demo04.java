package test;

import java.util.stream.Stream;

public class Demo04 {
    public static void main(String[] args) {
        Stream<String> stream = Stream.of("1", "2", "3", "4", "5", "6");
//        Stream<Integer> stream1 = stream.map(s -> Integer.parseInt(s));
//        stream1.forEach(a-> System.out.println(a+2));
//        stream.map(s->Integer.parseInt(s)).forEach(n-> System.out.println(n));
//        long count = stream.map(s -> Integer.parseInt(s)).filter(i -> i > 2).count();
//        System.out.println(count);
//        Stream<String> stream1 = stream.limit(3);
//        Stream<String> stream2 = stream1.filter(a -> a.length()>1);
//        stream2.forEach(i-> System.out.println(i));
//        stream.skip(2).forEach(i-> System.out.println(i));
        Stream<String> stream1 = Stream.of("张三丰", "赵敏", "张无忌", "周芷若", "张翠山");
        Stream<String> concat = Stream.concat(stream, stream1);
        concat.forEach(s -> System.out.println(s));
    }
}
