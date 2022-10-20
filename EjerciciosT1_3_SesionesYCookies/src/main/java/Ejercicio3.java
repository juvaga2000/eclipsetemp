
import jakarta.servlet.http.Cookie;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Ejercicio3
 */
public class Ejercicio3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio3() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		Cookie[]cookies=request.getCookies();
		if(request.getParameter("nombre")!=null) {
			String cookieName;
			if(cookies==null) {
				cookieName="name0";
			}else {
				int a = cookies.length;
				cookieName="name"+a;
			}
			Cookie c= new Cookie(cookieName, request.getParameter("nombre"));
			response.addCookie(c);
		}
		
		if(cookies==null) {
			response.getWriter().append("Eres el primer visitante. Escribe un nombre por URL para continuar(?nombre=juan)");
		}else {
			response.getWriter().append("Hola ").append(request.getParameter("nombre")).append("\n");
			response.getWriter().append("Contigo hoy me han visitado: \n");
			for(Cookie cookie:cookies) {
				response.getWriter().append(cookie.getValue()).append("\n");
			}
		}
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
