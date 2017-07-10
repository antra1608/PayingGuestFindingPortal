package com;

import java.io.*;
import java.util.Date;
import com.itextpdf.*;

import com.itextpdf.text.*;
import com.itextpdf.text.pdf.PdfWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/test")
public class TestServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = response.getWriter();
 request.setAttribute("latitude", request.getAttribute("latitude"));
 request.setAttribute("longitude", request.getAttribute("longitude"));
  pojo.Pg_details pg=(pojo.Pg_details)request.getAttribute("pg"); 
	HttpSession session = (HttpSession) request.getSession();
	String username = (String) session.getAttribute("username");
String path=(String)request.getAttribute("path");        
        try {
        	FileOutputStream file = new FileOutputStream(path);
        	
            Document d = new Document();
            PdfWriter.getInstance(d, file);
 
            d.open();
            d.add(new Paragraph("PG Name:"+pg.getP_name()));
            d.add(new Paragraph("Location:"+pg.getLocation()));
            d.add(new Paragraph("Address :"+pg.getAddress()));
            d.add(new Paragraph("Contact Person:"+pg.getContact_person()));
            d.add(new Paragraph("Contact Number:"+pg.getPhone()));
            d.add(new Paragraph("Owner Name"+username));
                     d.close();
            file.close();
           // out.println("Your PDF is generated!!!");
        request.getRequestDispatcher("Pg_image.jsp").include(request,response);
        
        } 
        catch (Exception e) {
        	e.printStackTrace();
        }
	}
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}