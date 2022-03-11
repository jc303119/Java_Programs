package com.jc.apps;

import java.io.IOException;
import javax.servlet.Filter;
import javax.servlet.FilterChain;
import javax.servlet.FilterConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebFilter;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet Filter implementation class SessionCheckingFilter
 */
@WebFilter("/dashboard.shop") //writing dashboard.shop will run the filter on dashboard ??  //(*.shop) 
public class SessionCheckingFilter implements Filter {

	public void destroy() {
		// TODO Auto-generated method stub
	}

	public void doFilter(ServletRequest request, ServletResponse response, FilterChain chain) throws IOException, ServletException {
		//upcast to httpServletRequest because request object is of http protocol of httpservletRequest
		HttpSession session = ((HttpServletRequest) request).getSession(false); //downcast first to httpservletrequest from servlet
		if(session == null){
			((HttpServletResponse) response).sendRedirect("welcome"); //downcast to httpservletresponse
		}
		else{
			chain.doFilter(request, response);
		}
		
	}

	public void init(FilterConfig fConfig) throws ServletException {
		// TODO Auto-generated method stub
	}

}
