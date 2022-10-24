

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio2
 */
public class Ejercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[]cookies=request.getCookies();
		if(request.getParameter("nombre")!=null) {
			Cookie c= new Cookie("nombre", request.getParameter("nombre"));
			c.setMaxAge(100);
			response.addCookie(c);
		}
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Cookie[]cookies=request.getCookies();
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.println("<html>");
		out.println("<head>");
		out.println("</head>");
		out.println("<body>");
		System.out.println("AAAAAAAAAAAAA");
			if(cookies[1].getDomain()!="localhost") {
				out.println("<h1>Acceso denegado<h1>");
			}
			if(cookies!=null){
			out.println("<h2>Salúdame</h2>");
			if(cookies[1]!=null) {
				out.println("Bienvenido a mi web");
				out.println("Me alegro de verte " +cookies[1].getValue());
			}
			out.println("<form method=\"post\" action=\"Ejercicio2\">");
			out.println("Nombre: ");
			out.println("<input type=\"text\" name=\"nombre\">");
			out.println("<br>");
			out.println("<input type=\"submit\" value=\"Confirmar\">");
			out.println("</form>");
		}
		
		out.println("</body>");
		out.println("</html>");
	}

}
