<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>    

<c:if test="${login.userid == param.writer }">
	<c:set var="row" value="${boardDAO.deleteAllReply(param.idx) }"></c:set>
	<c:set var="row2" value="${boardDAO.deleteBoard(param.idx) }"></c:set>
	
	<c:if test="${row2 != 0 }">
		<c:redirect url="board.jsp"></c:redirect>
	</c:if>
</c:if>


<c:if test="${empty login }">
	<script>
		alert('로그인 후 삭제 가능합니다')
		location.href = 'login.jsp'
	</script>
</c:if>

<script>
	alert('본인 게시글만 삭제 가능합니다')
	history.back()
</script>
</body>
</html>