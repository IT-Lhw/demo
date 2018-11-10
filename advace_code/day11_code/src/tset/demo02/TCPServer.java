package tset.demo02;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class TCPServer {
    public static void main(String[] args) throws IOException {
//        声明一个服务端对象server，设置端口号（必须和客户端指定端口号一致，否则无法访问）
        ServerSocket server = new ServerSocket(23554);
        while (true){
//        用server对象调用accept方法获取一个Socket类型的对象accept
            Socket accept = server.accept();
//        accept对象调用getInputStream方法获取一个InputStream类型的is对象
            InputStream is = accept.getInputStream();
//        声明一个本地输出流fos，指定输出的目的地。
            FileOutputStream fos = new FileOutputStream("E:\\过滤器.png");
//        定义一个变量用于接收返回值（表示的是有效数据的个数），声明一个byte数组，提高效率
            int len;
            byte[] bytes = new byte[1024];
//        while循环读取客户端传输过来的数据
            while ((len=is.read(bytes))!=-1){
//            使用本地输出流对象for将数据存储到本地硬盘中
                fos.write(bytes,0 ,len );
            }
//        使用accept对象调用getOutputStream获取一个网络输出流，对客户端进行回复
            OutputStream os = accept.getOutputStream();
            os.write("上传完成！".getBytes());
//            问题所在。
            accept.shutdownOutput();
//        释放资源
            fos.close();
        }

//        accept.close();
//        server.close();
    }
}
