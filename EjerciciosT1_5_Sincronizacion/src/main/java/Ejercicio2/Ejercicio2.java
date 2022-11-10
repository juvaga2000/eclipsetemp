package Ejercicio2;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.util.Random;

/**
 * Servlet implementation class Ejercicio2
 */
public class Ejercicio2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
	int valor=0;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio2() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int[] aleatorios=new int[100000];
		
		try {
			Thread.sleep(30000);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Random r = new Random();
		for(int i=0;i<100000;i++) {
			int n=r.nextInt(1,10000);
			aleatorios[i]=n;
			valor=valor+n;
		}
		
		for(int i=0;i<100000;i++) {
			int n=aleatorios[i];
			valor=valor-n;
		}
		
		response.getWriter().append("El valor es: "+valor);
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
