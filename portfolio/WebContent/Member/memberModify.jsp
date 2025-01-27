<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
 <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
 
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>회원정보수정!!!</title>
<link href="../css/memberRegister.css" rel="stylesheet" type="text/css">
</head>
<body>
	<header>
		<h1 align="center">
			<a href="../main/index.jsp">Meet<br>Meat
			</a>
		</h1>
		<form align="center" action="memberModifyOK.do" method="post">
		<table border="1">
		<tr>
			<td>이름</td>
			<td><input type="text" name="name" size="30" value="${userInfo.name}" readonly></td>
		</tr>
		<tr>
			<td>아이디</td>
			<td><input type="text" name="id" size="30" value="${userInfo.id }" readonly><br /></td>
		</tr>
		<tr>
			<td>닉네임</td>
			<td><input type="text" name="nickname" size="20" value="${userInfo.nickname }"><br /></td>
		</tr>
		<tr>
			<td>비밀번호</td>
			<td><input type="password" name="pw" size="20"></td>
		</tr>
		<tr>
			<td>비밀번호 확인</td>
			<td><input type="password" name="pw2" size="20"></td>
		</tr>
		<tr>
			<td>이메일</td>
			<td><input type="email" name="email" size="20" value="${userInfo.email }"></td>
		</tr>
		<tr>
			<td>주소</td>
			<td>
				<input type="text" id="sample4_postcode" placeholder="우편번호" name="postcode" value="${userInfo.postcode }" readonly>
				<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기">
				<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name="roadAddress" value="${userInfo.roadAddress }">
			<br>	
				<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name="jibunAddress" value="${userInfo.jibunAddress }">
				<span id="guide" style="color:#999;display:none"></span>
				<input type="text" id="sample4_extraAddress" placeholder="참고항목" name="extraAddress" value="${userInfo.extraAddress }">
				<input type="text" id="sample4_detailAddress" placeholder="상세주소" name="detailAddress" value="${userInfo.detailAddress }">
			</td>
		</tr>
		<tr>
			<td>생년월일</td>
			<td>
				<input type="text" placeholder="YY" name="birthYear" size="5" max="4">
				<input type="text" placeholder="MM" name="birthMonth" size="5" max="12">
				<input type="text" placeholder="DD" name="birthDate"size="5" max="31">
			</td>
		</tr>
		<tr>
			<td>전화번호</td>
			<td>
				<input type="text" name="cellphone" value="${userInfo.cellphone }">
			</td>
		</tr>
		<tr>
			<td>성별</td>
			<td>
				<input type="radio" name="gender" value="male" ${userInfo.gender eq 'male' ? 'checked':''}>남 &nbsp;
				<input type="radio" name="gender" value="female" <c:if test="${userInfo.gender eq 'female'}"> checked </c:if> >여
			</td>
		</tr>
		<tr>
			<td colspan="2">
				<input type="submit" value="회원정보수정"> <input type="reset" value="취소">
			</td>
		</tr>
		</table>
	</form>
	</header>
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src= "../js/memberRegister.js"></script>
</body>
</html>