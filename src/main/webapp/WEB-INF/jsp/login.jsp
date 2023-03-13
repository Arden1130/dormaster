<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2023/2/27
  Time: 20:54
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>

<head>
    <title>登录</title>
</head>



<body>

<div class="header"></div>

<div class="body">
    <div class="panel">
        <div class=""top>
            <p>账户登录</p>
        </div>
        <div class="middle">
            <form action="login" method="post">
                <span class="erro">${msg}</span>
                <span class="s1"></span>
                <span class="s2"></span>
                <input type="text" name="a_username" value="" class="iputs"/>
                <input type="password" name="a_password" value="" class="iputs"/>
                <input type="submit" value="登陆"/>
            </form>
        </div>
    </div>
</div>

<div class="footer">
    <span>宿舍管理系统</span>
</div>
</body>

</html>
