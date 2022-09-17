<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<html>
<head>
<%@ page isELIgnored="false" %>
<meta charset="UTF-8">
<title>hello title</title>
</head>
<body>
	<%
	int id = (Integer) request.getAttribute("id");
	String name = (String) request.getAttribute("name");
	String hobby = (String) request.getAttribute("hobby");
	out.println("ID: " + id);
	out.println("Name: " + name);
	out.println("Hobby: " + hobby);
	%>
	ID:
	<b> ${id}</b> NAME:
	<b>${name}</b> HOBBY:
	<b> ${hobby}</b>
</body>
</html>