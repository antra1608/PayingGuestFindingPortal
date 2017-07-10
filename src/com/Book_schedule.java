package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Security;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Properties;

import javax.mail.Message;
import javax.mail.MessagingException;
import javax.mail.PasswordAuthentication;
import javax.mail.Session;
import javax.mail.Transport;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@WebServlet("/Book_schedule")
public class Book_schedule extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// String submit=(String)request.getAttribute("submit");
		PrintWriter out = response.getWriter();
		String submit = request.getParameter("submit");
		model.lodger l = new model.lodger();

		HttpSession session = (HttpSession) request.getSession();
		String username = (String) session.getAttribute("username");
		String P_name = (String) session.getAttribute("P_name");

		int i = l.book(username);
		String mail = l.getmail(username);
		System.out.println(P_name);
		model.Pg_details p = new model.Pg_details();
		int P_id = p.getid(P_name);
		int O_id = p.getownerid(P_id);
		int L_id = l.getid(username);
		model.Pg_owner o = new model.Pg_owner();
		String mail1 = o.getmail(O_id);
		String m=null;

		if ("Book Now".equalsIgnoreCase(submit)) {

			/*
			 * //Mail TO Lodger String mailto =mail; String message =
			 * "You have Sucessfully Booked Your Pg "+"your PG name:-"+P_name;
			 * String subject = "PG Booking"; String mailfrom =
			 * "antra.purohit1608@gmail.com"; String[] sendTo = { mailto };
			 * 
			 * Security.addProvider(new
			 * com.sun.net.ssl.internal.ssl.Provider()); MailServlet
			 * sendMailThroughJava = new MailServlet(); try {
			 * sendMailThroughJava.sendSSLMessage(sendTo, subject, message,
			 * mailfrom); out.println("Mail sent successfully to lodger"); }
			 * catch (MessagingException ex) { out.println(
			 * "Error in sending mail"); } //Mail To Owner String mailto1
			 * =mail1; message ="One Lodger has registered to your PG "+
			 * "your PG name:-"; subject = "PG Booking"; mailfrom =
			 * "antra.purohit1608@gmail.com"; String[] sendTo1 = { mailto1 };
			 * 
			 * Security.addProvider(new
			 * com.sun.net.ssl.internal.ssl.Provider()); MailServlet
			 * sendMailThroughJava1 = new MailServlet(); try {
			 * sendMailThroughJava1.sendSSLMessage(sendTo1, subject, message,
			 * mailfrom); out.println("Mail sent successfully to owner"); }
			 * catch (MessagingException ex) { out.println(
			 * "Error in sending mail"); }
			 */
			// For booking pg insertion

			String sharing = request.getParameter("sharing");
			char[] s = sharing.toCharArray();
			int c = Character.getNumericValue(s[0]);

			System.out.println("Sharing is" + s[0] + "in numeric" + c);
			pojo.Lodger lo = new pojo.Lodger();
			lo.setDate_of_admission(request.getParameter("Date_of_admission"));
			lo.setGuardian_Contact(request.getParameter("Guardian_Contact"));
			lo.setGuardian_Name(request.getParameter("Guardian_Name"));
			lo.setNative_Address(request.getParameter("Native_Address"));
			lo.setOccupation(request.getParameter("Occupation"));
			lo.setMonth(request.getParameter("Month"));

			int a = l.book_pg(lo, P_id, L_id, c);

			// to decrease vacancy when pg is booked
			model.Sharing_info sh = new model.Sharing_info();
			int q = sh.update_vacancy_on_insert(P_id, c);
			
			m="Congratulations,Your booking is Confirmed Enjoy";

		}

		else if ("Schedule Meeting".equalsIgnoreCase(submit)) {
			String date = request.getParameter("Date");
			String time = request.getParameter("Time");
			java.sql.Date sqlDate = null;
			java.sql.Time sqlTime = null;
			DateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");
			Date myDate;
			try {
				myDate = formatter.parse(date);
				sqlDate = new java.sql.Date(myDate.getTime());

				DateFormat formatter1 = new SimpleDateFormat("HH:mm");
				Date myTime = formatter1.parse(time);
				sqlTime = new java.sql.Time(myDate.getTime());

			} catch (ParseException e) {
				e.printStackTrace();
			}

			System.out.println("Date is=" + date + "time is" + time);

			int d = l.set_meeting(sqlDate, sqlTime, P_id, L_id, O_id);
			/*
			 * this code is to write when owner confirm meeting //Mail TO Lodger
			 * String mailto =mail; String message =
			 * "Congratulations Your meeting with Owner of PG is fixed !! "+
			 * "for PG"+P_name+"on Date-"+date+"and time-"+time+"At PG itself";
			 * String subject = "PG Booking"; String mailfrom =
			 * "antra.purohit1608@gmail.com"; String[] sendTo = { mailto };
			 * 
			 * Security.addProvider(new
			 * com.sun.net.ssl.internal.ssl.Provider()); MailServlet
			 * sendMailThroughJava = new MailServlet(); try {
			 * sendMailThroughJava.sendSSLMessage(sendTo, subject, message,
			 * mailfrom); out.println("Mail sent successfully to lodger"); }
			 * catch (MessagingException ex) { out.println(
			 * "Error in sending mail"); }
			 */
			// Mail To Owner
			String mailto1 = mail1;
			String message = "One Lodger has scheduled meeting with you to visit  your PG :-" + P_name + "on Date-"
					+ date + "and time-" + time + "Please confirm it as soon as possible";
			String subject = "PG Booking";
			String mailfrom = "antra.purohit1608@gmail.com";
			String[] sendTo1 = { mailto1 };

			Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
			MailServlet sendMailThroughJava1 = new MailServlet();
			try {
				sendMailThroughJava1.sendSSLMessage(sendTo1, subject, message, mailfrom);
				out.println("Mail sent successfully to owner");
			} catch (MessagingException ex) {
				out.println("Error in sending mail");
			}
			m="Your meeting with scheduled as your given time. you will get confirmation mail soon, when owner confirm the meeting";
		}
		else if("Show Interest For Future Reference".equalsIgnoreCase(submit))
		{
		int r=	l.set_interest(L_id,P_id);
		m="Thanks for showing your interest.You will be notified in future when there is vacancy in your interested PG.";
		}
