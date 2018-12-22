<%--
  Created by IntelliJ IDEA.
  User: 25778
  Date: 2018/11/21
  Time: 16:12
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false"  %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="/add" method="post">
    id<input type="text" name="id" value="${students.id}"/>
    username<input type="text" name="name" value="${students.name}"/>
    age<input type="text" name="age" value="${students.age}"/>
    studentNumber<input type="text" name="studentNumber" value="${students.studentNumber}"/>
    <input type="submit" value="提交"/>
</form>
</body>
</html>
