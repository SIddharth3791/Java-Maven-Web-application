<%@page import ="java.util.Date" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>NEW MAVEN PROJECT ....JSP</title>
</head>
<body>
It is going to get so complicated now ${name}

<%
System.out.println(request.getParameter("name"));
Date date = new Date();
%>

<div> my current date is <%=date %></div>
</body>
</html>