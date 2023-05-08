<%@page import="model.Patientdata"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>

<!--
author: W3layouts
author URL: http://w3layouts.com
License: Creative Commons Attribution 3.0 Unported
License URL: http://creativecommons.org/licenses/by/3.0/
-->
<!DOCTYPE html>
<html lang="zxx">
<head>
<title>KhajinaDoc a Medical Online Solution |</title>
<!-- for-meta-tags-->
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords"
	content="Health Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript">
	addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } 
</script>
<!-- //for-meta-tags-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css"
	media="all" />
<link rel="stylesheet" href="css/flexslider.css" type="text/css"
	media="screen" Department="" />
<link href="css/services.css" rel="stylesheet" type="text/css"
	media="all" />
<link href="css/ziehharmonika.css" rel="stylesheet" type="text/css">
<link href="css/JiSlider.css" rel="stylesheet">
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet">
<!-- //font-awesome icons -->
<link
	href="//fonts.googleapis.com/css?family=Raleway:200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800"
	rel="stylesheet">
<link
	href="//fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,900"
	rel="stylesheet">

<style>
.overlay {
	border: 2px solid black;
	/* Set the border style to a 1px solid black line */
	padding: 10px;
	margin-top: 10px;
	/* Add some padding around the box content to make it easier to read */
}

.department .btn-group .btn:first-child {
	margin-right: 10px;
}

/* Style the primary button */
.btn-primary {
	background-color: #007bff;
	color: #fff;
	border: none;
}

/* Style the success button */
.btn-success {
	background-color: #28a745;
	color: #fff;
	border: none;
}

/* Add margin to the buttons */
.btn-group>.btn {
	margin-right: 5px;
}

.social_agileinfo li a {
	display: block;
	width: 30px;
	height: 30px;
	line-height: 30px;
	text-align: center;
	background: #333;
	border-radius: 50%;
	margin: 0 10px;
}

.social_agileinfo li a i {
	font-size: 18px;
}

.social_agileinfo li a:hover {
	background: #555;
}

.social_agileinfo li a:hover i {
	color: #fff;
}

.social_agileinfo li a:focus {
	outline: none;
}
</style>

</head>

<body>
<div class="main" id="home">
<%
   Patientdata p = null;
   if(session.getAttribute("data")!=null){
	   p = (Patientdata)session.getAttribute("data");
   }
   else{
	   response.sendRedirect("Patient_Login.jsp");
   }
   %>
<!-- banner -->
		<div class="header_agileinfo">
					<div class="w3_agileits_header_text">
				<ul class="top_agile_w3l_info_icons">
					<li><i class="fa fa-home" aria-hidden="true"></i>Near
						Kankariya,Ahemdabad</li>
					<li class="second"><i class="fa fa-phone" aria-hidden="true"></i>(+91)8200405262</li>

					<li><i class="fa fa-envelope-o" aria-hidden="true"></i><a
						href="mailto:maria@example.com">khajinadoc@gmail.com</a></li>
				</ul>

			</div>
						<div class="agileinfo_social_icons">
							<ul class="agileits_social_list">
								<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
								<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
								<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
								<li><a href="#" class="w3_agile_rss"><i class="fa fa-rss" aria-hidden="true"></i></a></li>
							</ul>
						</div>
						<div class="clearfix"> </div>
			</div>				

		<div class="header-bottom">
				<nav class="navbar navbar-default">
				<!-- Brand and toggle get grouped for better mobile display -->
				<div class="navbar-header">
				  <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#bs-example-navbar-collapse-1">
					<span class="sr-only">Toggle navigation</span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				  </button>
					<div class="logo">
						<h1><a class="navbar-brand" href="index.jsp"><span>Khajina</span>Doc <i class="fa fa-plus" aria-hidden="true"></i> <p>Quality Care 4U</p></a></h1>
					</div>
				</div>

				<!-- Collect the nav links, forms, and other content for toggling -->
				<div class="collapse navbar-collapse nav-wil" id="bs-example-navbar-collapse-1">
					<nav class="menu menu--sebastian">
					<ul id="m_nav_list" class="m_nav menu__list">
						<li class="m_nav_item menu__item menu__item--current" id="m_nav_item_1"> <a href="index.jsp" class="menu__link"> Home </a></li>
						<li class="m_nav_item menu__item" id="moble_nav_item_2"> <a href="about.jsp" class="menu__link"> About Us </a> </li>		
						<li class="m_nav_item menu__item" id="moble_nav_item_4"> <a href="appointment.jsp" class="menu__link">Appointment  </a> </li>
					
						<li class="m_nav_item menu__item" id="moble_nav_item_3 dropdown"> <a href="#" class="menu__link dropdown-toggle" data-toggle="dropdown"><%=p.getName()%>  <b class="caret"></b></a> 
						   <ul class="dropdown-menu agile_short_dropdown">
									<li><a href="Patient_profile.jsp">Profile</a></li>
									<li><a href="Patient_changepassword.jsp">Change Password</a></li>
									<li><a href="Patient_logout.jsp">Logout</a></li>
						   </ul>
						</li>
						<li class="m_nav_item menu__item" id="moble_nav_item_6"> <a href="contact.jsp" class="menu__link"> Contact </a> </li>
					</ul>
				</nav>

				</div>
				<!-- /.navbar-collapse -->
			</nav>
	 </div>
