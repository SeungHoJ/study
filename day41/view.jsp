<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<h3>게시글 상세 보기</h3>

<fieldset>
	<c:set var="dto" value="${boardDAO.selectOne(param.idx) }"></c:set>
	<c:set var="list" value="${replyDAO.selectAll(param.idx) }"></c:set>
	<h4>${dto.title } | ${dto.writer } | ${dto.writeDate }</h4>
	<pre>${dto.content }</pre>
</fieldset>
↳
<div id="reply">
	<c:forEach var="reply" items="${list }">
		<div class="replyItem" style="border : 1px solid grey; margin: 20px; padding: 10px; box-sizing: border-box;">
			<div style="display: flex; justify-content: space-between;">
				<div>${reply.writer }</div>
				<div><fmt:formatDate value="${reply.writeDate }" pattern="yyyy-MM-dd a hh:mm"/></div>
			</div>
			<div><pre>${reply.content }</pre></div>
		</div>
		<a href="reply-delete.jsp?idx=${reply.idx }"><button>삭제</button></a>
	</c:forEach>
	
</div>
<br>

<form action="reply-action.jsp?board_idx=${param.idx }" method="POST">
	<h3>댓글 작성</h3>
	<c:if test="${empty login }">
		<c:set var="replyComment">로그인 후에 댓글 작성 가능합니다</c:set>
	</c:if>
	<c:if test="${not empty login }">
		<c:set var="replyComment">바르고 고운 말을 사용합시다</c:set>
	</c:if>
	
	
	<input type="hidden" name="writer" value="${login.userid }">
	<textarea name="content" rows="5" cols="80" placeholder="${replyComment }" ${empty login ? 'disabled' : ''}></textarea>
	<input type="submit" value="작성하기">
</form>


<a href="${cpath }/board.jsp"><button>목록으로</button></a>
</body>
</html>