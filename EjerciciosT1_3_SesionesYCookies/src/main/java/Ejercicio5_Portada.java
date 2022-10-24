

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio5_Portada
 */
public class Ejercicio5_Portada extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio5_Portada() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "<head></head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>Bienvenido a web libreria. Seleccione el libro</h1>\r\n"
				+ "<form method=\"get\" action=\"Ejercicio5_Bienvenida\">"
				+ "<h3>Listado de libros<h3>"
				+ "<select id=\"libro\" name=\"libro\">"
				+ "<option value=\"c\">C</option>\r\n"
				+ "<option value=\"java\">Java</option>\r\n"
				+ "<option value=\"html\">HTML</option>\r\n"
				+ "<option value=\"C#\">C#</option>"
				+ "</select>"
				+ "<h3>Unidades<h3>"
				+"<input type=\"number\" name=\"unidades\"value=\"Unidades\">"
				+"<input type=\"submit\" value=\"Enviar\">"
				+ "</form>"
				+ "	</body>\r\n"
				+ "	</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
