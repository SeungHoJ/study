<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:set var="list" value="${dao.selectAll() }"></c:set>
<table border="1" cellpading="10" cellspacing="0">
	<thead>
		<tr>
			<th>userid</th>
			<th>userpw</th>
			<th>username</th>
			<th>gender</th>
			<th>email</th>
		</tr>
	</thead>
	<tbody>
<c:forEach var="dto" items="${list }">
	<tr>
		<td>${dto.userid }</td>
		<td>${dto.userpw }</td>
		<td>${dto.username }</td>
		<td>${dto.gender }</td>
		<td>${dto.email }</td>
	</tr>
</c:forEach>
</tbody>
</table>
<a href="login.jsp"><button>로그인</button></a>

</body>
</html>