package cn.itcast.servlet;

import cn.itcast.doamin.Account;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("hello")
public class HelloController {
    @RequestMapping(path = "demo")
    public String demo(Account account){
        System.out.println("demo");
        System.out.println(account);
        return "demo";
    }
    @RequestMapping(path = "demo1",method = {RequestMethod.GET})
    public String demo1(){
        System.out.println("demo1");
        return "demo";
    }
    @RequestMapping(path = "demo2")
    public String demo2(@RequestParam(value = "b") String str){
        System.out.println("demo2");
        System.out.println(str);
        return "demo";
    }
    @RequestMapping(path = "demo3")
    public String demo3(@RequestBody String body){
        System.out.println("demo3");
        System.out.println(body);
        return "demo";
    }
}
