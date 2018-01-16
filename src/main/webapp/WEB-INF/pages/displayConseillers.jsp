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


<h1>Liste des Conseillers</h1>


<div class="container">
		<table class="table table-striped">

			<c:forEach var="conseillers" items="${conseillers}">   
						
						<td scope="col">Nom</td>
						<td><c:out value="${conseiller.nom}" /></td>
						
						<td scope="col">Prenom</td>
						<td><c:out value="${conseiller.prenom}" /></td>
			</c:forEach>					
</table>

</div>
</body>
</html>
