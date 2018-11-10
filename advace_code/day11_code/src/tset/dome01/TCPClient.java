package tset.dome01;

import java.io.*;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException{
        Socket socket = new Socket("127.0.0.1", 9999);
        OutputStream os = socket.getOutputStream();
        BufferedWriter bufferW = new BufferedWriter(new OutputStreamWriter(os));
        bufferW.write(/*(*/"你好，服务器"/*).getBytes()*/);
        bufferW.flush();
        InputStream is = socket.getInputStream();
        BufferedReader br = new BufferedReader(new InputStreamReader(is));
        String s = br.readLine();
        System.out.println(s);
//        InputStream is = socket.getInputStream();
//        BufferedReader bufferR = new BufferedReader(new InputStreamReader(is));
//        int len;
//        char[] bytes = new char[1024];
//        len = bufferR.read(bytes);
//        System.out.println(bufferR.readLine());
//        socket.close();
    }
}
