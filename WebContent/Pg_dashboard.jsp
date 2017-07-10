<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
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
<style type="text/css">
.auto-style1 {
	width: 301px;
}
</style>
</head>
<body>
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
							<li><a href="Owner_dashboard1.jsp" class="current">Back</a></li>
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
					if ("true" == document.getElementById("c4").value) {
						document.getElementById("c4").value = false;
						document.getElementById("c1").disabled = true;
						document.getElementById("c2").disabled = true;
						document.getElementById("c3").disabled = true;

					} else if ("false" == document.getElementById("c4").value) {
						document.getElementById("c4").value = true;
						document.getElementById("c1").disabled = false;
						document.getElementById("c2").disabled = false;
						document.getElementById("c3").disabled = false;

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
			<div id="templatemo_section_3_1">
				<h1 align="center">PG DASHBOARD</h1>
				<h3>PG INFORMATION</h3>
				<hr />
				<form action="PgRegistration"   method="post">
					<table style="width: 540px; margin-top: 19px; margin-left: 158px;">
						<tr>
							<td class="auto-style1"><label> PG Name</label></td>
							<td><input type="text" name="Name" /></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1"><label>Gender Category</label></td>
							<td class="auto-style1"><select name="Gender">
									<option >Male</option>
									<option >Female</option>
							</select></td>

						</tr>
						<tr>
							<td class="auto-style1"><label> Licence number</label></td>
							<td><input type="text" name="Licence_no" /></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1"><label>Food Preference</label></td>
							<td class="auto-style1"><select name="Food_available">
									<option value="Veg">Veg</option>
									<option value="Non-Veg">Non-Veg</option>
									<option value="No Food Available">No Food Available</option>

							</select></td>

						</tr>
						<tr>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1"><label>Operating Since</label></td>
							<td class="auto-style1"><input type="text"
								name="Operating_since"> </input></td>

						</tr>
						<tr>
							<td class="auto-style1"></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

						</tr>

					</table>
					<h3 aling="center">ROOM SHARING INFORMATION</h3>
					<hr />
					<table align="center">
						<thead bgcolor="#223e5d">
							<tr>
								<th>Options</th>
								<th>Room Type (shared by)</th>
								<th>Rent<br /> <span>(per person)</span></th>
								<th>Deposit<br /> <span>(per person)</span></th>
								<th>Number of Rooms</th>
							</tr>
						</thead>

						<tbody>
							<tr>
								<td align="center"><input type="checkbox"
									name="room_type[]" value="1" onclick="enable1();" /></td>
								<td>1 Person</td>
								<td><input type="text" name="a1" id="a1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="a2" id="a2" disabled
									maxlength="5" /></td>
								<td><input type="number" maxlength="3" min="1" id="a3"
									max="999" name="a3" disabled></td>
								<td><input type="hidden" name="a4" id="a4" value="false" /></td>

							</tr>
							<tr>
								<td align="center"><input type="checkbox"
									name="room_type[]" value="2" onclick="enable2();" /></td>
								<td>2 People</td>
								<td><input type="text" name="b1" id="b1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="b2" id="b2" disabled
									maxlength="5" /></td>
								<td><input type="number" maxlength="3" min="1" id="b3"
									max="999" value="" name="b3" disabled></td>
								<td><input type="hidden" name="b4" id="b4" value="false" /></td>

							</tr>
							<tr>
								<td align="center"><input type="checkbox"
									name="room_type[]" value="3" onclick="enable3();" /></td>
								<td>3 People</td>
								<td><input type="text" name="c1" id="c1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="c2 id=" c2" disabled
									maxlength="5" /></td>
								<td><input type="number" maxlength="3" min="1" id="c3"
									max="999" value="" name="c3" disabled></td>
								<input type="hidden" name="c4" id="c4" value="false" />
							</tr>
							<tr>
								<td align="center"><input type="checkbox"
									name="room_type[]" value="4" onclick="enable4();" /></td>
								<td>4 People</td>
								<td><input type="text" name="d1" disabled maxlength="5"
									id="d1" /></td>
								<td><input type="text" name="d2" id="d2" disabled
									maxlength="5" /></td>
								<td><input type="number" maxlength="3" min="1" id="d3"
									max="999" value="" name="d3" disabled></td>
								<input type="hidden" name="d4" id="d4" value="false" />
							</tr>
							<tr>
								<td align="center"><input type="checkbox"
									name="room_type[]" value="5" onclick="enable5();" /></td>
								<td>5 People</td>
								<td><input type="text" name="e1" id="e1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="e2" id="e2" disabled
									maxlength="5" /></td>
								<td><input type="number" maxlength="3" min="1" id="e3"
									max="999" value="" name="e3" disabled></td>
								<input type="hidden" name="e4" id="e4" value="false" />
							</tr>
							<tr>
								<td align="center"><input type="checkbox"
									name="room_type[]" value="6" onclick="enable6();" /></td>
								<td>6+ People</td>
								<td><input type="text" name="f1" id="f1" disabled
									maxlength="5" /></td>
								<td><input type="text" name="f2" id="f2" disabled
									maxlength="5" /></td>
								<td><input type="number" maxlength="3" min="1" id="f3"
									max="999" value="" name="f3" disabled></td>
								<input type="hidden" name="f4" id="f4" value="false" />
							</tr>
							<tr>
								<td class="auto-style1"></td>
								<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
								<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
								<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
								<td class="auto-style1">&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

							</tr>

						</tbody>
					</table>


					<h3>AMENITIES INFORMATION</h3>
					<hr />
					<table align="center" border=1>
						<tr>
							<td><label for="Television"> <input id="Television"
									name="c1" type="checkbox" value="false" id="c1"
									onclick="settrue1();"> Television </label></td>


							<td><label for="Wifi"> <input id="Wifi" name="c2"
									type="checkbox" value="false" id="c2" onclick="settrue2();">
										Wifi </label></td>
							<td><label for="UPSBackedpower"> <input
									id="UPSBackedpower" name="c3" type="checkbox" value="false"
									id="c3" onclick="settrue3();"> UPSBackedpower </label></td>
							<td><label for="Laundry"> <input id="Laundry"
									name="c4" type="checkbox" value="false" id="c4"
									onclick="settrue4();"> Laundry </label></td>

						</tr>
						<tr>
							<td><label for="AirConditioner"> <input
									id="AirConditioner" name="c5" type="checkbox" value="false"
									id="c5" onclick="settrue5();"> Air Conditioner </label></td>

							<td><label for="DrinkingWater"> <input
									id="DrinkingWater" name="c6" type="checkbox" value="false"
									id="c6" onclick="settrue6();"> Drinking Water </label></td>

							<td><label for="HotWater"> <input id="HotWater"
									name="c7" type="checkbox" value="false" id="c7"
									onclick="settrue7();"> Hot Water </label></td>
							<td><label for="RoomService"> <input
									id="RoomService" name="c8" type="checkbox" value="false"
									id="c8" onclick="settrue8();"> Room Service </label></td>

						</tr>
						<tr>
							<td><label for="Security"> <input id="Security"
									name="c9" type="checkbox" value="false" id="c9"
									onclick="settrue9();"> Security </label></td>
							<td><label for="Parking"> <input id="Parking"
									name="c10" type="checkbox" value="false" id="c10"
									onclick="settrue10();"> Parking </label></td>
							<td><label for="Microwave"> <input id="Microwave"
									name="c11" type="checkbox" value="false" id="c11"
									onclick="settrue11();"> Microwave </label></td>
							<td><label for="Kitchen"> <input id="Kitchen"
									name="c12" type="checkbox" value="false" id="c12"
									onclick="settrue12();"> Kitchen </label></td>

						</tr>
						<tr>
							<td><label for="Heater"> <input id="Heater"
									name="c13" type="checkbox" value="false" id="c13"
									onclick="settrue13();"> Heater </label></td>
							<td><label for="WashingMachine"> <input
									id="WashingMachine" name="c14" type="checkbox" value="false"
									id="c14" onclick="settrue14();"> Washing Machine </label></td>
							<td><label for="Gesyer"> <input id="Television"
									name="c15" type="checkbox" value="false" id="c15"
									onclick="settrue15();"> Gesyer </label></td>
							<td><label for="Furniture"> <input id="Television"
									name="c16" type="checkbox" value="false" id="c16"
									onclick="settrue16();"> Furniture </label></td>

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
							<td><input type="text" name="Contact_person"></input>
						</tr>
						<tr>
							<td><label>Phone Number :</label></td>
							<td><input type="text" name="Phone"></input>
						</tr>
						<tr>
							<td><label>Email Id :</label></td>
							<td><input type="text" name="Email_id"></input>
						</tr>
						<tr>
							<td><label>Website URL(optional) :</label></td>
							<td><input type="text" name="Website"></input>
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
							<td><input type="text" name="Area"></input>
						</tr>
						<tr>
							<td><label>Address :</label></td>
							<td><input type="text" name="Address"></input>
						</tr>
						<tr>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

						</tr>

						<tr>
							<td><input type="submit"></input></td>
							<td>&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp</td>

						</tr>

					</table>
				</form>
			</div>
			<!-- end of section 1 -->

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