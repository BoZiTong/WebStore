<html>
<head>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<%@ include file="logo.jsp" %>
<title>请输入您的登录信息</title>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
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
</head>
<body>
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
<div class="btn_form">
<form action="forget" method="post" name="forget">
<h1>
请填写如下信息</h1><br>
<h2>
昵称<input type="text" name="nickName"><br>
<br>
邮箱<input type="text" name="mail"><br></h2><br>
<input type="submit" value="提交">
</form>
</div>
</div>
</div></div>
<%@include file="footer.jsp" %>
</body>
</html>