package homework;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * 分析以下需求，并用代码实现
 * 	实现一个验证码小程序，要求如下：
 * 	1. 在项目根目录下新建一个文件：data.txt,键盘录入3个字符串验证码，并存入data.txt中，要求一个验证码占一行；
 * 	2. 键盘录入一个需要被校验的验证码，如果输入的验证码在data.txt中存在：在控制台提示验证成功，如果不存在控制台提示验证失败
 */
public class HomeWork04 {
    public static void main(String[] args) throws Exception {
        BufferedReader br = new BufferedReader(new FileReader("E:\\date.txt"));
        ArrayList<String> list = new ArrayList<>();
        char[] chars = new char[1024];
        String str = null;
        while ((str=br.readLine())!=null){
            list.add(str);
        }
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入验证码：");
        String amount = sc.nextLine();
        if (list.contains(amount.toLowerCase())){
            System.out.println("验证成功！");
        }else {
            System.out.println("验证失败！");
        }
    }
}
