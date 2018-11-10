package cn.itcast.test;

import cn.itcast.domain.User;
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.junit.Test;

import java.io.IOException;
import java.util.Date;
import java.util.HashMap;

public class JSONTest {
    @Test
    public void jsonTest() throws JsonProcessingException {
//        User user = new User("赵四",55,"男",new Date());
//        user.setName("张三");
//        user.setAge(22);
//        user.setGender("女");
//        ObjectMapper mapper = new ObjectMapper();
//        String userStr = mapper.writeValueAsString(user);
//        System.out.println(userStr);
//        HashMap<String, Object> map = new HashMap<>();
//        map.put("name","李四" );
//        map.put("age",55 );
//        map.put("gender","男" );
//        String s = mapper.writeValueAsString(map);
//        System.out.println(s);
    }
    @Test
    public void jsonTest1() throws IOException {
        String str = "{'name':'李四','age':22,'gender':'男'}";
        ObjectMapper mapper = new ObjectMapper();
        User user = mapper.readValue(str, User.class);
        System.out.println(user);
    }
}
