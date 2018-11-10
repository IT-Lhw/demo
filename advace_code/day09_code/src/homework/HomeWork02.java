package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class HomeWork02 {
    public static void main(String[] args) {
        mathod();
    }

    private static void mathod() {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\课堂截图\\2018-08-17_163544.png");
            fos = new FileOutputStream("E:\\课堂截图.png");
            byte[] bt = new byte[1024];
            int num ;
            while ((num = fis.read(bt)) != -1){
                fos.write(bt,0 ,num );
            }
        }catch (Exception e){
            System.out.println(e);
        }
        finally {
            if (fos != null){
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fis != null){
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
