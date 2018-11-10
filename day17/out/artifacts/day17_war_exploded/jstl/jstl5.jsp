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
<%
List list = new ArrayList();
list.add(2);
list.add(5);
list.add(2);
list.add(51);
list.add(22);
list.add(36);
list.add(64);
list.add(11);
request.setAttribute("list",list );
%>
<%--输出集合中的偶数--%>
<c:forEach items="${list}" var="num" >
    <c:if test="${num%2==0}">${num}</c:if>
</c:forEach>
<hr>
<%--输出索引为偶数的元素--%>
<c:forEach items="${list}" var="num" step="2" varStatus="s">
    索引,${s.index}
    数据${num};
    <br>
</c:forEach>

</body>
</html>
