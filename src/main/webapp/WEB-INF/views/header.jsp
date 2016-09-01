<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/resources/images/" var="img"/>

<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css"
          href="https://fonts.googleapis.com/css?family=Tangerine">
 <link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
  <script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
    <script
src="http://maps.googleapis.com/maps/api/js">
</script>

<script>
function initialize() {
  var mapProp = {
    center:new google.maps.LatLng(51.508742,-0.120850),
    zoom:5,
    mapTypeId:google.maps.MapTypeId.ROADMAP
  };
  var map=new google.maps.Map(document.getElementById("googleMap"), mapProp);
}
google.maps.event.addDomListener(window, 'load', initialize);
</script>

<title>ClothesOnMind</title>
<style>
<style>
#background {
    position: fixed;
    top: 0;
    left: 0;
    width: 100%;
    height: 50%;
    
}
.navbar-custom{
	
	background-color:white;
}
.admin a
{
	text-decoration:none;
	color:white;
	font-size:30px;
	font-family:arial cursive;
}
<!-- search bar-->
#custom-search-input{
    padding: 3px;
    border: solid 1px #E4E4E4;
    border-radius: 6px;
    background-color: #fff;
}

#custom-search-input input{
    border: 0;
    box-shadow: none;
}

#custom-search-input button{
    margin: 2px 0 0 0;
    background: none;
    box-shadow: none;
    border: 0;
    color: #666666;
    padding: 0 8px 0 10px;
    border-left: solid 1px #ccc;
}

#custom-search-input button:hover{
    border: 0;
    box-shadow: none;
    border-left: solid 1px #ccc;
}

#custom-search-input .glyphicon-search{
    font-size: 23px;
}
#explore {
		padding-top:0px;
        font-family: 'Tangerine', serif;
        font-size:100px;
        color:white;
        background-color:black;
      }
body
{
	background-color:black;
}
.center {
    margin-top:30px;
    margin-left:20px;
    width: 50%;
    border: 3px solid #73AD21;
    padding-right:50px;
    padding-left:50px;
    padding-bottom:50px;
    padding-top:50px;
    background-color:white;
    text-align:center;
}
.form
{
	font-size:30px;
	font-family:arial bold;

}
</style>
</head>
<body>
<nav class="navbar navbar-default bg-fade" style="padding-bottom:0px;" >
  <div class="container-fluid" style="padding-bottom:0px;">
    <!-- Brand and toggle get grouped for better mobile display -->
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target=".navbar-collapse">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="${session.getContextPath()}/clotheson/aboutus" data-toggle="tooltip" title="AboutUs">
      <img src="${img}logo.jpg" style="margin-top:0px;max-width:200px;" height="50px"> </a>
      </div>
      <div id="custom-search-input" style="float:right; margin-top:20px;">
                <div class="input-group col-md-12">
                    <input type="text" class="form-control input-lg" placeholder="Search" />
                    <span class="input-group-btn">
                        <button class="btn btn-info btn-lg" type="button">
                            <i class="glyphicon glyphicon-search"></i>
                        </button>
                    </span>
                </div>
            </div>
   </div> 
 </nav>
 <nav class="navbar navbar-inverse" style="background-color:#0d0d0d;">
  <div class="container-fluid">
<ul class="nav navbar-nav">
<li class="active"><a href="${session.getContextPath}/clotheson/home" data-toggle="tooltip" title="Home"><span class="glyphicon glyphicon-home" style="font-size:150%;"></span></a></li>
<li><a href="${session.getContextPath()}/clotheson/location" data-toggle="tooltip" title="ServiceCentres"><span class="glyphicon glyphicon-map-marker" style="font-size:150%;"></span></a></li>
</ul>
<ul class="nav navbar-nav navbar-right">
<li><a href="${session.getContextPath()}/clotheson/joinus" data-toggle="tooltip" title="JoinUs"><span class="glyphicon glyphicon-user" style="font-size:150%;"></span></a></li>
<li><a href="${session.getContextPath()}/clotheson/contactus" data-toggle="tooltip" title="ContactUs"><span class="glyphicon glyphicon-earphone" style="font-size:150%;"></a></li>
<li ><a href="#"><span class="glyphicon glyphicon-shopping-cart" style="font-size:150%;"></span></a></li>

</ul>
</div>
</nav>
 

</body>
</html>



