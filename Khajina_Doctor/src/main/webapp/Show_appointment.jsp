<%@page import="model.Doctordata"%>
<%@page import="model.Appointmentdata"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">

<title>Appointment recipe</title>
<meta name="viewport" content="width=device-width, initial-scale=1">
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<meta name="keywords" content="Health Plus Responsive web template, Bootstrap Web Templates, Flat Web Templates, Android Compatible web template, 
Smartphone Compatible web template, free web designs for Nokia, Samsung, LG, SonyEricsson, Motorola web design" />
<script type="application/x-javascript"> addEventListener("load", function() { setTimeout(hideURLbar, 0); }, false);
		function hideURLbar(){ window.scrollTo(0,1); } </script>
<!-- //for-meta-tags-->
<link href="css/bootstrap.css" rel="stylesheet" type="text/css" media="all" />
<link href="css/wickedpicker.css" rel="stylesheet" type='text/css' media="all" />
			<link rel="stylesheet" href="css/jquery-ui.css" />
<link href="css/style.css" rel="stylesheet" type="text/css" media="all" />
<!-- font-awesome icons -->
<link href="css/font-awesome.css" rel="stylesheet"> 
<!-- //font-awesome icons -->
<link href="//fonts.googleapis.com/css?family=Raleway:200,200i,300,300i,400,400i,500,500i,600,600i,700,700i,800" rel="stylesheet">
<link href="//fonts.googleapis.com/css?family=Lato:300,300i,400,400i,700,900" rel="stylesheet">



</head>

<body>
<%
Appointmentdata a  = null;
   if(session.getAttribute("data")!=null){
	   a = (Appointmentdata)session.getAttribute("data");
   }
   else{
	   response.sendRedirect("appointment.jsp");
   }
   %>

<div class="banner-bottom" id="about">
		<div class="container">
					<h2 class="w3_heade_tittle_agile">Appointment</h2>
			        <p class="sub_t_agileits">Receipt</p>

					<div class="book-appointment">
						<h4>Appointment Details</h4>
								<form action="AppointmentController" method="post" >
								<div class="left-agileits-w3layouts same">
								<div class="gaps">
								 <div class="form-group contact-forms">
                                      <input type="hidden" class="form-control" placeholder="" name="Appointment_id" value="<%=a.getAppointment_id()%>">
                                </div>
									<p>Patient Name</p>
										<input type="text" name="Appointment_name" placeholder="" required="" value="<%=a.getAppointment_name()%>">
								</div>	
									<div class="gaps">	
									<p>Phone Number</p>
										<input type="text" name="Appointment_number" placeholder="" required=""  value=<%=a.getAppointment_number() %>>
									</div>
									<div class="gaps">
									<p>Email</p>
											<input type="email" name="Appointment_email" placeholder="" required="" value="<%=a.getAppointment_email()%>"/>
									</div>	
									<div class="gaps">
									<p>Symptoms</p>
											<input type="text" name="Appointment_symptoms" placeholder="" required="" value="<%=a.getAppointment_symptoms()%>">
									</div>
								</div>
								<div class="right-agileinfo same">
								<div class="gaps">
									<p>Select Date</p>		
											<input  id="datepicker1" name="Appointment_date" type="text" value="<%=a.getAppointment_date()%> %>" onfocus="this.value = '';" onblur="if (this.value == '') {this.value = 'mm/dd/yyyy';}" required="">
								</div>
								<div class="gaps"  >
									<p>Department</p>	
										<select class="option" name="Appointment_department" value="<%=a.getAppointment_department()%>">
											<option><%=a.getAppointment_department()%></option>
											<option>Cardiology</option>
											<option>Ophthalmology</option>
											<option>Neurology</option>
											<option>Psychology</option>
											<option>Dermatology</option>
										</select>
								</div>
								<div class="gaps">
									<p>Gender</p>	
										<select class="option" name="Appointment_gender" value="<%=a.getAppointment_gender()%>">
											<option><%=a.getAppointment_gender()%></option>
											<option>Male</option>
											<option>Female</option>
										</select>
								</div>
								<div class="gaps">
									<p>Time</p>		
										<input type="text" id="timepicker" name="Appointment_time" class="timepicker option" value="<%=a.getAppointment_time()%>">	
								</div>
								</div>
								<div class="clearfix"></div>
                          <button type="submit" name="action" value="update"  class="btn btn-block sent-butnn">Update</button>
                          
								</form>
							</div>
					   </div>

		</div>
	</div>
<!-- icons -->

</body>
</html>
