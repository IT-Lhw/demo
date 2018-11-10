package working.demo02;
//在任何版本的java中，接口都能定义抽象方法
//格式：
//public abstract 返回值类型 方法名称（）;
public interface MyinterfaceAbstract {

    public abstract void methodAbs1();
    void  methodAbs2();
    public static void show(){
        System.out.println("静态方法执行！");
    }
    public default void show1(){
        System.out.println("默认方法执行！");
    }
    public default void shou01(){
        a();
    }
    public default void shou02(){
        a();
    }
    private void a(){
        System.out.println(111111);
    }

}
