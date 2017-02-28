<%--
  Created by IntelliJ IDEA.
  User: Administrator
  Date: 2017/2/28
  Time: 16:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>注册</title>
</head>
<body>
<form action="/user/regist" method="post"><br/>
    用户名:<input type="text" name="username"/>${mess}<br/>
    密码:<input type="password" name="password"/><br/>
    请再次输入密码:<input type="password" name="repassword"/>${msg}<br/>
    电话号码:<input type="text" name="phone"/><br/>
    Emile:<input type="text" name="emile"/><br/>
    <input type="submit" value="注册"/><br/>

</form>
</body>
</html>
