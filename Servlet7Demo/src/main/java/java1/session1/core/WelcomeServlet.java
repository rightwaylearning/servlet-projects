package java1.session1.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.websocket.Session;

/**
 * Servlet implementation class WelcomeServlet
 */

@WebServlet("/WelcomeServlet")
public class WelcomeServlet extends HttpServlet {

	Integer i = 0;

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		HttpSession session = req.getSession();
	
		if(session.isNew()) {
			i++;
			out.write("I am new in side session");
		}else {
			out.write("I am already in side session");
		}
		out.write(" count "+i);
	}
}
