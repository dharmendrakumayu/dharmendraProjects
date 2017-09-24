<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="RegisterServlet">
	<table>
		<tr><th>User Name</th><td><input type="text" name="username" /></td></tr> 
		<tr><th>Password</th><td><input type="password" name="userpassword" /></td></tr> 
		<tr><th>Confirm Password</th><td><input type="password" name="confirmpassword" /></td></tr> 
		<tr><th>Email Id</th><td><input type="email" name="useremail" /></td></tr>
		<tr><th>Phone Number</th><td><input type="text" name="phonenumber" /></td></tr> 
		<tr><th></th><td><button type="submit">Register</button></td></tr> 
		</table>
	</form>

</body>
</html>