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
				<legend class="text-center">Modification des données du client ${idClient}</legend>
		      	<div class="col-md-12 col-md-offset-2">
		        	<div class="col-md-9 text-left">
				        <fieldset>
					        <!-- nom input-->
				            	Voici l'ancien nom de votre client : ${ancien_nom_client}<br>
				            	<form class="form-horizontal" method="post" action="option_conseiller" >
						            <div class="form-group">
						              <div class="col-md-9">
						                <input id="name" name="login" type="text" placeholder="nouveau_nom_client" class="form-control">
						              </div>
						            </div>
		          				
						    <!-- prenom input-->	
				            	Voici l'ancien prénom de votre client : ${ancien_prenom_client}
				            	
			            		    <div class="form-group">
						              <div class="col-md-9">
						                <input id="name" name="login" type="text" placeholder="nouveau_prenom_client" class="form-control">
						              </div>
						            </div>
		          				
					        <!-- mail input-->
				            	Voici l'ancien email de votre client : ${ancien_mail_client}<br><br>
				            	
					      	        <div class="form-group">
						              <div class="col-md-9">
						                <input id="name" name="login" type="text" placeholder="nouveau_mail_client" class="form-control">
						              </div>
						            </div>
		          				
					        <!-- adresse input-->
				            	Voici l'ancienne adresse de votre client : ${ancienne_adresse_client}<br><br>
				            	
					                <div class="form-group">
						              <div class="col-md-9">
						                <input id="name" name="login" type="text" placeholder="nouvelle_adresse_client" class="form-control">
						              </div>
						            </div>
		          				</form>
					            <!-- button actions -->
					            <div class="form-group">
					              	<div class="col-md-12 text-right">
					                	<form method="get" action="option_maj_infos_client_confirmation.jsp">
						                	<button type="reset" class="btn btn-primary btn-lg">Recommencer</button>
						                	<button type="submit" class="btn btn-primary btn-lg">Valider</button>
						                </form>
					              	</div>
					            </div>
				       	</fieldset>
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