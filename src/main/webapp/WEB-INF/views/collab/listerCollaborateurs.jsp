<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">

<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">



<title>SGP - App</title>

</head>
<body>
		
<div class="container">	
<h2>Les collaborateurs</h2>	
		<table class="table table-hover">
				<thead>	
					<tr>
							<th>Matricule</th>
							<th>Nom</th>
							<th>Prénom</th>
							<th>Adresse</th>
							<th>Date de Naissance</th>
							<th>Email Pro</th>
							<th>Numéro de sécurité sociale</th>
							<th>Date/Heure de création</th>
							<th>Etat</th>
							<th>Photo</th>
					</tr>
				</thead>
				
				<tbody>	
					<c:forEach var="collab" items="${listeCollaborateurs}"  >
					 	<tr>
						 	<td>${collab.matricule}</td>
							<td>${collab.nom}</td>
							<td>${collab.prenom}</td>
							<td>${collab.adresse}</td>
							<td>${collab.dateNaissance}</td>
							<td>${collab.emailPro}</td>
							<td>${collab.numSecure}</td>
							<td>${collab.dateHeureCreation}</td>
							<td>${collab.actif}</td>
							<td><img alt="asian-man" src="<%=request.getContextPath()%>/images/asian-man.png"></td>
						</tr>
				 
					</c:forEach>
				</tbody>			
						
						
		</table>	
</div>
		



</body>
</html>