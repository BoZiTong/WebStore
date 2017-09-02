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
<title>订单查询</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
<table style="text-align:center;width:1000">
<tr><td></td><td style="font-size:30px">订单号</td><td style="font-size:30px">总价</td><td style="font-size:30px">内容</td></tr><tr height=40><td></td></tr>
<%
String userId = (String)session.getAttribute("userId");
Vector<String> order = orderDB.getOrder(userId);
for(int i = 0;i < order.size(); i++)
{%> <tr>
	<td><%=i + 1%></td>
	<td><%=order.get(i) %></td>
	<td><%=orderDB.getPrice(order.get(i)) %></td>
	<td><%=orderDB.getDescription(order.get(i)) %></td></tr>
	<%
}
%>
</table>
</div></div></div>
<%@include file="footer.jsp" %>
</body>
</html>