<%@include file="header.jsp" %>
<body>
<div id="explore" style="background-color:#0000b3;">
<h1><center><span style="font-size:300%;color:white;">Manage Categories</span></center></h1>
</div>
<br>

<div style="background-color:white;padding-top: 20px;padding-bottom: 20px;">
<h2><center>CATEGORY LIST</center></h2>

<c:if test="${!empty categorylist}">

    <div class="table-responsive">
    <table class="table table-striped table-bordered w3-blue">
    <thead>
    <tr>
        <th>ID</th>
        <th>Name</th>
        <th>Description</th>
        <th>Edit</th>
        <th>Delete</th>
    </tr>
    </thead>
    <tbody>
    
    <c:forEach items="${categorylist}" var="category">
        <tr>
            <td>${category.id}</td>
            <td>${category.name}</td>
            <td>${category.description}</td>
            <td><a href="<c:url value='/cedit/${category.id}'></c:url>">Edit</a></td>
            <td><a href="<c:url value='/cdelete/${category.id}'></c:url>">Delete</a></td>        
            
        </tr>
    </c:forEach>
    <tbody>
    </table>
 </div>
</c:if>
<center>ADD NEW CATEGORY</center><hr>
<c:url var="addAction" value="/category/add"></c:url>
<div class="container">
	<div class="row" style="overflow-x:auto;">
	<div class=col-xs-2></div>
	<div class="col-xs-8" style="overflow-x:auto;">
	<form:form action="${addAction}" commandName="category" modelAttribute="category" method="POST" >
	<table   width="80%" >
    <c:if test="${!empty category.name}">
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
            <form:label path="description">
                <spring:message text="Description"/>
            </form:label>
        </td>
        <td width="25%">
            <form:input path="description" />
        </td> 
        <td width="30%"><form:errors path="description" cssStyle="color: #ff0000;"/></td>
        
    </tr>
    
    <tr>
        <td colspan="2">
            <c:if test="${!empty product.name}">
                <input type="submit"
                    value="<spring:message text="Edit Category"/>" />
            </c:if>
            <c:if test="${empty product.name}">
                <input type="submit"
                    value="<spring:message text="Add Category"/>" />
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