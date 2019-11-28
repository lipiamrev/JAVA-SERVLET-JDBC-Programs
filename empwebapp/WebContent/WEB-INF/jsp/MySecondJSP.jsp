<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%!
    int a =100;
    public int getA(){
    	return a;
    }
    public void setA(int a){
    	this.a =a;
    }
    String name = "Sam";
    public String getName(){
    	return name;
    }
    public String getName(String givenName){
    	return givenName;
    }
    public void setName(String name){
    	this.name = name;
    }
    %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	<% boolean isTrue = true;   %>
	<h2>Hello User</h2>
	
	a1 = <%=a %><br>
	a2 = <%=getA() %>
	
	Name1 = <%=name %><br>
	Name2 = <%=getName() %><br>
	Name3 = <%=getName("abc") %><br>
	
	<%for(int i =0; i<5 ; i++){ %>
	<%=getName() %>
	<%} %>
</body>
</html>

<jsp:include page="date.html" />
