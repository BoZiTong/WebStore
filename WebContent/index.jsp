<html>
<head>
<%@ include file="logo.jsp" %>
<%@ page language="java" contentType="text/html; charset=utf-8"
    pageEncoding="utf-8"%>
<title>Free Aditii Website Template | Home </title>
<meta name="viewport" content="width=device-width, initial-scale=1, maximum-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<script type="text/javascript" src="js/jquery.min.js"></script>
<!-- start slider -->		
	<link href="css/slider.css" rel="stylesheet" type="text/css" media="all" />
	<script type="text/javascript" src="js/modernizr.custom.28468.js"></script>
	<script type="text/javascript" src="js/jquery.cslider.js"></script>
	<script type="text/javascript">
		$(function() {
			$('#da-slider').cslider();
		});
	</script>
		<!-- Owl Carousel Assets -->
		<link href="css/owl.carousel.css" rel="stylesheet">
		     <!-- Owl Carousel Assets -->
		    <!-- Prettify -->
		    <script src="js/owl.carousel.js"></script>
		        <script>
		    $(document).ready(function() {
		
		      $("#owl-demo").owlCarousel({
		        items : 4,
		        lazyLoad : true,
		        autoPlay : true,
		        navigation : true,
			    navigationText : ["",""],
			    rewindNav : false,
			    scrollPerPage : false,
			    pagination : false,
    			paginationNumbers: false,
		      });
		
		    });
		    </script>
		   <!-- //Owl Carousel Assets -->
		<!-- start top_js_button -->
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
</head>
<body>
<jsp:useBean id="cart" class="mypack.shoppingCart" scope="session"/>
<!-- start header -->
<%@ include file="header.jsp" %>
<!-- start slider -->
			<div id="da-slider" class="da-slider">
				<div class="da-slide">
					<h2>欢迎来到 aditii</h2>
					<p>When she reached the first hills of the Italic Mountains, she had a last view back on the skyline of her hometown Bookmarksgrove, the headline of Alphabet Village and the subline of her own road, the Line Lane.</p>
					<a href="detail.jsp?itemId=1001" class="da-link">shop now</a>
					<div class="da-img"><img src="images/1001.jpg" alt="image01" /></div>
				</div>
				<div class="da-slide">
					<h2>Easy management</h2>
					<p>Far far away, behind the word mountains, far from the countries Vokalia and Consonantia, there live the blind texts. Separated they live in Bookmarksgrove right at the coast of the Semantics, a large language ocean.</p>
					<a href="detail.jsp?itemId=1002" class="da-link">shop now</a>
					<div class="da-img"><img src="images/1002.jpg" alt="image01" /></div>
				</div>
				<div class="da-slide">
					<h2>Revolution</h2>
					<p>A small river named Duden flows by their place and supplies it with the necessary regelialia. It is a paradisematic country, in which roasted parts of sentences fly into your mouth.</p>
					<a href="detail.jsp?itemId=1003" class="da-link">shop now</a>
					<div class="da-img"><img src="images/1003.jpg" alt="image01" /></div>
				</div>
				<div class="da-slide">
					<h2>Quality Control</h2>
					<p>Even the all-powerful Pointing has no control about the blind texts it is an almost unorthographic life One day however a small line of blind text by the name of Lorem Ipsum decided to leave for the far World of Grammar.</p>
					<a href="detail.jsp?itemId=1004" class="da-link">shop now</a>
					<div class="da-img"><img src="images/1004.jpg" alt="image01" /></div>
				</div>
				<nav class="da-arrows">
					<span class="da-arrows-prev"></span>
					<span class="da-arrows-next"></span>
				</nav>
			</div>
        </div>
        <div class="copyrights">Collect from <a href="http://www.cssmoban.com/"  title="网站模板">网站模板</a></div>
<!----start-cursual---->
<div class="wrap">
<!----start-img-cursual---->
	<div id="owl-demo" class="owl-carousel">
		<div class="item" onClick="location.href='detail.jsp?itemId=0005';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0005.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0005">branded shoes</a></h4>
				<a href="detail.jsp?itemId=0005" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0002';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0002.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0002">branded tees</a></h4>
				<a href="detail.jsp?itemId=0002" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0003';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0003.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0003">branded jeens</a></h4>
				<a href="detail.jsp?itemId=0003" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0004';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0004.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0004">branded tees</a></h4>
				<a href="detail.jsp?itemId=0004" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0005';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0005.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0005">branded shoes</a></h4>
				<a href="detail.jsp?itemId=0005" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0002';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0002.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0002">branded tees</a></h4>
				<a href="detail.jsp?itemId=0002" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0003';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0003.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0003">branded jeens</a></h4>
				<a href="detail.jsp?itemId=0003" class="btn">shop</a>
			</div>
		</div>	
		<div class="item" onClick="location.href='detail.jsp?itemId=0004';">
			<div class="cau_left">
				<img class="lazyOwl" data-src="images/0004.jpg" alt="Lazy Owl Image">
			</div>
			<div class="cau_left">
				<h4><a href="detail.jsp?itemId=0004">branded tees</a></h4>
				<a href="detail.jsp?itemId=0004" class="btn">shop</a>
			</div>
		</div>	
	</div>
	<!----//End-img-cursual---->
</div>
<!-- start main1 -->
<div class="main_bg1">
<div class="wrap">	
	<div class="main1">
		<h2>featured products</h2>
	</div>
</div>
</div>
<!-- start main -->
<div class="main_bg">
<div class="wrap">	
	<div class="main">
		<!-- start grids_of_3 -->
		<div class="grids_of_3">
			<div class="grid1_of_3">
				<a href="detail.jsp?itemId=0005">
					<img src="images/0005.jpg" alt=""/>
					<h3>branded shoes</h3>
					<div class="price">
						<h4>$300<span>indulge</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="grid1_of_3">
				<a href="detail.jsp?itemId=0006">
					<img src="images/0006.jpg" alt=""/>
					<h3>branded t-shirts</h3>
					<div class="price">
						<h4>$300<span>indulge</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="grid1_of_3">
				<a href="detail.jsp?itemId=0007">
					<img src="images/0007.jpg" alt=""/>
					<h3>branded tees</h3>
					<div class="price">
						<h4>$300<span>indulge</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="clear"></div>
		</div>
		<div class="grids_of_3">
			<div class="grid1_of_3">
				<a href="detail.jsp?itemId=0008">
					<img src="images/0008.jpg" alt=""/>
					<h3>branded bags</h3>
					<div class="price">
						<h4>$300<span>indulge</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="grid1_of_3">
				<a href="detail.jsp?itemId=0009">
					<img src="images/0009.jpg" alt=""/>
					<h3>ems women bag</h3>
					<div class="price">
						<h4>$300<span>indulge</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="grid1_of_3">
				<a href="detail.jsp?itemId=0010">
					<img src="images/0010.jpg" alt=""/>
					<h3>branded cargos</h3>
					<div class="price">
						<h4>$300<span>indulge</span></h4>
					</div>
					<span class="b_btm"></span>
				</a>
			</div>
			<div class="clear"></div>
		</div>	
		<!-- end grids_of_3 -->
	</div>
</div>
</div>	
<%@include file="footer.jsp" %>

</body>
</html>