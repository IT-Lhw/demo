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
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/addServlet")
public class AddServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//        设置编码
        request.setCharacterEncoding("utf-8");
//        创建user对象
        User user = new User();
//        获取表单数据，将其封装在map集合中
        Map<String, String[]> map = request.getParameterMap();
        String[] usernames = map.get("username");

//        调用BeanUtils的populate方法将map中的数据封装到user对象中
        try {
            BeanUtils.populate(user,map );
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (InvocationTargetException e) {
            e.printStackTrace();
        }
//        调用service方法，将user对象作为参数传递进去
        UserService service = new UserServiceImpl();
//        接受方法的返回值
        int i = service.addUserDao(user);
//        对返回值i进行判断
        if (i>0){
//            若大于0，则添加成功，跳转到list页面。
            request.getRequestDispatcher("/findUserByPageServlet").forward(request,response );
        }else {
//            否则，则添加失败，提示用户，“名字，邮箱，用户名，密码不可为空，用户名不可与已存在用户相同”
            request.setAttribute("addError", "<div class=\"alert alert-warning alert-dismissible\" role=\"alert\">\n" +
                    "\t\t  <button type=\"button\" class=\"close\" data-dismiss=\"alert\" >\n" +
                    "\t\t  \t<span>&times;</span></button>\n" +
                    "\t\t   <strong>名字，邮箱，用户名，密码不可为空，用户名不可与已存在用户相同。</strong>\n" +
                    "\t\t</div>");
            request.getRequestDispatcher("/list.jsp").forward(request,response );
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
