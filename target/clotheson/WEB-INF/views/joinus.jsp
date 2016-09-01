    <%@include file="header.jsp" %>
<body>

<br><br>
<div class="container" style="background-color:white">
<div class="row">
    <div class="col-md-6">
        <img alt="img" src="${img}cl10.jpg"  height="410px" width="400px" style="padding-right:20px;padding-left:40px;padding-top:30px;padding-bottom:10px;">
			
    </div>
    <div class="col-md-6" style="padding-left:10px;">
 	<br><br>   
        <span style="font-size:40px;fontfamily:Comic Sans, Comic Sans MS, cursive;padding-top:30px;color:black;"><a href="${session.getContextPath()}/clotheson/userloginpage" style="text-decoration:none;font-family:arial;color:black;">EXISTING USER?</a></span><br><h1><span style="font-family:arial-black bold;color:#cb3434;">OR</span></h1><br><a href="${session.getContextPath()}/clotheson/registerhere" style="font-size:40px;fontfamily:Comic Sans, Comic Sans MS, cursive;color:black; text-decoration:none;">REGISTER HERE..!
    </div>
   
</div>
</div><br><br>
<%@include file="footer.jsp" %>
</body>
</html>