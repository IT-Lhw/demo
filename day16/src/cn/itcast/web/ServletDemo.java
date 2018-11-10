package cn.itcast.web;

import cn.itcast.dao.LoginDao;
import cn.itcast.domain.User;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/demo")
public class ServletDemo extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置编码
        request.setCharacterEncoding("utf-8");
        response.setContentType("text/html;charset=utf-8");
//        获取表单数据
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String checkCode = request.getParameter("checkCode");
//        获取生成的验证码
        String cc =(String) request.getSession().getAttribute("checkCode");
//        创建User对象
        User user = new User(null,username,password);
//        调用查询数据库的方法，查询数据
        User user1 = LoginDao.select(user);
//        判断验证码是否正确
        if (cc.equalsIgnoreCase(checkCode)){
//            如果相等，则继续进行校验
//            判断用户名和密码是否正确
            if (user1!=null){
//                若正确，则跳转到登陆成功页面，需要改变地址栏路径，所以需要使用重定向
//                则跳转到主页success.jsp，显示：用户名,欢迎您
                request.getSession().setAttribute("username",username );
                response.sendRedirect("/day16/success.jsp");
            }else {
//                若用户名或密码不正确，则跳转登录页面，提示：用户名或密码错误
                request.setAttribute("error_user","用户名或密码错误" );
                request.getRequestDispatcher("/index.jsp").forward(request,response );
            }
        }else {
//            若验证码错误，跳转登录页面，提示：验证码错误
            request.setAttribute("error_check","验证码错误" );
            request.getRequestDispatcher("/index.jsp").forward(request,response );
        }
    }
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
