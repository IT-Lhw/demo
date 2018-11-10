<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/18
  Time: 23:11
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>欢迎登陆</title>
</head>
<body>
<h1><%=request.getSession().getAttribute("username")+"欢迎您！"%></h1>
</body>
</html>
