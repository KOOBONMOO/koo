<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html lang="ko-kr">
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>글쓰기!!!!!!!!!!!!!</title>
<link href="../css/board_combination.css" rel="stylesheet" type="text/css" >
</head>
<body>
	<a href="../main/index.jsp">
		<h1>MEET<br>MEAT</h1>
	</a>
	<form method="post" action="writeOK.do">
	<div class="con">
		<table border="1">
			<tr>
				<td>제목</td><td><input type="text" name="title" /></td>
			</tr>
			<tr>
				<td>내용</td><td><textarea name="contents" cols="100" rows="15"></textarea></td>
			</tr>
			<tr>
				<td colspan="2"><input type="submit" value="입력"> <a href="list.do">목록</a></td>
			</tr>
		</table>
		</div>
	</form>
</body>
</html>