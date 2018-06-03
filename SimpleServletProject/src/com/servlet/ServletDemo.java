package com.servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;



import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class ServletDemo implements Servlet
{
	 
	ServletConfig config; 
	
	@Override
	public void destroy()
	{
		
		System.out.println("Servlet Destroyed");
	}

	@Override
	public ServletConfig getServletConfig()
	{
		
		return config;
	}

	@Override
	public String getServletInfo()
	{
		
		return "copyright 2011-2017";
	}

	@Override
	public void init(ServletConfig config) throws ServletException
	{
		this.config = config;
		System.out.println(config + " Servlet is Initialized");
		
	}

	@Override
	public void service(ServletRequest request, ServletResponse response) throws ServletException, IOException
	{
			response.setContentType("text/html");
			
			PrintWriter out = response.getWriter();
			out.print("<html><body>");
			out.print("<b>Hello Simple Servlet<b>");
			out.print("</body></html>");
	}

}
