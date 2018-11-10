package test;

import java.util.function.Consumer;
import java.util.stream.Stream;

public class Demo02 {
//    public static void main(String[] args) {
//        Stream<String> stream = Stream.of("田七", "赵柳", "王五", "李四", "张三");
//        stream.forEach(name->System.out.println(name));
//    }
public static void main(String[] args) {
    Stream<String> stream = Stream.of("熊大", "熊二", "光头强", "肥波");
//    lambda表达式
//    stream.forEach(s-> System.out.println(s));
//    匿名内部类
//    stream.forEach(new Consumer<String>() {
//        @Override
//        public void accept(String s) {
//            System.out.println(s);
//        }
//    });
    stream.filter(s->s.length()<3).forEach(s -> System.out.println(s));
}
}
