

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.HashMap;

/**
 * Servlet implementation class Ejercicio1
 */
public class Ejercicio1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		String id="";
		String descripcion="";
		HashMap<String,String> tareas;
		if(request.getParameter("id")==null || request.getParameter("descripcion")==null) {
			out.append("?id=T1&descripcion=Lorem");
		}else {
			id=request.getParameter("id");
			descripcion=request.getParameter("descripcion");
		}
		
		if(getServletContext().getAttribute("notificaciones")==null) {
			tareas= new HashMap<>();
		}else {
			tareas=(HashMap)getServletContext().getAttribute("notificaciones");
		}
		
		tareas.put(id, descripcion);
		getServletContext().setAttribute("notificaciones", tareas);
		
		for (HashMap.Entry<String, String> entry : tareas.entrySet()) {
		    String key = entry.getKey();
		    String value = entry.getValue();
		    out.println(key+" *************************** "+value);
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
