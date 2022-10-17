

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.Cookie;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Ejemplo8
 */
public class Ejemplo8 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejemplo8() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/plain");
		boolean bandera=false;
		int n=0;
		Cookie[]cs=request.getCookies();
		if(cs!=null) {
			for(int i=0;i<cs.length&&!bandera;i++) {
				if(cs[i].getName().equals("cont")) {
					n=Integer.parseInt(cs[i].getValue())+1;
					bandera=true;
				}
			}
		}
		Cookie c=new Cookie("cont",String.valueOf(n));
		c.setMaxAge(60*60*365);
		response.addCookie(c);
		response.getWriter().append("Numero de visitas: "+n);
		response.getWriter().close();
	}

}
