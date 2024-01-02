<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify-action.jsp</title>
</head>
<body>

<jsp:setProperty property="*" name="dto"/>
<c:set var="row" value="${dao.modify(dto) }"></c:set>

<c:if test="${row != 0 }">
	<script>
		alert('수정 완료되었습니다')
		location.href = 'login.jsp'
	</script>
</c:if>

<script>
	alert('수정 실패')
	history.back()
</script>
</body>
</html>