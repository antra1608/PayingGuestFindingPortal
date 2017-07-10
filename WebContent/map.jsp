
<html>
<head>
<title>Google Map Hello World Example</title>
<style type="text/css">
div#map_container{
	width:500px;
	height:350px;
}
</style>
<script type="text/javascript" src="http://maps.googleapis.com/maps/api/js?sensor=false"></script>

<script type="text/javascript">
  function loadMap() {
    var latlng = new google.maps.LatLng(38.5748871, -89.5537646);
    var myOptions = {
      zoom: 10,
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
</head>

<body onload="loadMap()">
<div id="map_container"></div>
</body>
</html>