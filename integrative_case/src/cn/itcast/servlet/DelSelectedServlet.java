package cn.itcast.servlet;

import cn.itcast.service.UserService;
import cn.itcast.service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/delSelectedServlet")
public class DelSelectedServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置编码
        request.setCharacterEncoding("utf-8");
//        获取表单数据
        String[] ids = request.getParameterValues("id");
        //        获取当前页码
        String currentPage = request.getParameter("currentPage");
//        创建service对象，调用其删除方法
        UserService service = new UserServiceImpl();
        service.delSelectUser(ids);
//        删除完成，跳转到查询所有的页面
        response.sendRedirect(request.getContextPath()+"/findUserByPageServlet?rows=5&currentPage="+currentPage);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
