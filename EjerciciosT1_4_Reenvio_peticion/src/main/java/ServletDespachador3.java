

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

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
		doGet(request, response);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out=response.getWriter();
		response.setContentType("text/html");
		System.out.println(request.getParameter("text"));
		if(!request.getParameter("text").isBlank()||!request.getParameter("text").isEmpty()){
			RequestDispatcher dispatcher= request.getRequestDispatcher("ServletEjercicio3");
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Encabezado</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<hr color=\"blue\" size=\"5%\">\r\n"
					+ "		<table>\r\n"
					+ "			<tr>\r\n"
					+ "				<td>ENCABEZADO</td>\r\n"
					+ "			</tr>\r\n"
					+ "		</table>\r\n"
					+ "	<hr color=\"blue\" size=\"5%\">\r\n"
					+ "</body>\r\n"
					+ "</html>");
			
			dispatcher.include(request, response);
			
			out.println("<!DOCTYPE html>\r\n"
					+ "<html>\r\n"
					+ "<head>\r\n"
					+ "<meta charset=\"ISO-8859-1\">\r\n"
					+ "<title>Pie</title>\r\n"
					+ "</head>\r\n"
					+ "<body>\r\n"
					+ "	<hr color=\"blue\" size=\"5%\">\r\n"
					+ "		<table>\r\n"
					+ "			<tr>\r\n"
					+ "				<td>PIE</td>\r\n"
					+ "			</tr>\r\n"
					+ "		</table>\r\n"
					+ "	<hr color=\"blue\" size=\"5%\">\r\n"
					+ "</body>\r\n"
					+ "</html>");
		}else {
			System.out.println("B");
			RequestDispatcher dispatcher= request.getRequestDispatcher("ServletError3");
			String mensaje = "No has introducido ningún texto";
			request.setAttribute("mensajeAtributo", mensaje);

			dispatcher.forward(request, response);
		}
	}

}
