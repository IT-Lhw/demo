package homework;

import java.io.BufferedOutputStream;
import java.io.BufferedWriter;
import java.io.FileOutputStream;
import java.io.OutputStreamWriter;

/**
 * 描述:现有一字符串：”我爱Java”。将该字符串保存到当前项目根目录下的a.txt文件中。
 * 要求：使用gbk编码保存。
 * 注意：idea的默认编码是utf-8,所以可以通过filesettingsfile encodings设置为gbk格式，否则打开a.txt文件看到的将会是乱码。
 */
public class HomeWork05 {
    public static void main(String[] args) throws Exception{
        BufferedWriter gbk = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\a.txt"), "gbk"));
        gbk.write("我爱Java");
        gbk.close();
    }
}
