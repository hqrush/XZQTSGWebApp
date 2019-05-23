<%@ page language="java" contentType="text/html; charset=UTF-8"
  pageEncoding="UTF-8"%>
<%@ page import="java.util.*"%>
<html>
<body>
  <h2>Hello World!This is index.jsp!</h2>
  <hr>
  <h1>application内置对象</h1>
  <%
    application.setAttribute("city", "北京");
    application.setAttribute("postcode", "10000");
    application.setAttribute("email", "lisi@126.com");
  %>
  所在城市是：<%=application.getAttribute("city")%><br /> application中的属性有：
  <%
    Enumeration attributes = application.getAttributeNames();
    while (attributes.hasMoreElements()) {
      out.println(attributes.nextElement() + "&nbsp;&nbsp;");
    }
  %>
  Jsp引擎的版本号<%=application.getServerInfo()%>

  <hr>
  <a href="hello">Hello</a>
  <a href="bmpages/login">登录</a>
  <a href="bmpages/admin/add">添加</a>
  <a href="bmpages/admin/list">查看所有管理员</a>

</body>
</html>