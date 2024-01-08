<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="ex03.*"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<c:set var="cpath" value="${pageContext.request.contextPath }"></c:set>    
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>ex03-action.jsp</title>
</head>
<body>

<!--jsp:usebean 대신 fileUtil을 이용하여 dto를 생성한다  -->
<c:set var="fileUtil" value="${FileUtil.getInstance() }"></c:set>
<c:set var="dto" value="${fileUtil.getDTO(pageContext.request) }"></c:set>

<!--생성된 dto를 dao.insert() 함수에 전달하면서 함수를 실행한다 -->
<c:set var="reviewDAO" value="${ReviewDAO.getInstance() }"></c:set>
<c:set var="row" value="${reviewDAO.insert(dto) }"></c:set>

<script>
	const row = '${row}'
	alert('영향을 받은 줄수 : ' + row)
	location.href = '${cpath}/ex03-form.jsp'
</script>
</body>
</html>