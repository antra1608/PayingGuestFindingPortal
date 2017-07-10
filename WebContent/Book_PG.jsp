<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.util.*"%>

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
<script>
function set_rent( a)
{
	document.getElementById("Rent").disabled=false;
	document.getElementById("Rent").value=a;
//	document.getElementById("sharing").value=b;
//	alert(b);
	}
function set_hidden(a )
{
	//document.getElementById("Rent").disabled=false;
	//document.getElementById("Rent").value=a;
	document.getElementById("sharing").value=a;
//	alert(a);
	}

</script>
	<div id="templatemo_container">
		<div id="templatemo_top_panel">
			<div id="templatemo_header_section">
				<div id="templatemo_header">
					<h6 style="height: 50px; margin-top: 0px">
						PayingGuest Finding<br /> <br /> Portal
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
							<li><a href="#">About</a></li>
							<li><a href="#">Contact</a></li>
						</ul>
					</div>
					<!-- end of menu -->
				</div>

			</div>
			<!-- end of menu login section -->
		</div>
		<!-- end of top panel -->
		<%
			String submit = (String) request.getAttribute("submit");
			request.setAttribute("submit", submit);
		%>

		<div id="templatemo_content_panel_1">
			<h1 align="center">BOOK YOUR PG</h1>
			<hr></hr>
			<%
				if ("Book Your PG".equalsIgnoreCase(submit)) {
			%>
			<form method="get" action="Book_schedule">
				<%
					ArrayList<String> sharing = (ArrayList<String>) request.getAttribute("sharing");
				ArrayList<Integer> rent = (ArrayList<Integer>) request.getAttribute("rent");
				
				%>
				<table align="center" border=0
					style="width: 540px; margin-top: 19px">
					<tr align="left">
						<td><label>Select Your Room :</label></td>
					</tr>
					<%
						for (int i = 0; i < sharing.size(); i++) {
						Integer r=rent.get(i);
						String s=sharing.get(i);
					%>
					<tr>
						<td><input type="radio" name="Sharing_info" onclick="set_hidden('<%=s %>');set_rent('<%=r %>');"
							required /><%=sharing.get(i)%></td>
					</tr>
					<tr>
					<td>
					<input type="hidden" name="sharing" id="sharing"></input>
					</td>
					</tr>
					<%
					}
					%>

					<tr align="left">
						<td><label>Your Rent is: </label></td>
						<td><input type="text" name="Rent" id="Rent"  disabled="true"/></td>
					</tr>
				</table>

				<hr></hr>
				<table align="center" border=0
					style="width: 540px; margin-top: 19px">
					<tr align="left">
						<td><label>Native Address :</label></td>
						<td><input type="text" name="Native_Address" required /></td>
					</tr>

					<tr align="left">
						<td><label>Occupation: </label></td>
						<td><input type="text" name="Occupation" required /></td>
					</tr>
					<tr align="left">
						<td><label>Guardian Name: </label></td>
						<td><input type="text" name="Guardian_Name" required /></td>
					</tr>
					<tr align="left">
						<td><label>Guardian Contact:</label></td>
						<td><input type="text" name="Guardian_Contact" required /></td>
					</tr>
					<tr align="left">
						<td><label>Date Of Admission: </label></td>
						<td><input type="date"  name="Date_of_admission" required /></td>
					</tr>

					<tr align="left">
						<td><label>Duration Of Stay:</label></td>
						<td><input type="text" name="Month" />(In Month)</td>
					</tr>
					<tr align="left">
						<td></td>
						<td><input type="submit" name="submit" value="Book Now"
							onclick= /></td>
					</tr>
				</table>
			</form>
			<%
				} else if ("Schedule Your Visit".equalsIgnoreCase(submit)) {
			%>
			<form method="get" action="Book_schedule">

				<table align="center" border=0
					style="width: 540px; margin-top: 19px">
					<tr align="left">
						<td><label>Date :</label></td>
						<td><input type="date" name="Date" required /></td>
					</tr>

					<tr align="left">
						<td><label>Time: </label></td>
						<td><input type="time" name="Time" required /></td>
					</tr>
					<tr align="left">
						<td></td>
						<td><input type="submit" name="submit"
							value="Schedule Meeting" onclick= /></td>
					</tr>
				</table>
			</form>

			<%
				}
			%>
			<!-- end of section 1 -->
			<div class="cleaner_with_height">&nbsp;</div>
		</div>


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
					<li><a href="#" target="_blank">Owner name</a></li>
					<li><a href="#" target="_blank">Owner name</a></li>
					<li><a href="#" target="_blank">Owner name</a></li>
					<li><a href="#" target="_blank">Owner name</a></li>
				</ul>
			</div>

			<div class="cleaner_with_height">&nbsp;</div>
		</div>
		<!-- end of content panel 3 -->

		<div id="templatemo_footer_panel">
			Copyright � 2015 <a href="index.html">PayingGuest finding Portal</a>
			| <a href=# target="_parent"></a> by <a href=target="_blank">Antra
				and Shikha</a>
		</div>
	</div>
	<!-- end of container -->
</body>
</html>