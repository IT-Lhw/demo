package test02;

import java.security.PublicKey;
import java.util.Random;
import java.util.Scanner;

public class test02 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入字符串：");
        int num = show(sc.nextLine());
        System.out.println(num);

    }
    public static int show(String str){
        int num = 0;
        char ch = str.charAt(new Random().nextInt(str.length()));
        System.out.println("获取的随机字符是："+ch);
        int a = str.indexOf(ch);
        while (a!=-1){
            str = str.substring(a+1);
            num++;
            a = str.indexOf(ch);
        }
        return num;
    }
}
