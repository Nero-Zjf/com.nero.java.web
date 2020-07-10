<%@ page import="com.nero.java.jsp.service.Counter" %>
<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2018/9/5
  Time: 14:05
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" isErrorPage="true" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
    <title>统计调用次数</title>
</head>
<body>
<%!
    int count = 0;


%>
你当前调用次数为：
<%
    out.print(++count);
%>
<br>

<c:forEach begin="0" end="9" step="1">
    <c:out value="<br/>" escapeXml="false"/>
</c:forEach>
i am error <%=exception.getMessage()%>
<%=exception.getCause()%>
</body>
</html>
