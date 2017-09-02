<html>
<head>
<%@ include file="logo.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
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
   <script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event){		
				event.preventDefault();
				$('html,body').animate({scrollTop:$(this.hash).offset().top},1200);
			});
		});
	</script>
<jsp:useBean id="cart" scope="session" class="mypack.shoppingCart"/>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8">
<title>购物车</title>
</head>
<body>
<%@include file="header.jsp" %>
<div class="main_bg">
<div class="wrap">	
	<div class="main">
<div class="btn_form">
<form action="purchase" method="post">
<table style="text-align:center;width:1000">
<tr>
<td style="font-size:30px">编号</td>
<td style="font-size:30px">商品名</td>
<td style="font-size:30px">数量</td>
<td style="font-size:30px">总价</td>
<td></td>
</tr>
<%
	if(session.getAttribute("userId") == null){
		Iterator<String> i = cart.getItems().iterator();
		int count = 1;
		while(i.hasNext()){
			String itemId = i.next();
			%><tr><td><%=count%></td>
			<td><%=itemDB.getName(itemId) %></td>
			<td><%=cart.getQuantity(itemId) %></td>
			<td><%=cart.getQuantity(itemId)*itemDB.getPrice(itemId) %></td>
			<td><a href="purchase?itemId=<%=itemId%>"><img src="images/buy.jpg" width=100 height=auto></a></td>
			<td><a href="deletefromcart?itemId=<%=itemId%>"><img src="images/close.png" width=20 height=auto></a></td></tr><%
		}
	}else{
		String userId = (String)session.getAttribute("userId");
		Vector<String> item = cartDB.getItem(userId);
		int count = 1;
		for(int i = 1; i <= item.size(); i++){
			%><tr><td><%=i%></td>
			<td><%=itemDB.getName(item.get(i-1)) %></td>
			<td><%=cartDB.getQuantity(item.get(i-1), userId) %></td>
			<td><%=cartDB.getQuantity(item.get(i-1), userId)*itemDB.getPrice(item.get(i-1)) %></td>
			<td><a href="purchase?itemId=<%=item.get(i-1)%>"><img src="images/buy.jpg" width=100 height=auto></a></td>
			<td><a href="deletefromcart?itemId=<%=item.get(i-1)%>"><img src="images/close.png" width=20 height=auto></a></td></tr>
<%


	}
}
%>
<tr><td></td><td></td><td></td><td></td><td><br><br><input type="submit" value="购买全部" title=""></td></tr>
</table>
</form>
</div>
</div>
<br><br><br>
</div></div>
<%@include file="footer.jsp" %>
</body>
</html>