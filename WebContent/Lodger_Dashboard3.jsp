<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@page import="java.util.ArrayList"%>
	
	<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Real Estate - Free CSS Template</title>
<meta name="keywords"
	content="free css templates, real estate website, website templates, W3C, CSS, XHTML" />
<meta name="description"
	content="Real Estate Template - Free CSS Template, W3C compliant XHTML CSS layout" />
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/gallery_style.css" />
</head>
<body>
	<div id="templatemo_container">
		<div id="templatemo_top_panel">
			<div id="templatemo_header_section">
				<div id="templatemo_header">
					<h6 style="height: 50px; margin-top: 0px">
						PayingGuest Finding<br />
						<br /> Portal
					</h6>
				</div>
			</div>
			<!-- end of header section -->

			<div id="templatemo_menu_login_section">
				<div id="templatemo_menu_section">
					<div id="templatemo_menu_panel">
						<ul>
							<li><a href="index.html" class="current">Home</a></li>
							<li><a href="#">Sign up</a></li>
							<li><a href="#">Login</a></li>
							<li><a href="Accountdetails?category=lodger">MyAccount</a></li>
							<li><a href="#">Contact</a></li>
						</ul>
					</div>
					<!-- end of menu -->
				</div>
				<h1 align="center">
					Welcome
					<%=(String) session.getAttribute("username")%></h1>
			</div>
			<!-- end of menu login section -->
		</div>
		<!-- end of top panel -->


		<div id="templatemo_content_panel_1">
			<div id="templatemo_news_section">
				Notifications....<br />
				<marquee direction="up">this is notification section</marquee>
			</div>
			
			<%
			ArrayList<String> location =(ArrayList<String>) request.getAttribute("Location");
			String s;
			%>
			<div id="templatemo_section_1_1">
				<h1 align="center">Find Your Paying Guest...</h1>
				<form method="get" action="Search_pg">
					<table style="width: 540px; margin-top: 19px">
						<tr align="left">
							<td><label>Location</label></td>
							<td><select name="Location"><option>Aambawadi</option>
			
								<% for(int i=0;i<location.size();i++)
									
								{ 
									s=location.get(i);				
								out.print("<option>"+s+"</option>");
									
									%>
								
								<%} %>
								 <option>No Constrains</option>
							</select></td>
						</tr>
						</select>
						</td>
						</tr>
						<tr align="left">
							<td class="auto-style1"><label>Minimum Budget: </label></td>
							<td><select name="Min_budget">									<option>2500</option>
									<option>3500</option>
									<option>4500</option>
									<option>5500</option>
									<option>No Constrains</option></select></td>
						</tr>
						<tr align="left">
							<td class="auto-style1"><label>Maximum Budget </label></td>
							<td><select name="Max_budget"><option>5000</option>
									<option>6000</option>
									<option>7000</option>
									<option>8000</option>
									<option>9000</option>
									<option>10000</option>
											<option>No Constrains</option>
							</select></td>
						</tr>
						<tr align="left">
							<td class="auto-style1"><label>Gender</label></td>
							<td><select name="Gender"><option>Male</option>
									<option>Female</option></select></td>
						</tr>
						<tr align="left">
							<td class="auto-style1"><label>Fooding Facilities</label></td>
							<td><select name="Food_available"><option>yes</option>
									<option>No</option>
											<option>No Constrains</option>
									</select></td>
						</tr>

						<tr align="left">
							<td></td>
							<td><input type="submit" name="submit" value="submit" /></td>
						</tr>
					</table>
				</form>
			</div>
			<!-- end of section 1 -->
			<div class="cleaner_with_height">&nbsp;</div>
