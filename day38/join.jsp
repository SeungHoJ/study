<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>join.jsp</title>
</head>
<body>
 
 <div class="joinForm">
 	<form action="join-action.jsp">
		<p><input type="text" name="userid" placeholder="아이디" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="비밀번호" required></p>
		<p><input type="text" name="username" placeholder="이름" required></p>
		
		<input type="radio" name="gender" value="남성">남성
		<input type="radio" name="gender" value="여성">여성
			
		<p><input type="text" name="email" placeholder="이메일" required></p>
		<p><input type="submit"></p>
	</form>
 </div>

</body>
</html>