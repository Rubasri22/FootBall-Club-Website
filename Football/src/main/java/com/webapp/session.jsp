<%@ page import="com.model.User" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body> 
<center>
<h3>----This is a session page---- </h3>
</center>
<div id="stylo"><center> 
<%
User u=(User) session.getAttribute("data");
%>
<h2>Hi <%=u.getName() %></h2>
your age is <input type="text" value="<%=u.getAge() %>"><br>
<p> Your address is </p>
<address><%=u.getAddress() %></address>
</center>
</div>




</body>
</html>