package com.user.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SaveUser
 */
@WebServlet("/SaveUser")
public class SaveUser extends HttpServlet {
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
	
		String username = req.getParameter("fname");
		String email = req.getParameter("email");
		System.out.println(username +", "+email);
		
		PrintWriter out = resp.getWriter();
		out.write("<html>");
		out.write("<body>");
		out.print("<h5>"+ username +"User saved!!!!</h5>");
		out.write("</body>");
		out.write("</html>");
		
		RequestDispatcher disp = req.getRequestDispatcher("/UserDetails");
		disp.include(req, resp);

	
	}
}
