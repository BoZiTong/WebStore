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
<title>查询成功</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
	<table style="text-align:center;width:1000"><tr>
<%
	Vector<String> match = (Vector<String>)session.getAttribute("match");
	int flag = 0;
	for(int i = 0; i < match.size(); i++){%>
	<td style="text-align:center;width:400">
	<a href="detail.jsp?itemId=<%=match.get(i) %>"><img width=100% height=auto src="images/<%=match.get(i)%>.jpg" alt="Lazy Owl Image"></a><br>
	<%
		out.println(String.valueOf(i+1) + ":" + itemDB.getName(match.get(i)) + itemDB.getPrice(match.get(i)));
	    flag++;
	
	%></td>
	<%
	if(flag == 2){
		%></tr><tr><%
		flag = 0;
	}
	}
%>
</tr>
</table>
</div></div></div>
<%@include file="footer.jsp" %>
</body>
</html>