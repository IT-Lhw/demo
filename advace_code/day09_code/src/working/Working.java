package working;

import java.io.*;

public class Working {
    public static void main(String[] args) throws IOException {
        long l = System.currentTimeMillis();
        FileInputStream fis = new FileInputStream("F:\\作业\\路线，阶段2.png");
        FileOutputStream fos = new FileOutputStream("D:\\hyxd\\路线，阶段2.png");
        byte[] bytes = new byte[1024];
        int num = 0;
        while ((num = fis.read(bytes)) != -1){
            fos.write(bytes,0,num);
        }
        fis.close();
        fos.close();
        long s = System.currentTimeMillis();
        System.out.println("拷贝用时："+(s-l)+"毫秒");
    }
}
