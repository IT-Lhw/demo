package working;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

public class Demo01 {
    public static void main(String[] args) {
        System.out.println("1.连接数据库，2.断开数据库");
        Scanner sc = new Scanner(System.in);
        if(sc.nextInt() == 1){
            System.out.println("正在连接数据库");
            throw new RuntimeException("程序发生了未知异常");
        }else {
            System.out.println("正在断开数据库");
        }
        String[] arr = new String[3];
        try {
            String str =arr[3];
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("数组索引越界异常");
        }
        try {
            new SimpleDateFormat("yyyy-MM-dd").parse("2222");
        }catch (ParseException e) {
            System.out.println("参数格式错误");
            e.printStackTrace();
        }


    }
}
