package cn.itcast.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/findServlet")
public class FindServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置编码
        request.setCharacterEncoding("utf-8");
//        获取参数id;
        String id = request.getParameter("id");
//        System.out.println(id);
//        调用service中的方法，获取user对象
        UserService service = new UserServiceImpl();
        User user = service.findUser(id);
//        System.out.println(user);
//        将user存入request共享域中
        request.setAttribute("user",user );
//        跳转到update.jsp页面，实现数据回显
        request.getRequestDispatcher("/update.jsp").forward(request, response);
    }



    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
