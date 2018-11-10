package cn.itcast.web;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * 	1.编写两个SERVLET,Aservlet功能：把servletContext中的数据+1，BServelt功能：获取servletContext中的数据
 */
@WebServlet("/bservlet")
public class BServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doGet(request,response );
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
        ServletContext servletContext = this.getServletContext();
        Object num = servletContext.getAttribute("num");
        writer.write("<p>"+num+""+"</p>");
    }
}
