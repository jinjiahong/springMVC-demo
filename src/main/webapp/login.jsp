 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!-- 给此jsp定义默认编码类型，乱码则加上编码定义 -->
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
 <title>Demo01 - 登陆</title>
   <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="bootstrap/scripts/jquery.min.js"></script>
   <script src="bootstrap/js/bootstrap.min.js"></script>
</head>
<body>
	<form class="form-horizontal" role="form" action="login.html">
		<div class="form-group">
			<label for="userName" class="control-label">用户名：</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="userName" name="userName"
					placeholder="请输入用户名">
			</div>
		</div>
		<div class="form-group">
			<label for="password" class="col-sm-2 control-label">密码：</label>
			<div class="col-sm-10">
				<input type="text" class="form-control" id="password" name="password"
					placeholder="请输入密码">
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<div class="checkbox" style="margin-left: 160px;">
					<label> <input type="checkbox">请记住我
					</label>
				</div>
			</div>
		</div>
		<div class="form-group">
			<div class="col-sm-offset-2 col-sm-10">
				<button type="submit" class="btn btn-default"
					style="margin-left: 160px;">登录</button>
			</div>
		</div>
	</form>
	<font color = "red">${error }</font>
</body>
</html>