package test01;

public class test01 {
    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        int c = 8;
        int max = a;
        if(max < b){
            max = b;
        }if(max < c){
            max = c;
        }
        System.out.println("最大值是："+max);
        int min = a;
        min = min >b?b:min;
        min = min >c?c:min;
        System.out.println("最小值是"+min);
    }
}
