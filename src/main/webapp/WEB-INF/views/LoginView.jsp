
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NEW MAVEN PROJECT ....JSP</title>
</head>
<body>
It is going to get so complicated now ${name} because your password is : ${password}
<form action="/Login.Do" method = "Post">
<p><font color = red>${ErrorMessage}  </font></p>

Enter your name <input type = "text" name="name"/> 
Enter your Password <input type = "password" name="password"/>
<br></br>
&nbsp;&nbsp;&nbsp;&nbsp;<input type = "submit" value="submit"/>

</form>
</body>
</html>