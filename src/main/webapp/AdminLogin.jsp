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

		<h2>Admin Login Page</h2>
		<form action="AdminLoginServlet" method="get">
			<label for="adminName">Enter UserName</label> <input type="text"
				name="adminName" placeholder="Enter username" required> <br>
			<br> <label for="password">Enter password</label> <input
				type="password" name="password" placeholder="Enter password"
				required> <br> <br>
			<%
			String errorMessage = request.getParameter("errorMessage");
			if (errorMessage != null) {
				out.println("<font color='red'>" + errorMessage + "</font>");
			}
			%>
			<br>
			<br>

			<button type="submit" class="btn btn-primary">Submit</button>
			<br>
						

		</form>


	</main>

</body>
</html>