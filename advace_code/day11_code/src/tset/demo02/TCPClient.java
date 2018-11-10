package tset.demo02;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.Socket;
import java.net.SocketException;

public class TCPClient {
    public static void main(String[] args) throws IOException {
//        声明一个文件字节输入流来指定文件源
        FileInputStream fis = new FileInputStream("F:\\课堂截图\\文件过滤器底层原理.png");
//        声明一个套接字，指定一个IP地址和端口号
        Socket socket = new Socket("127.0.0.1", 23554);
//        使用socket对象获取一个网络字节输出流对象。
        OutputStream os = socket.getOutputStream();
//        声明一个数组来提高效率，定义一个变量来接收方法的返回值（表示读到的有效数据个数）
        byte[] bytes = new byte[1024];
        int len ;
//        os.write("请求存储数据".getBytes());
//        while循环将本地读到的数据输出到网络输出流
        while ((len = fis.read(bytes))!=-1){
            os.write(bytes,0,len);
        }
//        上传一个结束标记
        socket.shutdownOutput();
//        用socket对象调用getInputStream方法获取一个网络字节输入流对象。
        InputStream is = socket.getInputStream();
//        while循环，将读取到的数据，用字符串形式输出。
        try {
            while ((len=is.read(bytes)) != -1){
                System.out.print(new String(bytes,0,len));
            }
        } catch (SocketException e) {
            System.out.println("套接字异常，连接重置");
        }

//        释放资源
        finally {
            fis.close();
            socket.close();
        }
    }
}
