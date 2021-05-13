<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Login</title>
</head>
<body>
   <!--  <form action="User_Action.jsp">-->
    <form action="LoginServlet" method="post">
<h1>Login Page</h1>

<label for="login">UserName</label>
<input type="text" name="username" id="username" placeholder="username" required>
<br>
<br>
<label for="password">Password</label>
<input type="password" name="password" id="password" placeholder="password" required>
<br>
<br>

<%
String errorMessage=request.getParameter("errormessage");
if(errorMessage!=null){
	out.println("<font color='red'>"+errorMessage+"</font>");
}
%>
<br>
<br>
<button type="submit" class="btn btn-primary">Submit</button>


</form>

</body>
</html>