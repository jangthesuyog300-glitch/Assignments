package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.demo.beans.MyUser;
import com.demo.service.*;

public class LoginServlet extends HttpServlet {
	public void doPost(HttpServletRequest req, HttpServletResponse res) throws IOException, ServletException
	{
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String uname=req.getParameter("uname");
		String pass=req.getParameter("pass");
		LoginService lservice=new LoginServiceImpl();
		MyUser user=lservice.ValidateUser(uname,pass);
		 if(user!=null) {
			 out.println(user);
		 }
		 else {
			    out.print("<h1>Invalid credentials</h1>");
				RequestDispatcher rd=req.getRequestDispatcher("login.html");
				rd.include(req, res);
		 }
			
			
		
	}

}
