<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-close.jsp</title>
</head>
<body>


<%
	String makeCookie = request.getParameter("makeCookie");
	if(makeCookie != null){
		Cookie cookie = new Cookie("donotpopup","on");	// 값은 뭐든 상관없다
		cookie.setMaxAge(10);
		response.addCookie(cookie);
	}
%>
<script>
	window.close()
</script>
</body>
</html>