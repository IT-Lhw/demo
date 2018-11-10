package cn.itcast.servlet;

import cn.itcast.domain.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping(path = "user")
public class ControllerDemo1 {
    @RequestMapping(path = {"demo"})
    public String demo(Model model){
        User user = new User();
        user.setUsername("熊大");
        user.setPassword("123");
        user.setAge(23);
        model.addAttribute("user",user );
        System.out.println("demo1执行了。");
        return "demo";
    }
    @RequestMapping(path = {"demo1"})
    public ModelAndView demo1(){
        User user = new User();
        user.setUsername("小明");
        user.setPassword("456");
        user.setAge(16);
        ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("user",user );
        System.out.println("demo1执行了。");
        modelAndView.setViewName("demo");
        return modelAndView;
    }
    @RequestMapping(path = "testAjax")
    public @ResponseBody User testAjax(@RequestBody User user){
        System.out.println(user);
        return user;
    }
}
