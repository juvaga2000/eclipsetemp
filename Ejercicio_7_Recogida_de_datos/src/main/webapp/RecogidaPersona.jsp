<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<%
	if(request.getAttribute("deshabilitarFormulario")==null){%>
		<fieldset>
	<%
		 }else{ %>
		  <fieldset disabled="disabled">
	<% } %>
			<form action="ServletPersona" method="get">
				DNI <input type="text" name="dni"><br>
				Nombre <input type="text" name="nombre"><br>
				Apellidos <input type="text" name="apellidos"><br>
				<input type="submit" name="submit" value="Enviar">
			</form>
	</fieldset>
</body>
</html>