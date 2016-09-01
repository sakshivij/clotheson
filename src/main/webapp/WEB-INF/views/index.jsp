<%@include file="header.jsp" %>
<html>
<head>
<title>ClothesOnMind</title>
</head>
<body>
   
   <div id="myCarousel" class="carousel slide" style="margin-top:0px;">
      <!-- Indicators -->
      <ol class="carousel-indicators">
        <li data-target="#myCarousel" data-slide-to="0" class="active"></li>
        <li data-target="#myCarousel" data-slide-to="1"></li>
        <li data-target="#myCarousel" data-slide-to="2"></li>
   
      </ol>
      <div class="carousel-inner">
        <div class="item active">
          <img src="${img}cl11.jpg" alt="First carousel Image">
       </div>
        <div class="item">
          <img  src="${img}cl13.jpg"    alt="Second carousel Image">
          </div>
        <div class="item">
          <img src="${img}ll.jpg"    alt="Third carousel Image">
         </div>
	
   </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span></a>
    </div>

<div id="explore">
<center><h1><a href="${session.getContextPath()}/clotheson/home" style="font-size:150px; text-decoration:none;color:white;" data-toggle="tooltip" title="VisitUs">Explore now!</a></h1></center>

</div>

</body>
</html>
