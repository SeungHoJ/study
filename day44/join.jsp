<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:if test="${pageContext.request.method == 'GET' }">
<form method="POST">
	<p><input type="text" name="userid" placeholder="이름" required auofocus></p>
	<p><input type="password" name="userpw" placeholder="비밀번호" required></p>
	<p><input type="text" name="username" placeholder="닉네임"></p>
	<p>
		<input type="radio" name="gender" value="남성" >남성
		<input type="radio" name="gender" value="여성" >여성
	</p>
	<p><input type="text" name="email" placeholder="이메일"></p>
	<p><input type="submit" value="회원가입"></p>
</form>
</c:if>

<c:if test="${pageContext.request.method == 'POST' }">
	<jsp:useBean id="dto" class="member.MemberDTO"></jsp:useBean>
	<jsp:setProperty property="*" name="dto"/>
	<c:set var="row" value="${memberDAO.join(dto) }"></c:set>
	<c:if test="${row != 0 }">
		<script>
			alert('승가페 가입을 환영합니다')
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