<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="board.*, member.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>    
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<c:set var="memberDAO" value="${MemberDAO.getInstance() }"></c:set>
<c:set var="boardDAO" value="${BoardDAO.getInstance() }"></c:set>
<%request.setCharacterEncoding("UTF-8"); %>
<%response.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>board</title>
<style>
	a{
		text-decoration: none;
		color: inherit;
	}
	a:hover{
		text-decoration: underline;
		font-weight: bold;
	}
	ul {
		list-style: none;
		
	}
	nav > ul{
		width : 1200px;
		align-content : center;	
		display: flex;
		justify-content: space-between;
	}
	header > h1{
		text-align: center;
		width: 100%;	
	}
	nav{
		border-bottom: 1px solid darkgrey;
	}
</style>
</head>
<body>

<header>
	<h1><a href="${cpath }">day15-board</a></h1>
	<div style="text-align: right; padding-right: 20px; height: 30px;">
		<c:if test="${empty login }">
			비회원
		</c:if>
		<c:if test="${not empty login }">
			${login.username }님 환영합니다
		</c:if>
	</div>
	
	<nav>
		<ul>
			<li><a href="${cpath }/login.jsp">로그인</a></li>
			<li><a href="${cpath }/logout.jsp">로그아웃</a></li>
			<li><a href="${cpath }/join.jsp">회원가입</a></li>
			<li><a href="${cpath }/board.jsp">게시판</a></li>
		</ul>
	</nav>
</header>

</body>
</html>