<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="login" value="${dao.login(param.userid,param.userpw) }" scope="session"></c:set>


<c:if test="${empty login}">
	<script>
		alert('아이디 또는 비밀번호를 확인해주세요')
		history.back()
	</script>
</c:if>

<script>
	location.href='login.jsp'
</script>



</body>
</html>