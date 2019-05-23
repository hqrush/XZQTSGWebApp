<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>欢迎使用后台管理系统</title>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/reset.css" />
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/common.css" />
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/login.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/lib/jquery-3.4.1.min.js"></script>
</head>
<body>
	<div id="alogin">
		<form action="${pageContext.request.contextPath}/bmpages/doLogin"
			method="post">
			<div>
				用户名：<input type="text" name="adminName" />
			</div>
			<div>
				密 码：<input type="password" name="password" />
			</div>
			<div>
				<input type="checkbox" id="ckIsSave" /><label for="ckIsSave">是否保存</label>
			</div>
			<div>
				<input type="submit" value="提交" />
			</div>
		</form>
	</div>
</body>
</html>