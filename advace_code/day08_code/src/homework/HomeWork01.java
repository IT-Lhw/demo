package homework;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;

/**
 * 描述:
 * 键盘录入一个文件路径，根据文件路径创建文件对象，判断是文件还是文件夹
 * 如果是文件，则输出文件的大小
 * 如果是文件夹，则计算该文件夹下所有文件大小之和并输出(不包含子文件夹)。
 */
public class HomeWork01 {
    public static void main(String[] args) throws IOException {
        Scanner sc = new Scanner(System.in);
        System.out.println("你好，请输入文件路径：");
        String path = sc.nextLine();
        File file = new File(path);
        boolean newFile = file.createNewFile();
        System.out.println(newFile);
        if (file.isFile()){
            System.out.println("是文件，大小是："+file.length());
        }else {
            long value = mathod(file);
            System.out.println("是文件夹，该文件夹下的文件（不含子文件夹）总大小为"+value);
        }
    }

    private static long mathod(File file) {
        long value = 0;
        File[] fileArr = file.listFiles();
        for (File f1 : fileArr) {
            value = f1.length();
        }
        return value;
    }
}
