package test;

public class ObjectTest {
    public static void main(String[] args) {
        Demo09Object obj = new Demo09Object();
        method01(obj::method);
        method01((s)-> System.out.println(s.toUpperCase()));
        method01((s)->new Demo09Object().method(s));
    }
    public static void method01(MyInterface my){
        my.method02("hello");
    }
}
