package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Mypgs")
public class Mypgs extends HttpServlet {
	private static final long serialVersionUID = 1L;
       

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.getWriter().append("Served at: ").append(request.getContextPath());
	HttpSession session=	(HttpSession)request.getSession();
	String username=(String)session.getAttribute("username");	
	model.Pg_owner owner=new model.Pg_owner();
	ArrayList<String> p_name=new ArrayList<String>();
	int O_id=0;
	O_id=owner.getid(username);
	p_name=owner.getpgs(O_id);
	request.setAttribute("P_name", p_name);
	request.getRequestDispatcher("Mypgs.jsp").include(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
