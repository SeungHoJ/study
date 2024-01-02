<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join-action.jsp</title>
</head>
<body>

<jsp:setProperty property="*" name="dto"/>

<c:set var="row" value="${dao.add(dto) }"></c:set>

<c:if test="${row != 0 }">
	<script>
		alert('가입이 완료되었습니다!!')
		location.href='login.jsp'
	</script>
	
</c:if>
<script>
	alert('사용중인 아이디입니다')
	history.back()
</script>

</body>
</html>