request.setAttribute("message",m);
request.getRequestDispatcher("message.jsp").include(request, response);

	}

	public void sendSSLMessage(String recipients[], String subject, String message, String from)
			throws MessagingException {
		boolean debug = true;
		Properties ps = new Properties();
		ps.put("mail.smtp.host", "smtp.gmail.com");
		ps.put("mail.smtp.auth", "true");
		ps.put("mail.debug", "true");
		ps.put("mail.smtp.port", "465");
		ps.put("mail.smtp.socketFactory.port", "465");
		ps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		ps.put("mail.smtp.socketFactory.fallback", "false");

		Session session = Session.getDefaultInstance(ps, new javax.mail.Authenticator() {
			protected PasswordAuthentication getPasswordAuthentication() {
				return new PasswordAuthentication("antra.purohit1608@gmail.com", "prashantpurohit");
			}
		});
		session.setDebug(debug);
		Message msg = new MimeMessage(session);
		InternetAddress addressFrom = new InternetAddress(from);
		msg.setFrom(addressFrom);
		InternetAddress[] addressTo = new InternetAddress[recipients.length];
		for (int i = 0; i < recipients.length; i++) {
			addressTo[i] = new InternetAddress(recipients[i]);
		}
		msg.setRecipients(Message.RecipientType.TO, addressTo);
		msg.setSubject(subject);
		msg.setContent(message, "text/plain");
		Transport.send(msg);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
