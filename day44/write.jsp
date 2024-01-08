<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:if test="${not empty login }">
	<c:if test="${pageContext.request.method == 'GET' }">
		<form method="POST" enctype="multipart/form-data">
			<p><input type="text" name="title" placeholder="글 제목" required autofocus></p>
			<p><input type="hidden" name="writer" value="${login.userid }" required autofocus></p>
			<p><input type="hidden" name="ipaddr" value="${pageContext.request.remoteAddr }"></p>
			<p><input type="file" name="image"></p>
			<textarea rows="5" cols="80" name="content"></textarea>
			<p><input type="submit" value="작성하기"></p>
		</form>
	</c:if>
	<c:if test="${pageContext.request.method == 'POST' }">
		<c:set var="fileUtil" value="${FileUtil.getInstance() }"></c:set>
		<c:set var="dto" value="${fileUtil.getDTO(pageContext.request) }"></c:set>
		<c:set var="row" value="${boardDAO.write(dto) }"></c:set>
		<c:if test="${row != 0 }">
			<script>
				alert('작성 완료 !!')
				location.href = '${cpath }'
			</script>
		</c:if>	
		<c:if test="${row == 0 }">
			<script>
				alert('작성 실패')
				history.back()
			</script>
		</c:if>
	</c:if>
</c:if>
<c:if test="${empty login }">
	<script>
		alert('로그인 후 작성 가능합니다')
		history.back()
	</script>
</c:if>


</body>
</html>