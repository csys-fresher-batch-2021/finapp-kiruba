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
    
		<h3>Add Loans</h3>
		
		<form action="addloans" method="get">
		<label for="loanName">Loan Name</label>
		<input type="text" name="loanName" placeholder="Enter loan Name" required autofocus />
		<br>
		<br/>
		<button type="submit">ADD</button>
		</form>
    
	
	
</main>
</body>
</html>