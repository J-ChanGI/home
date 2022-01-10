<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>회원가입페이지</h2>
	<form action="membership" method="post">  
		
		아이디 : <input type="text" name="memid"><br>
		비밀번호 : <input type="password" name="mempass"><br>
		이름 : <input type="text" name="memname"><br>
		직급 : <input type="text" name="memrank"><br>
		부서 : <input type="text" name="memdpt"><br>
		가입일 : <input type="date" name="memjoindate"><br>	
		<input type="submit" value="가입">
	</form>
	
</body>
</html>