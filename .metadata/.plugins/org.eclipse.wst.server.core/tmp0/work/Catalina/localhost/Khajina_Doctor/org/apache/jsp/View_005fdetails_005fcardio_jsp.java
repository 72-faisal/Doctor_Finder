/*
 * Generated by the Jasper component of Apache Tomcat
 * Version: Apache Tomcat/9.0.73
 * Generated at: 2023-05-06 17:55:07 UTC
 * Note: The last modified time of this file was set to
 *       the last modified time of the source file after
 *       generation to assist with modification tracking.
 */
package org.apache.jsp;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.jsp.*;
import dao.Doctordao;
import model.Doctordata;
import model.Patientdata;

public final class View_005fdetails_005fcardio_jsp extends org.apache.jasper.runtime.HttpJspBase
    implements org.apache.jasper.runtime.JspSourceDependent,
                 org.apache.jasper.runtime.JspSourceImports {

  private static final javax.servlet.jsp.JspFactory _jspxFactory =
          javax.servlet.jsp.JspFactory.getDefaultFactory();

  private static java.util.Map<java.lang.String,java.lang.Long> _jspx_dependants;

  private static final java.util.Set<java.lang.String> _jspx_imports_packages;

  private static final java.util.Set<java.lang.String> _jspx_imports_classes;

  static {
    _jspx_imports_packages = new java.util.HashSet<>();
    _jspx_imports_packages.add("javax.servlet");
    _jspx_imports_packages.add("javax.servlet.http");
    _jspx_imports_packages.add("javax.servlet.jsp");
    _jspx_imports_classes = new java.util.HashSet<>();
    _jspx_imports_classes.add("dao.Doctordao");
    _jspx_imports_classes.add("model.Patientdata");
    _jspx_imports_classes.add("model.Doctordata");
  }

  private volatile javax.el.ExpressionFactory _el_expressionfactory;
  private volatile org.apache.tomcat.InstanceManager _jsp_instancemanager;

  public java.util.Map<java.lang.String,java.lang.Long> getDependants() {
    return _jspx_dependants;
  }

  public java.util.Set<java.lang.String> getPackageImports() {
    return _jspx_imports_packages;
  }

  public java.util.Set<java.lang.String> getClassImports() {
    return _jspx_imports_classes;
  }

  public javax.el.ExpressionFactory _jsp_getExpressionFactory() {
    if (_el_expressionfactory == null) {
      synchronized (this) {
        if (_el_expressionfactory == null) {
          _el_expressionfactory = _jspxFactory.getJspApplicationContext(getServletConfig().getServletContext()).getExpressionFactory();
        }
      }
    }
    return _el_expressionfactory;
  }

  public org.apache.tomcat.InstanceManager _jsp_getInstanceManager() {
    if (_jsp_instancemanager == null) {
      synchronized (this) {
        if (_jsp_instancemanager == null) {
          _jsp_instancemanager = org.apache.jasper.runtime.InstanceManagerFactory.getInstanceManager(getServletConfig());
        }
      }
    }
    return _jsp_instancemanager;
  }

  public void _jspInit() {
  }

  public void _jspDestroy() {
  }

  public void _jspService(final javax.servlet.http.HttpServletRequest request, final javax.servlet.http.HttpServletResponse response)
      throws java.io.IOException, javax.servlet.ServletException {

    if (!javax.servlet.DispatcherType.ERROR.equals(request.getDispatcherType())) {
      final java.lang.String _jspx_method = request.getMethod();
      if ("OPTIONS".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        return;
      }
      if (!"GET".equals(_jspx_method) && !"POST".equals(_jspx_method) && !"HEAD".equals(_jspx_method)) {
        response.setHeader("Allow","GET, HEAD, POST, OPTIONS");
        response.sendError(HttpServletResponse.SC_METHOD_NOT_ALLOWED, "JSPs only permit GET, POST or HEAD. Jasper also permits OPTIONS");
        return;
      }
    }

    final javax.servlet.jsp.PageContext pageContext;
    javax.servlet.http.HttpSession session = null;
    final javax.servlet.ServletContext application;
    final javax.servlet.ServletConfig config;
    javax.servlet.jsp.JspWriter out = null;
    final java.lang.Object page = this;
    javax.servlet.jsp.JspWriter _jspx_out = null;
    javax.servlet.jsp.PageContext _jspx_page_context = null;


    try {
      response.setContentType("text/html; charset=UTF-8");
      pageContext = _jspxFactory.getPageContext(this, request, response,
      			null, true, 8192, true);
      _jspx_page_context = pageContext;
      application = pageContext.getServletContext();
      config = pageContext.getServletConfig();
      session = pageContext.getSession();
      out = pageContext.getOut();
      _jspx_out = out;

      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!DOCTYPE html>\r\n");
      out.write("<html>\r\n");
      out.write("<head>\r\n");
      out.write("<meta charset=\"ISO-8859-1\">\r\n");
      out.write("<title>KhajjinaDoc a Medical Online Solution |</title>\r\n");
      out.write("<!-- for-meta-tags-->\r\n");
      out.write("<meta name=\"viewport\" content=\"width=device-width, initial-scale=1\">\r\n");
      out.write("<meta http-equiv=\"Content-Type\" content=\"text/html; charset=utf-8\" />\r\n");
      out.write("<meta name=\"keywords\"\r\n");
      out.write("	content=\"Health Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, \r\n");
      out.write("Smartphone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design\" />\r\n");
      out.write("<script type=\"application/x-javascript\">\r\n");
      out.write("	 addEventListener(\"load\", function() { setTimeout(hideURLbar, 0); }, false);\r\n");
      out.write("		function hideURLbar(){ window.scrollTo(0,1); } \r\n");
      out.write("</script>\r\n");
      out.write("<!-- //for-meta-tags-->\r\n");
      out.write("<link href=\"css/bootstrap.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	media=\"all\" />\r\n");
      out.write("<link rel=\"stylesheet\" href=\"css/flexslider.css\" type=\"text/css\"\r\n");
      out.write("	media=\"screen\" Department=\"\" />\r\n");
      out.write("<link href=\"css/services.css\" rel=\"stylesheet\" type=\"text/css\"\r\n");
      out.write("	media=\"all\" />\r\n");
      out.write("<link href=\"css/ziehharmonika.css\" rel=\"stylesheet\" type=\"text/css\">\r\n");
      out.write("<link href=\"css/JiSlider.css\" rel=\"stylesheet\">\r\n");
      out.write("<link href=\"css/style.css\" rel=\"stylesheet\" type=\"text/css\" media=\"all\" />\r\n");
      out.write("<!-- font-awesome icons -->\r\n");
      out.write("<link href=\"css/font-awesome.css\" rel=\"stylesheet\">\r\n");
      out.write("<!-- //font-awesome icons -->\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Raleway:200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<link\r\n");
      out.write("	href=\"//fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,900\"\r\n");
      out.write("	rel=\"stylesheet\">\r\n");
      out.write("<style>\r\n");
      out.write(".overlay {\r\n");
      out.write("	border: 2px solid black;\r\n");
      out.write("	/* Set the border style to a 1px solid black line */\r\n");
      out.write("	padding: 10px;\r\n");
      out.write("	margin-top: 10px;\r\n");
      out.write("	/* Add some padding around the box content to make it easier to read */\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".department .btn-group .btn:first-child {\r\n");
      out.write("	margin-right: 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the primary button */\r\n");
      out.write(".btn-primary {\r\n");
      out.write("  background-color: #007bff;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Style the success button */\r\n");
      out.write(".btn-success {\r\n");
      out.write("  background-color: #28a745;\r\n");
      out.write("  color: #fff;\r\n");
      out.write("  border: none;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write("/* Add margin to the buttons */\r\n");
      out.write(".btn-group > .btn {\r\n");
      out.write("  margin-right: 5px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social_agileinfo li a {\r\n");
      out.write("	display: block;\r\n");
      out.write("	width: 30px;\r\n");
      out.write("	height: 30px;\r\n");
      out.write("	line-height: 30px;\r\n");
      out.write("	text-align: center;\r\n");
      out.write("	background: #333;\r\n");
      out.write("	border-radius: 50%;\r\n");
      out.write("	margin: 0 10px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social_agileinfo li a i {\r\n");
      out.write("	font-size: 18px;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social_agileinfo li a:hover {\r\n");
      out.write("	background: #555;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social_agileinfo li a:hover i {\r\n");
      out.write("	color: #fff;\r\n");
      out.write("}\r\n");
      out.write("\r\n");
      out.write(".social_agileinfo li a:focus {\r\n");
      out.write("	outline: none;\r\n");
      out.write("}\r\n");
      out.write("</style>\r\n");
      out.write("</head>\r\n");
      out.write("<body>\r\n");
      out.write("	<div class=\"main\" id=\"home\">\r\n");
      out.write("		");

		Patientdata p = null;
		if (session.getAttribute("data") != null) {
			p = (Patientdata) session.getAttribute("data");
		} else {
			response.sendRedirect("Patient_Login.jsp");
		}
		
      out.write("\r\n");
      out.write("		<!-- banner -->\r\n");
      out.write("		<div class=\"header_agileinfo\">\r\n");
      out.write("			<div class=\"w3_agileits_header_text\">\r\n");
      out.write("				<ul class=\"top_agile_w3l_info_icons\">\r\n");
      out.write("					<li><i class=\"fa fa-home\" aria-hidden=\"true\"></i>Near\r\n");
      out.write("						Kankariya,Ahemdabad</li>\r\n");
      out.write("					<li class=\"second\"><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>(+91)8200405262</li>\r\n");
      out.write("\r\n");
      out.write("					<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a\r\n");
      out.write("						href=\"mailto:maria@example.com\">khajinadoc@gmail.com</a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"agileinfo_social_icons\">\r\n");
      out.write("				<ul class=\"agileits_social_list\">\r\n");
      out.write("					<li><a href=\"72__faisal\" class=\"w3_agile_facebook\"><i\r\n");
      out.write("							class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("					<li><a href=\"72__faisal\" class=\"agile_twitter\"><i\r\n");
      out.write("							class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("					<li><a href=\"72__faisal\" class=\"w3_agile_dribble\"><i\r\n");
      out.write("							class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("					<li><a href=\"72__faisal\" class=\"w3_agile_rss\"><i\r\n");
      out.write("							class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("				</ul>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"clearfix\"></div>\r\n");
      out.write("		</div>\r\n");
      out.write("\r\n");
      out.write("		<div class=\"header-bottom\">\r\n");
      out.write("			<nav class=\"navbar navbar-default\">\r\n");
      out.write("				<!-- Brand and toggle get grouped for better mobile display -->\r\n");
      out.write("				<div class=\"navbar-header\">\r\n");
      out.write("					<button type=\"button\" class=\"navbar-toggle collapsed\"\r\n");
      out.write("						data-toggle=\"collapse\" data-target=\"#bs-example-navbar-collapse-1\">\r\n");
      out.write("						<span class=\"sr-only\">Toggle navigation</span> <span\r\n");
      out.write("							class=\"icon-bar\"></span> <span class=\"icon-bar\"></span> <span\r\n");
      out.write("							class=\"icon-bar\"></span>\r\n");
      out.write("					</button>\r\n");
      out.write("					<div class=\"logo\">\r\n");
      out.write("						<h1>\r\n");
      out.write("							<a class=\"navbar-brand\" href=\"index.jsp\"><span>Khajina</span>Doc\r\n");
      out.write("								<i class=\"fa fa-plus\" aria-hidden=\"true\"></i>\r\n");
      out.write("								<p>Quality Care 4U</p></a>\r\n");
      out.write("						</h1>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("\r\n");
      out.write("				<!-- Collect the nav links, forms, and other content for toggling -->\r\n");
      out.write("				<div class=\"collapse navbar-collapse nav-wil\"\r\n");
      out.write("					id=\"bs-example-navbar-collapse-1\">\r\n");
      out.write("					<nav class=\"menu menu--sebastian\">\r\n");
      out.write("						<ul id=\"m_nav_list\" class=\"m_nav menu__list\">\r\n");
      out.write("							<li class=\"m_nav_item menu__item menu__item--current\"\r\n");
      out.write("								id=\"m_nav_item_1\"><a href=\"index.jsp\" class=\"menu__link\">\r\n");
      out.write("									Home </a></li>\r\n");
      out.write("							<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_2\"><a\r\n");
      out.write("								href=\"about.jsp\" class=\"menu__link\"> About Us </a></li>\r\n");
      out.write("							<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_2\"><a\r\n");
      out.write("								href=\"Department-home.jsp\" class=\"menu__link\"> Department </a></li>\r\n");
      out.write("\r\n");
      out.write("							<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_3 dropdown\">\r\n");
      out.write("								<a href=\"#\" class=\"menu__link dropdown-toggle\"\r\n");
      out.write("								data-toggle=\"dropdown\">");
      out.print(p.getName() );
      out.write(" <b class=\"caret\"></b></a>\r\n");
      out.write("								<ul class=\"dropdown-menu agile_short_dropdown\">\r\n");
      out.write("									<li><a href=\"Patient_profile.jsp\">Profile</a></li>\r\n");
      out.write("									<li><a href=\"Patient_changepassword.jsp\">Change\r\n");
      out.write("											Password</a></li>\r\n");
      out.write("									<li><a href=\"Patient_logout.jsp\">Logout</a></li>\r\n");
      out.write("								</ul>\r\n");
      out.write("							</li>\r\n");
      out.write("							<li class=\"m_nav_item menu__item\" id=\"moble_nav_item_6\"><a\r\n");
      out.write("								href=\"contact.jsp\" class=\"menu__link\"> Contact </a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</nav>\r\n");
      out.write("\r\n");
      out.write("				</div>\r\n");
      out.write("				<!-- /.navbar-collapse -->\r\n");
      out.write("			</nav>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("	<div class=\"department-box\">\r\n");
      out.write("		<div class=\"row\">\r\n");
      out.write("		 ");
 int did   =Integer.parseInt(request.getParameter("did"));	
      out.write("\r\n");
      out.write("		 \r\n");
      out.write("		 ");
 Doctordata d = Doctordao.cardiologistdrbyid(did);
      out.write("\r\n");
      out.write("		");
      out.write("\r\n");
      out.write("					\r\n");
      out.write("			<div class=\"col-md-4 department\">\r\n");
      out.write("				<div class=\"overlay\">\r\n");
      out.write("					<input type=\"hidden\" name=\"did\" value=\"");
      out.print(d.getDid() );
      out.write("\">		\r\n");
      out.write("					<img src=\"img/");
      out.print(d.getDid() );
      out.write("\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("\r\n");
      out.write("					<h4>Cardiology</h4>\r\n");
      out.write("					<br>\r\n");
      out.write("					<h6>");
      out.print(d.getDname() );
      out.write("</h6>\r\n");
      out.write("					<h6>");
      out.print(d.getDcaddress() );
      out.write("</h6>\r\n");
      out.write("					<h6>");
      out.print(d.getDspeciality() );
      out.write("</h6>\r\n");
      out.write("					<h6>");
      out.print(d.getDContact() );
      out.write("</h6>\r\n");
      out.write("					<h6>");
      out.print(d.getDemail());
      out.write("</h6>\r\n");
      out.write("					<h6>");
      out.print(d.getDhaddress() );
      out.write("</h6>\r\n");
      out.write("					\r\n");
      out.write("					<div class=\"btn-group\" role=\"group\">\r\n");
      out.write("						<a href=\"appointment.jsp\" class=\"btn btn-primary\" >Make an Appointment</a>\r\n");
      out.write("\r\n");
      out.write("						\r\n");
      out.write("\r\n");
      out.write("					</div>\r\n");
      out.write("					\r\n");
      out.write("					<br>\r\n");
      out.write("					<div class=\"agileinfo_social_icons\">\r\n");
      out.write("						<ul class=\"agileits_social_list\">\r\n");
      out.write("							<li><a href=\"72__faisal\" class=\"w3_agile_facebook\"><i\r\n");
      out.write("									class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("							<li><a href=\"72__faisal\" class=\"agile_twitter\"><i\r\n");
      out.write("									class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("							<li><a href=\"72__faisal\" class=\"w3_agile_dribble\"><i\r\n");
      out.write("									class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("							<li><a href=\"72__faisal\" class=\"w3_agile_rss\"><i\r\n");
      out.write("									class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("\r\n");
      out.write("	\r\n");
      out.write("<!-- footer -->\r\n");
      out.write("	<div class=\"footer\">\r\n");
      out.write("		<div class=\"container\">\r\n");
      out.write("			<h4>Subscribe to <span>Newsletter</span></h4>\r\n");
      out.write("			<form action=\"#\" method=\"post\">\r\n");
      out.write("				<input type=\"email\" name=\"Email\" placeholder=\"Enter Your Email...\" required=\"\">\r\n");
      out.write("				<input type=\"submit\" value=\"Send\">\r\n");
      out.write("			</form>\r\n");
      out.write("			<div class=\"agile_footer_copy\">\r\n");
      out.write("				<div class=\"w3agile_footer_grids\">\r\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid\">\r\n");
      out.write("						<h3>About Us</h3>\r\n");
      out.write("						<p>Duis aute irure dolor in reprehenderit in voluptate velit esse.<span>Excepteur sint occaecat cupidatat \r\n");
      out.write("							non proident, sunt in culpa qui officia deserunt mollit.</span></p>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid\">\r\n");
      out.write("						<h3>Contact Info</h3>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><i class=\"fa fa-map-marker\" aria-hidden=\"true\"></i>Near Kankariya <span>Ahmedabad.</span></li>\r\n");
      out.write("							<li><i class=\"fa fa-envelope-o\" aria-hidden=\"true\"></i><a href=\"khajinadoc@gmail.com\">khajinadoc@gmail.com</a></li>\r\n");
      out.write("							<li><i class=\"fa fa-phone\" aria-hidden=\"true\"></i>+91 8200405262</li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"col-md-4 w3agile_footer_grid w3agile_footer_grid1\">\r\n");
      out.write("						<h3>Navigation</h3>\r\n");
      out.write("						<ul>\r\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"gallery.jsp\">Department</a></li>\r\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"appointment.jsp\">Appointment</a></li>\r\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"about.jsp\">About</a></li>\r\n");
      out.write("							<li><span class=\"fa fa-long-arrow-right\" aria-hidden=\"true\"></span><a href=\"contact.jsp\">Contact Us</a></li>\r\n");
      out.write("						</ul>\r\n");
      out.write("					</div>\r\n");
      out.write("					<div class=\"clearfix\"> </div>\r\n");
      out.write("				</div>\r\n");
      out.write("			</div>\r\n");
      out.write("			<div class=\"w3_agileits_copy_right_social\">\r\n");
      out.write("				<div class=\"col-md-6 agileits_w3layouts_copy_right\">\r\n");
      out.write("					<p>&copy; 2023 KHAJINADOC. All rights reserved.</p>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"col-md-6 w3_agile_copy_right\">\r\n");
      out.write("					<ul class=\"agileits_social_list\">\r\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_facebook\"><i class=\"fa fa-facebook\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"agile_twitter\"><i class=\"fa fa-twitter\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_dribble\"><i class=\"fa fa-dribbble\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("								<li><a href=\"#\" class=\"w3_agile_rss\"><i class=\"fa fa-rss\" aria-hidden=\"true\"></i></a></li>\r\n");
      out.write("							</ul>\r\n");
      out.write("				</div>\r\n");
      out.write("				<div class=\"clearfix\"> </div>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- //footer -->\r\n");
      out.write("<a href=\"#\" id=\"toTop\" style=\"display: block;\"> <span id=\"toTopHover\" style=\"opacity: 1;\"> </span></a>\r\n");
      out.write(" <!-- js -->\r\n");
      out.write("<script src=\"js/jquery-2.2.3.min.js\"></script>\r\n");
      out.write("<script src=\"js/JiSlider.js\"></script>\r\n");
      out.write("		<script>\r\n");
      out.write("			$(window).load(function () {\r\n");
      out.write("				$('#JiSlider').JiSlider({color: '#fff', start: 3, reverse: true}).addClass('ff')\r\n");
      out.write("			})\r\n");
      out.write("		</script><script type=\"text/javascript\">\r\n");
      out.write("\r\n");
      out.write("  var _gaq = _gaq || [];\r\n");
      out.write("  _gaq.push(['_setAccount', 'UA-36251023-1']);\r\n");
      out.write("  _gaq.push(['_setDomainName', 'jqueryscript.net']);\r\n");
      out.write("  _gaq.push(['_trackPageview']);\r\n");
      out.write("\r\n");
      out.write("  (function() {\r\n");
      out.write("    var ga = document.createElement('script'); ga.type = 'text/javascript'; ga.async = true;\r\n");
      out.write("    ga.src = ('https:' == document.location.protocol ? 'https://ssl' : 'http://www') + '.google-analytics.com/ga.js';\r\n");
      out.write("    var s = document.getElementsByTagName('script')[0]; s.parentNode.insertBefore(ga, s);\r\n");
      out.write("  })();\r\n");
      out.write("\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<script src=\"js/ziehharmonika.js\"></script>\r\n");
      out.write("<script>\r\n");
      out.write("$(document).ready(function() {\r\n");
      out.write("		$('.ziehharmonika').ziehharmonika({\r\n");
      out.write("			collapsible: true,\r\n");
      out.write("			prefix: ''\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- stats -->\r\n");
      out.write("	<script src=\"js/jquery.waypoints.min.js\"></script>\r\n");
      out.write("	<script src=\"js/jquery.countup.js\"></script>\r\n");
      out.write("		<script>\r\n");
      out.write("			$('.counter').countUp();\r\n");
      out.write("		</script>\r\n");
      out.write("<!-- //stats -->\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("$(function(){\r\n");
      out.write("  $(\"#bars li .bar\").each(function(key, bar){\r\n");
      out.write("    var percentage = $(this).data('percentage');\r\n");
      out.write("\r\n");
      out.write("    $(this).animate({\r\n");
      out.write("      'height':percentage+'%'\r\n");
      out.write("    }, 1000);\r\n");
      out.write("  })\r\n");
      out.write("})\r\n");
      out.write("</script>\r\n");
      out.write("\r\n");
      out.write("<!-- bootstrap-pop-up -->\r\n");
      out.write("	<div class=\"modal video-modal fade\" id=\"myModal\" tabindex=\"-1\" role=\"dialog\" aria-labelledby=\"myModal\">\r\n");
      out.write("		<div class=\"modal-dialog\" role=\"document\">\r\n");
      out.write("			<div class=\"modal-content\">\r\n");
      out.write("				<div class=\"modal-header\">\r\n");
      out.write("					Health Plus\r\n");
      out.write("					<button type=\"button\" class=\"close\" data-dismiss=\"modal\" aria-label=\"Close\"><span aria-hidden=\"true\">&times;</span></button>						\r\n");
      out.write("				</div>\r\n");
      out.write("				<section>\r\n");
      out.write("					<div class=\"modal-body\">\r\n");
      out.write("						<img src=\"images/g9.jpg\" alt=\" \" class=\"img-responsive\" />\r\n");
      out.write("						<p>Ut enim ad minima veniam, quis nostrum \r\n");
      out.write("							exercitationem ullam corporis suscipit laboriosam, \r\n");
      out.write("							nisi ut aliquid ex ea commodi consequatur? Quis autem \r\n");
      out.write("							vel eum iure reprehenderit qui in ea voluptate velit \r\n");
      out.write("							esse quam nihil molestiae consequatur, vel illum qui \r\n");
      out.write("							dolorem eum fugiat quo voluptas nulla pariatur.\r\n");
      out.write("							<i>\" Quis autem vel eum iure reprehenderit qui in ea voluptate velit \r\n");
      out.write("								esse quam nihil molestiae consequatur.</i></p>\r\n");
      out.write("					</div>\r\n");
      out.write("				</section>\r\n");
      out.write("			</div>\r\n");
      out.write("		</div>\r\n");
      out.write("	</div>\r\n");
      out.write("<!-- //bootstrap-pop-up -->\r\n");
      out.write("\r\n");
      out.write("<!-- flexSlider -->\r\n");
      out.write("	<script defer src=\"js/jquery.flexslider.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(window).load(function(){\r\n");
      out.write("		  $('.flexslider').flexslider({\r\n");
      out.write("			animation: \"slide\",\r\n");
      out.write("			start: function(slider){\r\n");
      out.write("			  $('body').removeClass('loading');\r\n");
      out.write("			}\r\n");
      out.write("		  });\r\n");
      out.write("		});\r\n");
      out.write("  </script>\r\n");
      out.write("<!-- //flexSlider -->\r\n");
      out.write("\r\n");
      out.write("\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/move-top.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\" src=\"js/easing.js\"></script>\r\n");
      out.write("<script type=\"text/javascript\">\r\n");
      out.write("	jQuery(document).ready(function($) {\r\n");
      out.write("		$(\".scroll\").click(function(event){		\r\n");
      out.write("			event.preventDefault();\r\n");
      out.write("			$('html,body').animate({scrollTop:$(this.hash).offset().top},1000);\r\n");
      out.write("		});\r\n");
      out.write("	});\r\n");
      out.write("</script>\r\n");
      out.write("<!-- start-smoth-scrolling -->\r\n");
      out.write("			<script src=\"js/jarallax.js\"></script>\r\n");
      out.write("	<script src=\"js/SmoothScroll.min.js\"></script>\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		/* init Jarallax */\r\n");
      out.write("		$('.jarallax').jarallax({\r\n");
      out.write("			speed: 0.5,\r\n");
      out.write("			imgWidth: 1366,\r\n");
      out.write("			imgHeight: 768\r\n");
      out.write("		})\r\n");
      out.write("	</script>\r\n");
      out.write("	\r\n");
      out.write("	<script src=\"js/bootstrap.js\"></script>\r\n");
      out.write("<!-- //for bootstrap working -->\r\n");
      out.write("<!-- here stars scrolling icon -->\r\n");
      out.write("	<script type=\"text/javascript\">\r\n");
      out.write("		$(document).ready(function() {\r\n");
      out.write("			/*\r\n");
      out.write("				var defaults = {\r\n");
      out.write("				containerID: 'toTop', // fading element id\r\n");
      out.write("				containerHoverID: 'toTopHover', // fading element hover id\r\n");
      out.write("				scrollSpeed: 1200,\r\n");
      out.write("				easingType: 'linear' \r\n");
      out.write("				};\r\n");
      out.write("			*/\r\n");
      out.write("								\r\n");
      out.write("			$().UItoTop({ easingType: 'easeOutQuart' });\r\n");
      out.write("								\r\n");
      out.write("			});\r\n");
      out.write("	</script>\r\n");
      out.write("<!-- //here ends scrolling icon -->\r\n");
      out.write("</body>\r\n");
      out.write("</html>");
    } catch (java.lang.Throwable t) {
      if (!(t instanceof javax.servlet.jsp.SkipPageException)){
        out = _jspx_out;
        if (out != null && out.getBufferSize() != 0)
          try {
            if (response.isCommitted()) {
              out.flush();
            } else {
              out.clearBuffer();
            }
          } catch (java.io.IOException e) {}
        if (_jspx_page_context != null) _jspx_page_context.handlePageException(t);
        else throw new ServletException(t);
      }
    } finally {
      _jspxFactory.releasePageContext(_jspx_page_context);
    }
  }
}
