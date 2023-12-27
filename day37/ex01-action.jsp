<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ page import="java.net.URLEncoder, java.net.URLDecoder" %>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<%
	String memo = request.getParameter("memo");
	
	// new Cookie(쿠키이름, 쿠키값)
	Cookie cookie = new Cookie("memo",URLEncoder.encode(memo,"UTF-8"));
	
	// 쿠키의 유효시간을 설정한다. 60초, 60분, 24시간, 7일
	// 만료된 시간이 모두 지나면 쿠키는 소멸한다
	cookie.setMaxAge(60*60*24*7);
	
	// 서버에서 생성한 쿠키 객체를 클라이언트에게보내기 위해서 응답에 추가한다
	response.addCookie(cookie);
	
	// 쿠키는 클라이언트에 저장되므로, 포워드 및 리다이렉트에 의한 차이가 없다
	// 오히려 "재방문시"에 쿠키가 적용되기 때문에 리다이렉트를 지정해야 한다
	response.sendRedirect("ex01.jsp");
%>

</body>
</html>