package test;

import java.util.Arrays;
import java.util.Comparator;

public class Demo11 {
    public static void main(String[] args) {
        /*
之前排序的写法
 */
        Integer[] arr = new Integer[]{1, 2, 4, 3, 6, 5};
//        Arrays.sort(arr, new Comparator<Integer>() {
//            @Override
//            public int compare(Integer num1, Integer num2) {
//                return Integer.compare(num1, num2);
//            }
//        });
//        System.out.println(Arrays.toString(arr));
/*
转换成lambda表达式后的写法
// */
//        Arrays.sort(arr, (Integer num1, Integer num2) -> {
//            return Integer.compare(num1, num2);
//        });
/*
转换成方法引用的写法
 */

        Arrays.sort(arr, Integer::compare);

    }
}
