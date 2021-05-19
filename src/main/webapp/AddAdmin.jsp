<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
		<h2>Add Admin Page</h2>
		<form action="AddAdminservlet" method="get">
			<label for="username">Enter the name</label> <input type="text"
				name="username" placeholder="username" required> <br> <br>
			<label for="password">Enter the name</label> <input type="password"
				name="password" placeholder="password" required> <br> <br>

			<%
			String errorMessage = request.getParameter("errormessage");
			if (errorMessage != null) {
				out.println("<font color='red'>" + errorMessage + "</font>");
			}
			%>
			<button type="submit" class="btn btn-primary">Submit</button>


		</form>
	</main>

</body>
</html>