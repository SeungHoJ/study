<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>header.jsp</title>

<style>
	.joinForm{
		border: 1px solid grey;
		width: 1200px;
		margin: auto;
		align-content: center;
	}
</style>
</head>
<body>
<%request.setCharacterEncoding("UTF-8"); %>
<jsp:useBean id="dao" class="login.LoginDAO"></jsp:useBean>
<jsp:useBean id="dto" class="login.LoginDTO"></jsp:useBean>
	
</body>
</html>