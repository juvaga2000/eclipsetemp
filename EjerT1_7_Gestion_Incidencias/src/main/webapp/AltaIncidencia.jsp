<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<html><body>
<h1>ALTA INCIDENCIA</h1>
<%if(request.getAttribute("correcto")==null ||request.getAttribute("correcto").equals("no")){ %>
<form method="post" action="ServletIncidencia">
<table>
<tr><td><label>Tema: </label></td><td><input type='text' name='tema' value=""></td>
<tr><td><label>Descripción: </label></td><td><textarea name='descripcion' rows="4" cols="50"></textarea></td>
</table>
<input type='submit' name='enviar' value='Confirmar'>
</form>
<%
	}else if(request.getAttribute("correcto").equals("si")){ %>
	
	<p>Su inciencia ha sido dada de alta en el sistema con el codigo: </p><br>
	<h2> <%=request.getAttribute("lastID") %> </h2>
	<form method="post" action="ConsultaIncidencia.jsp">
		<input type="submit" value="Consulta">
	</form>
	
<%} %>
</body></html>