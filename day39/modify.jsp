<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>modify.jsp</title>
</head>
<body>

<form action="modify-action.jsp" method="POST">
	<p><input type="text" name="userid" value="${login.userid }" required autofocus></p>
	<p><input type="password" name="userpw" value="${login.userpw }" required></p>
	<p><input type="text" name="username" value="${login.username }" required></p>
	
	<input type="radio" name="gender" value="남성"${login.gender == '남성' ? 'checked' : '' }>남성
	<input type="radio" name="gender" value="여성"${login.gender == '여성' ? 'checked' : '' }>여성
		
	<p><input type="text" name="email" value="${login.email }" required></p>
	<p><input type="submit"></p>
</form>


</body>
</html>