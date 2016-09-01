<%@include file="header.jsp" %>
<body>
<div class="row">
<div class="col-md-6">
<img src="${img}aa8.jpg" style="margin-top:0px;padding-top:0px;" with="100%" height="30%">
</div>
<div class="col-md-6">
<div class="center">
<form:form action="userlogin" commandName="endUser" modelAttribute="endUser" method="post">
<table align="center">
<tr>
<td><form:label path="username"><spring:message text="USERNAME" ></spring:message></form:label></td>
<td><form:input path="username"/></td>
</tr>
<tr>
<td><form:label path="username"><spring:message text="PASSWORD" ></spring:message></form:label></td>
<td><form:password path="password"/></td>
</tr>
<tr>
<td><input type="submit" value="Login" style="align:center;"></input></td>
</tr>
</table>
</form:form>
</div>
</div>
</div><br><br><br>
<%@include file="footer.jsp" %>
</body>
</html>