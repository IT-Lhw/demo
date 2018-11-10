<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/29
  Time: 16:34
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery-3.3.1.min.js"></script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<input type="text" name="username" id="username" placeholder="请输入用户名"><span id="span"></span>
<hr>
<input type="text" name="password" id="password" placeholder="请输入密码">
<hr>
<input type="submit" value="注册">
</body>
<script>
    $(function () {
        $("#username").blur(function () {
            var username = $("#username").val();
            $.post("/json/findUserServlet",{"username":username},function (data) {
                if (data.userExsit) {
                    //如果用户名已存在。。。。
                    $("#span").css("color","red");
                    $("#span").html("用户名已存在，请换一个试试。")
                }else {
                    //如果用户名不存在。。。
                    $("#span").css("color","green");
                    $("#span").html("用户名可用。")
                }
            },"json");
        });
    });
</script>
</html>