</div>
<!-- banner -->
<!-- banner1 -->
	<div class="banner1 jarallax">
		<div class="container">
		</div>
	</div>

	<div class="services-breadcrumb">
		<div class="container">
			<ul>
				<li><a href="index.jsp">Home</a><i>|</i></li>
				<li>Patient Profile</li>
			</ul>
		</div>
	</div>
<!-- //banner1 -->
	<div class="banner-bottom" id="about">
		<div class="container">
			<h2 class="w3_heade_tittle_agile">Patient Profile</h2>
		    <p class="sub_t_agileits">Get in touch...</p>

           <div class="contact-top-agileits">
               <div class="col-md-4 contact-grid ">
					<div class="contact-grid1 agileits-w3layouts">
						<i class="fa fa-location-arrow"></i>
						<div class="con-w3l-info">
						   <h4>Address </h4>
						  <p>Near Kankariya,<span>Ahmedabad.</span></p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-4 contact-grid">
					<div class="contact-grid2 w3">
						<i class="fa fa-phone" aria-hidden="true"></i>
						<div class="con-w3l-info">
						  <h4>Call Us</h4>
						   <p>+91 8200405262</p>
						</div>
						<div class="clearfix"></div>
					</div>
				</div>
				<div class="col-md-4 contact-grid">
					<div class="contact-grid3 w3l">
						<i class="fa fa-envelope"></i>
						<div class="con-w3l-info">
						  <h4>Email</h4>
						  <p><a href="mailto:info@example.com">Khajinadoc@gmail.com</a>
						 
						  </p></div>
						  <div class="clearfix"></div>
					</div>
				</div>
				<div class="clearfix"></div>
				
			</div>
      <section class="contact py-lg-4 py-md-3 py-sm-3 py-3">
         <div class="container py-lg-5 py-md-4 py-sm-4 py-3">
            <h3 class="title text-center mb-lg-5 mb-md-4 mb-sm-4 mb-3">Patient Profile</h3>
            <div class="contact-list-grid">
               <form action="PatientController" method="post">
                  <div class=" agile-wls-contact-mid">
                  <div class="form-group contact-forms">
                        <input type="hidden" class="form-control" placeholder="Name" name="id" value="<%=p.getId() %>">
                     </div>
                     <div class="form-group contact-forms">
                        <input type="text" class="form-control" placeholder="Name" name="name" value="<%=p.getName() %>">
                     </div>
                     <div class="form-group contact-forms">
                        <input type="email" class="form-control" placeholder="Enter Email" name="email" value="<%= p.getEmail()%>">
                     </div>
                     <div class="form-group contact-forms">
                        <input type="text" class="form-control" placeholder="Enter Address" name="address" value="<%=p.getAddress()%>">
                     </div>
                     <div class="form-group contact-forms">
                        <input type="text" class="form-control" placeholder="Enter Contact no" name="contact" value="<%=p.getContact() %>">
                     </div>
                    <button type="submit" name="action" value="update"  class="btn btn-block sent-butnn">Update</button>
                  </div>
               </form>
            </div>
           </div>
         <!--//contact-map -->
      </section>
				  <ul class="agileits_social_list two">
				        <li class="fallow"> Follow Us :</li>
								<li><a href="#" class="w3_agile_facebook"><i class="fa fa-facebook" aria-hidden="true"></i></a></li>
								<li><a href="#" class="agile_twitter"><i class="fa fa-twitter" aria-hidden="true"></i></a></li>
								<li><a href="#" class="w3_agile_dribble"><i class="fa fa-dribbble" aria-hidden="true"></i></a></li>
								<li><a href="#" class="w3_agile_rss"><i class="fa fa-rss" aria-hidden="true"></i></a></li>
							</ul>
				         
			   </div>
	    </div>
	</div>

