package tset.demo05;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Random;

public class TCPServer {
    public static void main(String[] args) throws IOException {
        ServerSocket server = new ServerSocket(6985);
        FileOutputStream fos = new FileOutputStream("E:\\"+System.currentTimeMillis()+new Random().nextInt(111111) +".png");
        byte[] bytes = new byte[1024];

        while (true){
            Socket socket = server.accept();
            new Thread(new Runnable() {
                @Override
                public void run() {
                    try {

                        InputStream is = socket.getInputStream();
                        int len =0;
                        while ((len = is.read(bytes))!=-1){
                            fos.write(bytes,0 ,len );
                        }
                        OutputStream os = socket.getOutputStream();
                        os.write("上传成功".getBytes());
                    } catch (IOException e) {
                        System.out.println(e);
                    }
                }
            }).start();

        }

    }
}
