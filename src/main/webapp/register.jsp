<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Registration Page</title>
</head>
<body>
${message}<br>
<form action="register">
Customer Name:<input type="text" name="name"/><br>
Email id:<input type="text" name="email"/><br>
Password:<input type="password" name="password"/><br>
Mobile Number:<input type="text" name="contactNumber"/><br>
Income:<input type="text" name="income"/><br>
<input type="submit" value ="register"/><br>
</form>
<a href="login.jsp">click here</a>to login

</body>
</html>