<%--
  Created by IntelliJ IDEA.
  User: zmzy
  Date: 2017/2/23
  Time: 11:38
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>用户添加</title>
</head>
<body>
<form action="/user/add" method="post">
    姓名:<input type="text" name="name" /><br />
    密码:<input type="password" name="password" /><br />
    <input type="submit" value="保存" />
</form>
</body>
</html>
