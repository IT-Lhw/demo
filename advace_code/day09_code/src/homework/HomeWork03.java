package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork03 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\课堂截图\\2018-08-13_005047.png");
            fos = new FileOutputStream("F:\\课堂截图\\过山洞.png");
            int num;
            byte[] bytes = new byte[1024];
            while ((num = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, num);
            }
        } catch (Exception e) {
            System.out.println(e);
        } finally {
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
                if (fis != null) {
                    try {
                        fis.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }
        }
    }
}
