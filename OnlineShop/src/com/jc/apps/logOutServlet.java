package com.jc.apps;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class logOutServlet
 */
@WebServlet("/logout.shop")
public class logOutServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = request.getSession(false);
		
		// Set to expire far in the past.
		  response.setHeader("Expires", "-1"); //no cache for -1

		  // Set standard HTTP/1.1 no-cache headers.
		  response.setHeader("Cache-Control", "no-store, no-cache, must-revalidate");

		  // Set IE extended HTTP/1.1 no-cache headers (use addHeader).
		  response.addHeader("Cache-Control", "post-check=0, pre-check=0");

		  // Set standard HTTP/1.0 no-cache header.
		  response.setHeader("Pragma", "no-cache");
		  
//		if(session == null){
//			response.sendRedirect("welcome");
//		}
//		else{
			session.removeAttribute("userid");
			session.invalidate(); //session id will be remove from its origin
			PrintWriter out = response.getWriter();
			out.println("You Logout Successfully");
			out.close();
//		}
		
		
		  
	}

}
