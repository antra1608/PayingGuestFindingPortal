<%@page import="pojo.Sharing_info"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<%@page import="java.util.ArrayList"%>
<%@page import="pojo.Pg_amenties"%>
<%@page import="pojo.Pg_details"%>
<%@page import="pojo.Sharing_info"%>

<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Real Estate - Free CSS Template</title>
<meta name="keywords"
	content="free css templates, real estate website, website templates, W3C, CSS, XHTML" />
<meta name="description"
	content="Real Estate Template - Free CSS Template, W3C compliant XHTML CSS layout" />
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/gallery_style.css" />
<style type="text/css">
.auto-style1 {
	width: 301px;
}
</style>
<style type="text/css">
div#map_container {
	width: 100%;
	height: 250px;
}
</style>
<script type="text/javascript"
	src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>

<script type="text/javascript">
  function loadMap(a,b) {
    var latlng = new google.maps.LatLng(a,b);
    var myOptions = {
      zoom: 30,
      center: latlng,
      mapTypeId: google.maps.MapTypeId.ROADMAP
    };
    var map = new google.maps.Map(document.getElementById("map_container"),myOptions);
	
	var marker = new google.maps.Marker({
      position: latlng, 
      map: map, 
      title:"my hometown, Malim Nawar!"
	}); 
  
  }
</script>
<%
	ArrayList<pojo.Pg_details> p = (ArrayList<pojo.Pg_details>) request.getAttribute("pg");
	Pg_details pg = p.get(0);
	int p_id = (Integer) request.getAttribute("P_id");
	request.setAttribute("P_id", p_id);
	String category = (String) request.getParameter("category");
	System.out.print(category);
	Float lat = pg.getLatitude();
	Float lng = pg.getLongitude();
%>

