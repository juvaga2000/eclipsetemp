import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class Bienvenido
 */
public class Menu extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Menu() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		HttpSession sesion= request.getSession(true);
		if(sesion.getAttribute("carrito")==null) {
			sesion.setAttribute("carrito", request.getAttribute("producto")+"\n");
		}else {
			sesion.setAttribute("carrito", (String) sesion.getAttribute("producto")+request.getAttribute("producto")+"\n");
		}
		sesion.setAttribute(getServletInfo(), sesion);
		out.print("<html>\r\n"
				+ "<head></head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>Carniceria Panizo</h1>\r\n"
				+ "<a href=\"Listado\">Ver carrito</a>"
				+ "<a href=\"Tienda\">Seguir Comprando</a>"
				+ "	</body>\r\n"
				+ "	</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

}
