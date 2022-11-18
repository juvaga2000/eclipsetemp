

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.util.HashMap;

/**
 * Servlet Filter implementation class Ejercicio2Filtro
 */

@WebFilter( urlPatterns = "/Ejercicio2")
public class Ejercicio2Filtro extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Ejercicio2Filtro() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see Filter#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Filter#doFilter(ServletRequest, ServletResponse, FilterChain)
	 */
	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		System.out.println("AAAAAAAAAAAAA");
		HashMap<String,Integer> visitas;
		if(getServletContext().getAttribute("accesos")==null) {
			visitas=new HashMap<>();
		}else {
			visitas=(HashMap<String, Integer>)getServletContext().getAttribute("accesos");
		}
		
		if(!visitas.containsKey(request.getServerName())) {
			visitas.put(request.getServerName(), 1);
		}else {
			int temp=visitas.get(request.getServerName());
			visitas.put(request.getServerName(), temp+1);
		}
		
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
