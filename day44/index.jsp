<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp"%>

<c:set var="list" value="${boardDAO.selectList(param.search) }"></c:set>
	<table class="boardList" cellspacing = "0">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>날짜</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${list }">
				<tr>
					<td>${dto.idx }</td>
					<td>
						<a href="${cpath }/view.jsp?idx=${dto.idx}">${dto.title }${dto.image != 'winter.jpg' ? '💾' : ''}</a>
					</td>
					<td>${dto.writer }</td>
					<td>${dto.viewCount }</td>
					<td>${dto.writeDate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>


<div class="sb inner">
	<div>
		<form action="${cpath }">
			<input type="search" name="search" placeholder="검색">
			<input type="submit" value="검색">
		</form>
	</div>
	<div>
		<a href="${cpath }/write.jsp">
			<button>새글 작성</button>
		</a>
	</div>
</div>


</body>
</html>