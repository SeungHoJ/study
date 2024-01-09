<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="list" value="${boardDAO.selectListByWriter(login.userid) }"></c:set>
	<table class="myboardList" cellspacing = "0">
		<thead>
			<tr>
				<th>번호</th>
				<th>제목</th>
				<th>작성자</th>
				<th>조회수</th>
				<th>날짜</th>
				<th>삭제여부</th>
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
						<td>
							<c:if test="${dto.deleted == 1 }">
								<a href="${cpath }/retore.jsp?idx=${dto.idx}"><button>복원하기</button></a>
							</c:if>
							<c:if test="${dto.deleted == 0 }">
								게시중✔
							</c:if>
						</td>
					</tr>
				
			</c:forEach>
				
			
		</tbody>
	</table>

</body>
</html>