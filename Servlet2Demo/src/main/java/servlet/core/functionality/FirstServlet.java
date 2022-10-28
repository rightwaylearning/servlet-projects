package servlet.core.functionality;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.Servlet;
import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;

public class FirstServlet implements Servlet{

	@Override
	public void init(ServletConfig config) throws ServletException {
		System.out.println("I am INIT method of servlet");
		
	}
	

	@Override
	public void service(ServletRequest req, ServletResponse res) throws ServletException, IOException {
		PrintWriter w = res.getWriter();
		w.write("<h1>hello</h1>");
		
	}
	
	@Override
	public void destroy() {
		System.out.println("I am destroy methdo of Servlet..........");
		
	}




	
	@Override
	public String getServletInfo() {
		return null;
	}
	

	@Override
	public ServletConfig getServletConfig() {
		return null;
	}


}
