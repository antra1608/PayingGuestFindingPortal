package com;
import java.io.*;
import java.io.DataInputStream;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import java.util.ArrayList;
import java.util.Date;


import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;

import org.w3c.dom.Document;

//import com.itextpdf.text.pdf.PdfWriter;
//import com.itextpdf.text.Document;
import com.itextpdf.*;

//import com.itextpdf.text.Document;
import com.itextpdf.text.DocumentException;
import com.itextpdf.text.Paragraph;
import com.itextpdf.text.pdf.PdfWriter;
 

import pojo.Sharing_info;

@WebServlet("/PgRegistration")
public class PgRegistration extends HttpServlet {
	private static final long serialVersionUID = 1L;

	public PgRegistration() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
	
		// for uploading image
	/*	String saveFile = "";
		String contentType = request.getContentType();
		if ((contentType != null) && (contentType.indexOf("multipart/form-data") >= 0)) {
			DataInputStream in = new DataInputStream(request.getInputStream());
			int formDataLength = request.getContentLength();
			byte dataBytes[] = new byte[formDataLength];
			int byteRead = 0;
			int totalBytesRead = 0;
			while (totalBytesRead < formDataLength) {
				byteRead = in.read(dataBytes, totalBytesRead, formDataLength);
				totalBytesRead += byteRead;
			}
			String file = new String(dataBytes);
			saveFile = file.substring(file.indexOf("filename=\"") + 10);
			saveFile = saveFile.substring(0, saveFile.indexOf("\n"));
			saveFile = saveFile.substring(saveFile.lastIndexOf("\\") + 1,saveFile.indexOf("\""));
			int lastIndex = contentType.lastIndexOf("=");
			String boundary = contentType.substring(lastIndex + 1,contentType.length());
			int pos;
			pos = file.indexOf("filename=\"");
			pos = file.indexOf("\n", pos) + 1;
			pos = file.indexOf("\n", pos) + 1;
			pos = file.indexOf("\n", pos) + 1;
			int boundaryLocation = file.indexOf(boundary, pos) - 4;
			int startPos = ((file.substring(0, pos)).getBytes()).length;
			int endPos = ((file.substring(0, boundaryLocation)).getBytes()).length;
			File ff = new File(saveFile);
			FileOutputStream fileOut = new FileOutputStream(ff);
			fileOut.write(dataBytes, startPos, (endPos - startPos));
			fileOut.flush();
			fileOut.close();

		*/
		HttpSession session = (HttpSession) request.getSession();
		String username = (String) session.getAttribute("username");
		pojo.Pg_details pg = new pojo.Pg_details();
		pg.setAddress(request.getParameter("Address"));
		pg.setContact_person(request.getParameter("Contact_person"));
		pg.setEmail_id(request.getParameter("Email_id"));
		pg.setFood_available(request.getParameter("Food_available"));
		pg.setGender(request.getParameter("Gender"));
		pg.setLocation(request.getParameter("Area"));
		if(request.getParameter("Operating_since")!=null)
		pg.setOperating_since(Integer.parseInt(request.getParameter("Operating_since")));
		pg.setP_name(request.getParameter("Name"));
		if(request.getParameter("Phone")!=null)
		pg.setPhone((request.getParameter("Phone")));
		pg.setWebsite(request.getParameter("Website"));
		if(request.getParameter("Licence_no")!=null)
		pg.setLicence_no(Integer.parseInt(request.getParameter("Licence_no")));
	
		
		String postcode=request.getParameter("Address")+","+request.getParameter("Area");
		String latLongs[]=null;
		try {
			latLongs = getLatLongPositions(postcode);
			System.out.println("Latitude: " + latLongs[0] + " and Longitude: " + latLongs[1]);
			
			request.setAttribute("pg", pg);
			request.setAttribute("latitude", latLongs[0]);
			request.setAttribute("longitude", latLongs[1]);
			
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		model.Pg_details PG = new model.Pg_details();
		int i=PG.getnumber();
    	int j=i;
    	 i=i+1;
    	 System.out.println("number is"+i);
    	 String path="E:/Test"+i+".pdf";
    	int flag=PG.setnumber(i,j);
    	 request.setAttribute("path", path);
         
	int k = PG.insert(pg, username,latLongs[0] , latLongs[1],path);

		String pname = request.getParameter("Name");
int P_id = 0;
P_id=PG.getid(pname);


session.setAttribute("P_id", P_id);
		model.Pg_owner o = new model.Pg_owner();
	int O_id =0;
	O_id=o.getid(username);
	System.out.println(request.getParameter("Food_available"));
	
	System.out.println(request.getParameter("Website"));
	System.out.println(request.getParameter("Address"));
	System.out.println(request.getParameter("Gender"));
	System.out.println(request.getParameter("Email_id"));
	System.out.println(request.getParameter("Operating_since"));

		
			
		
		model.Sharing_info room = new model.Sharing_info();
		pojo.Sharing_info vac=new pojo.Sharing_info();
		int vacancy;
		
		if ("true".equalsIgnoreCase(request.getParameter("a4"))) {
			pojo.Sharing_info a = new pojo.Sharing_info();
			if (request.getParameter("a1") != null)
				a.setRent(Integer.parseInt(request.getParameter("a1")));
			if (request.getParameter("a3") != null)
			{
				vacancy=1*Integer.parseInt(request.getParameter("a3"));
				vac.setSharing1_vac(vacancy);
				a.setNo_of_sharing(Integer.parseInt(request.getParameter("a3")));
			}
				if (request.getParameter("a2") != null)

				a.setDeposit(Integer.parseInt(request.getParameter("a2")));
			a.setSharing(1);
			room.insert(a,O_id ,P_id);
		}
		if ("true".equalsIgnoreCase(request.getParameter("b4"))) {
			pojo.Sharing_info a = new pojo.Sharing_info();
			if (request.getParameter("b1") != null)

				a.setRent(Integer.parseInt(request.getParameter("b1")));
			if (request.getParameter("b3") != null)
			{
				vacancy=2*Integer.parseInt(request.getParameter("b3"));
				vac.setSharing2_vac(vacancy);
				a.setNo_of_sharing(Integer.parseInt(request.getParameter("b3")));
			
			}
			if (request.getParameter("b2") != null)

				a.setDeposit(Integer.parseInt(request.getParameter("b2")));
			a.setSharing(2);
			room.insert(a, O_id, P_id);
		}
		if ("true".equalsIgnoreCase(request.getParameter("c4"))) {
			pojo.Sharing_info a = new pojo.Sharing_info();
			if (request.getParameter("c1") != null)
				a.setRent(Integer.parseInt(request.getParameter("c1")));
			if (request.getParameter("c3") != null)
			{
				vacancy=3*Integer.parseInt(request.getParameter("c3"));
				vac.setSharing3_vac(vacancy);
			
				a.setNo_of_sharing(Integer.parseInt(request.getParameter("c3")));
			}
				if (request.getParameter("c2") != null)

				a.setDeposit(Integer.parseInt(request.getParameter("c2")));
			a.setSharing(3);
			room.insert(a, O_id, P_id);
		}
		if ("true".equalsIgnoreCase(request.getParameter("d4"))) {
			pojo.Sharing_info a = new pojo.Sharing_info();
			if (request.getParameter("d1") != null)

				a.setRent(Integer.parseInt(request.getParameter("d1")));
			if (request.getParameter("d3") != null)
			{
				vacancy=4*Integer.parseInt(request.getParameter("d3"));
				vac.setSharing4_vac(vacancy);
			
				a.setNo_of_sharing(Integer.parseInt(request.getParameter("d3")));
			}
				if (request.getParameter("d2") != null)

				a.setDeposit(Integer.parseInt(request.getParameter("d2")));
			a.setSharing(4);
			room.insert(a, O_id, P_id);
		}
		if ("true".equalsIgnoreCase(request.getParameter("e4"))) {
			pojo.Sharing_info a = new pojo.Sharing_info();
			if (request.getParameter("e1") != null)

				a.setRent(Integer.parseInt(request.getParameter("e1")));
			if (request.getParameter("e3") != null)
			{
				vacancy=5*Integer.parseInt(request.getParameter("e3"));
				vac.setSharing5_vac(vacancy);
			
				a.setNo_of_sharing(Integer.parseInt(request.getParameter("e3")));
			}
			if (request.getParameter("e2") != null)

				a.setDeposit(Integer.parseInt(request.getParameter("e2")));
			a.setSharing(5);
			room.insert(a, O_id, P_id);
		}
		if ("true".equalsIgnoreCase(request.getParameter("f4"))) {
			pojo.Sharing_info a = new pojo.Sharing_info();
			if (request.getParameter("f1") != null)

				a.setRent(Integer.parseInt(request.getParameter("f1")));
			if (request.getParameter("f3") != null)
			{
				vacancy=6*Integer.parseInt(request.getParameter("f3"));
				vac.setSharing6_vac(vacancy);
			
				a.setNo_of_sharing(Integer.parseInt(request.getParameter("f3")));
			}
				if (request.getParameter("f2") != null)

				a.setDeposit(Integer.parseInt(request.getParameter("f2")));
			a.setSharing(6);
			room.insert(a, O_id, P_id);
				}
		int q=room.set_vacancy(vac,O_id,P_id);
		
		pojo.Pg_amenties amen = new pojo.Pg_amenties();
		if (request.getParameter("c1") != null)
			amen.setTelevision("yes");
		else
			amen.setTelevision("no");

		if (request.getParameter("c2") != null)
			amen.setWifi("yes");
		else
			amen.setWifi("no");

		if (request.getParameter("c3") != null)
			amen.setUPSBackedpower("yes");
		else
			amen.setUPSBackedpower("no");

		if (request.getParameter("c4") != null)

			amen.setLaundry("yes");
		else
			amen.setLaundry("no");

		if (request.getParameter("c5") != null)

			amen.setAirConditioner("yes");
		else
			amen.setAirConditioner("no");

		if (request.getParameter("c6") != null)

			amen.setDrinkingWater("yes");
		else
			amen.setDrinkingWater("no");

		if (request.getParameter("c7") != null)

			amen.setHotWater("yes");
		else
			amen.setHotWater("no");
		if (request.getParameter("c8") != null)

			amen.setRoomService("yes");
		else
			amen.setRoomService("no");

		if (request.getParameter("c9") != null)

			amen.setSecurity("yes");
		else
			amen.setSecurity("no");

		if (request.getParameter("c10") != null)

			amen.setParking("yes");
		else
			amen.setParking("no");

		if (request.getParameter("c11") != null)
			amen.setMicrowave("yes");
		else
			amen.setMicrowave("no");

		if (request.getParameter("c12") != null)

			amen.setKitchen("yes");
		else
			amen.setKitchen("no");
		if (request.getParameter("c13") != null)
			amen.setHeater("yes");

		else

			amen.setHeater("no");

		if (request.getParameter("c14") != null)
			amen.setWashingMachine("yes");
		else
			amen.setWashingMachine("no");
		if (request.getParameter("c15") != null)

			amen.setGesyer("yes");
		else
			amen.setGesyer("no");
		if (request.getParameter("c16") != null)
			amen.setFurniture("yes");
		else
			amen.setFurniture("no");

		model.Pg_amenties a = new model.Pg_amenties();
		int p = 0;
		p = a.insert(amen, O_id,P_id);
		System.out.println(p);
		
		//To generate pdf of PG details
		
	  /*     PrintWriter out = response.getWriter();
	        try {
	            FileOutputStream file = new FileOutputStream("E:/Test1.pdf");
	 
	            Document d = new Document();
	            PdfWriter.getInstance(d, file);
	 
	            d.open();
	            d.add(new Paragraph(request.getParameter("data")));
	            d.add(new Paragraph(new Date().toString()));
	 
	            d.close();
	            file.close();
	            out.println("Your PDF is generated!!!");
	        } 
	        catch (Exception e) {
	        	e.printStackTrace();
	        }
*/
		
		
	request.getRequestDispatcher("test").include(request, response);
		}

