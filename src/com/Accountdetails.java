package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import model.Pg_owner;
import pojo.Lodger;
import pojo.admin;

@WebServlet("/Accountdetails")
public class Accountdetails extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Accountdetails() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
		HttpSession session = request.getSession();
		ArrayList<admin> ad = new ArrayList<admin>();
		ArrayList<pojo.Pg_owner> o = new ArrayList<pojo.Pg_owner>();
		ArrayList<pojo.Lodger> l = new ArrayList<pojo.Lodger>();

		String username = (String) session.getAttribute("username");
		
		if("owner".equalsIgnoreCase(request.getParameter("category")))
		{
		
			model.Pg_owner owner= new model.Pg_owner();
			o=owner.update(username);
			//System.out.println("updated");
			request.setAttribute("owner", o);
			request.setAttribute("category", "owner");
			request.getRequestDispatcher("Accountdetails.jsp").forward(request, response);
		
		}
		else if("admin".equalsIgnoreCase(request.getParameter("category")))
		{
		model.Admin admin=new model.Admin();
		ad=admin.update(username);
		
					request.setAttribute("admin", ad);
					request.setAttribute("category", "admin");
		//			System.out.println("updated");
					
					request.getRequestDispatcher("Accountdetails.jsp").forward(request, response);
		}
		else if("lodger".equalsIgnoreCase(request.getParameter("category")))
		{
			model.lodger lodger=new model.lodger();
			l=lodger.update(username);
			request.setAttribute("lodger", l);
			request.setAttribute("category", "lodger");
			System.out.println("updated");
			
			request.getRequestDispatcher("Accountdetails.jsp").forward(request, response);
			
					
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
