<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<jsp:useBean id="dto" class="reply.ReplyDTO"></jsp:useBean>
<jsp:setProperty property="*" name="dto"/>

<c:if test="${empty login }">
	alert('로그인후 댓글 작성이 가능합니다')
	history.back()
</c:if>
<c:set var="row" value="${replyDAO.insert(dto) }"></c:set>
<c:redirect url="view.jsp?idx=${dto.board_idx }"></c:redirect>
</body>
</html>