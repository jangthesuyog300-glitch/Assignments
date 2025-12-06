package com.demo.servlets;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Cookie;

/**
 * Servlet implementation class MyCookieServlet
 */
@WebServlet("/cookie")
public class MyCookieServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out=response.getWriter();
		String name=request.getParameter("name");
		String btn=request.getParameter("btn");
		switch(btn) {
		case "add" ->{
			String val=request.getParameter("val");
			Cookie c=new Cookie(name,val);
			response.addCookie(c);
			out.println("<h1>Cookie Added</h1>");
		}
		
		case "delete" ->{
			Cookie[] carr=request.getCookies();
			for(Cookie c:carr) {
				if(c.getName().equals(name)) {
					c.setMaxAge(0);
					response.addCookie(c);
					out.println("<h3>Cookie Deleted</h3>");
					break;
				}
			}
		}
		
		case "display" ->{
			Cookie[] carr=request.getCookies();
			for(Cookie c:carr) {
				out.println("name: "+c.getName()+"--->"+"value: "+c.getValue());
			}
		}
		}
		RequestDispatcher rd=request.getRequestDispatcher("cookiedemo.html");
		rd.include(request, response);
	}

}
