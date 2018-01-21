<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@page isELIgnored="false" %>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

<c:url value="/resources/images/" var="img"/>
<c:url value="/resources/css" var="style"/>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" type="text/css" href="https://fonts.googleapis.com/css?family=Tangerine">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
<script src="https://ajax.googleapis.com/ajax/libs/jquery/1.12.4/jquery.min.js"></script>
<script src="http://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>
<title>ClothesOnMind</title>
<link rel="stylesheet" type="text/css" href="${style}/style.css"/>
</head>
<body>

<!--  <nav class="navbar navbar  bg-fade" style="padding-bottom:0px;" >
  <div class="container-fluid" style="padding-bottom:0px;">
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
 -->
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