</head>
<body onload="loadMap(<%=lat%>, <%=lng%>)">
	<%
		ArrayList<Pg_amenties> b = (ArrayList<Pg_amenties>) request.getAttribute("amenities");
		Pg_amenties a = b.get(0);
	%>



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
							<li><a href="Mypgs.jsp" class="current">back</a></li>
						</ul>
					</div>
					<!-- end of menu -->
				</div>

			</div>
			<!-- end of menu login section -->
		</div>
		<!-- end of top panel -->

		<div id="templatemo_content_panel_1">

			<script type="text/javascript">
				var imgid = 'image';
				var imgdir = 'images/fullsize';
				var imgext = '.jpg';
				var thumbid = 'thumbs';
				var auto = true;
				var autodelay = 5;
			</script>
			<script type="text/javascript" src="slide.js"></script>
			<script type="text/javascript">
				function enable1() {
					if ("true" == document.getElementById("a4").value) {
						document.getElementById("a4").value = false;
						document.getElementById("a1").disabled = true;
						document.getElementById("a2").disabled = true;
						document.getElementById("a3").disabled = true;
					}

					else if ("false" == document.getElementById("a4").value) {
						document.getElementById("a4").value = true;
						document.getElementById("a1").disabled = false;
						document.getElementById("a2").disabled = false;
						document.getElementById("a3").disabled = false;
					}
				}
				function enable2() {
					if ("true" == document.getElementById("b4").value) {
						document.getElementById("b4").value = false;
						document.getElementById("b1").disabled = true;
						document.getElementById("b2").disabled = true;
						document.getElementById("b3").disabled = true;

					} else if ("false" == document.getElementById("b4").value) {
						document.getElementById("b4").value = true;
						document.getElementById("b1").disabled = false;
						document.getElementById("b2").disabled = false;
						document.getElementById("b3").disabled = false;

					}
				}
				function enable3() {
					if ("true" == document.getElementById("g4").value) {
						document.getElementById("g4").value = false;
						document.getElementById("g1").disabled = true;
						document.getElementById("g2").disabled = true;
						document.getElementById("g3").disabled = true;

					} else if ("false" == document.getElementById("g4").value) {
						document.getElementById("g4").value = true;
						document.getElementById("g1").disabled = false;
						document.getElementById("g2").disabled = false;
						document.getElementById("g3").disabled = false;

					}
				}
				function enable4() {
					if ("true" == document.getElementById("d4").value) {
						document.getElementById("d4").value = false;
						document.getElementById("d1").disabled = true;
						document.getElementById("d2").disabled = true;
						document.getElementById("d3").disabled = true;

					} else if ("false" == document.getElementById("d4").value) {
						document.getElementById("d4").value = true;
						document.getElementById("d1").disabled = false;
						document.getElementById("d2").disabled = false;
						document.getElementById("d3").disabled = false;

					}
				}
				function enable5() {
					if ("true" == document.getElementById("e4").value) {
						document.getElementById("e4").value = false;
						document.getElementById("e1").disabled = true;
						document.getElementById("e2").disabled = true;
						document.getElementById("e3").disabled = true;

					} else if ("false" == document.getElementById("e4").value) {
						document.getElementById("e4").value = true;
						document.getElementById("e1").disabled = false;
						document.getElementById("e2").disabled = false;
						document.getElementById("e3").disabled = false;

					}
				}
				function enable6() {
					if ("true" == document.getElementById("f4").value) {
						document.getElementById("f4").value = false;
						document.getElementById("f1").disabled = true;
						document.getElementById("f2").disabled = true;
						document.getElementById("f3").disabled = true;

					} else if ("false" == document.getElementById("f4").value) {
						document.getElementById("f4").value = true;
						document.getElementById("f1").disabled = false;
						document.getElementById("f2").disabled = false;
						document.getElementById("f3").disabled = false;

					}
				}
						</script>

			<form action="Pg_updation" method="post">
				<div id="templatemo_section_3_1">
					<h1 align="center">PG DASHBOARD</h1>
					<h3>PG INFORMATION</h3>
					<hr />
					<table style="width: 540px; margin-top: 19px; margin-left: 158px;">
						<tr>
							<td class="auto-style1"><label> PG Name</label></td>
							<td><input type="text" name="Name"
								value="<%=pg.getP_name()%>" /></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1"><label>Gender Category</label></td>
							<td class="auto-style1"><select name="Gender"
								value=<%=pg.getGender()%>>
									<option>Male</option>
									<option>Female</option>
							</select></td>

						</tr>
						<tr>
							<td class="auto-style1"><label> Licence number</label></td>
							<td><input type="text" name="Licence_no"
								value="<%=pg.getLicence_no()%>" /></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1"><label>Food Preference</label></td>
							<td class="auto-style1"><select name="Food_available"
								value="<%=pg.getFood_available()%>">
									<option value=1>Veg</option>
									<option value=2>Non-Veg</option>
									<option value=3>No Food Available</option>

							</select></td>

						</tr>
						<tr>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1"><label>Operating Since</label></td>
							<td class="auto-style1"><select name="Operating_since"
								value="<%=pg.getOperating_since()%>">
									<option value=1>Veg</option>
									<option value=2>Non-Veg</option>
									<option value=3>No Food Available</option>

							</select></td>

						</tr>
						<tr>
							<td class="auto-style1"></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

						</tr>

					</table>
					<h3 align="center">ROOM SHARING INFORMATION</h3>
					<hr />
					<table align="center">
						<thead bgcolor="#223e5d">
							<tr>
								<th>Options</th>
								<th>Room Type (shared by)</th>
								<th>Rent<br /> <span>(per person)</span></th>
								<th>Deposit<br /> <span>(per person)</span></th>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>

								<th>vacancy</th>

								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<th>No Of rooms</th>

								<%
									}
								%>

							</tr>
						</thead>

						<tbody>
							<tr>
								<%
									ArrayList<pojo.Sharing_info> sh1 = (ArrayList<pojo.Sharing_info>) request.getAttribute("1sharing");
									ArrayList<pojo.Sharing_info> sh2 = (ArrayList<pojo.Sharing_info>) request.getAttribute("2sharing");
									ArrayList<pojo.Sharing_info> sh3 = (ArrayList<pojo.Sharing_info>) request.getAttribute("3sharing");
									ArrayList<pojo.Sharing_info> sh4 = (ArrayList<pojo.Sharing_info>) request.getAttribute("4sharing");
									ArrayList<pojo.Sharing_info> sh5 = (ArrayList<pojo.Sharing_info>) request.getAttribute("5sharing");
									ArrayList<pojo.Sharing_info> sh6 = (ArrayList<pojo.Sharing_info>) request.getAttribute("6sharing");
									Sharing_info sh=(Sharing_info)request.getAttribute("vacancy");
									if (sh1.size() != 0) {
										Sharing_info s1 = sh1.get(0);
								%>
								<td align="center"><input type="checkbox" name="room1"
									value="1" selected="true" checked="true" onclick="enable1();" /></td>
								<td>1 Person</td>
								<td><input type="text" name="a1" id="a1"
									value="<%=s1.getRent()%>" maxlength="5" /></td>
								<td><input type="text" name="a2" id="a2"
									value="<%=s1.getDeposit()%>" maxlength="5" /></td>

								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="a3" id="a3" value="<%=sh.getSharing1_vac()%>"></td>

								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="a3" id="a3" value="<%=s1.getNo_of_sharing()%>"></td>

								<%
									}
								%>
								<td><input type="hidden" name="a4" id="a4" value="true"></input></td>
							</tr>


							<%
								} else {
							%>

							<tr>
								<td align="center"><input type="checkbox" name="room1"
									value="1" onclick="enable1();" /></td>
								<td>1 People</td>
								<td><input type="text" name="a1" id="a1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="a2" id="a2" disabled
									maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="a3" id="a3" disabled></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="a3" id="a3" disabled></td>
								
								<%
									}
								%>

								<td><input type="hidden" name="a4" id="a4" value="false"></input></td>
							</tr>
							<%
								}
								if (sh2.size() != 0) {
									Sharing_info s2 = sh2.get(0);
							%>
							<tr>
								<td align="center"><input type="checkbox" name="room2"
									value="2" selected="true" onclick="enable2();" checked="true" /></td>
								<td>2 People</td>
								<td><input type="text" name="b1" id="b1"
									value="<%=s2.getRent()%>" maxlength="5" /></td>
								<td><input type="text" name="b2" id="b2"
									value="<%=s2.getDeposit()%>" maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="b3" id="b3" value="<%=sh.getSharing2_vac()%>"></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="b3" id="b3" value="<%=s2.getNo_of_sharing()%>"></td>
								
								<%
									}
								%>
								
								
								<td><input type="hidden" name="b4" id="b4" value="true"></input></td>
							</tr>
							<%
								} else {
							%>
							<tr>
								<td align="center"><input type="checkbox"
									onclick="enable2();" name="room2" value="2" selected="true" /></td>
								<td>2 People</td>
								<td><input type="text" name="b1" id="b1" disabled
									maxlength="5" /></td>
								
								<td><input type="text" name="b2" id="b2" disabled
									maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="b3" id="b3" disabled></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="b3" id="b3" disabled></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="b4" id="b4" value="false"></input></td>
							</tr>
							<%
								}
								if (sh3.size() != 0) {
									Sharing_info s3 = sh3.get(0);
							%>
							<tr>
								<td align="center"><input type="checkbox" name="room3"
									value="3" selected="true" checked="true" onclick="enable3();" /></td>
								<td>3 People</td>
								<td><input type="text" name="g1" id="g1"
									value="<%=s3.getRent()%>" maxlength="5" /></td>
								<td><input type="text" name="g2" id="g2"
									value="<%=s3.getDeposit()%>" maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									id="g3" name="g3" value="<%=sh.getSharing3_vac()%>"></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									id="g3" name="g3" value="<%=s3.getNo_of_sharing()%>"></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="g4" id="g4" value="true"></input></td>
							</tr>





							<%
								} else {
							%>
							<tr>
								<td align="center"><input type="checkbox"
									onclick="enable3();" name="room3" value="3" /></td>
								<td>3 People</td>
								<td><input type="text" name="g1" id="g1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="g2" id="g2" disabled
									maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="g3" id="g3" disabled></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="g3" id="g3" disabled></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="g4" id="g4" value="false"></input></td>
							</tr>


							<%
								}
								if (sh4.size() != 0) {
									Sharing_info s4 = sh4.get(0);
							%>
							<tr>
								<td align="center"><input type="checkbox"
									onclick="enable4();" name="room4" value="4" selected="true"
									checked="true" /></td>
								<td>4 People</td>
								<td><input type="text" name="d1" id="d1"
									value="<%=s4.getRent()%>" maxlength="5" /></td>
								<td><input type="text" name="d2" id="d2"
									value="<%=s4.getDeposit()%>" maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="d3" id="d3" value="<%=sh.getSharing4_vac()%>"></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="d3" id="d3" value="<%=s4.getNo_of_sharing()%>"></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="d4" id="d4" value="true"></input></td>
							</tr>




							<%
								} else {
							%>
							<tr>
								<td align="center"><input type="checkbox"
									onclick="enable4();" name="room4" value="4" /></td>
								<td>4 People</td>
								<td><input type="text" name="d1" id="d1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="d2" id="d2" disabled
									maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="d3" id="d3" disabled></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="d3" id="d3" disabled></td>
								
								<%
									}
								%>
								
								
								<td><input type="hidden" name="d4" id="d4" value="false"></input></td>
							</tr>


							<%
								}
								if (sh5.size() != 0) {
									Sharing_info s5 = sh5.get(0);
							%>
							<tr>
								<td align="center"><input type="checkbox" name="room5"
									value="5" selected="true" checked="true" onclick="enable5();" /></td>
								<td>5 People</td>
								<td><input type="text" name="e1" id="e1"
									value="<%=s5.getRent()%>" maxlength="5" /></td>
								<td><input type="text" name="e2" id="e2"
									value="<%=s5.getDeposit()%>" maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="e3" id="e3" value="<%=sh.getSharing5_vac()%>"></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="e3" id="e3" value="<%=s5.getNo_of_sharing()%>"></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="e4" id="e4" value="true"></input></td>
							</tr>





							<%
								} else {
							%>
							<tr>
								<td align="center"><input type="checkbox"
									onclick="enable5();" name="room5" value="5" /></td>
								<td>5 People</td>
								<td><input type="text" name="e1" id="e1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="e2" id="e2" disabled
									maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="e3" id="e3" disabled></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="e3" id="e3" disabled></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="e4" id="e4" value="false"></input></td>
							</tr>





							<%
								}
								if (sh6.size() != 0) {
									Sharing_info s6 = sh6.get(0);
							%>
							<tr>
								<td align="center"><input type="checkbox"
									onclick="enable6();" name="room6" value="6" selected="true"
									checked="true" /></td>
								<td>6 People</td>
								<td><input type="text" name="f1" id="f1"
									value="<%=s6.getRent()%>" maxlength="5" /></td>
								<td><input type="text" name="f2" id="f2"
									value="<%=s6.getDeposit()%>" maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="f3" id="f3" value="<%=sh.getSharing6_vac()%>"></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									name="f3" id="f3" value="<%=s6.getNo_of_sharing()%>"></td>
								
								<%
									}
								%>
								
								<td><input type="hidden" name="f4" id="f4" value="true"></input></td>
							</tr>





							<%
								} else {
							%>
							<tr>
								<td align="center"><input type="checkbox" name="room6"
									value="6" onclick="enable6();" /></td>
								<td>6 People</td>
								<td><input type="text" name="f1" id="f1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="f2" id="f2" disabled
									maxlength="5" /></td>
								<%
									if ("view_details".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="f3" id="f3" disabled></td>
								
								<%
									} else if ("pg_update".equalsIgnoreCase(category)) {
								%>
								<td><input type="number" maxlength="3" min="1" max="999"
									value="" name="f3" id="f3" disabled></td>
								
								<%
									}
								%>
								
								
								<td><input type="hidden" name="f4" id="f4" value="false"></input></td>
							</tr>



							<%
								}
							%>

						</tbody>
						<h3>AMENITIES INFORMATION</h3>
						<hr />
						<table align="center" border=1>
							<tr>
						</table>

						<%
							if ("yes".equalsIgnoreCase(a.getTelevision())) {
						%>

						<td><label for="Television"> <input id="Television"
								name="c1" type="checkbox" value="false" checked="true">
									Television </label></td>

						<%
							} else {
						%>
						<td><label for="Television"> <input id="Television"
								name="c1" type="checkbox" value="false" selected="false">
									Television </label></td>
						<%
							}

							if ("yes".equalsIgnoreCase(a.getWifi())) {
						%>
						<td><label for="Wifi"> <input id="Wifi" name="c2"
								type="checkbox" value="false" checked="true"> Wifi </label></td>
						<%
							} else {
						%>
						<td><label for="Wifi"> <input id="Wifi" name="c2"
								type="checkbox" value="false" selected="false"> Wifi </label></td>
						<%
							}
							if ("yes".equalsIgnoreCase(a.getUPSBackedpower())) {
						%>

						<td><label for="UPSBackedpower"> <input
								id="UPSBackedpower" checked="true" name="c3" type="checkbox"
								value="false"> UPSBackedpower </label></td>
						<%
							} else {
						%>

						<td><label for="UPSBackedpower"> <input
								id="UPSBackedpower" name="c3" selected="false" type="checkbox"
								value="false"> UPSBackedpower </label></td>
						<%
							}
							if ("yes".equalsIgnoreCase(a.getLaundry())) {
						%>

						<td><label for="Laundry"> <input id="Laundry"
								name="c4" type="checkbox" value="false" checked="true">
									Laundry </label></td>
						<%
							} else {
						%>
						<td><label for="Laundry"> <input id="Laundry"
								name="c4" type="checkbox" value="false" selected="false">
									Laundry </label></td>
						</tr>

						<%
							}
							if ("yes".equalsIgnoreCase(a.getAirConditioner())) {
						%>
						<tr>
							<td><label for="AirConditioner"> <input
									id="AirConditioner" name="c5" type="checkbox" value="false"
									checked="true"> Air Conditioner </label></td>

							<%
								} else {
							%>
							<tr>
								<td><label for="AirConditioner"> <input
										id="AirConditioner" name="c5" type="checkbox" value="false"
										selected="false"> Air Conditioner </label></td>

								<%
									}
									if ("yes".equalsIgnoreCase(a.getDrinkingWater())) {
								%>
								<td><label for="DrinkingWater"> <input
										id="DrinkingWater" name="c6" checked="true" type="checkbox"
										value="false"> Drinking Water </label></td>
								<%
									} else {
								%>
								<td><label for="HotWater"> <input id="HotWater"
										name="c7" type="checkbox" value="false" selected="false">
											Hot Water </label></td>

								<%
									}
									if ("yes".equalsIgnoreCase(a.getRoomService())) {
								%>
								<td><label for="RoomService"> <input
										id="RoomService" name="c8" type="checkbox" checked="true"
										value="false"> Room Service </label></td>
								<%
									} else {
								%>
								<td><label for="RoomService"> <input
										id="RoomService" name="c8" type="checkbox" value="false"
										selected="false" /> Room Service
								</label></td>
								<%
									}
									if ("yes".equalsIgnoreCase(a.getSecurity())) {
								%>
							</tr>
							<tr>
								<td><label for="Security"> <input id="Security"
										name="c9" type="checkbox" value="false" checked="true" />
										Security
								</label></td>

								<%
									} else {
								%>
							</tr>
							<tr>
								<td><label for="Security"> <input id="Security"
										name="c9" type="checkbox" value="false" selected="false" />
										Security
								</label></td>
								<%
									}
									if ("yes".equalsIgnoreCase(a.getParking())) {
								%>
								<td><label for="Parking"> <input id="Parking"
										checked="true" name="c10" type="checkbox" value="false">
											Parking </label></td>

								<%
									} else {
								%>
								<td><label for="Parking"> <input id="Parking"
										name="c10" type="checkbox" value="false" selected="false" />
										Parking
								</label></td>
								<%
									}
									if ("yes".equalsIgnoreCase(a.getMicrowave())) {
								%>
								<td><label for="Microwave"> <input id="Microwave"
										name="c11" type="checkbox" value="false" checked="true" />
										Microwave
								</label></td>
								<%
									} else {
								%>
								<td><label for="Microwave"> <input id="Microwave"
										name="c11" type="checkbox" value="false" selected="false" />
										Microwave
								</label></td>
								<%
									}
									if ("yes".equalsIgnoreCase(a.getKitchen())) {
								%>
								<td><label for="Kitchen"> <input id="Kitchen"
										checked="true" name="c12" type="checkbox" value="false" />
										Kitchen
								</label></td>

								<%
									} else {
								%>
								<td><label for="Kitchen"> <input id="Kitchen"
										name="c12" type="checkbox" value="false" selected="false" />
										Kitchen
								</label></td>

								<%
									}
									if ("yes".equalsIgnoreCase(a.getHeater())) {
								%>
							</tr>
							<tr>
								<td><label for="Heater"> <input id="Heater"
										name="c13" type="checkbox" value="false" checked="true" />
										Heater
								</label></td>
								<%
									} else {
								%>
							</tr>
							<tr>
								<td><label for="Heater"> <input id="Heater"
										name="c13" type="checkbox" value="false" selected="false" />
										Heater
								</label></td>
								<%
									}
									if ("yes".equalsIgnoreCase(a.getWashingMachine())) {
								%>
								<td><label for="WashingMachine"> <input
										id="WashingMachine" name="c14" type="checkbox" checked="true"
										value="false"> Washing Machine </label></td>
								<%
									} else {
								%>

								<td><label for="Gesyer"> <input id="Television"
										name="c15" type="checkbox" value="false" selected="false">
											Gesyer </label></td>

								<%
									}
									if ("yes".equalsIgnoreCase(a.getFurniture())) {
								%>
								<td><label for="Furniture"> <input id="Television"
										name="c16" type="checkbox" value="false" checked="true">
											Furniture </label></td>
								<%
									}

									else {
								%>
								<td><label for="Furniture"> <input id="Television"
										name="c16" type="checkbox" value="false" selected="false" />
										Furniture
								</label></td>

								<%
									}
								%>
							</tr>
							<tr>
								<td>&nbsp&nbsp&nbsp</td>
								<td>&nbsp&nbsp&nbsp</td>
								<td class="auto-style1">&nbsp&nbsp&nbsp</td>
								<td class="auto-style1">&nbsp&nbsp&nbsp</td>

							</tr>
					</table>
					<h3>CONTACT INFORMATION</h3>
					<hr />
					<table align="center">
						<tr>
							<td><label>Contact Person :</label></td>
							<td><input type="text" name="Contact_person"
								value="<%=pg.getContact_person()%>"></input>
						</tr>
						<tr>
							<td><label>Phone Number :</label></td>
							<td><input type="text" name="Phone"
								value="<%=pg.getPhone()%>" /></td>
						</tr>


						<tr>
							<td><label>Email Id :</label></td>
							<td><input type="text" name="Email_id"
								value=" <%=pg.getEmail_id()%>"></input></td>
						</tr>
						<tr>
							<td><label>Website URL(optional) :</label></td>
							<td><input type="text" name="Website_url"
								value="<%=pg.getWebsite()%>" /></td>
						</tr>
						<tr>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

						</tr>

					</table>
					<h3>LOCATION INFORMATION</h3>
					<hr />
					<table align="center">
						<tr>
							<td><label>Area :</label></td>
							<td><input type="text" name="Area"
								value="<%=pg.getLocation()%>>"></input>
						</tr>
						<tr>
							<td><label>Address :</label></td>
							<td><input type="text" name="Address"
								value="<%=pg.getAddress()%>"></input>
						</tr>
						<tr>
							<td colspan="2">
								<div id="map_container"></div>

							</td>
						</tr>
						<tr>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

						</tr>
						<%
							if ("view_details".equalsIgnoreCase(category)) {
						%>
						<tr>
							<td><input type="submit" name="submit" value="Book Your PG" /></td>
							<td><input type="submit" name="submit"
								value="Schedule Your Visit" /></td>
							<% if(sh.getSharing1_vac()==0 && sh.getSharing2_vac()==0 && sh.getSharing3_vac()==0 && sh.getSharing4_vac()==0 && sh.getSharing5_vac()==0 && sh.getSharing6_vac()==0){%>
							<td><input type="submit" name="submit"
								value="Show Interest For Future Reference" /></td>
<%} %>
						</tr>
						<%
							} else if ("pg_update".equalsIgnoreCase(category)) {
						%>
						<tr>
							<td><input type="submit" name="submit" value="Save Changes" /></td>
						</tr>


						<%
							}
						%>
					</table>


				</div>
			</form>
			<!-- end of section 1 -->

		</div>
		<!-- end of content panel 1 -->

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
					<li><a href="http://www.flashmo.com" target="_blank">Free
							Flash</a></li>
					<li><a href="http://www.templatemo.com" target="_blank">Free
							CSS</a></li>
					<li><a href="http://www.webdesignmo.com" target="_blank">Web
							Design</a></li>
					<li><a href="http://www.photovaco.com" target="_blank">Free
							Photos</a></li>
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