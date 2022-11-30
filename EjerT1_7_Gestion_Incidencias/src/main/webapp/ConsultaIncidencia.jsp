<%@page import="java.util.ArrayList"%>
<%@page import="servlets.Incidencia"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<table border=1>
		<tr>
			<td>INCIDENCIA</td>
			<td>TEMA</td>
			<td>DESCRIPCION</td>
		</tr>
		<%
		ArrayList<Incidencia> incidencias=(ArrayList)getServletContext().getAttribute("incidencias");
		
		for(Incidencia i:incidencias){
			System.out.println(i.getId());
			%>
			<tr>
				<td><%=i.getId() %></td>
				<td><%=i.getTema() %></td>
				<td><%=i.getDescripcion() %></td>
			</tr>
		<%}
		%>
	</table>
	<form method="post" action="AltaIncidencia.jsp">
		<input type="submit" value="Volver">
	</form>
</body>
</html>