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
<title>회원가입!!!!</title>
<link href="../css/memberRegister.css" rel="stylesheet" type="text/css">
	<script src="https://t1.daumcdn.net/mapjsapi/bundle/postcode/prod/postcode.v2.js"></script>
	<script src="../js/memberRegister.js"></script> 
	<script>
		function idCheck() {
		window.open("idCheckForm.jsp", "idCheckForm",
		"width=400, height=300");
		}
	</script>
	<script>
        function check_pw(){
 
            var pw = document.getElementById('pw').value;
            var SC = ["!","@","#","$","%"];
            var check_SC = 0;
 
            if(pw.length < 6 || pw.length>16){
                window.alert('비밀번호는 6글자 이상, 16글자 이하만 이용 가능합니다.');
                document.getElementById('pw').value='';
            }
            for(var i=0;i<SC.length;i++){
                if(pw.indexOf(SC[i]) != -1){
                    check_SC = 1;
                }
            }
            if(check_SC == 0){
                window.alert('!,@,#,$,% 의 특수문자가 들어가 있지 않습니다.')
                document.getElementById('pw').value='';
            }
            if(document.getElementById('pw').value !='' && document.getElementById('pw2').value!=''){
                if(document.getElementById('pw').value==document.getElementById('pw2').value){
                    document.getElementById('check').innerHTML='비밀번호가 일치합니다.'
                    document.getElementById('check').style.color='blue';
                }
                else{
                    document.getElementById('check').innerHTML='비밀번호가 일치하지 않습니다.';
                    document.getElementById('check').style.color='red';
                }
            }
        }
    </script>
</head>
<body>
	<header>
		<h1 align="center">
			<a href="../main/index.jsp">Meet<br>Meat</a>
		</h1>
		<form align="center" method="post" action="memberRegisterOK.do">
			<table border="1">
				<tr>
					<td>이름*</td>
					<td><input type="text" name="name" id="name" maxlength="4" size="20"required></td>
				</tr>
				<tr>
					<td>아이디*</td>
					<td colspan="2">
						<form name="memberRegister" method="post" action="IDCheckOK.jsp">
						<input type="text" name="id" id="id" maxlength="10"size="20" required readonly>
						<input type="button" onClick="idCheck()" value="중복확인">
						</form>
					</td>
				</tr>
				<tr>
					<td>닉네임</td>
					<td><input type="text" name="nickname" size="20"></td>
				</tr>
				<tr>
					<td>비밀번호*</td>
					<td><input type="password" name="pw" id="pw" size="20" required onchange="check_pw()"></td>
				</tr>
				<tr>
					<td>비밀번호 확인*</td>
					<td><input type="password" name="pw2" id="pw2" size="20" required onchange="check_pw()">&nbsp;<span id="check"></span></td>
				</tr>
				<tr>
					<td>이메일</td>
					<td><input type="email" name="email" size="20"></td>
				</tr>
				<tr>
					<td>주소*</td>
					<td>				
						<input type="text" id="sample4_postcode" placeholder="우편번호" name="postcode" readonly> 
						<input type="button" onclick="sample4_execDaumPostcode()" value="우편번호 찾기">
						<input type="text" id="sample4_roadAddress" placeholder="도로명주소" name="roadAddress"><br> 
						<input type="text" id="sample4_jibunAddress" placeholder="지번주소" name="jibunAddress">
						<span id="guide" style="color: white; display: none"></span>
						<input type="text" id="sample4_extraAddress" placeholder="참고항목" name="extraAddress">
						<input type="text" id="sample4_detailAddress" placeholder="상세주소" name="detailAddress"> 
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
						<input type="text" name="cellphone" size="20">
					</td>
				</tr>
				<tr>
					<td>성별구분</td>
					<td>
						<input type="radio" name="gender" value="male">남 &nbsp;<input type="radio" name="gender" value="female">여
					</td>
				</tr>
				<tr>
					<td colspan="2">
						<input type="submit" value="회원가입"> <input type="reset" value="취소">
					</td>
				</tr>
			</table>
		</form>
	</header>
</body>
</html>