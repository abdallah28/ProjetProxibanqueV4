<!DOCTYPE html>

<html>
<head>
	<meta charset="utf-8">
	<title> Proxibanque V2 </title>
	<!-- font -->
	<link href="font-family: 'Roboto', sans-serif;" >
	<!-- css -->
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/resources/css/style.css">


</head>

<!-- contenu du site -->
<body>
	<!-- header -->
	<header class="container-fluid header">
		<div class="container">
			<a href="#" class="logo">Proxibanque V2</a>
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
			<img src=""${pageContext.request.contextPath}/resources/img/ban1.jpg" alt="banniere du site">	

		</div>
	</section>
	<!-- end banniere -->

	<!-- a propos -->	
	<section class="container-fluid about">
		<div class="container">
			<div class="row">
				<legend class="text-center">Login effectué</legend>
		      <div class="col-md-10 col-md-offset-3">
		        <div class="well well-sm">
		        	Bonjour, vous voici login dans l'application proxibanque.<br/>
		        </div>
		        <div class="form group">
		          <form class="form-horizontal" method="get" action="options_conseiller.jsp" >
		          	<button type="submit" class="btn btn-primary btn-lg"> Suivant </button>
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