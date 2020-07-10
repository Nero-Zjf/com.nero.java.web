<%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2018/9/6
  Time: 9:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<jsp:useBean id="cust" class="com.nero.java.jsp.domain.Customer" scope="request">
    <%--<jsp:setProperty name="cust" property="*"/>--%>
</jsp:useBean>
<jsp:setProperty name="cust" property="*"/>
your name:
<jsp:getProperty name="cust" property="name"/>
your age:
<jsp:getProperty name="cust" property="age"/>

el-name:${cust["name"]}
el-age:${cust.age}

el-list:${custs[0].age}
el-list:${header.host}
el-list:${pageContext.request.getAttribute("cust").name}

</body>
</html>