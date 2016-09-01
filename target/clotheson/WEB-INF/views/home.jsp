<%@include file="header.jsp" %>
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
          <img src="${img}aa6.jpg" alt="First carousel Image">
       </div>
        <div class="item">
          <img  src="${img}qw2.jpg"    alt="Second carousel Image">
          </div>
        <div class="item">
          <img src="${img}aa7.jpg"    alt="Third carousel Image">
         </div>
	
   </div>
      <a class="left carousel-control" href="#myCarousel" data-slide="prev">
      <span class="glyphicon glyphicon-chevron-left"></span></a>
      <a class="right carousel-control" href="#myCarousel" data-slide="next">
      <span class="glyphicon glyphicon-chevron-right"></span></a>
    </div>

<div id="explore" style="background-color:#0000b3;">
<center><span style="font-size:100%;color:white;"> Explore our best and unique designs..!</span></center>
</div>
<br><br><br>
<span style="font-family:Helvetica Narrow, sans-serif;font-size:40px;color:white;"><center>NEW ARRIVALS</center></span>
<br><span style="font-family:arial;font-size:20px;"><center>Check out the best fashion and more</center></span><br>
<br>
<div class="container">
<div class="row">
    <div class="col-md-4">
        <img alt="img" src="${img}cl9.jpg"  height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>
    <div class="col-md-4">
        <img alt="img" src="${img}cl7.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
    </div>
   <div class="col-md-4">
        <img alt="img" src="${img}cl8.jpg"  height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>

</div>
</div>
<br><br>
<span style="font-family:Helvetica Narrow, sans-serif;font-size:40px;color:white;"><center>BLACK ZONE</center></span>
<br><br>
<div class="container">
<div class="row">
    <div class="col-md-4">
        <img alt="img" src="${img}cl15.jpg"  height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>
    <div class="col-md-4">
        <img alt="img" src="${img}cl17.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
    </div>
   <div class="col-md-4">
        <img alt="img" src="${img}cl12.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
    </div>
   
</div>
<br><br><br>
</div>

<br><br>
<%@include file="footer.jsp" %>
</body>
