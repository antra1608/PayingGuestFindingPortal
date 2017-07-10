package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import pojo.Pg_amenties;
import pojo.Pg_details;

@WebServlet("/Pg_dashboard_update")
public class Pg_dashboard_update extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Pg_dashboard_update() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	//response.getWriter().append("Served at: ").append(request.getContextPath());
	System.out.println(request.getParameter("p_name"));
	model.Pg_details PG = new model.Pg_details();
	String p_name=(String)request.getParameter("p_name");
	System.out.println(p_name);
	
	HttpSession session=(HttpSession)request.getSession();
	session.setAttribute("P_name", p_name);
	
	pojo.Pg_details pg=new pojo.Pg_details();
	pg=PG.update(p_name);
	model.Pg_amenties am=new model.Pg_amenties();
	int P_id=PG.getid(p_name);
	
	System.out.println("id is"+P_id);
	request.setAttribute("P_id", P_id);
	
	// to get vacancy details for view details of resultant pg
	String Category=(String)request.getParameter("category");
	System.out.println("category is"+Category);
	if("view_details".equalsIgnoreCase(Category))
	{
	pojo.Sharing_info sh=new pojo.Sharing_info();
	model.Sharing_info SH = new model.Sharing_info();
	sh=SH.get_vacancy(P_id);
	request.setAttribute("vacancy", sh);
	}
	pojo.Pg_amenties amen=am.getamenties(P_id);
	ArrayList<pojo.Pg_amenties> a=new ArrayList<pojo.Pg_amenties>();
	System.out.println("this is amenieties"+amen.getDrinkingWater());
	System.out.println(amen.getHotWater());
	System.out.println(amen.getParking());
	
	a.add(amen);
	request.setAttribute("amenities", a);

	pojo.Sharing_info s1 = new pojo.Sharing_info();
	pojo.Sharing_info s2 = new pojo.Sharing_info();
	pojo.Sharing_info s3 = new pojo.Sharing_info();
	pojo.Sharing_info s4 = new pojo.Sharing_info();
	pojo.Sharing_info s5= new pojo.Sharing_info();
	pojo.Sharing_info s6 = new pojo.Sharing_info();
	
	model.Sharing_info SH=new model.Sharing_info();
	//g=SH.get2sharinginfo(P_id);
	
	ArrayList<pojo.Sharing_info> g=SH.get1sharinginfo(P_id);
	ArrayList<pojo.Sharing_info> b=SH.get2sharinginfo(P_id);
	ArrayList<pojo.Sharing_info> c=SH.get3sharinginfo(P_id);
	ArrayList<pojo.Sharing_info> d=SH.get4sharinginfo(P_id);
	ArrayList<pojo.Sharing_info> e=SH.get5sharinginfo(P_id);
	ArrayList<pojo.Sharing_info> f=SH.get6sharinginfo(P_id);

	System.out.println("-------------data of sharing-------------");
	System.out.println("1--size is"+g.size());
	System.out.println("2--size is"+b.size());

	System.out.println("3size is"+c.size());
	System.out.println("4size is"+d.size());
	System.out.println("5size is"+e.size());
	System.out.println("6size is"+f.size());

	request.setAttribute("1sharing", g);
	request.setAttribute("2sharing", b);
	request.setAttribute("3sharing", c);
	request.setAttribute("4sharing", d);
	request.setAttribute("5sharing", e);
	request.setAttribute("6sharing", f);
	
	
	
	
	
	
	/*	s=g.get(0);
		System.out.println(s.getDeposit());
		System.out.println(s.getNo_of_sharing());
		System.out.println(s.getRent());
		System.out.println(s.getSharing());

		s=g.get(0);
		System.out.println(s.getDeposit());
		System.out.println(s.getNo_of_sharing());
		System.out.println(s.getRent());
		System.out.println(s.getSharing());

		s=g.get(0);
		System.out.println(s.getDeposit());
		System.out.println(s.getNo_of_sharing());
		System.out.println(s.getRent());
		System.out.println(s.getSharing());

		s=g.get(0);
		System.out.println(s.getDeposit());
		System.out.println(s.getNo_of_sharing());
		System.out.println(s.getRent());
		System.out.println(s.getSharing());
	
		s=g.get(0);
		System.out.println(s.getDeposit());
		System.out.println(s.getNo_of_sharing());
		System.out.println(s.getRent());
		System.out.println(s.getSharing());
		
		s=g.get(0);
		System.out.println(s.getDeposit());
		System.out.println(s.getNo_of_sharing());
		System.out.println(s.getRent());
		System.out.println(s.getSharing());
	
	*/
	ArrayList<pojo.Pg_details> h=new ArrayList<pojo.Pg_details>();
	h.add(pg);
	request.setAttribute("pg", h);
	request.getRequestDispatcher("pg_dashboard_update1jsp.jsp").include(request, response);
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
