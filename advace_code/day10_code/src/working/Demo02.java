package working;

import java.io.*;

public class Demo02 {
    public static void main(String[] args) throws IOException {
//        BufferedReader br = new BufferedReader(new FileReader("E:\\IdeaProjects\\advace_code\\day10_code\\a"));
//        BufferedWriter bw = new BufferedWriter(new FileWriter("E:\\IdeaProjects\\advace_code\\day10_code\\b.txt"));
//        String str = null;
//        while ((str=br.readLine())!=null){
//            System.out.println(str);
//            bw.write(str);
//            bw.newLine();
//        }
//        bw.close();
//        br.close();
//        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\IdeaProjects\\advace_code\\day10_code\\b.txt"),"gbk"));
//        BufferedWriter gbk = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\IdeaProjects\\advace_code\\day10_code\\b.txt"), "gbk"));
//        gbk.write("世界，你好");
//        gbk.close();
//        String str;
//        while ((str=br.readLine())!=null){
//            System.out.println(str);
//        }
        BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream("E:\\IdeaProjects\\advace_code\\day10_code\\b.txt"), "gbk"));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(new FileOutputStream("E:\\IdeaProjects\\advace_code\\day10_code\\c.txt"),"utf-8"));
        String str ;
        while ((str = br.readLine())!=null){
            bw.write(str);
        }
        bw.close();
        br.close();
    }
}
