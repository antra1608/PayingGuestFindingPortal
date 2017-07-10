package com;

import java.io.IOException;
import java.io.PrintWriter;
import java.security.Security;
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

@WebServlet("/mail.do")
public class MailServlet extends HttpServlet {
	protected void doGet(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		doPost(request, response);
	}
	protected void doPost(HttpServletRequest request,HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		String password=null;
		if("owner".equalsIgnoreCase(request.getParameter("category")))
			{
		model.Pg_owner ow=new model.Pg_owner();
	password=	ow.getpassword(request.getParameter("email"));
			}
	
	else if("lodger".equalsIgnoreCase(request.getParameter("category")))
	{
		model.lodger lo=new model.lodger();
		password=	lo.getpassword(request.getParameter("email"));
		
		
	}
		String mailto = request.getParameter("email");
		String message = "Your Email-id is "+mailto+"\n"+"Your Password is"+password;
		String subject = "Forgot Password";
		String mailfrom = "antra.purohit1608@gmail.com";
		String[] sendTo = { mailto };

		Security.addProvider(new com.sun.net.ssl.internal.ssl.Provider());
		MailServlet sendMailThroughJava = new MailServlet();
		try {
			sendMailThroughJava.sendSSLMessage(sendTo, subject,	message, mailfrom);
			out.println("Mail sent successfully");
		} catch (MessagingException ex) {
			out.println("Error in sending mail");
		}
	}
	public void sendSSLMessage(String recipients[], String subject,	String message, String from) throws MessagingException {
		boolean debug = true;
		Properties ps = new Properties();
		ps.put("mail.smtp.host", "smtp.gmail.com");
		ps.put("mail.smtp.auth", "true");
		ps.put("mail.debug", "true");
		ps.put("mail.smtp.port", "465");
		ps.put("mail.smtp.socketFactory.port", "465");
		ps.put("mail.smtp.socketFactory.class", "javax.net.ssl.SSLSocketFactory");
		ps.put("mail.smtp.socketFactory.fallback", "false");

		Session session = Session.getDefaultInstance(ps,new javax.mail.Authenticator() {
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
}