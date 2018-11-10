<%--
  Created by IntelliJ IDEA.
  User: asus
  Date: 2018/11/1
  Time: 21:19
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<script src="js/jquery.min.js" ></script>
<script>
    $(function () {
        $("#button").click(function () {
            //alert("哈哈");
            $.ajax({
                url:"user/testAjax",
                contentType:"application/json;charset=utf-8",
                data:'{"username":"张三","password":"123","age":"30"}',
                dataType:"json",
                type:"post",
                success:function (data) {
                    alert(data);
                    alert(data.username);
                    alert(data.password);
                    alert(data.age);
                }
            });
        });
    });
</script>
<html>
<head>
    <title>Title</title>
</head>
<body>
<button id="button">点击发现新世界</button>
</body>
</html>
