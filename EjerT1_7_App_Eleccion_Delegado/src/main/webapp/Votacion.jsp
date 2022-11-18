<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<h2>ELECCION DE DELEGADO</h2>
	<hr>
	<p>Los delegados que se presentaron a miembros del consejo son</p>
	<form name="checkboxs" method="get" action="ServletVotacion">
		<input type="checkbox" value="Juan" name="delegado">JUAN VAQUERO
		<br>
		<br>
		<input type="checkbox" value="Ruben" name="delegado">RUBEN CASAS
		<br>
		<br>
		<input type="submit" value="VOTAR">
		<hr>
	</form>
</body>
</html>