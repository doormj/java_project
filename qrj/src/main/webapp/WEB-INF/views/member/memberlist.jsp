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
      <jsp:include page="../menu/menu.jsp" />
      <div>
        <h3>회원목록</h3>
      </div>
      <div>
        <c:forEach var="m" items="${members}">
          ${m.memberId} : ${m.memberName} : ${m.memberEntetDate}<br>
        </c:forEach>
      </div>
    </div>
  </body>
  
</html>