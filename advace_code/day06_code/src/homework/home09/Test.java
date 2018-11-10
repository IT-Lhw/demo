package homework.home09;

import java.util.Collections;

import java.util.HashMap;

public class Test {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        MyThread.map.put(0, "熊大");
        MyThread.map.put(1, "熊二");
        MyThread.map.put(2, "熊三");
        MyThread.map.put(3, "熊四");
        MyThread.map.put(4, "熊五");
        MyThread.map.put(5, "熊六");
        MyThread.map.put(6, "熊七");
        MyThread.map.put(7, "熊八");
        MyThread.map.put(8, "熊九");
        MyThread.map.put(9, "熊十");
//        遍历set集合，将集合中的数据拷贝到list集合中
        for (Integer integer : MyThread.list) {
            MyThread.integers1.add(integer);
        }
//        打乱集合中元素的顺序
        Collections.shuffle(MyThread.integers1);
//        创建十个线程
        MyThread myThread = new MyThread();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
        new Thread(myThread).start();
    }
}
