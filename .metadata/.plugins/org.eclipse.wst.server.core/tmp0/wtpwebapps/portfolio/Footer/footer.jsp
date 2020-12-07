<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta name="description" content="HTML Study">
<meta name="keywords" content="HTML,CSS,XML,JavaScript">
<meta name="author" content="Bruce">
<meta name="viewport" content="width=device-width, initial-scale=1.0">
<title>Insert title here</title>
<style type="text/css">
@import url('common.css');
.footBox{
	width:100%;
	margin: 0 auto;
	display: flex;
    justify-content: space-between;
    align-items: center;

}
.footBox1{
	width:80%;
	margin: 0 auto;
}
.footBox1 ul{
	 display: flex;
    justify-content: space-between;
    align-items: center;
}
.footBox1 ul li{
	width:20%;
	margin:0 auto;
}
.footBox1 ul p{
}
.footBox2 {
	width:20%;
}
.footBox2 ul{
	display: flex;
    justify-content: space-between;
    align-items: center;
}
.footBox2 ul li{
	padding:10px;
}
.footBox2 ul a img{
	width:100%;
}
</style>
</head>
<body>
<footer>
 <hr>
 <div class="footBox">
 <div class="footBox1">
            <ul>
                <li>
                <p><b>공지사항</b></p> 
                <p>미트미트 개인정보처리방침 개정 안내</p>
                </li>
                <li>
                    <p><b>광고문의</b></p>
                   <p>kudam92@naver.com</p> 
               </li>
               <li>
                    <p><b>사업장</b></p>
                   <p>서울 강남구 테헤란로5길 24 5층 504호</p> 
               </li>
                <li>
                    <p><b>전화문의</b></p>
                   <p>010-7147-7814</p> 
               </li>
            </ul>
 </div>    
		<div class="footBox2">
			<ul>
				<li>
					<a href="https://www.facebook.com/"><img src="../img/facebook.jpg" alt=""></a>
				</li>
				<li>
					<a href="https://www.instagram.com/"><img src="../img/instagram.jpg" alt=""></a>
				</li>
				<li>
					<a href="https://www.twitter.com/"><img src="../img/twitter.jpg" alt=""></a>
				</li>
			</ul>
		</div>
 </div>
</footer>
</body>
</html>