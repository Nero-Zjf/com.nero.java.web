<%@ tag body-content="scriptless" pageEncoding="UTF-8" dynamic-attributes="attrMap" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<h1 <c:forEach var="attr" items="${attrMap}">
    <c:out value="'${attr.key}' = '${attr.value}'"/>
</c:forEach>></h1>

