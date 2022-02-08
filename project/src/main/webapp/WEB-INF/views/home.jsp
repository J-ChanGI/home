<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<html>
<head>
	<title>Home</title>
</head>
<body>
 로그인된 아이디 : ${sessionScope.login}<br>
	<a href="memjoin">회원가입</a>
	<a href="loginjoin">로그인</a>
	<a href="logout">로그아웃</a><br>
	<c:if test="${sessionScope.login !=null }">
	<a href="mypagejoin">내정보</a>
	</c:if>
</body>
</html>
