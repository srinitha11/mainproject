<%@ page language="java" contentType="text/html"%>

<meta name="viewport" content="width=device-width, initial-scale=1">
  <link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/css/bootstrap.min.css">
  <script src="https://ajax.googleapis.com/ajax/libs/jquery/3.5.1/jquery.min.js"></script>
  <script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.4.1/js/bootstrap.min.js"></script>

<html>
<head>




</style>
<style type="text/css">

body {
  margin: 0;
  padding: 0;
  background-color: #17a2b8;
  height: 100vh;
}
#login .container #login-row #login-column #login-box {
  margin-top: 120px;
  max-width: 600px;
  height: 320px;
  border: 1px solid #9C9C9C;
  background-color: #EAEAEA;
}
#login .container #login-row #login-column #login-box #login-form {
  padding: 20px;
}
#login .container #login-row #login-column #login-box #login-form #register-link {
  margin-top: -85px;
}
</style>
</head>
<body>
<c:set var="flag" value="0"/>
<nav class="navbar navbar-inverse navbar-fixed-top">
  <div class="container-fluid">
    <div class="navbar-header">
      <button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#myNavbar">
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
        <span class="icon-bar"></span>
      </button>
      <a class="navbar-brand" href="#">Shoppingbee</a>
    </div>
    <div class="collapse navbar-collapse" id="myNavbar">
      <ul class="nav navbar-nav">
        <li class="active"><a href="index">Home</a></li>
        <c:if test="${flag==0}" >
        <li><a href="signIn">Login</a></li>
        <li><a href="signUp">Register</a></li>
        <li><a href="aboutus">About Us</a></li>
        <li><a href="contactus">Contact Us</a></li>
        </c:if>
         
          <c:if test="${flag==1}">
        <li><a href="showCategory">Manage Category</a></li>
            <li><a href="showProduct">Manage product</a></li>
              <li><a href="showSupplier">Manage Supplier</a></li>
            
         </c:if>
      
      </ul>
      <ul class="nav navbar-nav navbar-right">
        <li><a href="signUp"><span class="glyphicon glyphicon-user"></span> Sign Up</a></li>
        <li><a href="signIn"><span class="glyphicon glyphicon-log-in"></span> SignIn</a></li>
      </ul>
    </div>
  </div>
</nav>
</body>
</html>