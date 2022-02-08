<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html>
<head>
	<title>Home</title>
</head>
<body>
 로그인된 아이디 : ${sessionScope.login}<br>
	<a href="memjoin">회원가입</a>
	<a href="loginjoin">로그인</a>
	<a href="logout">로그아웃</a>
</body>
</html>
