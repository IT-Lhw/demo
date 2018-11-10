package test03;

import java.util.ArrayList;

public class EcarTest {
    public static ArrayList<Ecar> filter(ArrayList<Ecar> list,int price,int mile){
        ArrayList<Ecar> list1= new ArrayList<>();
        for (int i = 0; i < list.size(); i++) {
            if(list.get(i).getPrice()<price && list.get(i).getMile()>=mile){
                list1.add(list.get(i));
            }
        }
        return list1;
    }

    public static void main(String[] args) {
        ArrayList<Ecar> list = new ArrayList<>();
        list.add(new Ecar("威马EX5",179800,400));
        list.add(new Ecar("蔚来ES8",448000,500));
        list.add(new Ecar("特斯拉",828000,552));
        ArrayList<Ecar> list1 = filter(list,500000,400);
        for (int i = 0; i < list1.size(); i++) {
            System.out.println("满足条件的有"+list1.get(i).getBrand()+"价格："+list1.get(i).getPrice()+"里程为："+list1.get(i).getMile());
        }
    }
}
