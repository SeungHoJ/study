<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


<c:set var="dto" value="${boardDAO.selectOne(param.idx) }"></c:set>
<table border="1" cellpadding="10" cellspacing="0">
  <thead>
  	<tr>
  		<th colspan="8">글 제목 : ${dto.title }</th>
  		<th>작성자 : ${dto.writer}</th>
  	</tr>
  </thead>
  <tbody>
  	<tr>
  		<td colspan="10" width="1000px">${dto.content }</td>
  	</tr>
  </tbody>
</table>
<c:set var="list" value="${replyDAO.selectList(param.idx) }"></c:set>

	<div style="width: 1000px; border: 1px solid black; padding: 10px; margin: 20px auto;">
		댓글
		<c:forEach var="dto" items="${list }">
			<div style="border: 1px solid grey; width: 1000px; margin: auto; border-radius: 5px;">
				${dto.writer } : ${dto.content }
			</div>
		</c:forEach>
	</div>
	<div style="width: 1020px; padding-left : 0px; margin: 0px auto;">
<form style="padding-left: 0px;" action="reply-action.jsp">
	<p><input type="hidden" name="board_idx" value="${param.idx}"></p>
	<p><input type="hidden" name="writer" value="${login.userid }"></p>
	<textarea name="content" cols="80" rows="5"></textarea>
	<p><input type="submit" value="작성하기"></p>
</form>
</div>

</body>
</html>