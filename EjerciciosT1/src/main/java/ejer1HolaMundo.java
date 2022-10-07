
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ejer1HolaMundo
 */
public class ejer1HolaMundo extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public ejer1HolaMundo() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		if (request.getParameter("idioma").equals("spain")) {
			response.getWriter().append("Hola Mundo");
		} else if (request.getParameter("idioma").equals("italy")) {
			response.getWriter().append("Ciao a tutti");
		} else if (request.getParameter("idioma").equals("france")) {
			response.getWriter().append("Bonjour Tout");
		} else {
			response.getWriter().append("Idioma no encontrado");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		if (request.getParameter("idioma").equals("spain")) {
			response.getWriter().append("Hola Mundo");
		} else if (request.getParameter("idioma").equals("italy")) {
			response.getWriter().append("Ciao a tutti");
		} else if (request.getParameter("idioma").equals("france")) {
			response.getWriter().append("Bonjour Tout");
		}
	}

}
