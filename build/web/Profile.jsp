<%-- 
    Document   : Prrofile
    Created on : 14/10/2017, 06:59:41 PM
    Author     : Daniel Nempeque
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
	    <meta http-equiv="content-type" content="text/html; charset=UTF-8">
	    <title>Pet Me</title>	
		<meta name="viewport" content="width=device-width, initial-scale=1">


		<link rel="stylesheet" href="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/css/bootstrap.min.css">
		<link rel="stylesheet" href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
		<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
		<script src="https://maxcdn.bootstrapcdn.com/bootstrap/3.3.7/js/bootstrap.min.js"></script>


		<script type="text/javascript" src="js/modal.js"></script>
		<link rel="stylesheet" type="text/css" href="css/_navbar.css">
		<link rel="stylesheet" type="text/css" href="css/_style.css">
		<link rel="stylesheet" type="text/css" href="css/_profile.css">
	</head>
    <body>
        <nav class="navbar navbar-inverse" style="height: 10%">
		<div class="container-fluid">
		<!-- Media menu button-->

                <div class="navbar-header" style="width: 20%">
				<button type="button" class="navbar-toggle" data-toggle="collapse" data-target="#MyNavbar" >
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
					<span class="icon-bar"></span>
				</button>
                    <a class="navbar-brand" href="index.jsp"> <img class="LogoPrincipal" src="img/Recurso4PerrituNegro.png" width="40%" ></a>
				
			</div>	

		<!-- end media menu button-->

			<div class="collapse navbar-collapse" id="MyNavbar">
				<ul class="nav navbar-nav navbar-right ">
					<li><a href="Shop.jsp">Tienda <i class="fa fa-shopping-cart" aria-hidden="true"></i></a></li>
					<li><a href="Profile.jsp">Perfil <i class="fa fa-user" aria-hidden="true"></i></a></li>
					<button type="button" class="btn btn-primary btn-lg" onClick="window.location.href='login.jsp'">Login <i class="fa fa-sign-in" aria-hidden="true"></i></button>
					<button type="button" class="btn btn-default btn-lg" onClick="window.location.href='Register.jsp'">Register</button>
				</ul>			
									
			</div>
		</div>
	</nav>

	<div class="container-fluid">
            <div class="row content" style="padding: 1%">
            <div class="col-sm-3 sidenav hidden-xs" style="margin-top: 5%; padding: 25px; background-color:#f2f2f2; ">
                <h2 class="text-center">Pet Naimu</h2>
                <img src="img/profile.jpg" alt="" class="img-responsive img-circle center-block" width="60%">
          </div>
          <br>

          <div class="col-sm-9">
            <div class="well">
              <h4>Dashboard</h4>
              <p>Some text..</p>
            </div>
            <div class="row">
              <div class="col-sm-3">
                <div class="well">
                  <h4>Users</h4>
                  <p>1 Million</p> 
                </div>
              </div>
              <div class="col-sm-3">
                <div class="well">
                  <h4>Pages</h4>
                  <p>100 Million</p> 
                </div>
              </div>
              <div class="col-sm-3">
                <div class="well">
                  <h4>Sessions</h4>
                  <p>10 Million</p> 
                </div>
              </div>
              <div class="col-sm-3">
                <div class="well">
                  <h4>Bounce</h4>
                  <p>30%</p> 
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-sm-4">
                <div class="well">
                  <p>Text</p> 
                  <p>Text</p> 
                  <p>Text</p> 
                </div>
              </div>
              <div class="col-sm-4">
                <div class="well">
                  <p>Text</p> 
                  <p>Text</p> 
                  <p>Text</p> 
                </div>
              </div>
              <div class="col-sm-4">
                <div class="well">
                  <p>Text</p> 
                  <p>Text</p> 
                  <p>Text</p> 
                </div>
              </div>
            </div>
            <div class="row">
              <div class="col-sm-8">
                <div class="well">
                  <p>Text</p> 
                </div>
              </div>
              <div class="col-sm-4">
                <div class="well">
                  <p>Text</p> 
                </div>
              </div>
            </div>
          </div>
        </div>
      </div>
      </div>		
</body>
</html>
