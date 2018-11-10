<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/18
  Time: 18:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>login</title>
    <script>
        window.onload=function (ev) {
            var id =document.getElementById("id");
            id.onclick=function (ev1) {
                id.src="/day16//checkCodeServlet?a="+new Date().getTime();
            }
        }
    </script>
</head>
<body>
<form action="/day16/servletDemo" method="get">
    <table>
    <tr>
        <td>用户名:</td>
        <td><input type="text" placeholder="请输入用户名" name="username"></td>
    </tr>
    <tr>
        <td>密码   :</td>
        <td><input type="text" placeholder="请输入密码" name="password"></td>
    </tr>
    <tr>
        <td>验证码:</td>
        <td><input type="text" placeholder="请输入验证码" name="checkcode"></td>
    </tr>
    <tr>
        <td colspan="2"><img src="/day16//checkCodeServlet" id="id"></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="登陆">
        </td>
    </tr>
    </table>
    <hr>
    <%=request.getSession().getAttribute("usercuowu")%>
</form>
</body>
</html>
