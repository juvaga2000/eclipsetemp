package Ejercicio2;

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import jakarta.servlet.http.HttpServletRequest;

import java.io.IOException;
import java.util.HashMap;

/**
 * Servlet Filter implementation class Ejercicio2Filtro
 */

@WebFilter(urlPatterns = {"/Ejercicio2_A","/Ejercicio2_B","/Ejercicio2_C"})
public class Ejercicio2_Filtro extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public Ejercicio2_Filtro() {
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
		HashMap<String,Integer> visitas;
		if(request.getServletContext().getAttribute("accesos")==null) {
			visitas=new HashMap<>();
		}else {
			visitas=(HashMap<String, Integer>)request.getServletContext().getAttribute("accesos");
		}
		String url=((HttpServletRequest)request).getRequestURL().toString();
		System.out.println(url);
		if( !visitas.containsKey(url)){
			visitas.put(url, 1);
		}else {
			int temp=visitas.get(url);
			visitas.put(url, temp+1);
		}
		
		request.getServletContext().setAttribute("accesos", visitas);
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
