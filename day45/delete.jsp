<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<c:set var="row" value="${boardDAO.deleteRestore(param.idx) }"></c:set>
<c:if test="${row != 0 }">
	<script>
		alert('삭제되었습니다')
		location.href = '${cpath }'
	</script>
</c:if>
<script>
	alert('삭제 실패')
	location.href = '${cpath}/view.jsp?idx=${param.idx}'
</script>
</body>
</html>