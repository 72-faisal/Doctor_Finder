<%@page import="dao.Doctordao"%>
<%@page import="dao.Patientdao"%>

<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
int did = Integer.parseInt(request.getParameter("Did"));
Doctordao.deleteDoctor(did);
response.sendRedirect("admin-seller-list.jsp");
%>

</body>
</html>