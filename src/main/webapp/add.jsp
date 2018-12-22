<%--
  Created by IntelliJ IDEA.
  User: 25778
  Date: 2018/11/21
  Time: 15:29
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<form action="/add" method="post">
        <input  type="hidden" name="id" value="${studnets.id}"/>
    姓名<input type="text" name="name" value="${studnets.name }"/>
    年龄<input type="text" name="age" value="${students.age}"/>
    学号<input type="text" name="studentNumber" value="${stundets.studentNumber}"/>
    <input type="submit" value="提交"/>
</form>

</body>
</html>
