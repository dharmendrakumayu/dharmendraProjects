<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
    <%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
    
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form:form action="saveRegistration.do" modelAttribute="RegistrationModel" autocomplete="on" name="RegistrationModel">
<table border="1" align="center">
<tr>
<td>currentYear</td><td><form:input path="currentYear"/></td>
</tr>
<tr>
<td>firstName</td><td><form:input path="firstName"/></td>
</tr>
<tr>
<td>lastName</td><td><form:input path="lastName"/></td>
</tr>
<tr>
<td colspan="2" align="center"><form:button name="submit"  id="submit" >submit</form:button></td>
</tr>
</table>

</form:form>

</body>
</html>