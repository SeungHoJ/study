<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>delete.jsp</title>
</head>
<body>

	<c:set var="row" value="${dao.delete(login.userid) }"></c:set>
	row = ${row }
	<c:if test="${row != 0 }">
		<%session.removeAttribute("login"); %>
		<script>
			alert('회원 탈퇴되었습니다')
			location.href = 'login.jsp'
		</script>
	</c:if>
	
	<script>
		alert('삭제 실패')
		history.back()
	</script>
</body>
</html>