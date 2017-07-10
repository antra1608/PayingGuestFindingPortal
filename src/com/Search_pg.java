package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.Pg_search;
import pojo.Pg_details;

@WebServlet("/Search_pg")
public class Search_pg extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String Location = request.getParameter("Location");
		String Gender = request.getParameter("Gender");
		String Max_budget = request.getParameter("Max_budget");
		String Min_budget = request.getParameter("Min_budget");
		String Food_available = request.getParameter("Food_available");

		Pg_search search = new Pg_search();
		ArrayList<String> pg = new ArrayList<String>();
		ArrayList<Pg_details> pg1 = new ArrayList<Pg_details>();
		
		if (!("No Constrains".equalsIgnoreCase(Location)) && !("No Constrains".equalsIgnoreCase(Max_budget))
					&& !("No Constrains".equalsIgnoreCase(Min_budget)) && !("No Constrains".equalsIgnoreCase(Food_available))) {
				System.out.println("*******************************query 0*******************************");
				pg = search.query0(Location,Integer.parseInt(Max_budget),Integer.parseInt(Min_budget),Food_available,Gender);
				request.setAttribute("PG", pg);
				request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

			}

		  else	if ("No Constrains".equalsIgnoreCase(Location) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 1*******************************");
			pg = search.query1(Integer.parseInt(Max_budget), Integer.parseInt(Min_budget), Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 2*******************************");
			pg = search.query2(Location, Integer.parseInt(Min_budget), Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& ("No Constrains".equalsIgnoreCase(Min_budget))
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 3*******************************");
			pg = search.query3(Location, Integer.parseInt(Max_budget), Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& ("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 4*******************************");
			pg = search.query4(Location, Integer.parseInt(Max_budget), Integer.parseInt(Min_budget), Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 5*******************************");
			pg = search.query5(Integer.parseInt(Min_budget), Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& ("No Constrains".equalsIgnoreCase(Min_budget))
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 6*******************************");
			pg = search.query6(Location, Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& ("No Constrains".equalsIgnoreCase(Min_budget))
				&& ("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 7*******************************");
			pg = search.query7(Location, Integer.parseInt(Max_budget), Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if ("No Constrains".equalsIgnoreCase(Location) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& "No Constrains".equalsIgnoreCase(Min_budget)
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 8*******************************");
			pg = search.query8(Integer.parseInt(Max_budget), Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if ("No Constrains".equalsIgnoreCase(Location) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& "No Constrains".equalsIgnoreCase(Food_available)) {
			System.out.println("*******************************query 9*******************************");
			pg = search.query9(Integer.parseInt(Max_budget), Integer.parseInt(Min_budget), Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& ("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 10*******************************");
			pg = search.query10(Location, Integer.parseInt(Min_budget), Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& "No Constrains".equalsIgnoreCase(Min_budget)
				&& !("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 11*******************************");
			pg = search.query11(Food_available, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (!("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& ("No Constrains".equalsIgnoreCase(Min_budget)) && "No Constrains".equalsIgnoreCase(Food_available)) {
			System.out.println("*******************************query 12*******************************");
			pg = search.query12(Location, Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (("No Constrains".equalsIgnoreCase(Location)) && !("No Constrains".equalsIgnoreCase(Max_budget))
				&& "No Constrains".equalsIgnoreCase(Min_budget) && ("No Constrains".equalsIgnoreCase(Food_available))) {
			System.out.println("*******************************query 13*******************************");
			pg = search.query13(Integer.parseInt(Max_budget), Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (("No Constrains".equalsIgnoreCase(Location)) && "No Constrains".equalsIgnoreCase(Max_budget)
				&& !("No Constrains".equalsIgnoreCase(Min_budget))
				&& "No Constrains".equalsIgnoreCase(Food_available)) {
			System.out.println("*******************************query 14*******************************");
			pg = search.query14(Integer.parseInt(Min_budget), Gender);
			request.setAttribute("PG", pg);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		} else if (("No Constrains".equalsIgnoreCase(Location)) && ("No Constrains".equalsIgnoreCase(Max_budget))
				&& "No Constrains".equalsIgnoreCase(Min_budget) && "No Constrains".equalsIgnoreCase(Food_available)) {
			System.out.println("*******************************query 15*******************************");
		
			ArrayList<String> pgs=new ArrayList<String>();

			pgs = search.query15(Gender);
			request.setAttribute("PG", pgs);
			request.getRequestDispatcher("Resultant_Pg.jsp").include(request, response);

		}
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}
}