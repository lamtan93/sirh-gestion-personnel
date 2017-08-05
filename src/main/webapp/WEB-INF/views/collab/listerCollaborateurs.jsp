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
<script src="https://ajax.googleapis.com/ajax/libs/jquery/3.2.1/jquery.min.js"></script>
<link rel="stylesheet" href="<%=request.getContextPath()%>/css/monStyle.css">
<link rel="stylesheet" href="<%=request.getContextPath()%>/js/monJs.js">

<title>SGP - App</title>
<c:import url="/index.html"/>
</head>
<body>

 	
<!-- ---------------------------------Barre de recherche-------------------------- -->

	<div class="container">
	<div class="zoneRecherche">
		<div class="row">
			<div class="col-lg-4">
				<div class="infosGaucheRecherche">
					<span>Rechercher un nom ou un prénom qui commence par</span>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="infosDroiteRecherche">
					<input type="text" name="inputRecherche" placeholder="Nom || Prénom*" class="form-control">
				</div>
			</div>
			<div class="col-lg-2">
			<div class="buttonRecherche">
				<button type="submit" class="btn btn-primary btn-success">Rechercher</button>
			</div>
			</div>
			<div class="col-lg-3">
				<div class="infosDroiteVoirCollabActive">
						<label class="checkbox-inline">
					      	<input type="checkbox" value="">
					      	<span>Voir les collaborateurs désactivés</span>
					    </label>
				
						
				</div>
			</div>
		</div>

		<div class="row">
			<div class="col-lg-4">
				<div class="infosGaucheRecherche">
					<span>Filtrer par département</span>
				</div>
			</div>


			<div class="col-lg-3">
				<div class="infosDroiteRecherche">
					
						<select class="form-control" id="sel1">
					        <option>Comptabilité</option>
					        <option>Ressources humaines</option>
					        <option>Informatique</option>
					    </select>
				</div>

			</div>
		</div>

	</div>
	
</div>

<!-- ---------------------------Fin de zone de Recherche------------------------------------- -->

<!-- ---------------------------Mise a jour interface---------------------------------------- -->

<div class="container">	
<h2>Les collaborateurs</h2>	
	<div class="row">
<c:forEach var="collab" items="${listeCollaborateurs}"  >	
	<div class="col-lg-4">
		<div class="myBox">
			<div class="nomPrenom">
				<span>${collab.nom}</span>
				<span>${collab.prenom}</span>
			</div>
			<hr>
			<div id="image"><img src="<%=request.getContextPath()%>/images/dev_man_young.png"></div>
			<div class="actions">
				<div class="buttonAction"><a href="#">More</a></div>
				<div class="buttonAction"><a href="/sgp/collaborateurs/editer?matriculeCollab=${collab.matricule}">Edit</a></div>
			</div>
		<div class="divInfos">
			<div class="infosGauche">
				<span>Fonction</span><br>
				<span>Département</span><br>
				<span>Email</span><br>
				<span>Tél</span>
			</div>

			<div class="infosDroite">
				<span>${collab.intitulePoste}</span><br>
				<span>${collab.departement.nom}</span><br>
				<span>${collab.emailPro}</span><br>
				<span>075429654</span>
			</div>
		</div>
		</div>
	</div>
</c:forEach>
	</div>
</div>



</body>
</html>