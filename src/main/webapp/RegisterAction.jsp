<%@page import="in.kiruba.service.RegisterService"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<%
String n=request.getParameter("username");
String p=request.getParameter("password");
boolean valid=RegisterService.login(n,p);
if(valid){
	out.println("Successfully login");
}else{
	out.println("Invalid credentials");
}
%>

</body>
</html>