<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="member.*,board.*, reply.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<c:set var="memberDAO" value="${MemberDAO.getInstance() }"></c:set>
<c:set var="boardDAO" value="${BoardDAO.getInstance() }"></c:set>    
<c:set var="replyDAO" value="${ReplyDAO.getInstance() }"></c:set>    
<%request.setCharacterEncoding("UTF-8");
response.setCharacterEncoding("UTF-8"); %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>day-17</title>
<style>
	a{
		text-decoration: none;
		color: inherit;
	}
	h1{
		text-align: center;
	}
	ul{
		list-style: none;
		width: 100%;
		display: flex;
		justify-content: space-around;
		border-bottom: 1px solid darkgrey;
		font-weight: bold;
	}
	table{
		margin: auto;
	}
	
</style>
</head>
<body>

<h1><a href="${cpath }">승카페</a></h1>
<c:if test="${empty login }">
	비회원

</c:if>
<c:if test="${not empty login }">${login.username }님 환영합니다</c:if>
<ul>
	<li><a href="${cpath }/login.jsp">로그인</a></li>
	<li><a href="${cpath }/logout.jsp">로그아웃</a></li>
	<li><a href="${cpath }/join.jsp">회원가입</a></li>
	<li><a href="${cpath }/board.jsp">게시글</a></li>
</ul>
