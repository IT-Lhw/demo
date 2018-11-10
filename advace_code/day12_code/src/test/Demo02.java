package test;

import java.util.function.Supplier;

public class Demo02 {
    public static void main(String[] args) {
       int [] arr = {2,6,8,58,9,5,88,555};
       Supplier<Integer> sup = ()->{
           int max = arr[0];
           for (int i : arr) {
               if (i>max){
                   max = i;
               }
           }
           return max;
       };
        System.out.println(sup.get());
    }
}
