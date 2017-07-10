package com;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Lodger_updation")
public class Lodger_updation extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    public Lodger_updation() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String category=request.getParameter("category");
		HttpSession session = (HttpSession) request.getSession();
		String username = (String) session.getAttribute("username");
		model.lodger l= new model.lodger();
		model.Sharing_info sh =new model.Sharing_info();
		
		int L_id=l.getid(username);
		int sharing=l.getsharing(L_id);
		int P_id=l.getp_id(L_id);
		System.out.println(P_id);
		
		if("discontinue".equalsIgnoreCase(category))
		{
			
			int j=sh.update_vacancy_on_delete(P_id, sharing);
			ArrayList<String> mail=(ArrayList<String>)sh.getmail_of_interested_lodger(P_id);
			int i=l.delete(L_id);
			
		}
	
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}

}
