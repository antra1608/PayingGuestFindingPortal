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

@WebServlet("/Pg_updation")
public class Pg_updation extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public Pg_updation() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	String submit=request.getParameter("submit");
	model.Pg_details p = new model.Pg_details();
	HttpSession session = (HttpSession) request.getSession();
	String username = (String) session.getAttribute("username");
	String P_name = (String) session.getAttribute("P_name");

	int P_id = p.getid(P_name);

		if("Book Your PG".equalsIgnoreCase(submit) || "Schedule Your Visit".equalsIgnoreCase(submit))
	{
			model.Sharing_info sh= new model.Sharing_info();
ArrayList<String> sharing=sh.getsharing(P_id);
ArrayList<Integer> rent=sh.getsharingrent(P_id);

			
request.setAttribute("sharing", sharing);
request.setAttribute("rent", rent);

			request.setAttribute("submit", submit);
		request.getRequestDispatcher("Book_PG.jsp").include(request, response);
		
	}
		else if("Show Interest For Future Reference".equalsIgnoreCase(submit))
		{
			model.lodger l=new model.lodger();
			int L_id=l.getid(username);
			int i=l.book_interest(L_id,P_id);
		}
	else if("Save Changes".equalsIgnoreCase(submit)){
		
		pojo.Pg_details pg = new pojo.Pg_details();
		PrintWriter out = response.getWriter();

		pg.setAddress(request.getParameter("Address"));
		pg.setContact_person(request.getParameter("Contact_person"));
		pg.setEmail_id(request.getParameter("Email_id"));
		pg.setFood_available(request.getParameter("Food_available"));
		pg.setGender(request.getParameter("Gender"));
		pg.setLicence_no(Integer.parseInt(request.getParameter("Licence_no")));
		pg.setLocation(request.getParameter("Area"));
		pg.setOperating_since(Integer.parseInt(request.getParameter("Operating_since")));
		pg.setP_name(request.getParameter("Name"));
		pg.setPhone((request.getParameter("Phone")));
		pg.setWebsite(request.getParameter("Website_url"));
		pg.setLatitude(Float.valueOf(request.getParameter("Latitude")));
		pg.setLongitude(Float.valueOf(request.getParameter("Longitude")));

			System.out.println("the P_id is" + P_id);


		// Integer P_id=(Integer)request.getAttribute("P_id");
		// System.out.println("the P_ID id "+P_id);
		if (request.getParameter("room1") != null) {
			pojo.Sharing_info s1 = new pojo.Sharing_info();
			
			
			s1.setSharing(1);
			s1.setRent(Integer.parseInt(request.getParameter("a1")));
			s1.setDeposit(Integer.parseInt(request.getParameter("a2")));
			s1.setNo_of_sharing(Integer.parseInt(request.getParameter("a3")));
			model.Sharing_info SH1=new model.Sharing_info();
			int u1=SH1.update1sharing(s1,P_id,username);
			
			System.out.println(Integer.parseInt(request.getParameter("a1")));
			System.out.println(Integer.parseInt(request.getParameter("a2")));
			System.out.println(Integer.parseInt(request.getParameter("a3")));

		}
		if (request.getParameter("room2") != null) {
			pojo.Sharing_info s2 = new pojo.Sharing_info();
			s2.setSharing(2);
			s2.setRent(Integer.parseInt(request.getParameter("b1")));
			s2.setDeposit(Integer.parseInt(request.getParameter("b2")));
			s2.setNo_of_sharing(Integer.parseInt(request.getParameter("b3")));
			
			model.Sharing_info SH2=new model.Sharing_info();
			int u2=SH2.update2sharing(s2,P_id,username);
			
			System.out.println(Integer.parseInt(request.getParameter("b1")));
			System.out.println(Integer.parseInt(request.getParameter("b2")));
			System.out.println(Integer.parseInt(request.getParameter("b3")));

		}
		
		 if(request.getParameter("room3")!=null) { 
			 pojo.Sharing_info s3= new pojo.Sharing_info();
			 s3.setSharing(3);
		  
		  s3.setRent(Integer.parseInt(request.getParameter("g1")));
		  s3.setDeposit(Integer.parseInt(request.getParameter("g2")));
		  s3.setNo_of_sharing(Integer.parseInt(request.getParameter("g3")));
		  
		  model.Sharing_info SH3=new model.Sharing_info();
			int u3=SH3.update3sharing(s3,P_id,username);
			
		  System.out.println(Integer.parseInt(request.getParameter("g1")));
		  System.out.println(Integer.parseInt(request.getParameter("g2")));
		  System.out.println(Integer.parseInt(request.getParameter("g3")));
		  
		  }
		 
		if (request.getParameter("room4") != null) {
			pojo.Sharing_info s4 = new pojo.Sharing_info();
			s4.setSharing(4);
			s4.setRent(Integer.parseInt(request.getParameter("d1")));
			s4.setDeposit(Integer.parseInt(request.getParameter("d2")));
			s4.setNo_of_sharing(Integer.parseInt(request.getParameter("d3")));
			
			model.Sharing_info SH4=new model.Sharing_info();
			int u4=SH4.update4sharing(s4,P_id,username);
			
			System.out.println(Integer.parseInt(request.getParameter("d1")));
			System.out.println(Integer.parseInt(request.getParameter("d2")));
			System.out.println(Integer.parseInt(request.getParameter("d3")));

		}
		if (request.getParameter("room5") != null) {
			pojo.Sharing_info s5 = new pojo.Sharing_info();
			s5.setSharing(5);
			s5.setRent(Integer.parseInt(request.getParameter("e1")));
			s5.setDeposit(Integer.parseInt(request.getParameter("e2")));
			s5.setNo_of_sharing(Integer.parseInt(request.getParameter("e3")));
			
			model.Sharing_info SH5=new model.Sharing_info();
			int u5=SH5.update5sharing(s5,P_id,username);
			
			
			System.out.println(Integer.parseInt(request.getParameter("e1")));
			System.out.println(Integer.parseInt(request.getParameter("e2")));
			System.out.println(Integer.parseInt(request.getParameter("e3")));

		}

		if (request.getParameter("room6") != null) {
			pojo.Sharing_info s6 = new pojo.Sharing_info();
			s6.setSharing(6);
			s6.setRent(Integer.parseInt(request.getParameter("f1")));
			s6.setDeposit(Integer.parseInt(request.getParameter("f2")));
			s6.setNo_of_sharing(Integer.parseInt(request.getParameter("f3")));
	
			model.Sharing_info SH6=new model.Sharing_info();
			int u6=SH6.update6sharing(s6,P_id,username);
			
			System.out.println(Integer.parseInt(request.getParameter("f1")));
			System.out.println(Integer.parseInt(request.getParameter("f2")));
			System.out.println(Integer.parseInt(request.getParameter("f3")));

		}

		pojo.Pg_amenties amen = new pojo.Pg_amenties();
		if (request.getParameter("c5") != null)
			amen.setAirConditioner("yes");
		else
			amen.setAirConditioner("yes");
		if (request.getParameter("c6") != null)
			amen.setDrinkingWater("yes");
		else
			amen.setDrinkingWater("yes");

		if (request.getParameter("c16") != null)

			amen.setFurniture("yes");
		else
			amen.setFurniture("yes");

		if (request.getParameter("c15") != null)

			amen.setGesyer("yes");
		else
			amen.setGesyer("no");

		if (request.getParameter("c13") != null)

			amen.setHeater("yes");
		else
			amen.setHeater("no");

		if (request.getParameter("c7") != null)

			amen.setHotWater("yes");
		else
			amen.setHotWater("no");

		if (request.getParameter("c12") != null)

			amen.setKitchen("yes");
		else
			amen.setKitchen("no");

		if (request.getParameter("c4") != null)

			amen.setLaundry("yes");
		else
			amen.setLaundry("no");

		if (request.getParameter("c11") != null)

			amen.setMicrowave("yes");
		else
			amen.setMicrowave("no");

		if (request.getParameter("c10") != null)

			amen.setParking("yes");
		else
			amen.setParking("no");

		if (request.getParameter("c8") != null)

			amen.setRoomService("yes");
		else
			amen.setRoomService("no");

		if (request.getParameter("c9") != null)
			amen.setSecurity("yes");
		else
			amen.setSecurity("no");

		if (request.getParameter("c1") != null)
			amen.setTelevision("yes");
		else
			amen.setTelevision("no");

		if (request.getParameter("c3") != null)
			amen.setUPSBackedpower("yes");
		else
			amen.setUPSBackedpower("no");

		if (request.getParameter("c14") != null)
			amen.setWashingMachine("yes");
		else
			amen.setWashingMachine("no");

		if (request.getParameter("c2") != null)
			amen.setWifi("yes");
		else
			amen.setWifi("no");

		model.Pg_amenties Amen = new model.Pg_amenties();

				int j = Amen.update(amen, username, P_id);

		model.Pg_details PG = new model.Pg_details();
		int i = PG.update(pg, username, P_id);
		if (i == 1) {
			out.print("<script type=\"text/javascript\">alert('Data Updated');</script>");
			request.getRequestDispatcher("Mypgs").include(request, response);
		} else {
			out.print("<script type=\"text/javascript\">alert('Data Not Updated');</script>");
			request.getRequestDispatcher("Pg_dashboard_update").include(request, response);
			// request.getRequestDispatcher("Mypgs.jsp").include(request,
			// response);
		}}
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
