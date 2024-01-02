<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="login.*"%>
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
	h1{
		width : 100%;
		text-align: center;
	}
	body{
		background-color: darkgrey
	}
</style>
</head>

<body>
<header>
<%request.setCharacterEncoding("UTF-8"); %>
<c:set var="dao" value="${LoginDAO.getInstance() }"></c:set>
<jsp:useBean id="dto" class="login.LoginDTO"></jsp:useBean>

<h1><a href="login.jsp">loginCRUD</a></h1>
	

</html>