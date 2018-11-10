<%@ page import="java.util.List" %>
<%@ page import="java.util.ArrayList" %><%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/20
  Time: 13:48
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>Title</title>
</head>
<body>
<% List list = new ArrayList();
list.add("a");
list.add("bb");
list.add("ccc");
request.setAttribute("list", list);
%>
<%request.setAttribute("number", 22);%>
<c:forEach begin="1" end="10" var="i" step="2" >
    ${i}
</c:forEach>
<br>
<c:forEach items="${list}" var="str" varStatus="s">
    ${str} ${s.index} ${s.count} <br>
</c:forEach>
</body>
</html>
