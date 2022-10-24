

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

/**
 * Servlet implementation class Ejercicio4_Registrar
 */
public class Ejercicio4_Registrar extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Ejercicio4_Registrar() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		doPost(request,response);
		}
	
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		HttpSession sesion= request.getSession(true);
		int intentos;
		String user="admin";
		String pass="admin";
		
		String userIntroducido="";
		String passIntroducido="";
		
		if(request.getParameterNames()!=null) {
			Enumeration<String>valores=request.getParameterNames();
			String param;
			while(valores.hasMoreElements()) {
				param=valores.nextElement();
				if(param.equals("user")) {
					userIntroducido=request.getParameter(param);
				}else {
					passIntroducido=request.getParameter(param);
				}
			}
			System.out.println(userIntroducido);
			System.out.println(passIntroducido);
			
			if(userIntroducido.equals(user) && passIntroducido.equals(pass)) {
				sesion.setAttribute("user",user);
				sesion.setAttribute("pass",pass);
				response.sendRedirect("Ejercicio4_Bienvenido");
			}else {
				if(sesion.getAttribute("intentos")==null){
					sesion.setAttribute("intentos", "0");
					intentos=1;
				}else {
					intentos=Integer.parseInt((String) sesion.getAttribute("intentos"));
					intentos++;
					sesion.setAttribute("intentos", Integer.toString(intentos));
				}
			}
			
				if(sesion.getAttribute("intentos").equals("3")) {
					sesion.invalidate();
					out.print("<html>\r\n"
							+ "<head></head>\r\n"
							+ "<body>\r\n"
							+ "	<h1>Acceso Denegado</h1>\r\n"
							+ "	</body>\r\n"
							+ "	</html>");
				}else{
					out.print("<html>\r\n"
							+ "<head></head>\r\n"
							+ "<body>\r\n"
							+ "	<h1>Carniceria Panizo</h1>\r\n"
							+ "	<br>\r\n"
							+ "	<br>\r\n"
							+ "	<form method=\"post\" action=\"Ejercicio4_Registrar\">\r\n"
							+ "		Nombre<input name=\"user\" type=\"text\"><br>\r\n"
							+ "		Contraseña<input name=\"pass\" type=\"password\"><br>\r\n"
							+ "		<input type=\"submit\" value=\"Enviar Consulta\">\r\n"
							+ "	</form>\r\n"
							+ "Llevas estos intentos: "+sesion.getAttribute("intentos")
							+ "	</body>\r\n"
							+ "	</html>");
				}
			}
	}

}
