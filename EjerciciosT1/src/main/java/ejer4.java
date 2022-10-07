

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class ejer4
 */
public class ejer4 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ejer4() {
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
	    	Enumeration<String> parameterNames = request.getParameterNames();
	    	while(parameterNames.hasMoreElements()) {
				String paramName = parameterNames.nextElement();
				if(paramName!=null && !paramName.isEmpty())
				out.println("<td>"+paramName+"</td>");
			}
	    	out.println("</tr>");
	    	out.println("<tr>");
	    	Enumeration<String> parameterNames2 = request.getParameterNames();
	    	while(parameterNames2.hasMoreElements()) {
				String paramName = parameterNames2.nextElement();
				if(paramName!=null && !paramName.isEmpty())
				out.println("<td>"+request.getParameter(paramName)+"</td>");
			}
    	out.println("</tr>");
	    out.println("</table>");
	    out.println("</body>");
	    out.println("</html>");
	    out.close();
	}

}
