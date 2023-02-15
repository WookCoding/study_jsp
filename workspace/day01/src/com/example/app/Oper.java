package com.example.app;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class Oper extends HttpServlet{
	private static final long serialVersionUID = 1L;
	
	public Oper() {;}
	
	
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		resp.setContentType("text/html; charset=UTF-8");
		PrintWriter out = resp.getWriter();
		Calc calc = new Calc();
		String[] number = req.getParameter("number").split(" ");
		
		out.print("<h1>"+ req.getParameter("number") + "</h1>");
		out.print("<hr>");
		out.print("<p>값 : "+ calc.calc(number[0], number[2], number[1]) +"</p>");
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
