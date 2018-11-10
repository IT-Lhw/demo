package homework.homework02;

import java.util.ArrayList;
import java.util.Random;

public class Member extends User{
    public Member() {
    }

    public Member(int money, String name) {
        super(money, name);
    }
    public void openHongBao(ArrayList<Integer> list){
        Random num = new Random();
        int a = num.nextInt(list.size());
        setMoney(list.get(a));
        list.remove(a);
    }
}
