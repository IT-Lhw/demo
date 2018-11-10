package cn.itcast.web.cookie;

import util.CookieUtil;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;

@WebServlet("/last")
public class LastTimeServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        Cookie[] cookies = request.getCookies();
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("yyyy年MM月dd日/HH时mm分ss秒");
        long time = new Date().getTime();
        String lastTime = simpleDateFormat.format(time);
        boolean is = false;
        Cookie lastTime1 = CookieUtil.getCoolieByName(cookies, "lastTime");
        PrintWriter writer = response.getWriter();
        Cookie lastTime2 = new Cookie("lastTime", lastTime);
        lastTime2.setMaxAge(60*60*60);
        if (lastTime1==null){
            writer.write("欢迎您首次登陆。");
        }else {
            writer.write("欢迎您再次登陆，您上次登陆的时间为"+lastTime1.getValue());
        }
        response.addCookie(lastTime2);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
