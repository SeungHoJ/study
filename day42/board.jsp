<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<div style="border: 1;">
	<table border="1" cellpadding="10" cellspacing = "0">
		<thead>
			<tr>
				<th width="1000px">글 제목</th>
				<th>작성자</th>
				<th>작성일</th>
			</tr>
		</thead>
		<tbody>
			<c:forEach var="dto" items="${boardDAO.selectList() }">
				<tr>
					<td><a href="${cpath }/view.jsp?idx=${dto.idx}">${dto.title }</a></td>
					<td>${dto.writer }</td>
					<td>${dto.writeDate }</td>
				</tr>
			</c:forEach>
		</tbody>
	</table>
</div>
</body>
</html>