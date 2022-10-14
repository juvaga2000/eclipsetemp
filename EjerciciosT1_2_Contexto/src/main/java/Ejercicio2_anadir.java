
import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Enumeration;
import java.util.List;

/**
 * Servlet implementation class Ejercicio2
 */
public class Ejercicio2_anadir extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ejercicio2_anadir() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		if (request.getParameter("nombre") != null && request.getParameter("apellidos") != null
				&& request.getParameter("edad") != null) {
			Persona p = new Persona(request.getParameter("nombre"), request.getParameter("apellidos"),
					Integer.parseInt(request.getParameter("edad")));
			personas.add(p);
			getServletConfig().getServletContext().setAttribute("personas", personas);
			out.println("Añadido");
			out.println(getServletConfig().getServletContext().getAttribute("personas"));
		}else {
			out.println("null");
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
