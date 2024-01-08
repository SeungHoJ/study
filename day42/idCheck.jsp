<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="check" value="${memberDAO.idCheck(param.userid) }"></c:set>

<c:if test="${empty check }">
	<c:redirect url="join.jsp?userid=${param.userid }"></c:redirect>
</c:if>
<c:redirect url="join.jsp?userid=11111"></c:redirect>
</body>
</html>