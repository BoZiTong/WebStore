<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<div class="header_bg">
<div class="wrap">
	<div class="header">
		<div class="logo">
			<a href="index.jsp"><img src="images/logo.png" alt=""/> </a>
		</div>
		<div class="h_icon">
		<ul class="icon1 sub-icon1">
			<li><a class="active-icon c1" href="cart.jsp"><i>shoppingcart</i></a>
				<ul class="sub-icon1 list">
					<li><h3>点击查看购物车</h3><a href=""></a></li>
					<li><p>or</p></li>
					<li><p><a href="contactus.jsp">联系我们</a></p></li>
				</ul>
			</li>
		</ul>
		</div>
		<div class="h_search">
    		<form action="search" method="post">
    			<input type="text" name="search" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
    			<input type="submit" value="">
    		</form>
		</div>
		<div class="clear"></div>
	</div>
</div>
</div>
<div class="header_btm">
<div class="wrap">
	<div class="header_sub">
		<div class="h_menu">
			<ul>
				<li class="active"><a href="index.jsp">主页</a></li> |
				<%
				if(session.getAttribute("userId") == null){
		%>
				<li><a href="login.jsp">登录</a></li> |
				<li><a href="signup.jsp">注册</a></li> |
		<%
				}else{
				%>
				<li><a href="userinfo.jsp?type=1">我的信息</a></li> |
		    	<li><a href="order.jsp">订单查询</a></li> |
				<li><a href="signout.jsp">注销</a></li> |<%} %>
				<li><a href="service.jsp">我们的服务</a></li> |
				<li><a href="contactus.jsp">联系我们</a></li> 
			</ul>
		</div>
		<div class="top-nav">
	          <nav class="nav">	        	
	    	    <a href="#" id="w3-menu-trigger"> </a>
	                  <ul class="nav-list" style="">
	            	        <li class="nav-item"><a class="active" href="index.jsp">主页</a></li>
	            	        <%if(session.getAttribute("userId") == null){ %>
	            	        <li class="nav-item"><a href="login.jsp">登录</a></li>
	            	        <%}else{ %>
							<li class="nav-item"><a href="userinfo.jsp?type=1">我的信息</a></li>
							<li class="nav-item"><a href="order.jsp">订单查询</a></li>
							<li class="nav-item"><a href="signout.jsp">注销</a></li><%} %>
							<li class="nav-item"><a href="service.jsp">我们的服务</a></li>
							<li class="nav-item"><a href="contactus.jsp">联系我们</a></li>
	                 </ul>
	           </nav>
	             <div class="search_box">
				<form>
				   <input name="search" type="text" value="Search" onFocus="this.value = '';" onBlur="if (this.value == '') {this.value = 'Search';}"><input type="submit" value="">
			    </form>
			</div>
	          <div class="clear"> </div>
	          <script src="js/responsive.menu.js"></script>
         </div>		  
	<div class="clear"></div>
</div>
</div>
</div>