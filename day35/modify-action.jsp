<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<jsp:useBean id="dao" class="bugs.BugsDAO"></jsp:useBean>
<jsp:useBean id="dto" class="bugs.BugsDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<c:set var="row" value="${dao.modify(dto) }"></c:set>
${row }
<c:if test="${row != 0 }">
	<c:redirect url="list.jsp"></c:redirect>
</c:if>
</body>
</html>