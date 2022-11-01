package com.user.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class UserDetails
 */
@WebServlet("/UserDetails")
public class UserDetails extends HttpServlet {

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		PrintWriter out = resp.getWriter();

		out.write("<html>");
		out.write("<body>");
		out.write("<form action='SaveUser'>");
		out.write("Enter First name: <input type='text' name='fname'/><br>");
		out.write("Enter Email name: <input type='text' name='email'/><br>");
		out.write("<input type='submit'/>");
		out.write("</form>");
		out.write("</body>");
		out.write("</html>");

	}
}
