
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
public class Ejercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private ArrayList<Persona> personas = new ArrayList<Persona>();

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public Ejercicio2() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
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
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		out.println("<h1>Muestra de datos</h1>");
		out.println("<table border=\"1px\">");
		out.println("<tr>");
		out.println("<td>" + "Nombre" + "</td>");
		out.println("<td>" + "Apellidos" + "</td>");
		out.println("<td>" + "Edad" + "</td>");
		out.println("</tr>");
		out.println("<tr>");
		if (request.getParameter("nombre") != null && request.getParameter("apellidos") != null
				&& request.getParameter("edad") != null) {
			Persona p = new Persona(request.getParameter("nombre"), request.getParameter("apellidos"),
					Integer.parseInt(request.getParameter("edad")));
			personas.add(p);
			Enumeration<String> e = request.getParameterNames();
			while (e.hasMoreElements()) {
				String parametro = e.nextElement();
				if (parametro != null && !parametro.isEmpty())
					out.println("<td>" + request.getParameter(parametro) + "</td>");
			}
		}
		out.println("</tr>");
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");

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
