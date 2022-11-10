

import jakarta.servlet.Filter;
import jakarta.servlet.FilterChain;
import jakarta.servlet.FilterConfig;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebFilter;
import jakarta.servlet.http.HttpFilter;
import java.io.IOException;
import java.util.Enumeration;

/**
 * Servlet Filter implementation class EFilter1
 */
@WebFilter("/*")
public class EFilter1 extends HttpFilter implements Filter {
       
    /**
     * @see HttpFilter#HttpFilter()
     */
    public EFilter1() {
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
		System.out.println("llega");
		StringBuilder buffer = new StringBuilder();
		Enumeration<String> paramPeticion=request.getParameterNames();
		while(paramPeticion.hasMoreElements()) {
			String nameParam=paramPeticion.nextElement();
			String valoresParam[]=request.getParameterValues(nameParam);
			buffer.append(nameParam);
			buffer.append(" = ");
			for(int i=0;i<valoresParam.length;i++) {
				buffer.append(valoresParam[i]);
				buffer.append(" | ");
			}
		}
		System.out.println("La petición es recibida desde la IP: "+request.getRemoteAddr());
		if(!buffer.isEmpty()) {
			System.out.println("La petición tiene los siguientes parámetros: "+buffer);
		}
		chain.doFilter(request, response);
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
		System.out.println(fConfig.getFilterName());
	}

}
