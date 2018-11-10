package cn.itcast.web;

import com.fasterxml.jackson.databind.ObjectMapper;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

@WebServlet("/findUserServlet")
public class FindUserServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        response.setContentType("text/html;charset=utf-8");
        String username = request.getParameter("username");
        ArrayList<String> list = new ArrayList<>();
        list.add("tom");
        list.add("aaa");
        list.add("bbb");
        HashMap<String, Boolean> map = new HashMap<>();
        ObjectMapper mapper = new ObjectMapper();
        if (list.contains(username)){
            //若存在
            map.put("userExsit", true);
            mapper.writeValue(response.getWriter(),map );
        }else {
            //若不存在
            map.put("userExsit", false);
            mapper.writeValue(response.getWriter(),map );
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
