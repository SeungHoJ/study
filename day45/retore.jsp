<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="row" value="${boardDAO.deleteRestore(param.idx) }"></c:set>
<c:if test="${row != 0 }">
	<script>
		alert('복원 성공!!')
		location.href = '${cpath}/myboard.jsp'
	</script>
</c:if>
<script>
	alert('복원 실패')
	history.back()
</script>
</body>
</html>