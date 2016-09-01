<%@include file="header.jsp" %>
<body>
<div class="container" style="width:50%;align:center;background-color:white;">
<form  action="login" method="post">
        <h2>Please sign in</h2>
        <label for="inputEmail" class="sr-only">Username</label>
        <input type="text" name="userid" class="form-control" placeholder="Enter Username" required autofocus>
        <label for="inputPassword" class="sr-only">Password</label>
        <input type="password" name="password" class="form-control" placeholder="Password" required>
        <div class="checkbox">
          <label>
            <input type="checkbox" value="remember-me"> Remember me
          </label>
        </div>
        <button class="btn btn-lg btn-primary btn-block" type="submit">Sign in</button>
      </form>
   </div>
   <br><%@include file="footer.jsp" %>
</body>
</html>