<!DOCTYPE html>
<html>
<head>
	<meta charset="utf-8">
	<title> Proxibanque V2 </title>
	<!-- font -->
	<link rhref="font-family: 'Roboto', sans-serif;" >
	<!-- css -->
	<link rel="stylesheet" type="text/css" href="css/bootstrap.min.css">
	<link rel="stylesheet" type="text/css" href="css/style.css">


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
			<img src="img/ban1.jpg" alt="banniere du site">	

		</div>
	</section>
	<!-- end banniere -->

	<!-- a propos -->	
	<section class="container-fluid about">
		<div class="container">
			<div class="row">
		      <div class="col-md-12 col-md-offset-2">
		        <div class="col-md-9 text-right">
		        	<h1>
		        	liste des clients 
		        	</h1><br><br>
		        </div>
		      </div>

		      <div class="col-md-12 col-md-offset-2">
		        <div class="col-md-9 text-right">
		        	<form method="get" action="option_maj_infos_client.jsp">
		            <button type="submit" class="btn btn-primary btn-lg">Mise à jour des infos clients</button><br><br>
		            </form>
		            <form method="get" action="option_liste_compte.jsp">
		            <button type="submit" class="btn btn-primary btn-lg">Liste des comptes clients</button><br><br>
		            </form>
		            <form method="get" action="option_virement_accueil.jsp">
		            <button type="submit" class="btn btn-primary btn-lg">Virement de compte à compte</button><br><br>
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