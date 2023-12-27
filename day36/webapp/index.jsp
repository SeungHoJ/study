<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="bugs.BugsDAO"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
 <c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>   
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
header{
	border-bottom : 1px solid grey ;
	width: 100%	;
	position: fixed;
	top: 0;
	background-color: white;
	z-index: 5;
}
section{
	width: 1400px;
	margin:  0 auto;
	margin-top:  110px;
}
body{
	margin:0;
	padding : 0;
	background-color: #eee
}
.logo{
	width: 1400px;
	margin: auto;
}
.sb{
	width : 1400px;
	margin: auto;
	display: flex;
	justify-content: space-between;
	z-index: 6;
}
table {
	width:100%;
	border: 2px solid black;
	border-collapse: collapse;
}

tr {
	border-bottom: 1px solid grey;
}

td {
	border: 1px solid grey;
}

img {
	width: 50px;
	height: 50px;
}
</style>
</head>
<body>



<%-- <jsp:useBean id="dao" class=${BugsDAO.getInstance() }"></jsp:useBean> --%>
<c:set var="dao" value="${BugsDAO.getInstance() }"></c:set>

</body>
</html>