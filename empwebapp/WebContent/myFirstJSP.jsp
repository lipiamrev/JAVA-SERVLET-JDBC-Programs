<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    public void jspInit(){
    	System.out.println("Inside jspInit()..");
    }
    public void jspDestroy(){
    	System.out.println("Inside destroy()..");
    }
    %>
    <%
    System.out.println("Inside _jspService..");
    //Java code to generate dynamic date
    Date dateref = new Date();%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<h2>
	Current System Date and Time <br>
	<%=dateref %>
	</h2>
</body>
</html>