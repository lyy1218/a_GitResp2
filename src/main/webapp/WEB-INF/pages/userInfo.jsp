<%--
  Created by IntelliJ IDEA.
  User: shouzhongmeiyu
  Date: 2022/4/25
  Time: 15:24
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<h1 style="text-align: center">商城用户信息</h1>
<table border="1">
    <tr>
        <th>账号</th>
        <th>密码</th>
    </tr>
    <c:forEach items="${user}" var="users">
        <tr>
            <td>${user.name}</td>
            <td>${user.password}</td>
        </tr>
    </c:forEach>
</table>

</body>
</html>
