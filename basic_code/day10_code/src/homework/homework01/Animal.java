package homework.homework01;
/*
定义一个animal抽象类。
声明一个成员变量
声明一个抽象方法
声明一个成员方法。行为是喝水。
定义一个子类来继承父类
 */
public abstract class Animal {
    private int age;

    public Animal() {
    }

    public Animal(int age) {
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public abstract void eat();
    public void He(){
        System.out.println("喝水！");
    }
}
