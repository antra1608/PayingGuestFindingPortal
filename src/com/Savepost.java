package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Savepost")
public class Savepost extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		HttpSession session = (HttpSession) request.getSession();
		String username = (String) session.getAttribute("username");
		pojo.Pg_owner o = new pojo.Pg_owner();
		model.Pg_owner ow = new model.Pg_owner();
		PrintWriter out = response.getWriter();

		String category = request.getParameter("category");
System.out.println(category);
		if ("createpost".equalsIgnoreCase(category)) {
			o.setPost(request.getParameter("post"));
			int i = 0;
			i = ow.createpost(o, username);

			out.print("<script type=\"text/javascript\">" + "if(confirm('more posts?')){"
					+ "document.location = 'Create_Post.jsp'" + "}else" + "{"
					+ "document.location = 'Bulletin_board.jsp'}"

			+ "</script>");

		} else if ("mypost".equalsIgnoreCase(category)) {
			ArrayList<String> a = new ArrayList<String>();
			 a=ow.getpost(username);
			 request.setAttribute("post",a);
			 request.getRequestDispatcher("Myposts.jsp").include(request, response);
		}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}