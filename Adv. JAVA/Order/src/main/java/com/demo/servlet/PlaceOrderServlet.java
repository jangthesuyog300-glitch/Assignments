package com.demo.servlet;
import com.demo.beans.*;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class PlaceOrderServlet
 */
@WebServlet("/placeorder")
public class PlaceOrderServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest req, HttpServletResponse res) throws ServletException, IOException {
	
		
		HttpSession session = req.getSession();
		MyUser user =(MyUser) session.getAttribute("user");
		PrintWriter out =res.getWriter();
		if(user!=null && user.getRole().equals("user"))
		{
			List<String> cart=(List<String>)session.getAttribute("cart");
			
			cart.stream().forEach(s->out.println(s));
			out.println("<h4>Your order is placed successfully</h4>");
			out.println("<a href='logout'>Logout</a>");
		}
		
	}

}
