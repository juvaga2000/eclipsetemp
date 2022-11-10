package Ejercicio1;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class Ejercicio1A
 */
public class Ejercicio1A extends HttpServlet {
	private static final long serialVersionUID = 1L;
    private final Object lock=new Object();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio1A() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		if(request.getParameter("num")!=null) {
			try {
				synchronized (lock) {
					int n=Integer.parseInt(request.getParameter("num"));
					getServletContext().setAttribute("numero", n);
					Thread.sleep(4000);
					wait();
				}
				RequestDispatcher dispatcher= request.getRequestDispatcher("Ejercicio1B");
				dispatcher.forward(request, response);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}else {
			response.getWriter().append("?num=5");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
