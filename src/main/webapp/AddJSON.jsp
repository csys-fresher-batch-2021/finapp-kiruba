<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html lang="en">
<head>
<script
	src="https://cdnjs.cloudflare.com/ajax/libs/axios/0.21.1/axios.min.js"></script>
<meta charset="ISO-8859-1">
<title>loans</title>
</head>
<body>
<jsp:include page="header.jsp"></jsp:include>
	<main class="container-fluid">
	<h2>List Tasks</h2>
	<div class="table-responsive">
	<table class="table table-bordered table-hove">
	<caption>This Table contains loans with serial number</caption>
		<thead>
			<tr>
				<th id="s.no">S.no</th>
				<th id="loanname">LoanName</th>
			</tr>
		</thead>
		<tbody id="task-tbl">
		
		</tbody>
		
	</table>
	</div>
	</main>
	<script>
function getLoanTypes(){
	console.log("Fetching all tasks ");
	let url = "ListJSON";
	fetch(url).then(res=> res.json()).then(res=>{
		let tasks = res;
		console.log("Got response from servlet");
		console.log(tasks);
		let content = "";
		let count=0;
		for(let task of tasks){
			count++;
			content += "<tr><td>" + count + 
			"</td><td>" + task.type ;
			//content+= "<tr><td>"+task.id+" <td>"+task.type+"</td></tr>";
			
			
		}
		console.log(content);
		document.querySelector("#task-tbl").innerHTML= content;
	})
}


getLoanTypes();
</script>
</body>
</html>