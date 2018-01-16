
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/css/starter-template.css"
	rel="stylesheet" />
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</head>
<body>

	<h3>Veuillez remplir le formulaire suivant :</h3>

	<form action="/addClient" method="Post">


		<tr scope="row">
			<td scope="col">Nom :</td>
			<td><input name="nom" required="required" /></td>
		</tr>
		<br>
		<br>
		<br>



		<td scope="col">Prenom :</td>
		<td><input name="prenom" required="required" /></td>
		</tr>
		<br>
		<br>
		<br>
		<td scope="col">Email :</td>
		<td><input name="email" required="required" /></td>
		</tr>
		<br>
		<br>
		<br>
		<td scope="col">Adresse :</td>
		<td><input name="adresse" required="required" /></td>
		</tr>
		<br>
		<br>
		<br> <a href="${pageContext.request.contextPath}/displayClients">
			<button type="submit">Valider</button>
		</a>

	</form>







</body>
</html>