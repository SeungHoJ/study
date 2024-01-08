<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="dto" value="${boardDAO.selectOne(param.idx) }"></c:set>

<table class="boardView" cellspacing = "0">
  <thead>
  	<tr>
  		<th>글 제목 : ${dto.title }</th>
  		<th>작성자 : ${dto.writer }</th>
  		<th>작성일 : ${dto.writeDate }</th>	
  	</tr>
  </thead>
  <tbody>
  	<tr>
  		<td colspan="3">${dto.content }</td>
  	</tr>
  	<tr>
  		<td>첨부파일</td>
  		<td><img src="${cpath }/upload/${dto.image }"></td>
  	</tr>
  	<tr>
  		<td>${dto.ipaddr }</td>
  	</tr>
  </tbody>
</table>

</body>
</html>