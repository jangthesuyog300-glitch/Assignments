package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.*;
import com.demo.beans.*;

public class RegisterServlet extends HttpServlet{
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		
		String uname=req.getParameter("name");
		String pass=req.getParameter("pass");
		String role=req.getParameter("role");
		String date=req.getParameter("date");
		String email=req.getParameter("email");
		LocalDate ldt=LocalDate.parse(date,DateTimeFormatter.ofPattern("dd/MM/yyyy"));
		RegisterService rservice=new RegisterServiceImpl();
		MyUser u=new MyUser(uname,pass,role,ldt,email);
		boolean status=rservice.add(u);
		if(status) {
			out.println("<h1>Added Successfully! </h1>");
			RequestDispatcher rd= req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}
		
	}

}
