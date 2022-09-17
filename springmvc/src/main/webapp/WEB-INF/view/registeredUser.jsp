<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<%@ page isELIgnored="false" %>
<head>
<meta charset="UTF-8">
<title>Registered</title>
</head>
<body>
<h1>User Registered!! </h1>
<%=request.getAttribute("someUser")
%>
</body>
</html>