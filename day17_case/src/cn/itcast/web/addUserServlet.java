package cn.itcast.web;

import cn.itcast.domain.User;
import cn.itcast.service.impl.ServiseImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet("/addUserServlet")
public class addUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        String gender = request.getParameter("gender");
        String age = request.getParameter("age");
        String address = request.getParameter("address");
        String qq = request.getParameter("qq");
        String email = request.getParameter("email");
        User user = new User(name, gender, age, address, qq, email);
        boolean b = new ServiseImpl().addUserServlet(user);
        if (b==true){
            request.getRequestDispatcher("/list.jsp").forward(request,response );
        }else {
            request.setAttribute("b",b );
            request.getRequestDispatcher("/add.jsp").forward(request, response);
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
