package cn.itcast.day01.test;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Date;

public class DateTest {
    public static void main(String[] args) throws ParseException {
        Date date1 = new Date();
        System.out.println(date1);
        long num = date1.getTime();
        System.out.println(num);
        long num1 = System.currentTimeMillis();
        System.out.println(num1);
        Date date2 = new Date(1533436397067L);
        System.out.println("时间为：" + date2);
        System.out.println("==============");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy/MM/dd HH:mm:ss:SSS");
        String str = simpleDateFormat.format(new Date());
        System.out.println(str);
        SimpleDateFormat simpleDateFormat1 = new SimpleDateFormat("yyyy年MM月dd日 HH时mm分ss秒SSS毫秒");
        String str1 = simpleDateFormat1.format(new Date());
        System.out.println(str1);
        System.out.println("==============");
        SimpleDateFormat simpleDateFormat2 = new SimpleDateFormat("yyyy/MM/dd=HH:mm");
        Date parse = simpleDateFormat2.parse("2019/09/09=09:09");
        long time = parse.getTime();
        System.out.println(time);
        System.out.println("============");
        long time1 = new SimpleDateFormat("yyyy/MM/dd").parse("1996/11/15").getTime();
        long l = System.currentTimeMillis();
        long day = l-time1;
        day = day / 1000 / 60 / 60 / 24;
        System.out.println("存活于世" + day + "天");
        System.out.println("==========");
        Calendar instance = Calendar.getInstance();
        int y = instance.get(Calendar.YEAR);
        System.out.println(y);
        int i = instance.get(Calendar.DAY_OF_WEEK)-1;
        if(i == 0){
            i = 7;
        }
        System.out.println(i);
        String[] s ={"aaa","bbb","ccc","ddd"};
        String[] st =new String[3];
        System.arraycopy(s,1,st,0,2);
        System.out.println(Arrays.toString(st));
        StringBuilder bu1 = new StringBuilder();
        System.out.println("bu1:"+bu1);
        StringBuilder bu2 = new StringBuilder("abc");
        System.out.println("bu2:"+bu2);
        System.out.println("==============");
        bu2.append(1).append(1.1).append("tttt").append("中");
        System.out.println(bu2);
        System.out.println("==========");
        int [] arr = {1,2,3,4,5,6,7,8};
        StringBuilder bu = new StringBuilder();
        bu.append("[");
        for (int i1 = 0; i1 < arr.length; i1++) {

            if(i1 < arr.length-1){
                bu.append(arr[i1]+",");
            }
            else{
                bu.append(arr[i1]);
            }
        }
        bu.append("]");
        System.out.println(bu);
        String str2 = "521";
        int num2 = Integer.parseInt(str2);
        System.out.println(num2);
        double d = Double.parseDouble(str2);
        System.out.println(d);

    }
}
