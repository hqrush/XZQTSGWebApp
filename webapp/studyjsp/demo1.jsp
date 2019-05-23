<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ page import="java.util.*,java.text.SimpleDateFormat"%>

<%
	String path = request.getContextPath();
	String basePath = request.getScheme() + "://" + request.getServerName() + ":" + request.getServerPort()
			+ path + "/";
%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

	<%!// 用<%! 开头，可以定义变量和方法函数
	String s = "张三";
	int i = 1;

	int add(int x, int y) {
		return x + y;
	}%>
	<%
		out.print("<br />");
	%>
	<%
		//这里是jsp脚本
		out.print("这是用jsp脚本out.pring打印出来的文字！这里不换行！");
		out.println("这段用jsp脚本out.println打印出来的文字是换行的！");
		out.println(s + "计算了3+5 = " + add(3, 5));
	%>

	<%
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
		s = sdf.format(new Date());
	%>
	今天是<%=s%>
	<%=path%>
	<%=basePath%>
	<hr>
	<%!String printMultiTable() {
		String s = "";
		for (int i = 1; i < 10; i++) {
			for (int j = 1; j <= i; j++) {

				s += i + "*" + j + "=" + (i * j) + "&nbsp;&nbsp;&nbsp;&nbsp;";
			}
			s += "<br />";
		}
		return s;
	}%>
	<h1>九九乘法表</h1>
	<p><%=printMultiTable()%>
</body>
</html>