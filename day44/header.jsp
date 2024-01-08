<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*, member.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<c:set var="boardDAO" value="${BoardDAO.getInstance() }"></c:set>
<c:set var="memberDAO" value="${MemberDAO.getInstance()	 }"></c:set> 
<%request.setCharacterEncoding("UTF-8"); %>
<%response.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day19</title>
<style>
	.inner{
		width: 1200px;
		margin: auto;
	}
	.user{
		text-align: right;
		font-size: 18px;
		font-weight: bold;
	}
	h1{
		text-align: center;
	}
	ul {
		list-style: none;
		color: inherit;
		display: flex;
		justify-content: space-around;
		width: 1200px;
		margin: auto;
	}
	a {
		text-decoration: none;
		color: inherit;
		
	}
	table.boardList{
		width: 1200px;
		border: 1px solid grey;
		text-align: center;
		margin: 20px auto;
		border-radius: 10px;
		padding: 0;
	}
	table.boardList a{
		display: block;
	}
	th,td{
		padding: 10px;
		
	}
	
	table.boardList tr:hover{
		background-color: #dadada;
		transition-duration : 1s;
	}
	table.boardList  tr > th:nth-child(1) {width: 10%}
	table.boardList  tr > th:nth-child(2) {width: 50%}
	table.boardList  tr > th:nth-child(3) {width: 10%}
	table.boardList  tr > th:nth-child(4) {width: 10%}
	table.boardList  tr > th:nth-child(5) {width: 20%}
	
	.sb{
		display: flex;
		justify-content: space-between;
		
	}
	table.boardView{
		width: 1200px;
		margin: 20px auto;
		border: 1px solid grey;
	}
	table tr{
		border-bottom: 1px solid grey;	
	}
	
	table.boardView  tr > th:nth-child(1) {width: 60%}
	table.boardView  tr > th:nth-child(2) {width: 20%}
	table.boardView  tr > th:nth-child(3) {width: 20%}
</style>
</head>
<body>
<header>
	<h1><a href="${cpath }">승까페</a></h1>
	<div class="user inner">
		<c:if test="${empty login }">
			비회원
		</c:if>	
		<c:if test="${not empty login }">
			${login.username }님 환영합니다
		</c:if>
	</div>
	<div>
		<ul>
			<li><a href="${cpath }/login.jsp">로그인</a></li>
			<li><a href="${cpath }/logout.jsp">로그아웃</a></li>
			<li><a href="${cpath }/join.jsp">회원가입</a></li>
		</ul>
	</div>
</header>	
</html>