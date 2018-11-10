package working;

import java.io.*;

public class Demo01 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("E:\\IdeaProjects\\advace_code\\day09_code\\src\\working\\a.properties"));
//        String s = null;
//        while ((s=br.readLine())!=null){
//            System.out.println(s);
//        }
        BufferedWriter bw=new BufferedWriter(new FileWriter("E:\\IdeaProjects\\advace_code\\day09_code\\src\\working\\a.properties"));
        bw.write("sh=yizhong");
        bw.newLine();
        bw.write("zhuzi=shanxi");
        bw.close();
    }
}
