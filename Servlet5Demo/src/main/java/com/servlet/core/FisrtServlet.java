package com.servlet.core;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


@WebServlet("/FisrtServlet")
public class FisrtServlet extends HttpServlet {
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		
		PrintWriter out = resp.getWriter();
		out.write("Hello Good morning. I am first servlet");
		out.write("<br>");
		
	      RequestDispatcher disp = req.getRequestDispatcher("/SecondServlet");
		//disp.forward(req, resp);
	      disp.include(req, resp);
	}
	
}
