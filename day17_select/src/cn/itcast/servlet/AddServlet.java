package cn.itcast.servlet;

import cn.itcast.domain.User;
import cn.itcast.service.impl.ServiceUserImpl;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        request.getRequestDispatcher("utf-8");
        request.setCharacterEncoding("utf-8");
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String qq = request.getParameter("qq");
        String email = request.getParameter("email");
        User user = new User(name,gender,Integer.parseInt(age),address,qq,email);
        ServiceUserImpl serviceUser = new ServiceUserImpl();
        boolean b = serviceUser.addServiceUser(user);
        if (b){
            response.sendRedirect(request.getContextPath()+"/servletUser");
        }else {
            request.setAttribute("str","名字，性别，邮箱不可为空！" );
            request.getRequestDispatcher("/add.jsp").forward(request,response );
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
