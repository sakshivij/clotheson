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
<br><br>
<h1 >WELCOME ${username}<a href="${session.getContextPath()}/clotheson/logout"><span style="float:right;text-decoration:none;color:white;">LOGOUT</span></a></h1>

<br>
<br><br>
<div class="container">
<div class="row">
    <div class="col-md-4">
        <img alt="img" src="${img}pr1.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>
    <div class="col-md-4">
        <img alt="img" src="${img}pr2.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
    </div>
   <div class="col-md-4">
        <img alt="img" src="${img}pr3.jpg"  height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>
</div>
</div>
<br><br>
<div class="container">
<div class="row">
    <div class="col-md-4">
        <img alt="img" src="${img}pr4.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>
    <div class="col-md-4">
        <img alt="img" src="${img}pr6.jpg" height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
    </div>
   <div class="col-md-4">
        <img alt="img" src="${img}pr8.jpg"  height="410px" width="400px" style="padding-right:10px;padding-left:10px;">
			
    </div>
</div>
</div>
<br><br><%@include file="footer.jsp" %>
</body>
</html>