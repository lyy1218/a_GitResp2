<%--
  Created by IntelliJ IDEA.
  User: shouzhongmeiyu
  Date: 2022/4/29
  Time: 15:43
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
    <title>Title</title>
</head>
<body>
<c:forEach items="${users}" var="user">
    ${user.name}
    ${user.password}
</c:forEach>
</body>
</html>
