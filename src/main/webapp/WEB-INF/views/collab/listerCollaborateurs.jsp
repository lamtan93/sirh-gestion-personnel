<%@page import="dev.sgp.entite.Collaborateur"%>
<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
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
				<%
					List<Collaborateur> listeCollaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
					if(!listeCollaborateurs.isEmpty()){
					for (Collaborateur collab : listeCollaborateurs) {
				%>
				 	<tr>
					 	<td><%= collab.getMatricule() %></td>
						<td><%= collab.getNom() %></td>
						<td><%= collab.getPrenom() %></td>
						<td><%= collab.getAdresse() %></td>
						<td><%= collab.getDateNaissance() %></td>
						<td><%= collab.getEmailPro() %></td>
						<td><%= collab.getNumSecure() %></td>
						<td><%= collab.getDateHeureCreation() %></td>
						<td><%= collab.isActif() %></td>
						<td><img alt="asian-man" src="<%=request.getContextPath()%>/images/asian-man.png"></td>
					</tr>
				 
				
				</tbody>			
						
						
		</table>	
</div>
		<%
					}
		}else{
		%>
		
		<h3>Aucun collaborateurs</h3>
		<% 	
		}
		%>



</body>
</html>