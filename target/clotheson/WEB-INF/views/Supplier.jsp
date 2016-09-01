<%@include file="header.jsp" %>
<body>
<div id="explore" style="background-color:#0000b3;">
<h1><center><span style="font-size:300%;color:white;">Manage Suppliers</span></center></h1>
</div>
<br>
<div style="background-color:white;padding-top: 20px;padding-bottom: 20px;">
<h2><center>SUPPLIER LIST</center></h2>

<c:if test="${!empty supplierlist}">

    <div class="table-responsive">
    <table class="table table-striped table-bordered w3-blue">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Contact</th>
        <th>Address</th>
        
         <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    <c:forEach items="${supplierlist}" var="supplier">
        <tr>
            <td>${supplier.id}</td>
            <td>${supplier.name}</td>
            <td>${supplier.contact}</td>
            <td>${supplier.address}</td>
            <td><a href="<c:url value='/sedit/${supplier.id}'></c:url>">Edit</a></td>         
            <td><a href="<c:url value='/sdelete/${supplier.id}'></c:url>">Delete</a></td>
        </tr>
    </c:forEach>
    <tbody>
    </table>
 </div>
</c:if>
<center>ADD NEW SUPPLIER</center><hr>
<c:url var="addAction" value="/supplier/add"></c:url>
<div class="container">
	<div class="row" style="overflow-x:auto;">
	<div class=col-xs-2></div>
	<div class="col-xs-8" style="overflow-x:auto;">
	<form:form action="${addAction}" commandName="supplier" modelAttribute="supplier" method="POST" >
	<table   width="80%" >
    <c:if test="${!empty supplier.name}">
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
            <form:label path="contact">
                <spring:message text="Contact"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="contact" />
        </td> 
        <td width="30%"><form:errors path="contact" cssStyle="color: #ff0000;"/></td>
        
    </tr>
    <tr>
        <td width="25%">
            <form:label path="address">
                <spring:message text="Address"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="address" />
        </td> 
        <td width="30%"><form:errors path="address" cssStyle="color: #ff0000;"/></td>
        
    </tr>
    
    <tr>
        <td colspan="2">
            <c:if test="${!empty supplier.name}">
                <input type="submit"
                    value="<spring:message text="Edit Supplier"/>" />
            </c:if>
            <c:if test="${empty supplier.name}">
                <input type="submit"
                    value="<spring:message text="Add Supplier"/>" />
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

</div>
</body>
</html>