<%@ page import="cn.itcast.domain.User" %>
<%@ page import="java.util.*" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/20
  Time: 11:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>home</title>
  </head>
  <body>
  <%User user =new User();
  user.setAge(18);
  user.setName("张三");
  user.setBirthday(new Date());
  request.setAttribute("user", user);
  List list = new ArrayList<Object>();
  list.add("a");
  list.add("bb");
  list.add(user);
  request.setAttribute("l",list );
  Map map =new HashMap();
  map.put("gender", "男");
  map.put("name", "李四");
  map.put("user", user);
  request.setAttribute("map", map);
  %>
  生日：
  ${user.birthday}
  <br>
  姓名：
  ${user.name}
  <br>
  年龄：
  ${user.age}
  <hr>
  ${l[0]}
  ${l[2].name}
  <hr>
  ${map.name}
  ${map.gender}
  ${map.user.name}
  </body>
</html>
