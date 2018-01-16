<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Insert title here</title>
<link
	href="${pageContext.request.contextPath}/resources/css/bootstrap2.css"
	rel="stylesheet" />
<link
	href="${pageContext.request.contextPath}/resources/css/starter-template2.css"
	rel="stylesheet" />
<script
	src="${pageContext.request.contextPath}/resources/js/jquery-2.1.4.min.js"
	type="text/javascript"></script>
<script
	src="${pageContext.request.contextPath}/resources/js/bootstrap.min.js"></script>

</head>
<body>

	<h1>Liste des clients</h1>


	<div class="container">
		<table class="table table-striped">

			<%-- 			<c:forEach var="client" items="${clients}">    --%>
			<!-- 			<tr scope="row"> -->
			<!-- 					<td scope="col">Nom</td> -->
			<%-- 					<td><c:out value="${client.nom}" /></td> --%>
			<!-- 				</tr> -->

			<!-- 				<tr scope="row"> -->
			<!-- 					<td scope="col">Prenom</td> -->
			<%-- 					<td><c:out value="${client.prenom}" /></td> --%>
			<!-- 				</tr> -->

			<!-- 				<tr scope="row"> -->
			<!-- 					<td scope="col">Email</td> -->
			<%-- 					<td><c:out value="${client.email}" /></td> --%>
			<!-- 				</tr> -->

			<!-- 				<tr scope="row"> -->
			<!-- 					<td scope="col">Adresse</td> -->
			<%-- 					<td><c:out value="${client.adresse}" /></td> --%>
			<!-- 				</tr> -->


			<!-- 				<tr scope="row"> -->
			<!-- 					<td scope="col">solde</td> -->
			<%-- 					<td><c:out value="${compte.solde}" /></td> --%>
			<!-- 				</tr> -->




			<br>
			<br>
			<br>
			<br>
			<br>
			<br>

			<c:forEach var="client" items="${clients}">

				<!-- 					<td scope="col">Nom</td> -->

				<button type="reset" class="btn btn-primary btn-lg">Afficher
					le client</button>

				<tr scope="row">
					<td><c:out value="${client.nom}" /></td>
				</tr>

				<tr scope="row">
					<!-- 					<td scope="col">Prenom</td> -->
					<td><c:out value="${client.prenom}" /></td>
					<br>
					<br>
				</tr>
		</table>
		</c:forEach>

		<br>
		<br> <br>
		<br> Pour ajouter un nouveau client cliquez sur le bouton suivant
		:
		<button type="reset" class="btn btn-primary btn-lg">Ajouter
			un nouveau clientt</button>






	</div>
</body>
</html>