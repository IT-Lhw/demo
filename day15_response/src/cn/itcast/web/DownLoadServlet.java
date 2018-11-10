package cn.itcast.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.ServletOutputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

@WebServlet("/downLoadServlet")
public class DownLoadServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        获取表单参数filename的值
        String filename = request.getParameter("filename");
//        设置浏览器打开方式
        response.setHeader("content-disposition","attachment;filename=" +filename);
//        获取ServletContext对象
        ServletContext servletContext = this.getServletContext();
//        获取MIME对象
        String mimeType = servletContext.getMimeType(filename);
//        设置浏览器以什么编码打开文件
        response.setHeader("content-type",mimeType );
//        获取服务器web下img下的filename对应的文件的真实（服务器）路径
        String realPath = servletContext.getRealPath("/img/" + filename);
//        获取响应体输出流
        ServletOutputStream os = response.getOutputStream();
//        获取文件对象
        File file = new File(realPath);
//        获取文件输入流
        FileInputStream fis = new FileInputStream(file);
        byte[] a = new byte[1024];
        int len=0 ;
        while ((len = fis.read(a)) != -1){
            os.write(a);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
