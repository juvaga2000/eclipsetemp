

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletError3
 */
public class ServletError3 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletError3() {
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
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>Servlet ERROR</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "     <h1>Mensaje del servidor</h1>"
				+ "<br>"
				+ "<p style='color:red'>"+request.getAttribute("mensajeAtributo")+"</p>"
				+ "<br>"
				+ "<a href='index2.html'>Volver</a>"
				+ "    </body>\r\n"
				+ "</html>");
	}

}
