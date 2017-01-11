<!-- <html>
<body>
<h2>Hello World!</h2>
</body>
</html>
 -->
 <%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%><!-- 给此jsp定义默认编码类型，乱码则加上编码定义 -->
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
   <title>Bootstrap 实例 - 小金test</title>
   <link href="bootstrap/css/bootstrap.min.css" rel="stylesheet">
   <script src="bootstrap/scripts/jquery.min.js" type="text/javascript"></script>
   <script src="bootstrap/js/bootstrap.min.js" type="text/javascript"></script>
</head>
<body>
<h1>Test第一个bootstrap Demo</h1>
<!-- p标签自带换行 -->
<!-- <p><strong>p标签</strong><em>自带</em><strong>换行</strong><small>吗？</small></p>

<p>父文本大小</p>
<small>small显示的内容为正常文本大小的85%</small><br>
<strong>strong显示的内容为正常文本的粗体</strong><br>
<em>em显示的内容为正常文本大小的斜体</em><br> -->

<!-- form表单 -->
<form class="form-horizontal" role="form" action="index.html" method="post">
 <!--  <div class="form-group">
    <label for="userName" class="control-label">用户名：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="userName" placeholder="请输入用户名">
    </div>
  </div>
  <div class="form-group">
    <label for="password" class="col-sm-2 control-label">密码：</label>
    <div class="col-sm-10">
      <input type="text" class="form-control" id="password" placeholder="请输入密码">
    </div>
  </div>
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <div class="checkbox" style="margin-left: 160px;">
        <label>
          <input type="checkbox">请记住我
        </label>
      </div>
    </div>
  </div> -->
  <div class="form-group">
    <div class="col-sm-offset-2 col-sm-10">
      <button type="submit" class="btn btn-default" style="margin-left: 160px;">登录</button>
    </div>
  </div>
</form>

<h1>test代码的显示</h1>
<!-- pre 标签可以用来放入代码块；'&lt;'='<'; -->
<pre>
	&lt;body&gt;
		&lt;hl&gt;无法再交心联手&lt;hl&gt;
	&lt;body&gt;
</pre>
<div class="table-responsive">
<table class="table table-hover table-bordered">
<caption>小金金的第一个table(bootstrap类型)</caption>
<thead>
	<tr>
		<th>名称</th>
		<th>城市</th>
	</tr>
</thead>
<tbody>
	<tr class="success">
		<td>小金</td>
		<td>南京</td>
	</tr>
	<tr class="warning">
		<td>大大</td>
		<td>淮阴</td>
	</tr>
</tbody>
</table>
</div>
</body>
</html>