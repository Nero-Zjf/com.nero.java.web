<%@ page import="java.util.List" %>
<%@ page import="java.util.Iterator" %><%--
  Created by IntelliJ IDEA.
  User: nero
  Date: 2018/9/4
  Time: 15:17
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java"%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="demo" uri="http://nero.demo.com" %>
<%@taglib prefix="my"  uri="http://table.nero.com" %>
<html>
<head>
    <title>Title</title>
    <link rel="stylesheet" type="text/css" href="/css/main.css">
</head>
<body>
<h1>Beer Recommendations JSP ${email}</h1>
<c:catch var="exc">
<%
    List styles = (List) request.getAttribute("styles");
    Iterator iterator = styles.iterator();
    while (iterator.hasNext()) {
        double dd = 1/0;
        out.print("<br>try:" + iterator.next());
    }
%>
</c:catch>
<c:if test="${exc!=null}">
    my exception: ${exc.message}
</c:if>
<tb:table items="${styles}"></tb:table>
<%--<tb:table>--%>
    <%--<jsp:attribute name="items">${styles}</jsp:attribute>--%>
<%--</tb:table>--%>
<c:set var="bodyName" value="dddd" scope="application" />
<demo:simpleTag title="SimpleTag" id="cctv" class="test">

</demo:simpleTag>
<br>
<demo:traditionTag title="traditionTag"/>
<c:out value="fffff"/>
</body>
</html>
