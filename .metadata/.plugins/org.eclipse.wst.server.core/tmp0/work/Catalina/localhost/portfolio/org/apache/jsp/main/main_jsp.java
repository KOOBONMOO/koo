/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.38
 * Generated at: 2020-11-17 07:50:50 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp.main;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;

public final class main_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  static {
    _jspx_dependants = new java.util.HashMap<java.lang.String,java.lang.Long>(4);
    _jspx_dependants.put("/main/../Footer/footer.jsp", Long.valueOf(1605170053964L));
    _jspx_dependants.put("jar:file:/C:/apache-tomcat-9.0.38/lib/standard.jar!/META-INF/c.tld", Long.valueOf(1098678690000L));
    _jspx_dependants.put("/main/../Header/header.jsp", Long.valueOf(1605167485350L));
    _jspx_dependants.put("file:/C:/apache-tomcat-9.0.38/lib/standard.jar", Long.valueOf(1576913834000L));
  }

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = null;
  }

  private org.apache.jasper.runtime.TagHandlerPool _005fjspx_005ftagPool_005fc_005fif_0026_005ftest;

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest = org.apache.jasper.runtime.TagHandlerPool.getTagHandlerPool(getServletConfig());
  }

  public void _jspDestroy() {
    _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.release();
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSP들은 오직 GET, POST 또는 HEAD 메소드만을 허용합니다. Jasper는 OPTIONS 메소드 또한 허용합니다.");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("    \r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"HTML Study\">\r\n");
      out.write("<meta name=\"keywords\" content=\"HTML,CSS,XML,JavaScript\">\r\n");
      out.write("<meta name=\"author\" content=\"Bruce\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>미트미트 메인!!!</title>\r\n");
      out.write("<link href=\"../css/main.css\" rel=\"stylesheet\" type=\"text/css\" >\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"HTML Study\">\r\n");
      out.write("<meta name=\"keywords\" content=\"HTML,CSS,XML,JavaScript\">\r\n");
      out.write("<meta name=\"author\" content=\"Bruce\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import url('common.css');\r\n");
      out.write("body {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("header {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    position: relative;\r\n");
      out.write("}\r\n");
      out.write(".titleBox{\r\n");
      out.write("    position: absolute;\r\n");
      out.write("    right: 0;\r\n");
      out.write("    padding-right: 10%;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".title {\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding-top: 10px;\r\n");
      out.write("}\r\n");
      out.write(".title a{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".logo{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding-bottom: 50px;\r\n");
      out.write("}\r\n");
      out.write(".logo h1{\r\n");
      out.write("    width: 10%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    border: 15px solid #F15F5F;\r\n");
      out.write("    border-radius: 50%;\r\n");
      out.write("    padding: 30px;\r\n");
      out.write("    font-size: 3em;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".head1{\r\n");
      out.write("    width: 100%;\r\n");
      out.write("    margin: 0 auto;\r\n");
      out.write("    background: #F15F5F;\r\n");
      out.write("}\r\n");
      out.write(".head1 nav{\r\n");
      out.write("    width: 90%; /* 메뉴들 ul 없애주는 역할*/\r\n");
      out.write("    margin: 0 auto;\t/*전체 메뉴바 자체의 위치*/\r\n");
      out.write("    display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-content: center;\r\n");
      out.write("    padding: 8px 0;\t/*메뉴바와 메뉴이름 사이 간격*/\r\n");
      out.write("    \r\n");
      out.write("}\r\n");
      out.write(".bar{ \r\n");
      out.write("    width: 80%; /*메뉴들의 간격*/\r\n");
      out.write("    margin: 0 auto;  /*메뉴바와 메뉴이름 사이 간격*/\r\n");
      out.write("    display: flex; /*메뉴바 보이게하는 역할*/\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-content: center;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("}\r\n");
      out.write(".bar li div {\r\n");
      out.write("    background:  #F15F5F;\r\n");
      out.write("    position: relative;\r\n");
      out.write("    left: 30%;\r\n");
      out.write("    transform: translateX(-50%);/*소메뉴 위치(왼쪽이냐오른쪽이냐)*/\r\n");
      out.write("    opacity: 0;\t/*소메뉴 나오게하는 역할*/\r\n");
      out.write("    transition: .5s; /*소메뉴 나오거나 없어지는 속도*/\r\n");
      out.write("    padding: 10px 19.5%;/*큰메뉴와 소메뉴 사이 간격*/\r\n");
      out.write("    margin: 5px, 0;/*모름*/\r\n");
      out.write("    text-al\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bar li:hover div {\r\n");
      out.write("    opacity: 1;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bar li div a {\r\n");
      out.write("\twidth: 50px;\r\n");
      out.write("    display: block;\r\n");
      out.write("    text-align: center;\r\n");
      out.write("    padding: 0;\t/*메뉴바 자체를 줄이기는 하지만 소메뉴들도 간격이 좁아짐*/\r\n");
      out.write("    text-transform: uppercase;\r\n");
      out.write("    color: white;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".bar li div a:hover {\r\n");
      out.write("    color: #333;\r\n");
      out.write("    font-weight: bold;\r\n");
      out.write("    border-bottom: 1px solid  #F15F5F;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<body>\r\n");
      out.write("<header>\r\n");
      out.write("<div class=\"titleBox\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f0(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f1(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>        \r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <h1>\r\n");
      out.write("\t\t\t\t<a href=\"../main/main.jsp\">Meet<br>Meat</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("<div class=\"head1\">\r\n");
      out.write("            <nav>\r\n");
      out.write("            <ul class=\"bar\">\r\n");
      out.write("\t\t\t\t<li class=\"bigMenu1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"../Beef/beef.jsp\">Beef\r\n");
      out.write("\t\t\t\t\t\t<div class=\"smallMenu1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"importProductBeef.jsp\">수입산</a> \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"koreanBeef.jsp\">한우</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"bigMenu2\">\r\n");
      out.write("\t\t\t\t\t<a href=\"../Pork/pork.jsp\">Pork</a> \r\n");
      out.write("\t\t\t\t\t<div class=\"smallMenu2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"importProductFrok.jsp\">수입산</a> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"americanBeef.jsp\">한돈</a>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"bigMenu3\">\r\n");
      out.write("\t\t\t\t\t<a href=\"Lamb.jsp\">Lamb</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"../Event/event.jsp\">Event</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t</ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("</div>\r\n");
      out.write("</header>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("<!-- \r\n");
      out.write("<header>\r\n");
      out.write("<div class=\"titleBox\">\r\n");
      out.write("    <div class=\"title\">\r\n");
      out.write("\t\t");
      if (_jspx_meth_c_005fif_005f2(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("\r\n");
      out.write("\t</div>\r\n");
      out.write("\t");
      if (_jspx_meth_c_005fif_005f3(_jspx_page_context))
        return;
      out.write("\r\n");
      out.write("</div>        \r\n");
      out.write("        <div class=\"logo\">\r\n");
      out.write("            <h1>\r\n");
      out.write("\t\t\t\t<a href=\"main.jsp\">Meet<br>Meat</a>\r\n");
      out.write("\t\t\t</h1>\r\n");
      out.write("        </div>\r\n");
      out.write("<div class=\"head1\">\r\n");
      out.write("            <nav>\r\n");
      out.write("            <ul class=\"bar\">\r\n");
      out.write("            \r\n");
      out.write("\t\t\t\t<li class=\"bigMenu1\">\r\n");
      out.write("\t\t\t\t\t<a href=\"Beef/beef.jsp\">소고기\r\n");
      out.write("\t\t\t\t\t\t<div class=\"smallMenu1\">\r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"importProductBeef.jsp\">수입산</a> \r\n");
      out.write("\t\t\t\t\t\t\t<a href=\"koreanBeef.jsp\">한우</a>\r\n");
      out.write("\t\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t\t</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t\r\n");
      out.write("\t\t\t\t<li class=\"bigMenu2\">\r\n");
      out.write("\t\t\t\t\t<a href=\"Pork/pork.jsp\">돼지고기</a> \r\n");
      out.write("\t\t\t\t\t<div class=\"smallMenu2\">\r\n");
      out.write("\t\t\t\t\t\t<a href=\"importProductFrok.jsp\">수입산</a> \r\n");
      out.write("\t\t\t\t\t\t<a href=\"americanBeef.jsp\">한돈</a>\t\t\t\t\r\n");
      out.write("\t\t\t\t\t</div>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li class=\"bigMenu3\">\r\n");
      out.write("\t\t\t\t\t<a href=\"Lamb.jsp\">양고기</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"#\">STORE</a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("            </ul>\r\n");
      out.write("        </nav>\r\n");
      out.write("</div>\r\n");
      out.write("    </header>\r\n");
      out.write("-->\r\n");
      out.write("    <main>\r\n");
      out.write("        <div class=\"text\">\r\n");
      out.write("              <p>미트미트는 세일중</p>\r\n");
      out.write("            <h2>지금이 먹어볼 기회! 놓치지 마세요</h2>\r\n");
      out.write("        </div>\r\n");
      out.write("        <div class=\"main_b\">\r\n");
      out.write("\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <figure><a href=\"https://www.foodjang.com/goods/goods_view.php?goodsNo=1000002122\"><img src=\"../img/1.jpg\" alt=\"\"></a></figure>\r\n");
      out.write("                    <figcaption>\r\n");
      out.write("                        <p><b>꽃갈비살(1~2인분) 300g<br>\r\n");
      out.write("                                23,500원<br></b></p>\r\n");
      out.write("                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>\r\n");
      out.write("                    </figcaption>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <figure><a href=\"https://www.foodjang.com/goods/goods_view.php?goodsNo=1000010868&mtn=1%5E%7C%5E%ED%91%B8%EB%93%9C%EC%9E%A5%EC%9D%80+%EC%84%B8%EC%9D%BC%EC%A4%91%5E%7C%5En\"><img src=\"../img/tomahawk.jpg\" alt=\"\"></a></figure>\r\n");
      out.write("                    <figcaption>\r\n");
      out.write("                        <p><b>토마호크 스테이크(1~2인분) 300g<br>\r\n");
      out.write("                                25,500원<br></b></p>\r\n");
      out.write("                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>\r\n");
      out.write("                    </figcaption>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <figure><a href=\"https://www.foodjang.com/goods/goods_view.php?goodsNo=1000004235\"><img src=\"../img/3.jpg\" alt=\"\"></a></figure>\r\n");
      out.write("                    <figcaption>\r\n");
      out.write("                        <p><b>마왕 스테이크(4~5인분) 850g<br>\r\n");
      out.write("                                28,500원<br></b></p>\r\n");
      out.write("                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>\r\n");
      out.write("                    </figcaption>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <figure><a href=\"https://www.foodjang.com/goods/goods_view.php?goodsNo=1000000136\"><img src=\"../img/4.jpg\" alt=\"\"></a></figure>\r\n");
      out.write("                    <figcaption>\r\n");
      out.write("                        <p><b>프리미엄 삼겹살 500g (1~2인분)<br>\r\n");
      out.write("                                5,500원<br></b></p>\r\n");
      out.write("                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>\r\n");
      out.write("                    </figcaption>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <figure><a href=\"https://www.foodjang.com/goods/goods_view.php?goodsNo=1000002851\"><img src=\"../img/5.jpg\" alt=\"\"></a></figure>\r\n");
      out.write("                    <figcaption>\r\n");
      out.write("                        <p><b>목살 스테이크(1~2인분) 500g<br>\r\n");
      out.write("                                7,500원<br></b></p>\r\n");
      out.write("                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>\r\n");
      out.write("                    </figcaption>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <figure><a href=\"https://www.foodjang.com/goods/goods_view.php?goodsNo=1000010871\"><img src=\"../img/6.jpg\" alt=\"\"></a></figure>\r\n");
      out.write("                    <figcaption>\r\n");
      out.write("                        <p><b>프리미엄 갈매기살(1~2) 400g<br>\r\n");
      out.write("                                9,700원<br></b></p>\r\n");
      out.write("                        <p>12월 31일까지 주문시 1,000원 할인쿠폰 증정!</p>\r\n");
      out.write("                    </figcaption>\r\n");
      out.write("                </li>\r\n");
      out.write("            </ul>\r\n");
      out.write("\r\n");
      out.write("        </div>\r\n");
      out.write("        </main>\r\n");
      out.write("<!-- <footer>\r\n");
      out.write(" <hr>\r\n");
      out.write(" <div class=\"footBox\">\r\n");
      out.write(" <div class=\"footBox1\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                <p><b>공지사항</b></p> \r\n");
      out.write("                <p>미트미트 개인정보처리방침 개정 안내</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <p><b>광고문의</b></p>\r\n");
      out.write("                   <p>kudam92@naver.com</p> \r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                    <p><b>사업장</b></p>\r\n");
      out.write("                   <p>서울 강남구 테헤란로5길 24 5층 504호</p> \r\n");
      out.write("               </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <p><b>전화문의</b></p>\r\n");
      out.write("                   <p>010-7147-7814</p> \r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write(" </div>\r\n");
      out.write("         \r\n");
      out.write("\t\t<div class=\"footBox2\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/\"><img src=\"img/facebook.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.instagram.com/\"><img src=\"img/instagram.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.twitter.com/\"><img src=\"img/twitter.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write(" </div>\r\n");
      out.write("</footer> -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"UTF-8\">\r\n");
      out.write("<meta name=\"description\" content=\"HTML Study\">\r\n");
      out.write("<meta name=\"keywords\" content=\"HTML,CSS,XML,JavaScript\">\r\n");
      out.write("<meta name=\"author\" content=\"Bruce\">\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1.0\">\r\n");
      out.write("<title>Insert title here</title>\r\n");
      out.write("<style type=\"text/css\">\r\n");
      out.write("@import url('common.css');\r\n");
      out.write(".footBox{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("\r\n");
      out.write("}\r\n");
      out.write(".footBox1{\r\n");
      out.write("\twidth:80%;\r\n");
      out.write("\tmargin: 0 auto;\r\n");
      out.write("}\r\n");
      out.write(".footBox1 ul{\r\n");
      out.write("\t display: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".footBox1 ul li{\r\n");
      out.write("\twidth:20%;\r\n");
      out.write("\tmargin:0 auto;\r\n");
      out.write("}\r\n");
      out.write(".footBox1 ul p{\r\n");
      out.write("}\r\n");
      out.write(".footBox2 {\r\n");
      out.write("\twidth:20%;\r\n");
      out.write("}\r\n");
      out.write(".footBox2 ul{\r\n");
      out.write("\tdisplay: flex;\r\n");
      out.write("    justify-content: space-between;\r\n");
      out.write("    align-items: center;\r\n");
      out.write("}\r\n");
      out.write(".footBox2 ul li{\r\n");
      out.write("\tpadding:10px;\r\n");
      out.write("}\r\n");
      out.write(".footBox2 ul a img{\r\n");
      out.write("\twidth:100%;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("<footer>\r\n");
      out.write(" <hr>\r\n");
      out.write(" <div class=\"footBox\">\r\n");
      out.write(" <div class=\"footBox1\">\r\n");
      out.write("            <ul>\r\n");
      out.write("                <li>\r\n");
      out.write("                <p><b>공지사항</b></p> \r\n");
      out.write("                <p>미트미트 개인정보처리방침 개정 안내</p>\r\n");
      out.write("                </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <p><b>광고문의</b></p>\r\n");
      out.write("                   <p>kudam92@naver.com</p> \r\n");
      out.write("               </li>\r\n");
      out.write("               <li>\r\n");
      out.write("                    <p><b>사업장</b></p>\r\n");
      out.write("                   <p>서울 강남구 테헤란로5길 24 5층 504호</p> \r\n");
      out.write("               </li>\r\n");
      out.write("                <li>\r\n");
      out.write("                    <p><b>전화문의</b></p>\r\n");
      out.write("                   <p>010-7147-7814</p> \r\n");
      out.write("               </li>\r\n");
      out.write("            </ul>\r\n");
      out.write(" </div>    \r\n");
      out.write("\t\t<div class=\"footBox2\">\r\n");
      out.write("\t\t\t<ul>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.facebook.com/\"><img src=\"../img/facebook.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.instagram.com/\"><img src=\"../img/instagram.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t\t<li>\r\n");
      out.write("\t\t\t\t\t<a href=\"https://www.twitter.com/\"><img src=\"../img/twitter.jpg\" alt=\"\"></a>\r\n");
      out.write("\t\t\t\t</li>\r\n");
      out.write("\t\t\t</ul>\r\n");
      out.write("\t\t</div>\r\n");
      out.write(" </div>\r\n");
      out.write("</footer>\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
      out.write("\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }

  private boolean _jspx_meth_c_005fif_005f0(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f0 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f0_reused = false;
    try {
      _jspx_th_c_005fif_005f0.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f0.setParent(null);
      // /main/../Header/header.jsp(119,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f0.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo eq null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f0 = _jspx_th_c_005fif_005f0.doStartTag();
      if (_jspx_eval_c_005fif_005f0 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<a href=\"../Member/login.jsp\">로그인</a>&nbsp&nbsp&nbsp&nbsp\r\n");
          out.write("\t\t\t<a href=\"../Member/memberRegister.jsp\">회원가입</a>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f0.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f0.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f0);
      _jspx_th_c_005fif_005f0_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f0, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f0_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f1(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f1 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f1_reused = false;
    try {
      _jspx_th_c_005fif_005f1.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f1.setParent(null);
      // /main/../Header/header.jsp(124,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f1.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo ne null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f1 = _jspx_th_c_005fif_005f1.doStartTag();
      if (_jspx_eval_c_005fif_005f1 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님 환영합니다.<br/>\r\n");
          out.write("\t\t<a href=\"../logout.do\">로그아웃</a>&nbsp&nbsp&nbsp&nbsp\r\n");
          out.write("\t\t<a href=\"../Member/memberModify.do\">회원정보 수정</a>&nbsp&nbsp&nbsp&nbsp\r\n");
          out.write("\t\t<a href=\"../board/list.jsp\">고객센터</a>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f1.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f1.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f1);
      _jspx_th_c_005fif_005f1_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f1, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f1_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f2(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f2 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f2_reused = false;
    try {
      _jspx_th_c_005fif_005f2.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f2.setParent(null);
      // /main/main.jsp(21,2) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f2.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo eq null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f2 = _jspx_th_c_005fif_005f2.doStartTag();
      if (_jspx_eval_c_005fif_005f2 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t\t<a href=\"Member/login.jsp\">로그인</a>&nbsp&nbsp&nbsp&nbsp\r\n");
          out.write("\t\t\t<a href=\"Member/memberRegister.jsp\">회원가입</a>\r\n");
          out.write("\t\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f2.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f2.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f2);
      _jspx_th_c_005fif_005f2_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f2, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f2_reused);
    }
    return false;
  }

  private boolean _jspx_meth_c_005fif_005f3(javax.servlet.jsp.PageContext _jspx_page_context)
          throws java.lang.Throwable {
    javax.servlet.jsp.PageContext pageContext = _jspx_page_context;
    javax.servlet.jsp.JspWriter out = _jspx_page_context.getOut();
    //  c:if
    org.apache.taglibs.standard.tag.rt.core.IfTag _jspx_th_c_005fif_005f3 = (org.apache.taglibs.standard.tag.rt.core.IfTag) _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.get(org.apache.taglibs.standard.tag.rt.core.IfTag.class);
    boolean _jspx_th_c_005fif_005f3_reused = false;
    try {
      _jspx_th_c_005fif_005f3.setPageContext(_jspx_page_context);
      _jspx_th_c_005fif_005f3.setParent(null);
      // /main/main.jsp(27,1) name = test type = boolean reqTime = true required = true fragment = false deferredValue = false expectedTypeName = null deferredMethod = false methodSignature = null
      _jspx_th_c_005fif_005f3.setTest(((java.lang.Boolean) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo ne null }", boolean.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null)).booleanValue());
      int _jspx_eval_c_005fif_005f3 = _jspx_th_c_005fif_005f3.doStartTag();
      if (_jspx_eval_c_005fif_005f3 != javax.servlet.jsp.tagext.Tag.SKIP_BODY) {
        do {
          out.write("\r\n");
          out.write("\t\t");
          out.write((java.lang.String) org.apache.jasper.runtime.PageContextImpl.proprietaryEvaluate("${userInfo.id }", java.lang.String.class, (javax.servlet.jsp.PageContext)_jspx_page_context, null));
          out.write(" 님 환영합니다.<br/>\r\n");
          out.write("\t\t<a href=\"logout.do\">로그아웃</a>&nbsp&nbsp&nbsp&nbsp\r\n");
          out.write("\t\t<a href=\"Member/memberModify.do\">회원정보 수정</a>&nbsp&nbsp&nbsp&nbsp\r\n");
          out.write("\t\t<a href=\"board/list.jsp\">고객센터</a>\r\n");
          out.write("\t");
          int evalDoAfterBody = _jspx_th_c_005fif_005f3.doAfterBody();
          if (evalDoAfterBody != javax.servlet.jsp.tagext.BodyTag.EVAL_BODY_AGAIN)
            break;
        } while (true);
      }
      if (_jspx_th_c_005fif_005f3.doEndTag() == javax.servlet.jsp.tagext.Tag.SKIP_PAGE) {
        return true;
      }
      _005fjspx_005ftagPool_005fc_005fif_0026_005ftest.reuse(_jspx_th_c_005fif_005f3);
      _jspx_th_c_005fif_005f3_reused = true;
    } finally {
      org.apache.jasper.runtime.JspRuntimeLibrary.releaseTag(_jspx_th_c_005fif_005f3, _jsp_getInstanceManager(), _jspx_th_c_005fif_005f3_reused);
    }
    return false;
  }
}
