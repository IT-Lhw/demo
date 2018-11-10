package test;

import org.junit.Test;

public class Demo13 {
    public static void main(String[] args) {
        int[] arr = method02(5,int[]::new );
        System.out.println(arr.length);
    }
    @Test
    public static int[] method02(int sazi,Demo14Interface di){
        return di.method1(sazi);
    }
}
