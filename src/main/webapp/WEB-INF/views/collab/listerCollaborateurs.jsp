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
<c:import url="/index.html"/>
</head>
<body>
		
<div class="container">	
<h2>Les collaborateurs</h2>	
		<table class="table table-hover">
				<thead>	
					<tr>
							
							<th>Nom</th>
							<th>Prénom</th>
							<th>Email Pro</th>
							<th>Fonction</th>
							<th>Adresse</th>
							<th>Departement</th>
							<th>Photo</th>
							<th>Action</th>
							
					</tr>
				</thead>
				
				<tbody>	
					<c:forEach var="collab" items="${listeCollaborateurs}"  >
					 	<tr>
						 	
							<td>${collab.nom}</td>
							<td>${collab.prenom}</td>
							<td>${collab.emailPro}</td>
							<td>${collab.intitulePoste}</td>
							<td>${collab.adresse}</td>
							<td>${collab.departement.nom}</td>
							<td><img alt="asian-man" src="<%=request.getContextPath()%>/images/asian-man.png"></td>
							<td><a href="/sgp/collaborateurs/editer?matriculeCollab=${collab.matricule}">Editer</a></td>
						</tr>
				 
					</c:forEach>
				</tbody>			
						
						
		</table>	
</div>
		



</body>
</html>