<div class="footer">
		<div class="container">
			<h4>
				Subscribe to <span>Newsletter</span>
			</h4>
			<form action="#" method="post">
				<input type="email" name="Email" placeholder="Enter Your Email..."
					required=""> <input type="submit" value="Send">
			</form>
			<div class="agile_footer_copy">
				<div class="w3agile_footer_grids">
					<div class="col-md-4 w3agile_footer_grid">
						<h3>About Us</h3>
						<p>
							"Welcome to KhajinDoc, the leading doctor finder app for
							finding top-quality healthcare providers near you. Our app is
							designed to make it easy for you to find and book appointments
							with the best doctors, surgeons, and specialists in your area.</span>
						</p>
					</div>
					<div class="col-md-4 w3agile_footer_grid">
						<h3>Contact Info</h3>
						<ul>
							<li><i class="fa fa-map-marker" aria-hidden="true"></i>Near
								Kankariya <span>Ahmedabad.</span></li>
							<li><i class="fa fa-envelope-o" aria-hidden="true"></i><a
								href="khajinadoc@gmail.com">khajinadoc@gmail.com</a></li>
							<li><i class="fa fa-phone" aria-hidden="true"></i>+91
								8200405262</li>
						</ul>
					</div>
					<div class="col-md-4 w3agile_footer_grid w3agile_footer_grid1">
						<h3>Navigation</h3>
						<ul>
							<li><span class="fa fa-long-arrow-right" aria-hidden="true"></span><a
								href="Department-home.jsp">Department</a></li>
							<li><span class="fa fa-long-arrow-right" aria-hidden="true"></span><a
								href="appointment.jsp">Appointment</a></li>
							<li><span class="fa fa-long-arrow-right" aria-hidden="true"></span><a
								href="about.jsp">About</a></li>
							<li><span class="fa fa-long-arrow-right" aria-hidden="true"></span><a
								href="contact.jsp">Contact Us</a></li>
						</ul>
					</div>
					<div class="clearfix"></div>
				</div>
			</div>
			<div class="w3_agileits_copy_right_social">
				<div class="col-md-6 agileits_w3layouts_copy_right">
					<p>&copy; 2023 KHAJINADOC. All rights reserved.</p>
				</div>
				<div class="col-md-6 w3_agile_copy_right">
					<ul class="agileits_social_list">
						<li><a href="#" class="w3_agile_facebook"><i
								class="fa fa-facebook" aria-hidden="true"></i></a></li>
						<li><a href="#" class="agile_twitter"><i
								class="fa fa-twitter" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_dribble"><i
								class="fa fa-dribbble" aria-hidden="true"></i></a></li>
						<li><a href="#" class="w3_agile_rss"><i class="fa fa-rss"
								aria-hidden="true"></i></a></li>
					</ul>
				</div>
				<div class="clearfix"></div>
			</div>
		</div>
	</div>
	<!-- //footer -->
	<a href="#" id="toTop" style="display: block;"> <span
		id="toTopHover" style="opacity: 1;"> </span></a>
	<!-- js -->
	<script src="js/jquery-2.2.3.min.js"></script>
	<script src="js/JiSlider.js"></script>
	<script>
		$(window).load(function() {
			$('#JiSlider').JiSlider({
				color : '#fff',
				start : 3,
				reverse : true
			}).addClass('ff')
		})
	</script>
	<script type="text/javascript">
		var _gaq = _gaq || [];
		_gaq.push([ '_setAccount', 'UA-36251023-1' ]);
		_gaq.push([ '_setDomainName', 'jqueryscript.net' ]);
		_gaq.push([ '_trackPageview' ]);

		(function() {
			var ga = document.createElement('script');
			ga.type = 'text/javascript';
			ga.async = true;
			ga.src = ('https:' == document.location.protocol ? 'https://ssl'
					: 'http://www')
					+ '.google-analytics.com/ga.js';
			var s = document.getElementsByTagName('script')[0];
			s.parentNode.insertBefore(ga, s);
		})();
	</script>

	<script src="js/ziehharmonika.js"></script>
	<script>
		$(document).ready(function() {
			$('.ziehharmonika').ziehharmonika({
				collapsible : true,
				prefix : ''
			});
		});
	</script>
	<!-- stats -->
	<script src="js/jquery.waypoints.min.js"></script>
	<script src="js/jquery.countup.js"></script>
	<script>
		$('.counter').countUp();
	</script>
	<!-- //stats -->
	<script type="text/javascript">
		$(function() {
			$("#bars li .bar").each(function(key, bar) {
				var percentage = $(this).data('percentage');

				$(this).animate({
					'height' : percentage + '%'
				}, 1000);
			})
		})
	</script>

	<!-- bootstrap-pop-up -->
	<div class="modal video-modal fade" id="myModal" tabindex="-1"
		role="dialog" aria-labelledby="myModal">
		<div class="modal-dialog" role="document">
			<div class="modal-content">
				<div class="modal-header">
					Health Plus
					<button type="button" class="close" data-dismiss="modal"
						aria-label="Close">
						<span aria-hidden="true">&times;</span>
					</button>
				</div>
				<section>
					<div class="modal-body">
						<img src="images/g9.jpg" alt=" " class="img-responsive" />
						<p>
							Ut enim ad minima veniam, quis nostrum exercitationem ullam
							corporis suscipit laboriosam, nisi ut aliquid ex ea commodi
							consequatur? Quis autem vel eum iure reprehenderit qui in ea
							voluptate velit esse quam nihil molestiae consequatur, vel illum
							qui dolorem eum fugiat quo voluptas nulla pariatur. <i>" Quis
								autem vel eum iure reprehenderit qui in ea voluptate velit esse
								quam nihil molestiae consequatur.</i>
						</p>
					</div>
				</section>
			</div>
		</div>
	</div>
	<!-- //bootstrap-pop-up -->

	<!-- flexSlider -->
	<script defer src="js/jquery.flexslider.js"></script>
	<script type="text/javascript">
		$(window).load(function() {
			$('.flexslider').flexslider({
				animation : "slide",
				start : function(slider) {
					$('body').removeClass('loading');
				}
			});
		});
	</script>
	<!-- //flexSlider -->


	<!-- start-smoth-scrolling -->
	<script type="text/javascript" src="js/move-top.js"></script>
	<script type="text/javascript" src="js/easing.js"></script>
	<script type="text/javascript">
		jQuery(document).ready(function($) {
			$(".scroll").click(function(event) {
				event.preventDefault();
				$('html,body').animate({
					scrollTop : $(this.hash).offset().top
				}, 1000);
			});
		});
	</script>
	<!-- start-smoth-scrolling -->
	<script src="js/jarallax.js"></script>
	<script src="js/SmoothScroll.min.js"></script>
	<script type="text/javascript">
		/* init Jarallax */
		$('.jarallax').jarallax({
			speed : 0.5,
			imgWidth : 1366,
			imgHeight : 768
		})
	</script>

	<script src="js/bootstrap.js"></script>
	<!-- //for bootstrap working -->
	<!-- here stars scrolling icon -->
	<script type="text/javascript">
		$(document).ready(function() {
			/*
				var defaults = {
				containerID: 'toTop', // fading element id
				containerHoverID: 'toTopHover', // fading element hover id
				scrollSpeed: 1200,
				easingType: 'linear' 
				};
			 */

			$().UItoTop({
				easingType : 'easeOutQuart'
			});

		});
	</script>
	<!-- //here ends scrolling icon -->
</body>
</html>