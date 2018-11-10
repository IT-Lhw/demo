package homework.homework02;

import java.util.ArrayList;
import java.util.Random;

public class QunZhu extends User{
    public QunZhu(int money, String name) {
        super(money, name);
    }

    public QunZhu() {
    }
    ArrayList<Integer> list= new ArrayList<>();
    public ArrayList<Integer> fa(int x,int coumt){
        int QunZhuYuE = getMoney();
        if(x>QunZhuYuE){
            System.out.println("余额不足。");
        return list;
        }else {
            int avg = x/coumt;
            int yu = x%coumt;
            for (int i = 0; i < coumt-1; i++) {
                list.add(avg);
            }
            setMoney(getMoney()-x);
            list.add(new Random().nextInt(coumt),avg+yu);
            return list;
        }
    }
}
