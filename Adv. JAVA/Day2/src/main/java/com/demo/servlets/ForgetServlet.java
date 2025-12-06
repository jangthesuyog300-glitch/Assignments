package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import com.demo.service.*;

public class ForgetServlet extends HttpServlet {
	public void doPost(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		res.setContentType("text/html");
		PrintWriter out=res.getWriter();
		String uname=req.getParameter("name");
		String email=req.getParameter("email");
		String pass = req.getParameter("upass");
		LoginService fservice=new LoginServiceImpl();
		boolean status=fservice.upass(uname,email,pass);

		if(status) {
			out.println("<h1>Added Successfully! </h1>");
			RequestDispatcher rd= req.getRequestDispatcher("login.html");
			rd.include(req, res);
		}else
		{
			out.println("<h1>Invalid Credentials! </h1>");
			RequestDispatcher rd= req.getRequestDispatcher("ForgetPass.html");
			rd.include(req, res);
		}
	}

}
