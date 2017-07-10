<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page import="java.util.ArrayList"%>
<%@page import="pojo.admin"%>

<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">

<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Real Estate - Free CSS Template</title>
<meta name="keywords" content="free css templates, real estate website, website templates, W3C, CSS, XHTML" />
<meta name="description" content="Real Estate Template - Free CSS Template, W3C compliant XHTML CSS layout" />
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/gallery_style.css" />
    </head>
<body>
<script type="text/javascript">
function fun()
{
	alert("data updated");
	}
</script>
<div id="templatemo_container">
<div id="templatemo_top_panel">
	<div id="templatemo_header_section">
		<div id="templatemo_header">
        	<h6 style="height: 50px; margin-top: 0px">PayingGuest
            Finding<br /><br /> Portal</h6>
        </div>
    </div> <!-- end of header section -->
    
    <div id="templatemo_menu_login_section">
    	<div id="templatemo_menu_section">
        	<div id="templatemo_menu_panel">
                <ul>
                    <li><a href="#" class="current">Home</a></li>
                    <li><a href="#">Logout</a></li>
                </ul> 
            </div> <!-- end of menu -->
        </div>
        
    </div> <!-- end of menu login section -->
</div> <!-- end of top panel -->

<div id="templatemo_content_panel_1">
    <div id="templatemo_section_2_1" align=center>
    <h3 align="center">ACCOUNT DETAILS</h3>
    <%
	    ArrayList<admin> ad = (ArrayList<admin>) request.getAttribute("admin");
	    
	//    for(int i=0; i<1; i++) {
			admin u = (admin) ad.get(0);
	%>
		
    <form action="Updation" method="post">
    <%-- <c:forEach var="d" items="${admin}">
    	<c:out value="${d.A_name}"></c:out>
    </c:forEach> --%>
  <table  align="center">
  <tr>
  <td><label>Name</label></td>
  <td><input type="text" name="Name" value="<%= u.getA_name() %>" required/></td>
  </tr>
  <tr>
  <td><label>User Name</label></td>
  <td><input type="text" name="Username" value="<%= u.getA_username() %>" required/></td>
  </tr>
  <tr>
  <td><label>Email Address</label></td>
  <td><input type="text" name="Email" value="<%= u.getEmail() %>" required/></td>
  </tr>
  <tr>
  <td><label>Gender :</label></td>
  <td><select name="Gender"><option value="male">Male</option><option value="female">Female</option></select></td>
  </tr>
  <tr>
  <td><label>Mobile Number</label></td>
  <td><input type="text" name="Mobile" value="<%= u.getMobile() %>" required/></td>
  </tr>
  <tr>
  <td>
  </td>
  <td><input type="submit" name="updation" onclick="fun()"  value="Save Changes" required></input></td></tr>
  </table></form>
    </div>
    <!-- end of section 1 -->
</div>
	<%
		//}
	%>

<div id="templatemo_content_panel_2">
  <h3 align="center">PASSWORD DETAILS</h3>
<form action="Updation" method="post">
  <table  align="center">
  <tr>
  <td><label>Enter your current password</label></td>
  <td><input type="password" name="Current_password" required/></td>
  </tr>
  <tr>
  <td><label>Enter Your New password  </label></td>
  <td><input type="password" name="New_password" required/></td>
  </tr>
  <tr>
  <td><label>Confirm your new password</label></td>
  <td><input type="password" name="Confirm_password" required/></td>
  </tr>
  <tr>
  <td align="left"><input type="submit" name="updation" onclick="fun()" value="Reset Password"></input>
  </td>
  <td align="right"><a href=#>Show password</a></td></tr>
  </table>
  </form>
    <div class="cleaner_with_height">&nbsp;</div>
</div> <!-- end of content panel 2 -->

<div id="templatemo_content_panel_3">

	<div class="templatemo_quick_contact">
    	<h1>Quick Contact</h1>
        <p>
            Tel: 010-100-1000<br />
            Fax: 020-200-2000<br />
            Email: info {at} templatemo.com
        </p>
        <a href="http://validator.w3.org/check?uri=referer"><img style="border:0;width:88px;height:31px" src="http://www.w3.org/Icons/valid-xhtml10" alt="Valid XHTML 1.0 Transitional" width="88" height="31" vspace="8" border="0" /></a>
<a href="http://jigsaw.w3.org/css-validator/check/referer"><img style="border:0;width:88px;height:31px"  src="http://jigsaw.w3.org/css-validator/images/vcss-blue" alt="Valid CSS!" vspace="8" border="0" /></a> 
    </div><!-- end of news section 3-->
    
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
                <li><a href="#" target="_blank">Free Flash</a></li>
                <li><a href="#" target="_blank">Free CSS</a></li>
                <li><a href="#" target="_blank">Web Design</a></li>
                <li><a href="#" target="_blank">Free Photos</a></li>
            </ul>
    </div>
    
<div class="cleaner_with_height">&nbsp;</div>
</div><!-- end of content panel 3 -->

<div id="templatemo_footer_panel">
    Copyright © 2015 <a href="index.html">PayingGuest finding Portal</a> | <a href=# target="_parent"></a> by <a href= target="_blank">Antra and Shikha</a></div>
</div> <!-- end of container -->
</body>
</html>