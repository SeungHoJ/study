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
<c:set var="dto" value="${replyDAO.selectOne(param.idx) }"></c:set>

<c:if test="${login.userid == dto.writer }">
	<c:set var="row" value="${replyDAO.delete(param.idx) }"></c:set>
	<c:redirect url="view.jsp?idx=${dto.board_idx }"></c:redirect>
</c:if>
<script>
	alert('삭제 실패')
	history.back()
</script>

</body>
</html>