

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.sql.Date;

/**
 * Servlet implementation class Ejemplo7
 */
public class Ejemplo7 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejemplo7() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		int c;
		HttpSession sesion= request.getSession(true);
		if(sesion.isNew()) {
			response.getWriter().append("UwU"+"\n");
			c=0;
			response.sendRedirect(response.encodeURL("http://localhost:8080/Ejemplo7_Sesiones/Ejemplo7"));
		}else {
			response.getWriter().append("OwO"+"\n");
			c=(int)sesion.getAttribute("contador");
		}
		
		sesion.setAttribute("contador",c+1);
		response.getWriter().append(sesion.getAttribute("contador")+"\n");
		response.getWriter().append("Creada el:" + new Date(sesion.getCreationTime())+"\n");
		response.getWriter().append("Ultimo Acceso:" + new Date(sesion.getLastAccessedTime())+"\n");
		sesion.setMaxInactiveInterval(5);
		response.getWriter().append("Tiempo inactivo permitido:" + sesion.getMaxInactiveInterval()+"\n");
		response.getWriter().append("ID:" + sesion.getId()+"\n");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
