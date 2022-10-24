

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Tienda
 */
public class Ejercicio4_Tienda extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio4_Tienda() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		HttpSession sesion=request.getSession();
		PrintWriter out = response.getWriter();
		if(sesion.getAttribute("user")!=null) {
			out.print("<html>\r\n"
					+ "<head></head>\r\n"
					+ "<body>\r\n"
					+ "	<h1>Carniceria Panizo</h1>\r\n"
					+ "<form method=\"get\" action=\"Ejercicio4_Menu\">"
					+ "<select id=\"productos\" name=\"productos\">"
					+ "<option value=\"chorizo\">Chorizo</option>\r\n"
					+ "<option value=\"pollo\">Pollo</option>\r\n"
					+ "<option value=\"ternera\">Ternera</option>\r\n"
					+ "<option value=\"costillas\">Costillas</option>"
					+ "</select>"
					+"<input type=\"submit\" value=\"Enviar\">"
					+ "</form>"
					+ "	</body>\r\n"
					+ "	</html>");
		}else {
			out.print("<html>\r\n"
					+ "<head></head>\r\n"
					+ "<body>\r\n"
					+ "	<h1>Acceso denegado</h1>\r\n"
					+ "	</body>\r\n"
					+ "	</html>");
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
