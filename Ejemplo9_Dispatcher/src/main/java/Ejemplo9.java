

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejemplo9
 */
public class Ejemplo9 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejemplo9() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html><body>");
		out.println("<fieldset><legend>Ejemplo de Request Dipsatcher</legend>");
		out.println("<form name='formulario action='Ejemplo9' method='post'>");
		out.println("<input type='submit' name='metodo' value='include'>");
		out.println("<input type='submit' name='metodo' value='forward'>");
		out.println("</form></fieldset></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>");
		out.println("<body bgcolor='#AAFF9F'>");
		out.println("<h3>Ejemplo de Request Dipsatcher</h3>");
		out.println("Este servlet usa un despachador que nos lleva a un servlet");
		
		RequestDispatcher dispatcher= request.getRequestDispatcher("Ejemplo9BIS");
		if(dispatcher!=null) {
			if(request.getParameter("metodo")!=null) {
				request.setAttribute("attribDispatcher", "Lleva atributo");
				if(request.getParameter("metodo").equals("include")) {
					dispatcher.include(request, response);
				}else {
					dispatcher.forward(request, response);
				}
			}
			out.println("<p>Reenvío de la respuesta al primer servlet</p>");
		}else {
			out.print("<p>No se ha encontrado el despachador</p>");
		}
		out.println("</body></html>");
	}

}
