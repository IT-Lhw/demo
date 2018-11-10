package test;

import java.util.function.Supplier;

public class Demo01 {
    public static int method(int a,int b,Supplier<Integer> sup){
        return sup.get();
    }

    public static void main(String[] args) {
        int a =58;
        int b =68;
        int max = method(a,b,() -> a>b?a:b );
        System.out.println(max);
    }
}
