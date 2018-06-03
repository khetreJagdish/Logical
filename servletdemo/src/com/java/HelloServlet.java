package com.java;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

/**
 * Servlet implementation class HelloServlet
 */
public class HelloServlet  implements Servlet {

	/**
	 * @see Servlet#init(ServletConfig)
	 */
	public void init(ServletConfig config) throws ServletException {
		String initParam = config.getInitParameter("name");
		           
		System.out.println("Init Parameter : " + initParam );
		
	}

	/**
	 * @see Servlet#destroy()
	 */
	public void destroy() {
		// TODO Auto-generated method stub
	}

	/**
	 * @see Servlet#getServletConfig()
	 */
	public ServletConfig getServletConfig() {
	
		return null;
	}

	/**
	 * @see Servlet#getServletInfo()
	 */
	public String getServletInfo() {
	
		return null; 
	}

	/**
	 * @see Servlet#service(ServletRequest request, ServletResponse response)
	 */
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException {
		
				String name = request.getParameter("p1");
				int portno = request.getLocalPort();
				System.out.println("Port number : "+ portno);
				String serverName = request.getServerName();
				System.out.println("serverName : " + serverName);
				String localName = request.getLocalName();
				System.out.println("Locale Name : "+localName);
				response.setContentType("text/html");
				PrintWriter out = response.getWriter();
				out.println("Hello " + name);
		
	}

}
