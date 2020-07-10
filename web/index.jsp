<%@ page import="java.util.Date" %><%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2018/8/21
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>$Title$</title>
</head>
<body>
<%!int id = 1;%>
<%
    out.println("hello world" + id);
%>
<jsp:scriptlet>
    out.println("hello world" + id);
</jsp:scriptlet>
<p><%= (new Date())%></p>
</body>
</html>
