<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<div align="center">
		<jsp:include page="../menu/menu.jsp"></jsp:include>
		<div>
			<c:forEach items="${members }" var="m">
			${m.memberId } : &{m.memberName } : ${m.memeberEntetDate }<br>
			</c:forEach>
		</div>
	</div>
</body>
</html>