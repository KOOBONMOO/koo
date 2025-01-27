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
body {
    width: 100%;
    margin: 0 auto;
}

header {
    width: 100%;
    margin: 0 auto;
    position: relative;
}
.titleBox{
    position: absolute;
    right: 0;
    padding-right: 10%;
    
}
.title {
    width: 100%;
    margin: 0 auto;
    text-align: center;
    padding-top: 10px;
}
.title a{
    width: 100%;
    margin: 0 auto;
    
}

.logo{
    width: 100%;
    margin: 0 auto;
    text-align: center;
    padding-bottom: 50px;
}
.logo h1{
    width: 10%;
    margin: 0 auto;
    border: 15px solid #F15F5F;
    border-radius: 50%;
    padding: 30px;
    font-size: 3em;
}

.head1{
    width: 100%;
    margin: 0 auto;
    background: #F15F5F;
}
.head1 nav{
    width: 90%; /* 메뉴들 ul 없애주는 역할*/
    margin: 0 auto;	/*전체 메뉴바 자체의 위치*/
    display: flex;
    justify-content: space-between;
    align-content: center;
    padding: 8px 0;	/*메뉴바와 메뉴이름 사이 간격*/
    
}
.bar{ 
    width: 80%; /*메뉴들의 간격*/
    margin: 0 auto;  /*메뉴바와 메뉴이름 사이 간격*/
    display: flex; /*메뉴바 보이게하는 역할*/
    justify-content: space-between;
    align-content: center;
    text-align: center;
}
.bar li div {
    background:  #F15F5F;
    position: relative;
    left: 30%;
    transform: translateX(-50%);/*소메뉴 위치(왼쪽이냐오른쪽이냐)*/
    opacity: 0;	/*소메뉴 나오게하는 역할*/
    transition: .5s; /*소메뉴 나오거나 없어지는 속도*/
    padding: 10px 19.5%;/*큰메뉴와 소메뉴 사이 간격*/
    margin: 5px, 0;/*모름*/
    text-al
}

.bar li:hover div {
    opacity: 1;
}

.bar li div a {
	width: 50px;
    display: block;
    text-align: center;
    padding: 0;	/*메뉴바 자체를 줄이기는 하지만 소메뉴들도 간격이 좁아짐*/
    text-transform: uppercase;
    color: white;
}

.bar li div a:hover {
    color: #333;
    font-weight: bold;
    border-bottom: 1px solid  #F15F5F;
}

</style>
</head>



<body>
<header>
<div class="titleBox">
    <div class="title">
		<c:if test="${userInfo eq null }">
			<a href="../Member/login.jsp">로그인</a>&nbsp&nbsp&nbsp&nbsp
			<a href="../Member/memberRegister.jsp">회원가입</a>
		</c:if>
	</div>
	<c:if test="${userInfo ne null }">
		${userInfo.id } 님 환영합니다.<br/>
		<a href="../logout.do">로그아웃</a>&nbsp&nbsp&nbsp&nbsp
		<a href="../Member/memberModify.do">회원정보 수정</a>&nbsp&nbsp&nbsp&nbsp
		<a href="../board/list.jsp">고객센터</a>
	</c:if>
</div>        
        <div class="logo">
            <h1>
				<a href="../main/index.jsp">Meet<br>Meat</a>
			</h1>
        </div>
<div class="head1">
            <nav>
            <ul class="bar">
				<li class="bigMenu1">
					<a href="../Beef/beef.jsp">Beef
						<div class="smallMenu1">
							<a href="importProductBeef.jsp">수입산</a> 
							<a href="koreanBeef.jsp">한우</a>
						</div>
					</a>
				</li>
				<li class="bigMenu2">
					<a href="../Pork/pork.jsp">Pork</a> 
					<div class="smallMenu2">
						<a href="importProductFrok.jsp">수입산</a> 
						<a href="americanBeef.jsp">한돈</a>				
					</div>

				</li>
				<li class="bigMenu3">
					<a href="Lamb.jsp">Lamb</a>
				</li>
				<li>
					<a href="../Event/event.jsp">Event</a>
				</li>
				</ul>
        </nav>
</div>
</header>
</body>
</html>