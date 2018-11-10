<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<!-- 网页使用的语言 -->
<html lang="zh-CN">
<head>
    <!-- 指定字符集 -->
    <meta charset="utf-8">
    <!-- 使用Edge最新的浏览器的渲染方式 -->
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <!-- viewport视口：网页可以根据设置的宽度自动进行适配，在浏览器的内部虚拟一个容器，容器的宽度与设备的宽度相同。
    width: 默认宽度与设备的宽度相同
    initial-scale: 初始的缩放比，为1:1 -->
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <!-- 上述3个meta标签*必须*放在最前面，任何其他内容都*必须*跟随其后！ -->
    <title>用户信息管理系统</title>

    <!-- 1. 导入CSS的全局样式 -->
    <link href="css/bootstrap.min.css" rel="stylesheet">
    <!-- 2. jQuery导入，建议使用1.9以上的版本 -->
    <script src="js/jquery-2.1.0.min.js"></script>
    <!-- 3. 导入bootstrap的js文件 -->
    <script src="js/bootstrap.min.js"></script>
    <style type="text/css">
        td, th {
            text-align: center;
        }
    </style>
    <style>
        .error{
            color: red;
        }
    </style>

</head>
<body>
<div class="container">
    <h3 style="text-align: center">用户信息列表</h3>
    <div style="float: left">
    <form class="form-inline">
        <div class="form-group">
            <label for="exampleInputName2">姓名</label>
            <input type="text" class="form-control" id="exampleInputName2" placeholder="李四">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail2">籍贯</label>
            <input type="email" class="form-control" id="exampleInputEmail2" placeholder="北京">
        </div>
        <div class="form-group">
            <label for="exampleInputEmail3">邮箱</label>
            <input type="email" class="form-control" id="exampleInputEmail3" placeholder="xxx@xxx.xxx">
        </div>
        <div class="btn-group" role="group" aria-label="...">
            <%--<button type="button" class="btn btn-default">Left</button>--%>
            <button type="button" class="btn btn-default">查询</button>
            <%--<button type="button" class="btn btn-default">Right</button>--%>
        </div>
    </form>
    </div>
    <div style="float: right ; margin: 5px">
        <a class="btn btn-primary"  data-target="#myModal" data-toggle="modal" >添加联系人</a>
        <a class="btn btn-primary" href="javascript:delSelect()">删除选中</a>
    </div>
    <form id="form" action="${pageContext.request.contextPath}/delSelectedServlet" method="post">
        <input type="hidden" name="currentPage" value="${pb.currentPage}">
        <table border="1" class="table table-bordered table-hover">
        <tr class="success">
            <th><input type="checkbox" id="checkid" ></th>
            <th>编号</th>
            <th>姓名</th>
            <th>性别</th>
            <th>年龄</th>
            <th>籍贯</th>
            <th>QQ</th>
            <th>邮箱</th>
            <th>用户名</th>
            <th>密码</th>
            <th>操作</th>
        </tr>
        <c:forEach items="${pb.list}" var="user" varStatus="s">
        <tr>
            <td><input type="checkbox" name="id" value="${user.id}"></td>
            <td>${s.count}</td>
            <td>${user.name}</td>
            <td>${user.gender}</td>
            <td>${user.age}</td>
            <td>${user.address}</td>
            <td>${user.qq}</td>
            <td>${user.email}</td>
            <td>${user.username}</td>
            <td>${user.password}</td>
            <td><a class="btn btn-default btn-sm" href="${pageContext.request.contextPath}/findServlet?id=${user.id}">修改</a>&nbsp;
                <a class="btn btn-default btn-sm" href="javascript:deleteUser(${user.id})">删除</a></td>
        </tr>
        </c:forEach>
    </table>
    </form>
    <div>
        <nav>
            <ul class="pagination">

                <li>
                    <c:if test="${pb.currentPage !=1 && pb.totalCount != 0}">
                        <a href="${pageContext.request.contextPath}/findUserByPageServlet?tows=5&currentPage=${pb.currentPage-1}" aria-label="Previous">
                        <span aria-hidden="true">&laquo;</span>
                        </a>
                    </c:if>

                </li>
                <c:forEach begin="1" end="${pb.totalPage}" var="i">
                    <c:if test="${i == pb.currentPage}">
                        <li class="active"><a href="${pageContext.request.contextPath}/findUserByPageServlet?tows=5&currentPage=${i}">${i}</a></li>
                    </c:if>
                    <c:if test="${i != pb.currentPage}">
                        <li><a href="${pageContext.request.contextPath}/findUserByPageServlet?tows=5&currentPage=${i}">${i}</a></li>
                    </c:if>

                </c:forEach>

                <li>
                    <c:if test="${pb.currentPage != pb.totalPage && pb.totalCount != 0}">
                        <a href="${pageContext.request.contextPath}/findUserByPageServlet?tows=5&currentPage=${pb.currentPage+1}" aria-label="Next">
                        <span aria-hidden="true">&raquo;</span>
                        </a>
                    </c:if>

                </li>
                <span style="font-size: 20px;margin-left: 10px">共${pb.totalCount}条记录，共${pb.totalPage}页</span>
            </ul>
        </nav>
    </div>
