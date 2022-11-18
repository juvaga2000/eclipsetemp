package Ejercicio3;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

/**
 * Servlet implementation class Ejercicio3
 */
public class Ejercicio3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private final Object lock=new Object();
       
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
		HttpSession sesion;
		synchronized(lock) {
			sesion=request.getSession();
		}
		
		sesion.setAttribute("nombre", request.getAttribute("nombre"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		DateFormat formatter = new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
		
		out.println("<!DOCTYPE html>\r\n"
				+ "<html>\r\n"
				+ "<head>\r\n"
				+ "<meta charset=\"UTF-8\">\r\n"
				+ "<title>Insert title here</title>\r\n"
				+ "</head>\r\n"
				+ "<body>\r\n"
				+ "?nombre=Juan"+"<br>"
				+ "<br>"
				+ "Nombre: "+sesion.getAttribute("nombre")+"<br>"
				+ "ID: "+sesion.getId()+"<br>"
				+ "Creacion: "+formatter.format(new Date(sesion.getCreationTime()))+"<br>"
				+ "Ultimo acceso: "+formatter.format(new Date(sesion.getLastAccessedTime()))
				+ "</body>\r\n"
				+ "</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
