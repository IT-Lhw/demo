<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/20
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%request.setAttribute("num", 1);%>
<c:if test="true">
    显示内容
</c:if>
<c:choose>
    <c:when test="${num==1}">我比0大一</c:when>
    <c:when test="${num==2}">我比3小一</c:when>
    <c:when test="${num==3}">我和三相等</c:when>
</c:choose>
</body>
</html>