</div>
<!-- Button trigger modal -->
<%--<button type="button" class="btn btn-primary " data-toggle="modal" data-target="#myModal">--%>
    <%--Launch demo modal--%>
<%--</button>--%>

<!-- Modal -->
<div class="modal fade" id="myModal" tabindex="-1" role="dialog" aria-labelledby="myModalLabel">
    <div class="modal-dialog" role="document">
        <div class="modal-content">
            <div class="modal-header">
                <button type="button" class="close" data-dismiss="modal" aria-label="Close"><span aria-hidden="true">&times;</span></button>
                <h4 class="modal-title" id="myModalLabel">添加新用户</h4>
            </div>
            <div class="modal-body">
                <form action="${pageContext.request.contextPath}/addServlet" method="post" id="tableForm">
                    <div class="form-group">
                        <label for="name">姓名：</label>
                        <input type="text" required class="form-control" id="name" name="name" placeholder="请输入姓名">
                    </div>

                    <div class="form-group">
                        <label>性别：</label>
                        <input type="radio" name="gender" value="男" checked="checked"/>男
                        <input type="radio" name="gender" value="女"/>女
                    </div>

                    <div class="form-group">
                        <label for="age">年龄：</label>
                        <input type="text" class="form-control" id="age" name="age" placeholder="请输入年龄">
                    </div>

                    <div class="form-group">
                        <label >籍贯：</label>
                        <select name="address"  class="form-control" id="jiguan">
                            <option value="广东">广东</option>
                            <option value="广西">广西</option>
                            <option value="湖南">湖南</option>
                        </select>
                    </div>

                    <div class="form-group">
                        <label for="qq">QQ：</label>
                        <input type="text" id="qq" class="form-control" name="qq" placeholder="请输入QQ号码"/>
                    </div>

                    <div class="form-group">
                        <label for="email">Email：</label>
                        <input type="email" required id="email" class="form-control" name="email" placeholder="请输入邮箱地址"/>
                    </div>

                    <div class="form-group">
                        <label for="username">用户名：</label>
                        <input type="text" required id="username" class="form-control" name="username" placeholder="请输入用户名"/>
                        <span id="s_username" class="error"></span>
                    </div>

                    <div class="form-group">
                        <label for="password">密码：</label>
                        <input type="text" required id="password" class="form-control" name="password" placeholder="请输入密码"/>
                        <span id="s_password" class="error"></span>
                    </div>
                    <div class="modal-footer">
                        <button type="submit" class="btn btn-primary" >提交</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">重置</button>
                        <button type="button" class="btn btn-default" data-dismiss="modal">取消</button>
                    </div>
                </form>
            </div>

        </div>
    </div>
</div>
${addError}

<script>
    window.onload=function (ev) {
        document.getElementById("tableForm").onsubmit=function (ev1) {
            return checkUsername && checkPassword;
        }
        document.getElementById("username").onblur=checkUsername;
        document.getElementById("password").onblur=checkPassword;
        function checkUsername () {
            var username = document.getElementById("username").value;
            var reg_username = /^\w{6,12}$/;
            var s_username = document.getElementById("s_username");
            var flag = reg_username.test(username);
            if(!flag){
                //提示红色用户名有误
                s_username.innerHTML = "用户名格式有误";
            }else{
                s_username.innerHTML = "";
            }
            return flag;
        }
        //校验密码
        function checkPassword(){
            //1.获取用户名的值
            var password = document.getElementById("password").value;
            //2.定义正则表达式
            var reg_password = /^\w{6,12}$/;
            //3.判断值是否符合正则的规则
            var flag = reg_password.test(password);
            //4.提示信息
            var s_password = document.getElementById("s_password");

            if(!flag){
                //提示红色用户名有误
                s_password.innerHTML = "密码格式有误";
            }else {
                s_password.innerHTML = "";
            }
            return flag;
        }
    };
    function deleteUser(id) {
        if (confirm("您确定要删除吗？")){
            location.href="${pageContext.request.contextPath}/delServlet?id="+id+"&"+"currentPage="+${pb.currentPage};
        }
    }
    function delSelect() {
        var flag = false;
        if (confirm("您确定要删除吗？")){
            var str = document.getElementsByName("id");
            for (var i=0; i<str.length ; i++){
                if (str[i].checked){
                    flag=true;
                    break;
                }
            }
            if (flag) {
                document.getElementById("form").submit();
            }
        }
    }
    document.getElementById("checkid").onclick=function (ev) {
        var str = document.getElementsByName("id");
        for (var i=0; i<str.length ; i++){
            str[i].checked=this.checked;
        }
    }
</script>
</body>
</html>
