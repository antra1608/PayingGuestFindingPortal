package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Admin;
import model.Pg_owner;
import util.DBhelper;

@WebServlet("/login")
public class login extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");
		String category = request.getParameter("category");
		try {
			if ("admin".equalsIgnoreCase(category)) {
				Admin admin = new Admin();
				int i = admin.select(username, password);
				System.out.print(i);
				if (i == 1) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("Admin_panel.jsp");

				} else {
					response.sendRedirect("Admin.jsp");
				}
			} else if ("Owner".equalsIgnoreCase(category)) {
				Pg_owner owner = new Pg_owner();
				int i = owner.select(username, password);
				if (i == 1) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					response.sendRedirect("Owner_dashboard1.jsp");
				} else {
					response.sendRedirect("Login.jsp");
				}
			} else if ("Lodger".equalsIgnoreCase(category)) {
				model.lodger lodger = new model.lodger();
				int i = lodger.select(username, password);
				if (i == 1) {
					HttpSession session = request.getSession();
					session.setAttribute("username", username);
					int L_id=lodger.getid(username);
					String status=lodger.getstatus(L_id);
					model.Pg_details pg= new model.Pg_details();
					ArrayList<String> location=pg.getlocation();
					request.setAttribute("Location", location);
					if("Not Enrolled".equalsIgnoreCase(status)){
				request.getRequestDispatcher("Lodger_Dashboard3.jsp").include(request, response);
					}
					else if("Enrolled".equalsIgnoreCase(status))
					{
						request.getRequestDispatcher("Lodger_Dashboard2.jsp").include(request, response);
								
					}
						
				
				} else {
					response.sendRedirect("Login.jsp");
				}
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}