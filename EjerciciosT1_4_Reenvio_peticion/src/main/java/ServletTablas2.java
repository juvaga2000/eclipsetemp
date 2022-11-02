

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Servlet implementation class ServletTablas2
 */
public class ServletTablas2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletTablas2() {
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
		int lista=Integer.valueOf(request.getParameter("listaTabla"));
		System.out.println(request.getParameter("color"));
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		out.println("<html>\r\n"
				+ "    <head>\r\n"
				+ "        <title>Servlet Tablas</title>\r\n"
				+ "    </head>\r\n"
				+ "    <body>\r\n"
				+ "     <h1>Tabla de multiplicar del "+lista+"</h1>"
				+ "<br>"
				+ "<table style='background-color:"+request.getParameter("color")+";'>");
		for(int i=0;i<=10;i++) {
			out.println("<tr>"
							+"<td>"+lista+"X"+i+"</td>"
							+ "<td>"+lista*i+"</td>"
						+"</tr>"
					);
		}
		out.println("</table>"
				+ "<a href='index2.html'>Volver</a>"
				+ "    </body>\r\n"
				+ "</html>");
	}

}
