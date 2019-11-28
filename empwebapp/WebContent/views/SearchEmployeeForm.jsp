<%@page import="com.manthan.empwebapp.beans.EmployeeInfoBean"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%EmployeeInfoBean employeeInfoBean = (EmployeeInfoBean) request.getAttribute("searchEmployee"); %>
    <%String msg = (String) request.getAttribute("msg"); %>
    <jsp:include page="/homePage"></jsp:include>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<fieldset>
	<legend>Search Employee</legend>
	<form action="./searchEmp" method="get">
		Employee Id: <input type="text" name="empId" required>
		<br><br>
		<input type="submit" value="Search">
	</form>
	</fieldset>
	
	<% if(msg != null && !msg.isEmpty()) { %>
	<h3 style="color: red;"> <%=msg %> </h3>
	<%} %>
	<%if(employeeInfoBean != null) { %>
	<table>
		<tr>
		<td>Employee ID</td>
		<td> : </td>
		<td><%=employeeInfoBean.getEmpId() %></td>
		</tr>
		
		<tr>
		<td>Employee Age</td>
		<td> : </td>
		<td> <%=employeeInfoBean.getAge() %></td>
		</tr>
		
		<tr>
		<td>Employee Salary</td>
		<td> : </td>
		<td> <%=employeeInfoBean.getSalary() %></td>
		</tr>
		
		<tr>
		<td>Employee Designation</td>
		<td> : </td>
		<td> <%=employeeInfoBean.getDesignation() %></td>
		</tr>
		
		<tr>
		<td>Employee Mobile</td>
		<td> : </td>
		<td> <%=employeeInfoBean.getMobile() %></td>
		</tr>
		
	</table>
	<%} %>
	
</body>
</html>