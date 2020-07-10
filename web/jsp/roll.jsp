<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2018/9/6
  Time: 15:00
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ taglib prefix="mine" uri="DiceFunctions" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
${mine:rollIt()}
<%@include file="welcome.jsp"%>
<jsp:include page="result.jsp">
    <jsp:param name="name" value="nero"/>
</jsp:include>
</body>
</html>
