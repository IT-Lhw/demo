package homework;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;

/**
 * 利用高效字节输出流往C盘下的d.txt文件输出一个字节数。利用高效字节输出流往C盘下的d.txt文件输出一个字节数。
 */
public class HomeWork01 {
    public static void main(String[] args) throws Exception {
        BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("E:\\d.txt"));
        bos.write("我好开心".getBytes());
        bos.close();
    }
}
