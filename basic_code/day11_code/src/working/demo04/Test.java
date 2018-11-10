package working.demo04;

public class Test {
    public static void main(String[] args) {
        Myinterface some = new Myinterface() {
            @Override
            public void show() {
                System.out.println("匿名内部类实现了方法");
            }
        };
        some.show();
    }
}
