package working;
//java.util.LinkedList集合是list接口的实现类
//LinkedList集合特点
//底层是一个链表结构，所以查询慢，增删快
//里面包含了大量操作首尾元素的方法，
// 注意，使用LinkedList集合特有的方法，不能使用多态。因为只有实现类自己可以访问实现类特有的方法。
/*
public void addFirst（E e）：将指定元素添加到此列表开头
public void addLast （E e）：将指定元素添加到此列表的末尾
public E getFirst（）：返回此列表的第一个元素
public E getLast（）：返回此列表最后一个元素
public E removeFirst（）：移除并返回此列表的第一个元素
public E removeLast（）：移除并返回此列表的最后一个元素
public E pop（）：从此列表所表示的堆栈处弹出一个元素
public void push（）：将元素推入此列表表示的堆栈
public boolean isEmpty（）：判断集合是否为空，若为空，则返回true。
 */

import java.util.Arrays;
import java.util.HashSet;

public class MyLinkedList {
    public static void main(String[] args) {
        int[] a = {1,3,3,1,2};
        Arrays.sort(a);
        System.out.println(Arrays.toString(a));

        String s1 = "ab" + "c";
        String s2 = "abc";

        System.out.println(s1 == s2 + " : " + s1.equals(s2));
        HashSet<String> strings = new HashSet<>();
        strings.add("天");
        strings.add("天");
        strings.add("向");
        strings.add("上");
        System.out.println(strings);
        System.out.println(strings.size());

    }

}
