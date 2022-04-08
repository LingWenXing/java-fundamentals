

import java.io.IOException;

import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet Filter implementation class CreateAccountFilter
 */
public class CreateAccountFilter implements Filter {

    /**
     * Default constructor. 
     */
    public CreateAccountFilter() {
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
		String name = request.getParameter("name");
		String un = request.getParameter("un");
		String pwd = request.getParameter("pwd");
		String cpwd = request.getParameter("cpwd");
		String email = request.getParameter("email");
		
		if(name.length()==0||un.length()==0||pwd.length()==0||cpwd.length()==0||email.length()==0) {
			((HttpServletResponse)response).sendRedirect("/SigninApplication/dataIncompleteError.html");
		}else if(!pwd.equals(cpwd)){
			((HttpServletResponse)response).sendRedirect("/SigninApplication/pwdCpwdNotMatchingError.html");
		}else {
			// pass the request along the filter chain
			chain.doFilter(request, response);
		}
	}

	/**
	 * @see Filter#init(FilterConfig)
	 */
	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
