

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Servlet implementation class ServletEjem10
 */
public class ServletEjem10 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private static int val=0;
       private final Object lock=new Object();
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletEjem10() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		try {
			
			synchronized (lock) {
				val=Integer.parseInt(request.getParameter("param"));
				System.out.println("Thread: "+Thread.currentThread().getName()+" usa el valor: "+val);
				Thread.sleep(5000);
			}
		}
		 catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		System.out.println("El hilo "+Thread.currentThread().getName()+" usa el valor: "+val);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
