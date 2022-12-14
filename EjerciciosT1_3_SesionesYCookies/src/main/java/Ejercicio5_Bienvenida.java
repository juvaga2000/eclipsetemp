

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Ejercicio5_Bienvenida
 */
public class Ejercicio5_Bienvenida extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio5_Bienvenida() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[]cookies=request.getCookies();
		if(cookies==null) {
			response.addCookie(new Cookie("C", "0"));
			response.addCookie(new Cookie("Java", "0"));
			response.addCookie(new Cookie("HTML", "0"));
			response.addCookie(new Cookie("C#", "0"));
		}else {
			
		}
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "<head></head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>Bienvenido a web libreria. Usted seleccionÃ³ "+request.getParameter("libro")+"</h1>\r\n"
				+ "<a href=\"Ejercicio5_Portada\">Seguir comprando</a>"
				+ "<a href=\"Ejercicio5_Carrito\">Ver carrito</a>"
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
