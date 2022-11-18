<%@ page session="true"%>
<!DOCTYPE html>
<% 
Integer accesos=(Integer) session.getAttribute("accesos");
if(accesos==null)
	accesos=0;
accesos=accesos+1;
session.setAttribute("accesos", accesos);
if(request.getParameter("invalidaSesion")!=null)
	session.invalidate();
%>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<form>
		<input type="submit" name="invalidaSesion" value="InvalidarSesion">
		<input type="submit" value="Recargar">
	</form>
	<br>
	contador: <%= accesos %>
</body>
</html>