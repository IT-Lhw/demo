package homework;
/**
 * 获得指定文件夹下所有的java文件(不考虑子文件夹的)并输出到控制台
 */

import java.io.File;
import java.io.FileFilter;

public class HomeWork02 {
    public static void main(String[] args) {
        File file = new File("E:\\IdeaProjects\\basic_code\\day04_code\\src\\cn\\itcast\\day04\\demo01");
        mathod(file);
    }

    private static void mathod(File file) {
        File[] files = file.listFiles(new FileFilter() {
            @Override
            public boolean accept(File pathname) {
                if (pathname.isFile()&&pathname.toString().toLowerCase().endsWith(".java")){
                    System.out.println(pathname.toString());
                    return true;
                }else {
                    return false;
                }
            }
        });

    }
}
