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
<form action="./deleteEmp" method="get">
		<table>
			<tr>
				<td>Emp ID</td>
				<td> : </td>
				<td><input type="text" name="empId" required></td>
			</tr>
			</table>
			<input type="submit" name = "Delete">
	</form>

</body>
</html>