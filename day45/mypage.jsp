<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ include file="header.jsp" %>


	<div class="inner">
		<div>
			<ul>
				<li><a href="${cpath }/mypage.jsp">회원정보</a></li>
				<li><a href="${cpath }/myboard.jsp">내가 쓴 글</a></li>
			</ul>
		</div>
		<div>
			<table>
				<tr>
					<td>ID</td>
					<td>${login.userid }</td>
				</tr>
				<tr>
					<td>Password</td>
					<td><input type="password" name="userpw" value="${login.userpw }"></td>
				</tr>
				<tr>
					<td>Name</td>
					<td><input type="text" name="username" value="${login.username }"></td>
				</tr>
			</table>
		</div>
	</div>

</body>
</html>