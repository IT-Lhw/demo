package working.working01;

import java.util.List;
import java.util.Scanner;

public class TestRegister {
    public static void main(String[] args) {
        List<String> register = List.of("熊大","熊二","光头强","灰太狼");
        Scanner sc = new Scanner(System.in);
        System.out.println("请输入您要注册的用户名:");
        String name = sc.nextLine();
        if(register.contains(name)){
            throw new RegisterException("该用户名已被注册，请重新输入：");
        }else{
            System.out.println("恭喜您，注册成功！");
        }
    }
}