	public static String[] getLatLongPositions(String address) throws Exception {
		int responseCode = 0;
		String api = "http://maps.googleapis.com/maps/api/geocode/xml?address=" + URLEncoder.encode(address, "UTF-8")
				+ "&sensor=true";
		URL url = new URL(api);
		HttpURLConnection httpConnection = (HttpURLConnection) url.openConnection();
		httpConnection.connect();
		responseCode = httpConnection.getResponseCode();
		if (responseCode == 200) {
			DocumentBuilder builder = DocumentBuilderFactory.newInstance().newDocumentBuilder();
			;
			Document document = builder.parse(httpConnection.getInputStream());
			XPathFactory xPathfactory = XPathFactory.newInstance();
			XPath xpath = xPathfactory.newXPath();
			XPathExpression expr = xpath.compile("/GeocodeResponse/status");
			String status = (String) expr.evaluate(document, XPathConstants.STRING);
			if (status.equals("OK")) {
				expr = xpath.compile("//geometry/location/lat");
				String latitude = (String) expr.evaluate(document, XPathConstants.STRING);
				expr = xpath.compile("//geometry/location/lng");
				String longitude = (String) expr.evaluate(document, XPathConstants.STRING);
				return new String[] { latitude, longitude };
			} else {
				throw new Exception("Error from the API - response status: " + status);
			}
		}
		return null;
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
