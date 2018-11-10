<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/28
  Time: 16:03
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-3.3.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="button" value="点我" onclick="fun();">
<input type="text">
</body>
<script>
    function fun() {
        $.get("ajaxServlet",{username:"张三"},function (data) {
            alert(data);
        },"text")

    }
</script>
</html>
