<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ page import ="java.util.ArrayList"%>
<%@ page import ="java.util.List"%>
<%@ page import = "com.aaron.spring.springmvc.dto.Person"%>
<!DOCTYPE html>
<html>
<%@ page isELIgnored="false" %>
<head>
<meta charset="UTF-8">
<title>Person list</title>
</head>
<body>


<%
List<Person> personList = (List<Person>)request.getAttribute("persons");
	for(Person p : personList){
		out.println(p.getId());
		out.println(p.getName());
	}
%>

</body>
</html>