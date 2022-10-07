package ejercicio2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

/**
 * Servlet implementation class ejer2
 */
public class ejer2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
    static ArrayList <Persona> personas;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ejer2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Persona p = new Persona(request.getParameter("nombre"), request.getParameter("apellidos"), Integer.valueOf(request.getParameter("edad")), request.getParameter("contacto"));
		//Persona[] personas = {p};
		ejer2.personas.add(p);
		response.getWriter().append(personas[0].getNombre()+" --- "+personas[0].getApellidos()+" --- "+personas[0].getEdad());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
