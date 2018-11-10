package tset.demo03;

import java.io.*;
import java.net.Socket;
import java.util.Scanner;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream os = socket.getOutputStream();
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(os));
        System.out.println("请输入要转换的字母");
        bw.write(new Scanner(System.in).nextLine());
        bw.newLine();
        bw.flush();
        System.out.println(new BufferedReader(new InputStreamReader(socket.getInputStream())).readLine());
    }
}
