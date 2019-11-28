<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<% String msg = (String) request.getAttribute("msg"); %>
<jsp:include page="/homePage"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<%if(msg != null && !msg.isEmpty()) { %>
	<%=msg %>
	<%} %>
	<form action="./addEmp" method="post">
		<table>
			<tr>
				<td>Emp ID</td>
				<td>:</td>
				<td><input type="text" name="empId" required></td>
			</tr>
			<tr>
				<td>Emp Name</td>
				<td>:</td>
				<td><input type="text" name="empName"></td>
			</tr>
			<tr>
				<td>Age</td>
				<td>:</td>
				<td><input type="number" name="age"></td>
			</tr>
			<tr>
				<td>Salary</td>
				<td>:</td>
				<td><input type="number" name="salary"></td>
			</tr>
			<tr>
				<td>Designation</td>
				<td>:</td>
				<td><input type="text" name="designation"></td>
			</tr>
			<tr>
				<td>Mobile</td>
				<td>:</td>
				<td><input type="number" name="mobile"></td>
			</tr>
		</table>

		<input type="submit" name="add">
	</form>
</body>
</html>