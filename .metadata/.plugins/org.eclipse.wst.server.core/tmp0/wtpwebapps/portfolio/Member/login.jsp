 <%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>로그인!!!</title>
    <link href="../css/login.css" rel="stylesheet" type="text/css" >
</head>
<body>
   <header>
       <h1><a href="../main/index.jsp">Meet<br>Meat</a></h1>
	<c:if test="${userInfo eq null}">
		<form action="login.do" method="post">
			아이디  &nbsp&nbsp&nbsp<input type="text" name="id">
			<br />
			<br />
			비밀번호  <input type="password" name="pw"><br />
			<input type="submit" value="Login"> 
			<a href="../Member/memberRegister.do">회원가입</a>
		</form>
		<br/>
	</c:if>
    </header>
    <%@ include file="../Footer/footer.jsp" %>
</body>
</html>