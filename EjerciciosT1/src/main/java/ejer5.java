

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet implementation class ejer5
 */
public class ejer5 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ejer5() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		Enumeration<String> datos=request.getParameterNames();
		String parametro="";
		while(datos.hasMoreElements()) {
			parametro=datos.nextElement();
			if(parametro.equals("asignatura")) {
				String[]lista=request.getParameterValues(parametro);
				response.getWriter().append(parametro+": ");
				for(int i=0;i<lista.length;i++) {
					response.getWriter().append(lista[i]+", ");
				}
				response.getWriter().append("\n");
			}else if(!parametro.equals("Enviar"))
				response.getWriter().append(parametro).append(":").append(request.getParameter(parametro));
		}
		/*
		response.getWriter().append(request.getParameter("asignatura"));
		response.getWriter().append(" -- ");
		response.getWriter().append(request.getParameter("sexo"));
		for(int i = 0;i<request.getParameterValues("extraescolares").length;i++) {
			response.getWriter().append(" -- ");
			response.getWriter().append(request.getParameterValues("extraescolares")[i]);
		}
		*/
	}

}
