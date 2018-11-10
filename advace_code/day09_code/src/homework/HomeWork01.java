package homework;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *  public static void main(String[] args) {
 *         FileInputStream fis = null;
 *         FileOutputStream fos = null;
 *         try{
 *             fis = new FileInputStream("day09/a.txt");
 *             fos = new FileOutputStream("day09/b.txt");
 *
 *             byte[] data = new byte[1024*8];//data:数据
 *             int len ;//表示向数组中填充了几个数据
 *
 *             while( (len=fis.read(data)) != -1 ){
 *                 fos.write(data, 0, len);
 *             }
 *
 *         }catch (Exception e){
 *             e.printStackTrace();
 *         }finally {
 *             if(fis!=null){//有可能fis没有创建对象成功，那么值就是null,是为了避免空指针异常
 *                 try {
 *                     fis.close();
 *                 } catch (IOException e) {
 *                     e.printStackTrace();
 *                 }
 *             }
 *
 *             if(fos != null){
 *                 try {
 *                     fos.close();
 *                 } catch (IOException e) {
 *                     e.printStackTrace();
 *                 }
 *             }
 *         }
 *     }
 */

public class HomeWork01 {
    public static void main(String[] args) {
        FileInputStream fis = null;
        FileOutputStream fos = null;
        try {
            fis = new FileInputStream("F:\\课堂截图\\2018-08-17_184136.png");
            fos = new FileOutputStream("F:\\作业\\课堂截图.png");
            byte[] bytes = new byte[1024];
            int len;
            while ((len = fis.read(bytes)) != -1) {
                fos.write(bytes, 0, len);
            }
        }
    catch(Exception e){
            e.printStackTrace();
        }
    finally{
            if (fis != null) {
                try {
                    fis.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
            if (fos != null) {
                try {
                    fos.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
