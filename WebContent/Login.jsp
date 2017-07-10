<%@page import="model.Pg_owner"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@page import="model.Pg_owner"  %>
    <%@page import="java.util.*"  %>
    
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
                    <li><a href="subpage.html">Logder</a></li>
                    <li><a href="#">Owner</a></li>
                    <li><a href="#">Login</a></li>
                    <li><a href="#">About</a></li>
                    <li><a href="#">Contact</a></li>                   
                </ul> 
            </div> <!-- end of menu -->
        </div>
        
    </div> <!-- end of menu login section -->
</div> <!-- end of top panel -->

<div id="templatemo_gallery_panel">
<div id="gallery">
  <div id="imagearea">
    <div id="image">
      <a href="javascript:slideShow.nav(-1)" class="imgnav " id="previmg"></a>
      <a href="javascript:slideShow.nav(1)" class="imgnav " id="nextimg"></a>
    </div>
  </div>
  <div id="thumbwrapper">
    <div id="thumbarea">
      <ul id="thumbs">
        <li value="1"><img src="images/thumbs/1.jpg" width="179" height="100" alt="" /></li>
        <li value="2"><img src="images/thumbs/2.jpg" width="179" height="100" alt="" /></li>
        <li value="3"><img src="images/thumbs/3.jpg" width="179" height="100" alt="" /></li>
        <li value="4"><img src="images/thumbs/4.jpg" width="179" height="100" alt="" /></li>
        <li value="5"><img src="images/thumbs/5.jpg" width="179" height="100" alt="" /></li>
        <li value="3"><img src="images/thumbs/3.jpg" width="179" height="100" alt="" /></li>
        <li value="4"><img src="images/thumbs/4.jpg" width="179" height="100" alt="" /></li>
        <li value="5"><img src="images/thumbs/5.jpg" width="179" height="100" alt="" /></li>
      </ul>
    </div>
  </div>
</div>

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
function fun()
{
	
	var email = prompt("Please enter your Email-id", "");
//var category=document.getElementsByName("category");
var category = document.getElementById('category');
var sv = category.options[category.selectedIndex].value;
	if (email != null) {
		var s="mail.do?email="+email+"&category="+sv;

		document.location=s;
	}

	}
</script>
</div>

<div id="templatemo_content_panel_1">
<div id="templatemo_news_section">Notifications....<br />

<%
Pg_owner OW = new Pg_owner();
ArrayList<String> a=OW.selectpost();
String notify=null;
for(int i=0;i<a.size();i++)
{
	notify=notify+a.get(i)+"<br>";
}

%>
<marquee direction="down" scrollamount="2" behaviour="scroll" loop="infinite"><%=notify %></marquee>
</div>
    <div id="templatemo_section_1_1">
        <h1 align="center">Login</h1>
        <form method="get" action="login">
        <table  style="width: 540px; margin-top: 19px">
       <tr align="left"> <td>Select Category:</td><td><select name="category" id="category"><option>Owner</option><option>Lodger</option></select></td></tr>
        <tr align="left"><td>Username:</td> <td><input type="text" name="username"/></td></tr>
        <tr align="left"><td>Password :</td><td><input type="password" name="password"/></td></tr>
               <tr align="left"><td> </td><td><input type="submit" name="submit" value="submit"/></td>
               <td><input type="button" value="Forgot Password" onclick="fun();" /></td>
               </tr>
        </table>
        </form>
    </div>
    <!-- end of section 1 -->
    <div class="cleaner_with_height">&nbsp;</div>
</div>

<div id="templatemo_content_panel_2">
<div id="cleaner_with_height">
<h3>Frequently searched PGs</h3>

<table  style="margin-left: 0px; height: 45px; width: 907px;">

<tr><td>Aambawadi&nbsp;&nbsp;&nbsp; |</td><td>Bopal&nbsp;&nbsp;&nbsp;&nbsp; |</td><td>Bodakdev&nbsp;&nbsp;&nbsp; |</td><td>Satelite&nbsp;&nbsp;&nbsp;&nbsp; |</td><td>University&nbsp;&nbsp;&nbsp; |</td><td>Thaltej&nbsp;&nbsp;&nbsp;&nbsp; |</td><td>Narayanpura&nbsp;&nbsp;&nbsp; |</td><td>Navarangpura&nbsp;&nbsp;&nbsp; |</td><td>Paldi&nbsp;&nbsp;&nbsp; |</td></tr><tr><td>Prahladnagar&nbsp;&nbsp; |</td><td>Shayamal&nbsp;&nbsp;&nbsp;&nbsp; |</td><td>Vastrapur&nbsp;&nbsp;&nbsp; |</td><td>Gurukul&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</td><td>LawGarden&nbsp;&nbsp; |</td><td>
    Swasti&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</td><td>Maninagar&nbsp; |</td><td>ScienceCity&nbsp;&nbsp;&nbsp;&nbsp;&nbsp;&nbsp; |</td></tr>
</table>
</div>
	<div class="templatemo_section_2">
    
    	
        <img src="images/pg1.jpg" alt="image" />
        <h4>Images of Frequently searched Pg </h4>
        <p>Details of them...</p>
        <div class="price">PRICE:<span> 6500</span></div>    
        <div class="readmore"><a href="subpage.html">Read more</a></div>                       
    </div>
    <div class="templatemo_section_2">
        <img src="images/pg2.jpg" alt="image" />
      <h4>Images of Frequently searched Pg </h4>
        <p>Details of them...</p>  <div class="price">PRICE:<span> 7500</span></div>                           
        <div class="readmore"><a href="subpage.html">Read more</a></div>
    </div>
    <div class="templatemo_section_2">

        <img src="images/pg3.jpg" alt="image" />
        <h4>Images of Frequently searched Pg </h4>
        <p>Details of them...</p><div class="price">PRICE:<span> 5000</span></div>                           
      <div class="readmore"><a href="subpage.html">Read more</a></div>
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
                <li><a href="http://www.flashmo.com" target="_blank">Free Flash</a></li>
                <li><a href="http://www.templatemo.com" target="_blank">Free CSS</a></li>
                <li><a href="http://www.webdesignmo.com" target="_blank">Web Design</a></li>
                <li><a href="http://www.photovaco.com" target="_blank">Free Photos</a></li>
            </ul>
    </div>
    
<div class="cleaner_with_height">&nbsp;</div>
</div><!-- end of content panel 3 -->

<div id="templatemo_footer_panel">
    Copyright © 2015 <a href="index.html">PayingGuest finding Portal</a> | <a href=# target="_parent"></a> by <a href= target="_blank">Antra and Shikha</a></div>
</div> <!-- end of container -->
</body>
</html>