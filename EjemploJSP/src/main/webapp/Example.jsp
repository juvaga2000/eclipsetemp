<%@page import="java.util.Date"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<%! String cadena="Hola Mundo";%>
<%! int num=10;%>
<%! public String hora(){
		return (new Date().toString());
};%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<p>La fecha actual es <%=new Date()  %></p>
	<p><%= cadena %></p>
	<!-- Se ve -->
	<%-- No se ve --%>
	<h1>TABLA CONTADOR</h1>
	<table>
		<% for(int i = num; i < num+10;i++){%>
		<li><%= i %>
		<% } %>
	</table>
</body>
</html>