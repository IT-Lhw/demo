package working.File.method;

import java.io.File;

public class Demo01 {
    public static void main(String[] args) {
        File f = new File("F:\\就业班课堂笔记\\6-10");
        System.out.println(f.getName());
        System.out.println(f.getPath());
        System.out.println(f.getAbsolutePath());
        System.out.println(f.length());
    }
}
