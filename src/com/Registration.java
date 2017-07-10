package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pg_owner;
import model.lodger;
import util.DBhelper;

@WebServlet("/Registration")
public class Registration extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		pojo.Pg_owner o=new pojo.Pg_owner();
		o.setO_name( request.getParameter("name")) ;
		o.setO_username( request.getParameter("username"));
		o.setPassword(request.getParameter("password"));
		o.setMobile(Integer.parseInt(request.getParameter("mobile")));
		o.setEmail(request.getParameter("email"));
		String category = request.getParameter("category");
		pojo.Lodger l=new pojo.Lodger();
		l.setL_name( request.getParameter("name"));
		l.setL_username( request.getParameter("username"));
		l.setPassword( request.getParameter("password"));
		l.setMobile( Integer.parseInt(request.getParameter("mobile")));
		l.setEmail(request.getParameter("Email"));
		try {
			DBhelper db=new DBhelper();
			Connection con=db.getConnection();

						PreparedStatement pt;
						ResultSet rs;
						if ("Owner".equalsIgnoreCase(category)) {
							Pg_owner owner=new Pg_owner();
							owner.insert(o);
							HttpSession session = request.getSession();
							session.setAttribute("username", request.getParameter("username"));
							response.sendRedirect("Owner_dashboard1.jsp");
						
						} else if ("Lodger".equalsIgnoreCase(category)) {
					
						lodger lodger=new lodger();
						lodger.insert(l);
							HttpSession session = request.getSession();
							session.setAttribute("username", request.getParameter("username"));
							response.sendRedirect("Lodger_Dashboard1.jsp");
						}
					} catch (Exception e) {
						e.printStackTrace();
					}

	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
