<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="./forgot" method="post">
			<table>
				<tr>
					<td>Username</td>
					<td>:</td>
					<td><input type="text" name="username" required></td>
				</tr>

				<tr>
					<td>New Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>
				
				<tr>
					<td>Confirm Password</td>
					<td>:</td>
					<td><input type="password" name="password" required></td>
				</tr>

				<tr>
					<td colspan="3"><br> <input type="submit" value="Submit"></td>
				</tr>
				
			</table>
		</form>
	
</body>
</html>