package homeworkTest;

import homework.domain.MyArrayList;

public class MyArrayListTest {
    public static void main(String[] args) {
//        创建MyArrayList集合对象
        MyArrayList<String> list = new MyArrayList<>();
//        用集合对象调用add方法添加元素
        list.add("a");
        list.add("b");
        list.add("c");
//        用集合对象调用size方法获取集合中元素的个数
        System.out.println(list.size());
        System.out.println(list);
//        用集合对象调用remove方法，删除指定元素
        list.remove("b");
        System.out.println(list.size());
        System.out.println(list);
        System.out.println(list.get(0));
//        用集合对象调用contains方法。
        System.out.println(list.contains("b"));
        System.out.println(list.contains("a"));
//        用集合对象调用clear方法清空集合
        list.clear();
        System.out.println(list);
        System.out.println(list.size());
//        用集合对象调用isEmpti方法，判断集合是否为空
        System.out.println(list.isEmpty());
    }

}
