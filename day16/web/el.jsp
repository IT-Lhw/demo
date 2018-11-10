<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/19
  Time: 23:37
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%session.setAttribute("age","22" );
pageContext.setAttribute("name","张三" );
%>
${pageScope.name}
${sessionScope.age}
</body>
</html>
