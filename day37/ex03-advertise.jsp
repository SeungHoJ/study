<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-advertise.jsp</title>
<style>
	.root{
		width: 100%;
		margin: auto;
		text-align: center;
	}
	.sb{
		display: flex;
		justify-content: space-between;
	}
</style>
</head>
<body>

<div class="root">
	<img src="winter.jpg" height="200px">
	<h3>Happy New Year!!</h3>
</div>
<form action="ex03-close.jsp">
	<div class="sb">
		<div>
			<label><input type="checkbox" name="makeCookie">10초간 이 광고 보지않음</label>
		</div>
		<div>
			<input type="submit" value="닫기">
		</div>
	</div>
</form>


</body>
</html>