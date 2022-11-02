

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletDespachador3
 */
public class ServletDespachador3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletDespachador3() {
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
		if(!request.getParameter("listaTabla").isBlank()||request.getParameter("listaTabla").isEmpty()){
			RequestDispatcher dispatcher= request.getRequestDispatcher("ServletTablas2");
			dispatcher.include(request, response);	//include cabecera
													//progaramar html
			dispatcher.include(request, response);	//include pie
		}else {
			RequestDispatcher dispatcher= request.getRequestDispatcher("ServletError3");
			String mensaje = "No has introducido ningun texto";
			request.setAttribute("mensajeAtributo", mensaje);

			dispatcher.forward(request, response);
		}
	}
	

}
