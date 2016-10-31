<%@include file="header.jsp" %>
<body>
<h1 >WELCOME ${username}<a href="${session.getContextPath()}/clotheson/logout"><span style="float:right;text-decoration:none;color:white;">LOGOUT</span></a></h1>
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
        <th></th>
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
  			<td><form action="${session.getContextPath()}/clotheson/productdetail" method="post">
  			<input type="hidden" name="id" value="${product.id}">
  			<input type="hidden" name="name" value="${product.name}">
  			<input type="hidden" name="brand" value="${product.brand}">
  			<input type="hidden" name="color" value="${product.color}">
  			<input type="hidden" name="size" value="${product.size}">
  			<input type="hidden" name="price" value="${product.price}">
			<input type="submit" value="View Product">
  			</form> 
	</td></tr>
	</c:forEach>
        </tbody>
</table>
</div>
</c:if>
<%@include file="footer.jsp" %>
</body>
</html>