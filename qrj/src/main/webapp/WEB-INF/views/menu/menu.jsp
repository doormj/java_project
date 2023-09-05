<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<header>
		<nav>
			<ul>
				<li><a href="home.do">Home</a></li>
				<li><a href="#">menu2</a></li>
				<li><a href="#">menu3</a></li>
				<li><a href="noticeselectlist.do">Content</a></li>
				<c:if test="${empty id }">
					<li><a href="memberjoinform.do">회원가입</a></li>
					<li><a href="memberloginform.do">Login</a></li>
				</c:if>
				<c:if test="${not empty id }">
					<li><a href="memberlist.do">Member</a></li>
					<li><a href="memberlogout.do">Logout</a></li>
					<li><a href="#">menu7</a></li>
					<li>${name }님접속중</li>
				</c:if>
			</ul>
		</nav>
	</header>
</body>
</html>