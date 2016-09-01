<%@include file="header.jsp" %>
<body>

<div id="explore" style="background-color:#0000b3;">
<h1><center><span style="font-size:300%;color:white;"> Welcome Admin!</span></center></h1>
</div>

<div class="admin">
<a href="${session.getContextPath()}/clotheson/logout" style="float:right;text-decoration:none;color:white;"> Logout</a><br><br>
<a href="${session.getContextPath()}/clotheson/manageproducts">MANAGE PRODUCTS</a><br><a href="${session.getContextPath()}/clotheson/managecategories">MANAGE CATEGORIES</a><br><a href="${session.getContextPath()}/clotheson/managesuppliers">MANAGE SUPPLIERS</a>
</div>
<br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>