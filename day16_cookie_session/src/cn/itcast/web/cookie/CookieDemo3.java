package cn.itcast.web.cookie;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.XMLConstants;
import javax.xml.crypto.Data;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.DateFormatSymbols;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/demo3")
public class CookieDemo3 extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        PrintWriter writer = response.getWriter();
//        获取当前系统时间
        long time = new Date().getTime();
        SimpleDateFormat format = new SimpleDateFormat("yyyy年MM月dd日/HH时mm分ss秒");
        String format1 = format.format(time);
//        获取请求头cookie
        Cookie[] cookies = request.getCookies();
        boolean is = false;
//        定义一个cookie
        Cookie c = new Cookie("lastTime", format1);
        for (Cookie cookie : cookies) {
            if (cookie.getName().equalsIgnoreCase("lastTime")){
                is = true;
                break;
            }
        }
        if (is){
            writer.write("欢迎您再次访问，您上次访问的时间是："+format1);
        }else {
            writer.write("欢迎您首次访问。");
            c.setMaxAge(60*60*24);
            response.addCookie(c);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
