<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:if test="${pageContext.request.method == 'GET' }">
	<form action="idCheck.jsp">
		<input type="text" name="userid" placeholder="${empty param.userid ? 'ID' : param.userid}" required autofocus>
		<input type="submit" value="중복확인"><c:if test="${param.userid == '11111' }">중복된 아이디입니다</c:if><c:if test="${param.userid != '11111'&&not empty param.userid }">사용가능한 아이디입니다</c:if>
	</form>
	<form method="POST">
		<p><input type="hidden" name="userid" value="${param.userid }" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="Password" required></p>
		<p><input type="text" name="username" placeholder="Name" required></p>
		<p>
			<label><input type="radio" name="gender" value="남성">남성</label>
			<label><input type="radio" name="gender" value="여성">여성</label>
		</p>
		<p><input type="text" name="email" placeholder="email" required></p>
		<p><input type="submit" value="회원가입"></p>
	</form>
</c:if>
<c:if test="${pageContext.request.method == 'POST' }">
	<jsp:useBean id="dto" class="member.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<c:set var="row" value="${memberDAO.join(dto) }"></c:set>
	<c:if test="${row != 0 }">
		<c:remove var="login"/>
		<script>
			alert('승카페 가입을 환영합니다')
			location.href = '${cpath}/login.jsp'
		</script>
	</c:if>
	<script>
		alert('가입 실패')
		history.back()
	</script>
</c:if>

</body>
</html>