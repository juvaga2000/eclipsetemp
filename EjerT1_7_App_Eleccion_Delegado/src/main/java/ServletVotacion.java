

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

/**
 * Servlet implementation class ServletVotacion
 */
public class ServletVotacion extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletVotacion() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		ArrayList<Votacion> votos=new ArrayList<>();
		if(getServletContext().getAttribute("votosContext")==null) {
			Votacion votacion=new Votacion("Juan");
			Votacion votacion2=new Votacion("Ruben");
			Votacion votacion3=new Votacion("Blanco");
			
			votos.add(votacion);
			votos.add(votacion2);
			votos.add(votacion3);
		}else {
			votos=(ArrayList<Votacion>)getServletContext().getAttribute("votosContext");
		}
		
		String[] seleccion=request.getParameterValues("delegado");
		
		if(seleccion==null) {
			for(Votacion v:votos) {
				if(v.getNombre()=="Blanco") {
					v.setVotos(v.getVotos()+1);
				}
			}
		}else {
			for(String s:seleccion) {
				for(Votacion v:votos) {
					if(s.equals(v.getNombre())) {
						v.setVotos(v.getVotos()+1);
					}
				}
			}
		}
		getServletContext().setAttribute("votosContext", votos);
		RequestDispatcher dispatcher= request.getRequestDispatcher("Resultados.jsp");
		dispatcher.forward(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
