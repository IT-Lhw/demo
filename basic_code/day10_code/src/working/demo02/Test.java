package working.demo02;

import working.demo02.MyInterAbsImpl;
import working.demo02.MyinterfaceAbstract;

public class Test {
    public static void main(String[] args) {
        MyInterAbsImpl my = new MyInterAbsImpl();
        my.methodAbs1();
        my.methodAbs2();
        MyinterfaceAbstract.show();
        my.show1();
    }
}
