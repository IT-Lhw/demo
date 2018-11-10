package working.demo041;

import working.demo04.Myinterface;

public class MyInterfaceImol {
    public static void main(String[] args) {
        Myinterface obj = new Myinterface() {
            @Override
            public void show() {
                System.out.println("匿名内部类实现了方法");
            }
        };
    }

}
