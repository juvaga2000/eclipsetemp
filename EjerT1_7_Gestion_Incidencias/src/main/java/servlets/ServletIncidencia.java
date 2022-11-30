package servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Random;

/**
 * Servlet implementation class ServletIncidencia
 */
public class ServletIncidencia extends HttpServlet{
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletIncidencia() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Incidencia> lista;
		ArrayList<Integer> ids=new ArrayList<>();

		Random r=new Random();
		String correcto;
		RequestDispatcher dispatcher=request.getRequestDispatcher("AltaIncidencia.jsp");
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		
		if(getServletContext().getAttribute("incidencias")==null) {
			lista=new ArrayList<>();
		}else {
			lista=(ArrayList<Incidencia>)getServletContext().getAttribute("incidencias");
		}
		
		int n=-1;
		
		for(Incidencia i: lista) {
			ids.add(i.getId());
		}
		
		do {
			n=r.nextInt(0,20);
		} while (ids.contains(n));
		
		if(!request.getParameter("tema").isBlank() && !request.getParameter("descripcion").isBlank()) {
			lista.add(new Incidencia(n, request.getParameter("tema"),request.getParameter("descripcion")));
			getServletContext().setAttribute("incidencias", lista);
			correcto="si";
			System.out.println(correcto);
			request.setAttribute("correcto", correcto);
			request.setAttribute("lastID", n);
			dispatcher.forward(request, response);
		}else {
			dispatcher.include(request, response);
			out.println("<p style=\"color:red\">(*) El tema y la descripción son obligatorios</p>");
		}
		
		
	}

}
