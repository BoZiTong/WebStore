<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="logo.jsp" %>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- start details -->
<link rel="stylesheet" type="text/css" href="css/productviewgallery.css" media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/cloud-zoom.1.0.3.min.js"></script>
<script type="text/javascript" src="js/jquery.fancybox.pack.js"></script>
<script type="text/javascript" src="js/jquery.fancybox-buttons.js"></script>
<script type="text/javascript" src="js/jquery.fancybox-thumbs.js"></script>
<script type="text/javascript" src="js/productviewgallery.js"></script>
<!-- start top_js_button -->
<script type="text/javascript" src="js/jquery.min.js"></script>
<script type="text/javascript" src="js/move-top.js"></script>
<script type="text/javascript" src="js/easing.js"></script>
<title>注册</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
<div align="center"><div class="btn_form">
<form action="signup" method="post">
请输入如下信息：<br>
<table>
<tr><td>
&nbsp;&nbsp;&nbsp;&nbsp;昵称:</td><td><input type="text" name="nickName" value=""></td></tr>
<tr><td>
&nbsp;&nbsp;&nbsp;&nbsp;密码：</td><td><input type="password" name="p1" value=""></td></tr>
<tr><td>
确认密码:</td><td><input type="password" name="p2" value=""></td></tr>
<tr><td>
&nbsp;&nbsp;&nbsp;&nbsp;性别:</td><td><select name="gender">
<option>男</option>
<option>女</option>
</select></td></tr>
<tr><td>
&nbsp;&nbsp;&nbsp;&nbsp;邮箱：</td><td><input type="text" name="mail" value=""></td></tr>
<tr><td>
手机号码：</td><td><input type="text" name="phone" value=""></td></tr>
<tr><td>
&nbsp;&nbsp;&nbsp;&nbsp;地址：</td><td><input type="text" name="address" value=""></td></tr>
</table>
<input type="submit" value="提交"></form>
</div>
</div>
</div></div></div>
<%@include file="footer.jsp" %>
</body>
</html>