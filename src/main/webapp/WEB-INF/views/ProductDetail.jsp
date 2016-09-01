<%@include file="header.jsp" %> 
<body>
<div style="background-color:white;">
<div class="container" id="product-section">

  <div class="row">
   <div class="col-md-5">
    <img src="resources/images/${product.id}.jpg" class="image-responsive" height="400" width="400" border="1"/>
  
   </div>
   <div class="col-md-7">
   <div class="row">
   <div class="col-md-12">
   <h1>${product.name}</h1>
   </div>
   </div>
   
   
   <div class="row">
 <div class="col-md-12">
  <span class="label label-primary">Color</span>
  <span class="monospaced">${product.color}</span>
 </div>
</div>
  <div class="row">
 <div class="col-md-12">
  <span class="label label-primary">Size</span>
  <span class="monospaced">${product.size}</span>
 </div>
</div>
<div class="row">
 <div class="col-md-3">
  <span class="sr-only">9 out of 10 </span>
  <span class="glyphicon glyphicon-star" aria-hidden="true"></span>
  <span class="glyphicon glyphicon-star" aria-hidden="true"></span>
  <span class="glyphicon glyphicon-star" aria-hidden="true"></span>
  <span class="glyphicon glyphicon-star" aria-hidden="true"></span>
  <span class="glyphicon glyphicon-star-empty" aria-hidden="true"></span>
  <span class="label label-success">80</span>
 </div>
 <div class="col-md-3">
  <span class="monospaced">Give your  Review</span>
 </div>
</div>
   
<div class="row">
 <div class="col-md-12 bottom-rule">
  <h2 class="product-price">${product.price}</h2>
 </div>
</div>
<div class="row add-to-cart">
 <div class="col-md-3 product-qty">
  <span class="btn btn-default btn-lg btn-qty">
   <span class="glyphicon glyphicon-plus" aria-hidden="true"></span>
  </span>
 
 </div>

 <div class="col-md-9">
<a href="${request.getContextPath()}/clotheson/order/${product.id}" role="button" name="_eventId_submit" 
  class="btn btn-lg btn-primary btn-full-width">add to cart
   <span class="glyphicon glyphicon-cart-in"></span>
  </a></div>

</div>
</div>
</div>
</div>
</div>
</body>
</html>