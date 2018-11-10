package homework.homework;

import jdk.nashorn.api.tree.NewTree;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;

/**
 * 描述:定义一个学生类，包含姓名，年龄，性别等成员变量，
 * 提供setters和getters方法以及构造方法。
 * 在测试类中创建一个学生对象，
 * 给学生对象的三个成员变量赋值。
 * 然后将该对象保存到当前项目根目录下的stu.txt文件中。
 */
public class HomeWork07 {
    public static void main(String[] args) throws Exception{
        Student student = new Student("熊大", 8, "男");
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("E:\\IdeaProjects\\advace_code\\day10_code\\stu.txt"));
        oos.writeObject(student);
        oos.close();

    }
}
