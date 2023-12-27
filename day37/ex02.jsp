<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex02.jsp</title>
<style>

	.black{
		background-color: black;
		color: #dadada;
	}
	.lime{
		background-color: black;
		color: #00FF00;	
	}
	.aqua{
		background-color: black;
		color: #00FFFF;
		
	}
	.orange{
		background-color: black;
		color: orange;
	}
	.pre{
		font-size: 16px;
	}
</style>
</head>
<body class="${cookie.theme.value }">

<h1>쿠키를 활용한 색상 테마 설정</h1>
<hr>

<form action="ex02-action.jsp">
	<select name="theme">
		<option>white</option>
		<option ${cookie.theme.value == 'black' ? 'selected' : '' }>black</option>
		<option ${cookie.theme.value == 'lime' ? 'selected' : '' }>lime</option>
		<option ${cookie.theme.value == 'aqua' ? 'selected' : '' }>aqua</option>
		<option ${cookie.theme.value == 'orange' ? 'selected' : '' }>orange</option>
	</select>
	<input type="submit">
</form>

<fieldset>	
	<legend>lorem</legend>
	<pre>Lorem ipsum dolor sit amet, consectetur adipiscing elit, sed do eiusmod tempor incididunt ut labore et dolore magna aliqua. Ut enim ad minim veniam,<br>quis nostrud exercitation ullamco laboris nisi ut aliquip ex ea commodo consequat.<br>Duis aute irure dolor in reprehenderit in voluptate velit esse cillum dolore eu fugiat nulla pariatur.<br>Excepteur sint occaecat cupidatat non proident, sunt in culpa qui officia deserunt mollit anim id est laborum.
	</pre>
</fieldset>

<div>
	<button id="checkCookie">쿠키확인</button>
	
</div>


<script>

	checkCookie.onclick = function(){
		alert(document.cookie)
	}
</script>
</body>
</html>