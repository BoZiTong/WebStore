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
<title>请输入您的登录信息</title>
</head>
<body>
<jsp:useBean id="cart" class="mypack.shoppingCart" scope="session"/>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
<div class="btn_form">
	<form action=login method="post">
	<br><br>
	<div style="text-align:center"><h1>请输入您的登录信息</h1><br></div><br>
	<h2>用户：<input type="text" name="username" value="用户名/邮箱/手机号" required="required"
		onblur="if(this.value==''){this.value='用户名/邮箱/手机号'}"
		onfocus="if(this.value=='用户名/邮箱/手机号'){this.value=''}"/><br /><br>
	密码：<input type="text" name="password" value="请输入密码.." required="required"
		onblur="if(this.value==''){this.type='text';this.value='请输入密码..'}"
		onfocus="if(this.value=='请输入密码..'){this.type='password';this.value=''}"/><br/><br>
	<input type="submit" name="submit" value="确认"/>

	<a href="forgetpassword.jsp">忘记密码？</a>
	</h2>
	<br><br><br>
	</form>
	</div>
	</div></div></div></div>
	</div>
	</div>
<%@include file="footer.jsp" %>	
</body>
</html>