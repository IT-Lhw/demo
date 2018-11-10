<%@ page import="java.util.ArrayList" %>
<%@ page import="java.util.List" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/20
  Time: 13:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%--<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% int a= 5;
List list = new ArrayList<String>();
list.add("s");
request.setAttribute("a",a );
request.setAttribute("list",list );
%>
<c:if test="true">
    <h1>cctv<%=a%></h1>
</c:if>
<c:if test="true">
    s
</c:if>
<c:if test="${requestScope.a>1}">
    <h1>您真菜</h1>
</c:if>
<c:if test="${not empty list}">
<h1>我是实的，不是空的</h1>
</c:if>
<%=10>11%>
</body>
</html>