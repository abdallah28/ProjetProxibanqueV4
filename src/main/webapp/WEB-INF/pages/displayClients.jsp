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

						<c:forEach var="client" items="${clients}">   
																
							<tr scope="row">
								<td scope="col"></td>
								<td><c:out value="${client.nom}" /></td>
							</tr>

							<tr scope="row">
								<td scope="col"></td>
								<td><c:out value="${client.prenom}" /></td>
							</tr>

							<tr scope="row">
								<td scope="col"></td>
								<td><c:out value="${client.email}" /></td>
							</tr>

							<tr scope="row">
								<td scope="col"></td>
								<td><c:out value="${client.adresse}" /></td>
							</tr>

							
				<!-- 					
							<tr scope="row">
								<td scope="col">solde</td>
								<td><c:out value="${compte.solde}" /></td>
							</tr>
				-->
							<tr>
							<a href="diplayClient/${client.id}"> afficher le client </a>
							</tr>
						<br>	
		</table>
		</c:forEach>
		<br>
		<br> 
		<br> Pour ajouter un nouveau client cliquez sur le bouton suivant:
		<a href="addClient">Ajouter
			un nouveau client</a>






	</div>
</body>
</html>