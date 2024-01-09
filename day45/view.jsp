<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>

<c:set var="dto" value="${boardDAO.selectOne(param.idx) }"></c:set>
<c:set var="row" value="${boardDAO.viewCount(param.idx) }"></c:set>

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
<div class="sb inner">
  	<div>
  		<a href="${cpath }"><button>목록으로</button></a>
  	</div>
  	<c:if test="${dto.writer == login.userid || login.userid == '관리자'}">
  		<div>
	  		<a href="${cpath }/modify.jsp"><button>수정</button></a>
	  		<a class="deleteBtn" idx="${dto.idx }" href="${cpath }/delete.jsp?idx=${dto.idx}"><button>삭제</button></a>
  		</div>
  	</c:if>
  </div>

<script>
	const deleteBtnList = document.querySelectorAll('a.deleteBtn')
	const deleteHandler = function(event){
		event.preventDefault()
		let target = event.target
		while(target.classList.contains('deleteBtn') == false){
			target = target.parentNode
		}
		console.log(target)
		const idx = target.getAttribute('idx')
		const flag = confirm(idx+'번 게시글을 삭제하시겠습니까?')
		const url = target.href
		if(flag){
			location.href = url
		}
	}
	deleteBtnList.forEach(element => element.onclick = deleteHandler)
		
	

</script>

</body>
</html>