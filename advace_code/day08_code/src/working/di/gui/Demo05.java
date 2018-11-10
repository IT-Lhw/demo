package working.di.gui;

import java.io.File;

public class Demo05 {
    public static void main(String[] args) {
        File file = new File("C://");
        mathod(file);
    }

    private static void mathod(File file) {
        File[] arr = file.listFiles();
        for (File file1 : arr) {
            if (file1.isDirectory()){
                mathod(file1);
            }
            if (file1.isFile()){
                System.out.println(file1);
            }
        }
    }
}
