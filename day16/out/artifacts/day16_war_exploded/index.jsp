<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/9/18
  Time: 21:13
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
  <head>
    <title>登录首页</title>
    <script>
      window.onload=function (ev) {
          var id = document.getElementById("id");
          id.onclick=function (ev1) {
              id.src="/day16/checkCodeServlet?date="+new Date().getTime();
          }
      }
    </script>
      <style>
          div{
              color: red;
          }
      </style>
  </head>
  <body>
<form action="/day16/demo" method="get">
  <table>
    <tr>
      <td>用户名</td>
      <td><input type="text" name="username" placeholder="请输入用户名"></td>
    </tr>
    <tr>
      <td>密码</td>
      <td><input type="text" name="password" placeholder="请输入密码"></td>
    </tr>
    <tr>
      <td>验证码</td>
      <td><input type="text" name="checkCode" placeholder="请输入验证码"></td>
    </tr>
    <tr>
      <td rowspan="2"><img src="/day16/checkCodeServlet" id="id"></td>
    </tr>
    <tr>
      <td rowspan="2"><input type="submit" value="注册"></td>
    </tr>
  </table>
</form>
  <div><%=request.getAttribute("error_check")==null?"":request.getAttribute("error_check")%></div>
  <div><%=request.getAttribute("error_user")==null?"":request.getAttribute("error_user")%></div>
  </body>
</html>
