<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
<h2>Registration Page</h2>

<form action="RegisterAction.jsp">

<label for="username">UserName</label>
<input type="text" name="username"  required>
<br>
<br>
<label for="password">Password</label>
<input type="password" name="password"  required>
<br>
<br>

<br>

<button class="btn btn-primary">Submit</button>

<button>Reset</button>

</form>
<br>

</main>


</body>
</html>