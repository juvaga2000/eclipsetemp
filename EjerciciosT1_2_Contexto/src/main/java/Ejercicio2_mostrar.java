

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class Ejercicio2_mostrar
 */
public class Ejercicio2_mostrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio2_mostrar() {
        super();
        // TODO Auto-generated constructor stub
    }
    
    public void init(ServletConfig config) throws ServletException {
		// TODO Auto-generated method stub
		super.init(config);
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
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
		
		ArrayList <Persona>personas= (ArrayList<Persona>)getServletConfig().getServletContext().getAttribute("personas");
		for(Persona persona:personas){
			out.println("<tr>");
			out.println("<td>");
			out.println(persona.getNombre());
			out.println("</td>");
			out.println("<td>");
			out.println(persona.getApellidos());
			out.println("</td>");
			out.println("<td>");
			out.println(persona.getEdad());
			out.println("</td>");
			out.println("</tr>");
		}
		//out.println((ArrayList<Persona>)getServletConfig().getServletContext().getAttribute("personas"));
		
		out.println("</table>");
		out.println("</body>");
		out.println("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
