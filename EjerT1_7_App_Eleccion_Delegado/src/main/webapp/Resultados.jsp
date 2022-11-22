<%@page import="java.io.PrintWriter"%>
<%@page import="java.util.ArrayList"%>
<%@ page import ="a.Votacion" %>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
	<% ArrayList<Votacion> votos=(ArrayList) getServletContext().getAttribute("votosContext");
	PrintWriter writer = response.getWriter();
	response.setContentType("text/html");
	writer.println("<!DOCTYPE html>" +
			"<html lang='en'>" +
			"<head>" +
			    "<meta charset='UTF-8'>" +
			    "<meta http-equiv='X-UA-Compatible' content='IE=edge'>" +
			    "<meta name='viewport' content='width=device-width, initial-scale=1.0'>" +
			    "<title>Document</title>" +
			"</head>" +
			"<body>");
			
	for(Votacion voto : votos){
		writer.append(voto.getNombre()+"---"+voto.getVotos()+ "<br>");
	}
	
	writer.println("</body>" +
			"</html>");
	%>
</body>
</html>