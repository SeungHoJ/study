<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
    


<c:if test="${pageContext.request.method == 'GET' }">
	
	<form method="POST">
		<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="Password" required></p>
		<p><input type="submit" value="로그인"></p>
	</form>
</c:if>
<c:if test="${pageContext.request.method == 'POST' }">
	<c:set var="login" value="${memberDAO.login(param.userid,param.userpw) }" scope="session"></c:set>
	<c:if test="${empty login }">
		<script>
			alert('아이디혹은 비밀번호가 일치하지 않습니다')
			history.back()
		</script>
	</c:if>
	<script>
		location.href = '${cpath}'
	</script>
</c:if>

</body>
</html>