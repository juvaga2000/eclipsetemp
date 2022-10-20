

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio2B
 */
public class Ejercicio2B extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio2B() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[]cookies=request.getCookies();
		if(request.getParameter("nombre")!=null) {
			Cookie c= new Cookie("nombre", request.getParameter("nombre"));
			c.setMaxAge(100);
			response.addCookie(c);
		}
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		if(cookies!=null) {
			if(cookies[0].getDomain()!="localhost") {
				out.println("<h1>Acceso denegado<h1>");
			}
		}else {
			out.println("<h2>Salúdame</h2>");
			out.println("<br>");
			out.println("Gracias por confiar en nosotros");
			out.println("<br>");
			out.println("<a href=\"http://localhost:8080/EjerciciosT1_3_SesionesYCookies/Ejercicio2\"> Volver al formulario</a>");
			out.println("</body>");
			out.println("</html>");	
		}
		
	}

}
