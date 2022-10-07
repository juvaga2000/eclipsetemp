

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Ejemplo6
 */
public class Ejemplo6bis extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private String paramContext;
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejemplo6bis() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    public void init(ServletConfig config) throws ServletException{
    	super.init(config);
    	paramContext =  config.getServletContext().getInitParameter("param");
    }
    
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/plain");
		response.getWriter().append("Parametro inicial de contexto: ")
						.append(getServletConfig().getServletContext().getInitParameter("param")+"\n");
		response.getWriter().append("Parametro inicial de contexto desde request: ")
						.append((String)request.getServletContext().getAttribute("atribbContext"));
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
