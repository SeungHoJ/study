<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>login.jsp</title>
</head>


<c:if test="${empty login}">

	<form action="login-action.jsp" method="POST">
		<p><input type="text" name="userid" placeholder="ID" required autofocus></p>
		<p><input type="password" name="userpw" placeholder="Password" required></p>
		<p><input type="submit" value="로그인"></p>
	</form>
	<a href="join.jsp"><button>회원가입</button></a>
	<a href="list.jsp"><button>회원목록</button></a>

</c:if>	

<c:if test="${not empty login}">
	<h3>${login.username }님 환영합니다.</h3>	
	<a href="logout.jsp"><button>로그아웃</button></a>
	<a href="modify.jsp"><button>정보수정</button></a>
	<a class="deleteLink" href="delete.jsp"><button>회원탈퇴</button></a>
	
</c:if>
	
<script>
			function deleteHandler(event){
				event.preventDefault()
				const flag = confirm('정말 삭제하시겠습니까?')
				if(flag){
					location.href = event.target.parentNode.href
				}
			}
			const aList = document.querySelectorAll('a.deleteLink')
			aList.forEach(a => a.onclick = deleteHandler)
		</script>	
	
</header>
</body>
</html>