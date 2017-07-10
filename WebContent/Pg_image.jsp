<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD XHTML 1.0 Transitional//EN" "http://www.w3.org/TR/xhtml1/DTD/xhtml1-transitional.dtd">
<html xmlns="http://www.w3.org/1999/xhtml">
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
<title>Real Estate - Free CSS Template</title>
<meta name="keywords" content="free css templates, real estate website, website templates, W3C, CSS, XHTML" />
<meta name="description" content="Real Estate Template - Free CSS Template, W3C compliant XHTML CSS layout" />
<link href="css/templatemo_style.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet" type="text/css" href="css/gallery_style.css" />
<style type="text/css">
div#map_container{
	width:350px;
	height:350px;
}
</style>
<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>

<script type="text/javascript">
  function loadMap(a,b) {
    var latlng = new google.maps.LatLng(a,b);
    var myOptions = {
      zoom: 20,
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
String lat=(String)request.getAttribute("latitude");
String lng=(String)request.getAttribute("longitude");

%>
</head>
<body onload="loadMap(<%=lat%>, <%=lng%>)">
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
                    <li><a href="index.html" class="current">Home</a></li>
                    <li><a href="#">Sign up</a></li>
                    <li><a href="#">Login</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>                   
                </ul> 
            </div> <!-- end of menu -->
        </div>
        
    </div> <!-- end of menu login section -->
</div> <!-- end of top panel -->


<div id="templatemo_content_panel_1">
<h1 align="center">Your PG Location in Map</h1>
<div id="map_container"></div>


<table align="center">
<form action="Pg_image" enctype="multipart/form-data" method="post">
<label><h1>Upload Image</h1></label>
<input type="file" name="image"></input>
<input type="submit" name="uplaod" value="upload" />

</form></table>
    <!-- end of section 1 -->
    <div class="cleaner_with_height">&nbsp;</div>
</div>

<div id="templatemo_content_panel_2">
<div id="cleaner_with_height">

</div>
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
                <li><a href="http://www.flashmo.com" target="_blank">Owner name</a></li>
                <li><a href="http://www.templatemo.com" target="_blank">Owner name</a></li>
                <li><a href="http://www.webdesignmo.com" target="_blank">Owner name</a></li>
                <li><a href="http://www.photovaco.com" target="_blank">Owner name</a></li>
            </ul>
    </div>
    
<div class="cleaner_with_height">&nbsp;</div>
</div><!-- end of content panel 3 -->

<div id="templatemo_footer_panel">
    Copyright © 2015 <a href="index.html">PayingGuest finding Portal</a> | <a href=# target="_parent"></a> by <a href= target="_blank">Antra and Shikha</a></div>
</div> <!-- end of container -->
</body>
</html>