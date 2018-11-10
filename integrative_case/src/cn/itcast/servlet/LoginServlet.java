package cn.itcast.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;
import org.apache.commons.beanutils.BeanUtils;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/loginServlet")
public class LoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
//        获取表单数据
//        获取验证码
        String verifycode = request.getParameter("verifycode");
//        获取map集合
        Map<String, String[]> map = request.getParameterMap();
//        封装user对象
        User user = new User();
        try {
            BeanUtils.populate(user,map );
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
        HttpSession session = request.getSession();
        String check = (String) session.getAttribute("CHECKCODE_SERVER");
        session.removeAttribute("CHECKCODE_SERVER");

//        判断验证码是否正确
        if (check.equalsIgnoreCase(verifycode)){
//            若正确，则创建service对象，调用其方法，返回User对象。
            UserService service = new UserServiceImpl();
            User loginUser = service.selectDao(user);
//            判断返回的loginUser是否为空
            if (loginUser!=null){
//                若不为空，则登陆成功，跳转到list.jsp页面
                session.setAttribute("user", user);
                request.getRequestDispatcher("/index.jsp").forward(request,response );
            }
            else {
//                若loginUser为空，则调转登陆界面，提示用户用户名或密码错误。
                request.setAttribute("error","<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\n" +
                        "\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" >\n" +
                        "\t\t  \t<span>&times;</span></button>\n" +
                        "\t\t   <strong>用户名或密码错误。</strong>\n" +
                        "\t\t</div>" );
                request.getRequestDispatcher("/login.jsp").forward(request,response );
            }
        }else {
//            若验证码错误则提示用户，验证码错误
            request.setAttribute("error", "<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\n" +
                    "\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" >\n" +
                    "\t\t  \t<span>&times;</span></button>\n" +
                    "\t\t   <strong>验证码错误。</strong>\n" +
                    "\t\t</div>");
            request.getRequestDispatcher("/login.jsp").forward(request,response );
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
