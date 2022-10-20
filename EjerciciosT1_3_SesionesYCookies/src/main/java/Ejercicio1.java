import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;

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

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
    	response.setContentType("text/html");
		int carrito=0;
		HttpSession sesion= request.getSession(true);

		if(sesion.getAttribute("total")!=null) {
			carrito= (int)sesion.getAttribute("total");
		}
		
		if(request.getParameter("producto")!=null) {
			switch(request.getParameter("producto")) {
				case "A":
					carrito+=3;
					break;
				case "B":
					carrito+=4;
					break;
				case "C":
					carrito+=5;
					break;
				case "D":
					carrito+=1;
					break;
				
			}
			sesion.setAttribute("total", carrito);
		}
		
		
		PrintWriter out = response.getWriter();
		out.println("<html>");
			out.println("<head>");
			out.println("</head>");
			out.println("<body>");
			out.println("<h2>Tienda ASDF</h2>");
			if(request.getParameter("ticket")!=null) {
				out.println(sesion.getAttribute("total"));
			}
			out.println("<form method=\"get\" action=\"http://localhost:8080/EjerciciosT1_3_SesionesYCookies/Ejercicio1\">");
				out.println("<input type=\"submit\" name =\"producto\" value=\"A\">");
				out.println("<input type=\"submit\" name =\"producto\" value=\"B\">");
				out.println("<input type=\"submit\" name =\"producto\" value=\"C\">");
				out.println("<input type=\"submit\" name =\"producto\" value=\"D\">");
				out.println("<br>");
				out.println("<input type=\"submit\" name =\"ticket\" value=\"ticket\">");
			out.println("</form>");
			out.println("</body>");
		out.println("</html>");
		//response.getWriter().append(carrito);
	}
	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
