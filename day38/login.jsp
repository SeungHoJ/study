<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>
<body>

<c:if test="${empty login}">

	<form action="login-action.jsp" method="POST">
		<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="Password" required></p>
		<p><input type="submit" value="로그인"></p>
	</form>
	<a href="join.jsp"><button>회원가입</button></a>

</c:if>	

<c:if test="${not empty login}">
	<h3>${login.username }님 환영합니다.</h3>	
	<a href="logout.jsp"><button>로그아웃</button></a>
	<a href="modify.jsp"><button>정보수정</button></a>
	<a href="delete.jsp"><button>회원탈퇴</button></a>
</c:if>
	

</body>
</html>