package homework.homework;

import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class HomeWork08 {
    public static void main(String[] args) throws Exception{
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("E:\\IdeaProjects\\advace_code\\day10_code\\stu.txt"));
        Student stu = (Student) ois.readObject();
        System.out.println(stu);
    }
}
