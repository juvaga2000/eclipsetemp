import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import a.Persona;

/**
 * Servlet implementation class ServletPersona
 */
public class ServletPersona extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletPersona() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out =response.getWriter();
		response.setContentType("text/html");
		boolean temp=true;
		request.setAttribute("deshabilitarFormulario", temp);
		RequestDispatcher dispatcher = request.getRequestDispatcher("RecogidaPersona.jsp");
		dispatcher.include(request, response);
		
		if(!request.getParameter("dni").isBlank() || !request.getParameter("nombre").isBlank() || !request.getParameter("apellidos").isBlank() ) {
			Persona persona= new Persona((String)request.getParameter("dni"),(String)request.getParameter("nombre"),(String)request.getParameter("apellidos"));
			out.println("<!DOCTYPE html> " +
					"<html lang='en'> " +
					"<head> " +
					    "<meta charset='UTF-8'> " +
					    "<meta http-equiv='X-UA-Compatible' content='IE=edge'> " +
					    "<meta name='viewport' content='width=device-width, initial-scale=1.0'> " +
					    "<title>Document</title> " +
					"</head> " +
					"<body> " +
					    "<hr> ");
			out.print("DNI ----- "+ persona.getDni()+"<br>");
			out.print("Nombre ----- "+ persona.getNombre()+"<br>");
			out.print("Apellidos ----- "+ persona.getApellidos()+"<br>");
			out.println("<hr> " +
					"</body> " +
					"</html> ");
		}else {
			out.println("<!DOCTYPE html> " +
					"<html lang='en'> " +
					"<head> " +
					    "<meta charset='UTF-8'> " +
					    "<meta http-equiv='X-UA-Compatible' content='IE=edge'> " +
					    "<meta name='viewport' content='width=device-width, initial-scale=1.0'> " +
					    "<title>Document</title> " +
					"</head> " +
					"<body> " +
					    "<hr> "+
					"<h3>ERROR!</h3> <br>"+
					    "Rellena todos los campos"+
					 "<hr> " +
					"</body> " +
					"</html> ");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
