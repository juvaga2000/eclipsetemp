

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ejer3
 */
public class ejer3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ejer3() {
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
		response.setContentType("text/html");
	    PrintWriter out = response.getWriter();

	    out.println("<html>");
	    out.println("<head>");
	    out.println("</head>");
	    out.println("<body>");
	    out.println("<h1>Muestra de datos</h1>");
	    out.println("<table border=\"1px\">");
	    	out.println("<tr>");
	    		out.println("<td>"+"Nombre"+"</td>");
	    		out.println("<td>"+"Apellidos"+"</td>");
	    		out.println("<td>"+"Direccion"+"</td>");
	    		out.println("<td>"+"Tarjeta"+"</td>");
	    		out.println("<td>"+"Numero de tarjeta"+"</td>");
	    	out.println("</tr>");
	    	out.println("<tr>");
    			out.println("<td>"+request.getParameter("nombre")+"</td>");
    			out.println("<td>"+request.getParameter("apellidos")+"</td>");
    			out.println("<td>"+request.getParameter("direccion")+"</td>");
    			out.println("<td>"+request.getParameter("tarjeta")+"</td>");
    			out.println("<td>"+request.getParameter("tarjetanum")+"</td>");
    	out.println("</tr>");
	    out.println("</table>");
	    out.println("</body>");
	    out.println("</html>");
	}

}
