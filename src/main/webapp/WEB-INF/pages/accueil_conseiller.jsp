<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Proxibanque V3 </title>
	<!-- font -->
	<link rhref="font-family: 'Roboto', sans-serif;" />
	
	<!-- css -->
	<link rel="stylesheet"  href="${pageContext.request.contextPath} resources/css/bootstrap.min.css"/>
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css"/>

</head>

<!-- contenu du site -->
<body>
	<!-- header -->
	<header class="container-fluid header">
		<div class="container">
			<a href="#" class="logo">Proxibanque V3</a>
			<nav class="menu">
				<a href="#"> Accueil </a>
				<a href="#about"> Qui nous sommes </a>
				<a href="#contact"> Contact </a>
			</nav>
		</div>
	</header>
	<!-- end header -->

	<!-- banniere -->
	<section class="container-fluid banner">
		<div class="ban">
			<img src="${pageContext.request.contextPath}/resources/img/ban1.jpg" alt="banniere du site">	
		</div>
	</section>
	<!-- end banniere -->

	<!-- a propos -->	
	<section class="container-fluid about">
		<div class="container">
			<div class="row">
		      <div class="col-md-6 col-md-offset-3">
		        <div class="well well-sm">
		          <form class="form-horizontal" method="post" action="ServletAuthentification">
		          <fieldset>
		            <legend class="text-center">Login conseiller</legend>
		    
		            <!-- login input-->
		            <div class="form-group">
		              <label class="col-md-3 control-label" for="name"> Login </label>
		              <div class="col-md-9">
		                <input id="login" name="login" type="text" placeholder="Votre login" class="form-control">
		              </div>
		            </div>
		    
		            <!-- password input-->
		            <div class="form-group">
		              <label class="col-md-3 control-label" for="password"> Mot de passe </label>
		              <div class="col-md-9">
		                <input id="password" name="password" type="password" placeholder="Votre mot de passe" class="form-control">
		              </div>
		            </div>
		    
		            <!-- button actions -->
		            <div class="form-group">
		              	<div class="col-md-12 text-right">
		                	<button type="reset" class="btn btn-primary btn-lg">Recommencer</button>
		                	<button type="submit" class="btn btn-primary btn-lg">Valider</button>
		              	</div>
		            </div>
		          </fieldset>
		          </form>
		        </div>
		      </div>
			</div>
		</div>
	</section>
	<!-- end a propos -->	

	<!-- footer/contact -->	
	<footer class="container-fluid contact">
		<div class="container">
		<p>
			Copyright (c) 2017 Copyright Holder All Rights Reserved.
		</p>
		</div>
	</footer>
	<!-- end footer/contact -->	

</body>
</html>