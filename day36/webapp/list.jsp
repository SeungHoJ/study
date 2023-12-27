<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ include file="index.jsp"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>

</head>
<body>
	<header>
		<div class="logo">
			<h1>
				<a href="">day11 - bugs</a>
			</h1>
		</div>
		<div class="sb">
			<form action="list.jsp">
				<input type="search" name="search" placeholder="검색"
					value="${param.search }"> 
				<input type="submit">
			</form>

			<a href="add.jsp"><button>추가</button></a>
		</div>
	</header>	
	<section>
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
						<td><a href="view.jsp?id=${dto.id }"><button>상세조회</button></a>
							<a href="modify.jsp?id=${dto.id }"><button>수정</button></a> <a
							href="delete.jsp?id=${dto.id }"><button>삭제</button></a></td>

					</tr>
				</c:forEach>
			</tbody>
		</table>
	</section>
</body>
</html>