<%@ page contentType="text/html;charset=UTF-8" language="java" isELIgnored="false" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>

<body>

<form action="${pageContext.request.contextPath}/all" method="post" >
    <input type="submit" value="查看"/>
</form>

<table border="1" cellspacing="0" cellpadding="0">
    <tr>
        <td>id</td>
        <td>name</td>
        <td>age</td>
        <td>studentNumber</td>
        <td colspan="2">操作</td>
    </tr>

    <c:forEach items="${sessionScope.list}" var="studnets">
        <tr>
            <td>${studnets.id}</td>
            <td>${studnets.name}</td>
            <td>${studnets.age}</td>
            <td>${studnets.studentNumber}</td>
            <td><a href="updata?id=${studnets.id}">修改</a></td>
            <td><a href="del?id=${studnets.id}" onclick="return confirm('删除')">删除</a></td>
        </tr>
    </c:forEach>
</table>

<a href="add.jsp">添加</a>

</body>
</html>
