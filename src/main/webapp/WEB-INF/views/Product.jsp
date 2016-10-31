<%@include file="header.jsp" %>
<body>
<div id="explore" style="background-color:#0000b3;">
<h1><center><span style="font-size:300%;color:white;">Manage Products</span></center></h1>
</div>
<br>
<div style="background-color:white;padding-top: 20px;padding-bottom: 20px;">
<h2><center>PRODUCT LIST</center></h2>

<c:if test="${!empty productlist}">

    <div class="table-responsive">
    <table class="table table-bordered w3-blue">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Brand</th>
        <th>Color</th>
        <th>Size</th>
        <th>Price</th>
        <th>Category</th>
         <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${productlist}" var="product">
        <tr>
            <td>${product.id}</td>
            <td>${product.name}</td>
            <td>${product.brand}</td>
            <td>${product.color}</td>
            <td>${product.size}</td>
            <td>${product.price}</td>
             <td>${product.category.name}</td>
             <td><a href="<c:url value='/edit/${product.id}'></c:url>">Edit</a></td>       
            <td><a href="<c:url value='/delete/${product.id}'></c:url>">Delete</a></td>
        </tr>
    </c:forEach>
    </tbody>
    </table>
 </div>
</c:if><br><br>
<center>ADD NEW PRODUCT</center><hr>
<c:url var="addAction" value="/product/add"></c:url>
<div class="container">
	<div class="row" style="overflow-x:auto;">
	<div class=col-xs-2></div>
	<div class="col-xs-8" style="overflow-x:auto;">
	<form:form action="${addAction}" commandName="product" modelAttribute="product" method="POST" enctype="multipart/form-data" >
	<table  width="80%" >
    <c:if test="${!empty product.name}">
    <tr>
        <td width="25%">
            <form:label path="id">
                <spring:message text="ID"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="id" readonly="true" size="8"  disabled="true" />
            <form:hidden path="id" />
        </td> 
        <td width="30%"></td>
        
    </tr>
    </c:if>
    <tr>
        <td width="25%">
            <form:label path="name">
                <spring:message text="Name"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="name" />
        </td> 
        <td width="30%"><form:errors path="name" cssStyle="color: #ff0000;"/></td>
        
    </tr>
    <tr> 
   	 <td width="25%">
    <form:label path="brand">
            <spring:message text="Brand"/>
    </form:label>
      </td>
     
    <td width="25%">
        <form:select path="brand">
				<form:option value="" label="--- Select ---" />
				<form:option value="W">W</form:option>  
                <form:option value="Fab India">Fab India</form:option>  
                <form:option value="Biba">Biba</form:option>  
                <form:option value="Zara">Zara</form:option>
                <form:option value="Lavie">Lavie</form:option> 
                <form:option value="viva">viva</form:option>
                <form:option value="Shopper Stop">Shopper Stop</form:option>  
         </form:select>
         
        </td>
        <td width="30%"><form:errors path="brand" cssStyle="color: #ff0000;"/></td>
        
    </tr>
    
     <tr>
     <td width="25%">
      <form:label path="color">
                <spring:message text="Color"/>
            </form:label>
            </td>
        <td width="25%">
           <form:select path="color">
				<form:option value="" label="--- Select ---" />
				<form:option value="Red">Red</form:option>  
                <form:option value="Green">Green</form:option>  
                <form:option value="Blue">Blue</form:option>  
                <form:option value="White">White</form:option>
                <form:option value="Pink">Pink</form:option>
                <form:option value="Black">Black</form:option>
                <form:option value="Gold">Gold</form:option>  
                <form:option value="Silver">Silver</form:option>
                <form:option value="Rose Gold">Rose Gold</form:option>     
                </form:select>
      </td>
     <td width="30%"><form:errors path="color" cssStyle="color: #ff0000;"/></td>
  </tr>
    
    <tr>
     <td width="25%">
      <form:label path="size">
                <spring:message text="Size"/>
            </form:label>
            </td>
        <td width="25%">
           <form:select path="size">
				<form:option value="" label="--- Select ---" />
				<form:option value="XS">XS</form:option>  
                <form:option value="S">S</form:option>  
                <form:option value="M">M</form:option>  
                <form:option value="L">L</form:option>  
                <form:option value="XL">XL</form:option>
                </form:select>
      </td>
     <td width="30%"><form:errors path="size" cssStyle="color: #ff0000;"/></td>
  </tr>
    
     <tr>
        <td width="25%">
            <form:label path="price">
                <spring:message text="Price"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="price" />
        </td>
        <td width="30%"><form:errors path="price" cssStyle="color: #ff0000;"/></td>
    </tr>
    <tr>
    <td width="25%">
    <form:label path="category.name">
                <spring:message text="Category"/>
            </form:label>
      </td>
      <td width="25%">
    
		<form:select path="category.name">
				<form:option value="" label="--- Select ---" />
				  <c:forEach items="${categorylist}" var="category">
				<form:option value="${category.name}"></form:option>
				</c:forEach>		
		</form:select> 
		
      </td>
    </tr>
      <tr>
        <td width="25%">
            <form:label path="image">
                <spring:message text="Please select a image to upload a image"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="image" type="file" />
        </td>
         <td width="30%">
            
        </td>
    </tr>
    
    <tr>
        <td colspan="2">
            <c:if test="${!empty product.name}">
                <input type="submit"
                    value="<spring:message text="Edit Product"/>" />
            </c:if>
            <c:if test="${empty product.name}">
                <input type="submit"
                    value="<spring:message text="Add Product"/>" />
         </c:if>
        </td>
    </tr>
    
</table>  

</form:form>
</div>
<div class="col-xs-2"></div>
</div>
<br><br>
</div>
<%@include file="footer.jsp" %>
</body>
</html>