<!-- 	<tr align="left">
							<td class="auto-style1"><label>Paying Guest Name</label></td>
							<td><input type="text" name="pg_name" /></td>
						</tr>
						
	 -->		
		</div>

		<div id="templatemo_content_panel_2">
			<div id="cleaner_with_height"></div>
			<h3>Frequently searched PGs</h3>

			<table style="margin-left: 0px; height: 45px; width: 907px;">

				<tr>
					<td>Aambawadi&nbsp;&nbsp;&nbsp; |</td>
					<td>Bopal&nbsp;&nbsp;&nbsp;&nbsp; |</td>
					<td>Bodakdev&nbsp;&nbsp;&nbsp; |</td>
					<td>Satelite&nbsp;&nbsp;&nbsp;&nbsp; |</td>
					<td>University&nbsp;&nbsp;&nbsp; |</td>
					<td>Thaltej&nbsp;&nbsp;&nbsp;&nbsp; |</td>
					<td>Narayanpura&nbsp;&nbsp;&nbsp; |</td>
					<td>Navarangpura&nbsp;&nbsp;&nbsp; |</td>
					<td>Paldi&nbsp;&nbsp;&nbsp; |</td>
				</tr>
				<tr>
					<td>Prahladnagar&nbsp;&nbsp; |</td>
					<td>Shayamal&nbsp;&nbsp;&nbsp;&nbsp; |</td>
					<td>Vastrapur&nbsp;&nbsp;&nbsp; |</td>
					<td>Gurukul&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</td>
					<td>LawGarden&nbsp;&nbsp; |</td>
					<td>Swasti&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</td>
					<td>Maninagar&nbsp; |</td>
					<td>ScienceCity&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</td>
				</tr>
			</table>

			<div class="templatemo_section_2">


				<img src="images/pg1.jpg" alt="image" />
				<h4>Images of Frequently searched Pg</h4>
				<p>Details of them...</p>
				<div class="price">
					PRICE:<span> 6500</span>
				</div>
				<div class="readmore">
					<a href="subpage.html">Read more</a>
				</div>
			</div>
			<div class="templatemo_section_2">
				<img src="images/pg2.jpg" alt="image" />
				<h4>Images of Frequently searched Pg</h4>
				<p>Details of them...</p>
				<div class="price">
					PRICE:<span> 7500</span>
				</div>
				<div class="readmore">
					<a href="subpage.html">Read more</a>
				</div>
			</div>
			<div class="templatemo_section_2">

				<img src="images/pg3.jpg" alt="image" />
				<h4>Images of Frequently searched Pg</h4>
				<p>Details of them...</p>
				<div class="price">
					PRICE:<span> 5000</span>
				</div>
				<div class="readmore">
					<a href="subpage.html">Read more</a>
				</div>
			</div>

			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<!-- end of content panel 2 -->

		<div id="templatemo_content_panel_3">

			<div class="templatemo_quick_contact">
				<h1>Quick Contact</h1>
				<p>
					Tel: 010-100-1000<br /> Fax: 020-200-2000<br /> Email: info {at}
					templatemo.com
				</p>
				<a href="http://validator.w3.org/check?uri=referer"><img
					style="border: 0; width: 88px; height: 31px"
					src="http://www.w3.org/Icons/valid-xhtml10"
					alt="Valid XHTML 1.0 Transitional" width="88" height="31"
					vspace="8" border="0" /></a> <a
					href="http://jigsaw.w3.org/css-validator/check/referer"><img
					style="border: 0; width: 88px; height: 31px"
					src="http://jigsaw.w3.org/css-validator/images/vcss-blue"
					alt="Valid CSS!" vspace="8" border="0" /></a>
			</div>
			<!-- end of news section 3-->

			<div class="templatemo_section_3">
				<h1>Helpful Links</h1>
				<ul class="list_section">
					<li><a href="#">Testimonials</a></li>
					<li><a href="#">FAQs</a></li>
					<li><a href="#">Terms of us</a></li>
					<li><a href="#">About Us</a></li>
					<li><a href="#">Contact Us</a></li>
				</ul>
			</div>
			<div class="templatemo_section_3">
				<h1>Partner Links</h1>
				<ul class="list_section">
					<li><a href="http://www.flashmo.com" target="_blank">Owner
							name</a></li>
					<li><a href="http://www.templatemo.com" target="_blank">Owner
							name</a></li>
					<li><a href="http://www.webdesignmo.com" target="_blank">Owner
							name</a></li>
					<li><a href="http://www.photovaco.com" target="_blank">Owner
							name</a></li>
				</ul>
			</div>

			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<!-- end of content panel 3 -->

		<div id="templatemo_footer_panel">
			Copyright © 2015 <a href="index.html">PayingGuest finding Portal</a>
			| <a href=# target="_parent"></a> by <a href=target="_blank">Antra
				and Shikha</a>
		</div>
	</div>
	<!-- end of container -->
</body>
</html>