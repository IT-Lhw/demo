package tset.demo05;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;

public class TCPClient {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("F:\\课堂截图\\2018-08-13_005047.png");
        Socket socket = new Socket("127.0.0.1", 6985);
        OutputStream os = socket.getOutputStream();
        byte[] bytes = new byte[1024];
        int len;
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
        socket.shutdownOutput();
        InputStream is = socket.getInputStream();
        while ((len=is.read(bytes))!=-1){
            System.out.println(new String(bytes,0,len));
        }
        fis.close();
        socket.close();
    }
}
