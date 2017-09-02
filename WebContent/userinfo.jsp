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
<title>商品详情</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
	<div class="btn_form">
<form action="userinfo.jsp?"><input type="submit" name="type" value="基本信息"></form>
<br>
<br>
<form action="userinfo.jsp?"><input type="submit" name="type" value="修改密码"></form>
</div>
<%
	if(request.getParameter("type").equals("基本信息")){
%>
<div align="center">
<form action="user?type=info" method="post">
<h1>基本信息：</h1><br><br>
&nbsp;昵称：&nbsp;<input type="text" name="nickName" value=""><br>
&nbsp;邮箱：&nbsp;<input type="text" name="mail" value=""><br>
手机号码：<input type="text" name="phone" value=""><br>
&nbsp;地址：&nbsp;<input type="text" name="address" value=""><br>
<input type="submit" value="提交"><input type="reset" value="重置"></form>
</div>
<%} else{%>
<div align="center">
<form action="user?type=password" method="post"><br><br><br>
请输入您的密码：<input type="password" name="p1" value=""><br>
请输入新的密码：<input type="password" name="p2" value=""><br>
请确认新的密码：<input type="password" name="p3" value=""><br>

<input type="submit" value="提交"><input type="reset" value="重置"></form></div>

<%} %>
</div></div></div>
<%@include file="footer.jsp" %>
    </body>
    </html>