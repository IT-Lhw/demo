package working;

public class Test {
    public static void main(String[] args)  {
        try {
            throw new MyException("发生未知异常");
        } catch (MyException e) {
            e.printStackTrace();
            System.out.println("发生位未知异常，请稍后再试");
        }
    }
}
