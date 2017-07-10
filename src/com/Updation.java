package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import util.DBhelper;

@WebServlet("/Updation")
public class Updation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");

		HttpSession session = request.getSession();
		String username = (String) session.getAttribute("username");
		System.out.print(username);

		String updation = request.getParameter("updation");
		model.Admin admin = new model.Admin();
		model.lodger lodger = new model.lodger();
		model.Pg_owner owner = new model.Pg_owner();

		String category = (String) request.getParameter("category");
		System.out.println("the updateion category is" + category + updation);
		if ("admin".equalsIgnoreCase(category)) {

			if ("Save Changes".equalsIgnoreCase(updation)) {
				String Name = request.getParameter("Name");
				String Username = request.getParameter("Username");
				String Email = request.getParameter("Email");

				String Mobile = request.getParameter("Mobile");

				pojo.admin a = new pojo.admin();
				a.setA_name(Name);
				a.setA_username(Username);
				a.setEmail(Email);

				a.setMobile(Mobile);

				int i = admin.update(a, username);
				if (i == 1)
					System.out.println("i am updated");

			} else if ("Reset Password".equalsIgnoreCase(updation)) {
				String Password = admin.getPassword(username);
				System.out.println(Password);
				String Current_password = request.getParameter("Current_password");
				String New_password = request.getParameter("New_password");
				String Confirm_password = request.getParameter("Confirm_password");

				if (Current_password.equals(Password)) {
					if (New_password.equals(Confirm_password)) {
						int i = admin.update(Current_password, New_password, username);
						out.print("<script type=\"text/javascript\">alert('Data Updated');</script>");
						request.getRequestDispatcher("Admin_panel.jsp").include(request, response);


					} else {
						out.print("<script type=\"text/javascript\">alert('Password Do Not Match');</script>");
						request.getRequestDispatcher("Accountdetails").include(request, response);

					}

				} else {
					out.print("<script type=\"text/javascript\">alert('Password is not right');</script>");
					request.getRequestDispatcher("Accountdetails").include(request, response);

				}
			}
		} else if ("owner".equalsIgnoreCase(category)) {
			request.setAttribute("update", "owner");

			if ("Save Changes".equalsIgnoreCase(updation)) {
				String Name = request.getParameter("Name");
				String Username = request.getParameter("Username");
				String Email = request.getParameter("Email");
				String Mobile = request.getParameter("Mobile");

				pojo.Pg_owner o = new pojo.Pg_owner();
				o.setO_name(Name);
				o.setO_username(Username);
				o.setEmail(Email);
				o.setMobile(Integer.parseInt(Mobile));

				int i = owner.update(o, username);

			} else if ("Reset Password".equalsIgnoreCase(updation)) {
				String Current_password = request.getParameter("Current_password");
				String New_password = request.getParameter("New_password");
				String Confirm_password = request.getParameter("Confirm_password");
				if (New_password.equals(Confirm_password)) {
				} else {
					out.print("<script type=\"text/javascript\">alert('Password Do Not Match');</script>");

				}
				int i = owner.update(Current_password, New_password, username);
			}
			out.print("<script type=\"text/javascript\">alert('Data Updated');</script>");
			request.getRequestDispatcher("Owner_Dashboard1.jsp").include(request, response);

		} else if ("lodger".equalsIgnoreCase(category)) {
			// HttpSession sesion= (HttpSession)request.getSession();
			// sesion.setAttribute("update", "lodger");
			request.setAttribute("category", "lodger");
			if ("Save Changes".equalsIgnoreCase(updation)) {
				String Name = request.getParameter("Name");
				String Username = request.getParameter("Username");
				String Email = request.getParameter("Email");
				String Mobile = request.getParameter("Mobile");

				pojo.Lodger l = new pojo.Lodger();
				l.setL_name(Name);
				l.setL_username(Username);
				l.setEmail(Email);
				l.setMobile(Integer.parseInt(Mobile));

				int i = lodger.update(l, username);
				System.out.println(i);

			} else if ("Reset Password".equalsIgnoreCase(updation)) {
				String Current_password = request.getParameter("Current_password");
				String New_password = request.getParameter("New_password");
				String Confirm_password = request.getParameter("Confirm_password");
				if (New_password.equals(Confirm_password)) {
				} else {
					out.print("<script type=\"text/javascript\">alert('Password Do Not Match');</script>");

				}
				int i = lodger.update(Current_password, New_password, username);
			}
			out.print("<script type=\"text/javascript\">alert('Data Updated');</script>");
			response.sendRedirect("Lodger_Dashboard1.jsp");

		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
