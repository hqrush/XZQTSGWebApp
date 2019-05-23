<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<jsp:useBean id="role"
		class="org.xzqtsg.webapp_core.domain.entity.Role"></jsp:useBean>
	<%=role.getName()%>
</body>
</html>