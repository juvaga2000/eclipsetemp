

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Map;

/**
 * Servlet implementation class Ejercicio5_Carrito
 */
public class Ejercicio5_Carrito extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio5_Carrito() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Map<String,Integer> libros=getLibros(request);
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		out.print("<html>\r\n"
				+ "<head></head>\r\n"
				+ "<body>\r\n"
				+ "	<h1>Compra total</h1>\r\n"
				+ "<table>");
		for (Map.Entry<String, Integer> entry : libros.entrySet()) {
		    System.out.println(entry.getKey() + "/" + entry.getValue());
		}
		out.print("</table>"
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
	
	private Map getLibros(HttpServletRequest request) {

		Cookie[]cookies=request.getCookies();
		Map<String, Integer> libros = new HashMap<String, Integer>();
		for(Cookie cookie: cookies) {
			if(!libros.containsKey(cookie.getName())) {
				libros.put(cookie.getName(), 1);
			}else {
				int cantidad=libros.get(cookie.getName());
				libros.put(cookie.getName(), cantidad++);
			}
		}
		return libros;
	}

}
