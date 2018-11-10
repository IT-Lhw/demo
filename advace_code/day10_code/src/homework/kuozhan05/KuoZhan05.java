package homework.kuozhan05;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

/**
 * 定义一个学生类，成员变量有姓名，年龄，性别，提供setters和getters方法以及构造方法
 * 定义一个测试类，在测试类创建多个学生对象保存到集合中，然后将集合存储到当前项目根目录下的stus.txt文件中。
 */
public class KuoZhan05 {
    public static void main(String[] args) throws Exception{
        Student student01 = new Student("熊大", 9, "男");
        Student student02 = new Student("熊二", 7, "男");
        Student student03 = new Student("光头强", 23, "男");
        ArrayList<Student> list = new ArrayList<>();
        list.add(student01);
        list.add(student02);
        list.add(student03);
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\IdeaProjects\\advace_code\\day10_code\\stus.txt"));
        oos.writeObject(list);
        oos.close();
    }
}
