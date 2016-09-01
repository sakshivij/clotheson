<%@include file="header.jsp" %> 
<body>
<div align="center" style="background-color:white;width:100%;text-align:center;">
<form:form action="register" method="get" commandName="userRegister" modelAttribute="userRegister">
<table border="0">
<tr>
<td colspan="2" align="center"><h2>Please fill your personal details</h2></td><hr>
</tr>
</table>
<div class="row" >
			<div class=col-xs-4><form:label path="fname"><spring:message text="First Name"/></form:label></div>
			<div class=col-xs-6><form:input path="fname"/></div>
			<div class=col-xs-2><form:errors path="fname" cssStyle="color: #ff0000;"/></div>
	</div>
	<div class="row">		
			<div class=col-xs-4><form:label path="lname"><spring:message text="Last Name"/></form:label></div>
			<div class=col-xs-6><form:input path="lname"/></div>
		<div class=col-xs-2><form:errors path="lname" cssStyle="color: #ff0000;"/></div>
				
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="age"><spring:message text="Age"/></form:label></div>
			<div class=col-xs5><form:input path="age"/></div>
			<div class=col-xs-3><form:errors path="age" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="contact"><spring:message text="Contact no"/></form:label></div>
			<div class=col-xs-6><form:input path="contact"/></div>
						<div class=col-xs-2><form:errors path="contact" cssStyle="color: #ff0000;"/></div>
		</div>
		
			<div class="row">
			<div class=col-xs-4><form:label path="gender"><spring:message text="Gender"/></form:label></div>
			<div class=col-xs-6> 
			 <form:select path="gender">
				<form:option value="" label="--- Select ---" />
				<form:option value="Male">Male</form:option>
				<form:option value="Female">Female</form:option>
		  </form:select>
			</div>
		  			<div class=col-xs-2><form:errors path="gender" cssStyle="color: #ff0000;"/></div>
           
           
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="address"><spring:message text="Address"/></form:label></div>
			<div class=col-xs-6><form:input path="address"/></div>
						<div class=col-xs-2><form:errors path="address" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="city"><spring:message text="City"/></form:label></div>
			<div class=col-xs-6><form:input path="city"/></div>
						<div class=col-xs-2><form:errors path="city" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="state"><spring:message text="State"/></form:label></div>
			<div class=col-xs-6><form:input path="state"/></div>
						<div class=col-xs-2><form:errors path="state" cssStyle="color: #ff0000;"/></div>
		</div>
			<div class="row">
			<div class=col-xs-4><form:label path="email"><spring:message text="Email"/></form:label></div>
			<div class=col-xs-6><form:input path="email"/></div>
						<div class=col-xs-2><form:errors path="email" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
			<div class=col-xs-4><form:label path="username"><spring:message text="UserName"/></form:label></div>
			<div class=col-xs-6><form:input path="username"/></div>
						<div class=col-xs-2><form:errors path="username" cssStyle="color: #ff0000;"/></div>
		</div>
		<div class="row">
		<div class="col-xs-4"><form:label path="password"><spring:message text="password"></spring:message></form:label></div>
		<div class="col-xs-6"><form:input path="password"/></div>
					<div class=col-xs-2><form:errors path="password" cssStyle="color: #ff0000;"/></div>
		</div>
		<br>
		
		<div class="row">
			<div class=col-xs-4></div>
		    <div class=col-xs-6><input type="submit" value="<spring:message text="ADD USER"/>"></div>
		    
		</div>


</form:form>
</div>
<br><br><%@include file="footer.jsp" %>
</body>
</html>



