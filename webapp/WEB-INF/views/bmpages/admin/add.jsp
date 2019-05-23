<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>添加管理员</title>
<link type="text/css" rel="stylesheet"
	href="<%=request.getContextPath()%>/static/css/bootstrap431/bootstrap.min.css" />
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/lib/jquery-3.4.1.min.js"></script>
<script type="text/javascript"
	src="<%=request.getContextPath()%>/static/js/lib/bootstrap431.min.js"></script>
</head>
<body>
	<h1>添加管理员</h1>
	<hr>
	<div class="well">
		<form action="${pageContext.request.contextPath}/bmpages/admin/doAdd"
			method="post" class="form-horizontal">
			<div>
				<span> 登录名：</span> <input name="UserName" type="text" width="100" />
			</div>
			<div>
				<span>密 码：</span> <input name="Password" type="password" width="100" />
			</div>
			<div>
				<span>密码确认：</span> <input name="Password2" type="password"
					width="100" />
			</div>
			<div>
				<span>真实姓名：</span> <input name="RealName" type="password"
					width="100" />
			</div>
			<div class="form-group">
				<label class="checkbox-inline"> <input type="radio"
					value="true" checked="checked">启用
				</label> <label class="checkbox-inline"> <input type="radio"
					value="false">不启用
				</label>
			</div>
			<div>
				<span>所属角色：</span> <select name="RoleId"></select>
			</div>
			<div>
				<input name="btnAdd" type="submit" value="添加" />
			</div>
		</form>
	</div>
</body>
</html>