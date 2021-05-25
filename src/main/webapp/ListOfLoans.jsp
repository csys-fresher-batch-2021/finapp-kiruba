<!DOCTYPE html>
<%@page import="in.kiruba.model.Loan"%>

<%@page import="java.util.List"%>
<%@page import="in.kiruba.service.DisplayLoans" %>
<html lang = "en">
<head>
<meta charset="ISO-8859-1">
<title>LoanLists</title>
</head>

<body>
	<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">

		<table class="table table-bordered">
		<caption>This Table contains loans with serial number</caption>
		
			<thead>
				<tr>
					<th id="S.no">S.no</th>
					<th id="loans">Loans</th>
				</tr>
			</thead>
			<tbody>
<% 
List<Loan> typesOfLoans=DisplayLoans.getLoanTypes();
int i=0;
for(Loan loantypes:typesOfLoans){
	i++;
%>
				<tr>
					<td><%=i %>
					<td>
						<%=loantypes.getType() %>
					</td>
				</tr>

				<% }%>






			</tbody>


		</table>
	</main>

</body>
</html>