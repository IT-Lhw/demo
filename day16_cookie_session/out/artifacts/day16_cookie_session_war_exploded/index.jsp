<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/17
  Time: 20:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>$Title$</title>
  </head>
  <body>
  <%int num = 5;
  if (num>6){
      %>
  <div  style="width: 100%;height: 100px;background-color: red;"></div>
  <%
  }else {
      %>
  <div style="width: 100%;height: 200px;background-color: cadetblue;"></div>
  <%
  }
  %>
  </body>
</html>
