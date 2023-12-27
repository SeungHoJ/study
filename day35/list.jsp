<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style>
table {
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
	<form action="list.jsp">
		<input type="search" name="search" placeholder="검색" value="${param.search }">
		<input type="submit">
	</form>


	<table>
		<thead>
			<tr>
				<th>ID</th>
				<th>ARTIST_NAME</th>
				<th>ARTIST_IMG</th>
				<th>NAME</th>
				<th>ALBUM_IMG</th>
				<th>GENRE</th>
				<th>PLAYTIME</th>
				<th>ISTITLE</th>
				<th>ALBUM_NAME</th>
				<th>기능</th>

			</tr>
		</thead>
		<jsp:useBean id="dao" class="bugs.BugsDAO"></jsp:useBean>
		<c:set var="list" value="${dao.selectAll(param.search) }"></c:set>
		<tbody>
			
			<c:forEach var="dto" items="${list}">
				<tr bgcolor=${dto.isTitle == 1 ? 'lightpink' : 'white' }>
					<td>${dto.id }</td>
					<td>${dto.artist_name }</td>
					<td><img src="${cpath }/artist_img/${dto.artist_img }	"></td>
					<td>${dto.name }</td>
					<td>${dto.album_name }</td>
					<td><img src="album_img/${dto.album_img }"></td>
					<td>${dto.genre }</td>
					<td>${dto.playTime }초</td>
					<td>${dto.isTitle }</td>
					<td>
						<a href="view.jsp?id=${dto.id }"><button>상세조회</button></a>
						<a href="modify.jsp?id=${dto.id }"><button>수정</button></a>
						<a href="delete.jsp?id=${dto.id }"><button>삭제</button></a>
					</td>

				</tr>
			</c:forEach>
		</tbody>
	</table>
</body>
</html>