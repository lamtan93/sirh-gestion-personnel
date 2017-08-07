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
<script src="<%=request.getContextPath()%>/js/monJs.js"></script>
<!-- Jquery UI -->

  <link rel="stylesheet" href="//code.jquery.com/ui/1.12.1/themes/base/jquery-ui.css">
  <link rel="stylesheet" href="/resources/demos/style.css">
  <script src="https://code.jquery.com/jquery-1.12.4.js"></script>
  <script src="https://code.jquery.com/ui/1.12.1/jquery-ui.js"></script>
<!-- ---- -->


<title>SGP - App</title>
<c:import url="/index.html"/>
</head>
<body>
<!-- table Collab Details -->

<div id="tableMore">
	
	<div class="container">
	  <h2>Détail du collaborateur</h2>         
	  <table class="table table-bordered">
    <thead>
      <tr>
		    <th>Nom</th>
		     <th>Prenom</th>
		     <th>Poste</th>
		     <th>Departement</th>
	         <th>Matricule</th>
	         <th>Banque</th>
	         <th>Bic</th>
	         <th>Iban</th>
	         <th>No Secure</th>
	         <th>Etat</th>
	         <th>Adresse</th>
	         <th>Date de création</th>
      </tr>
    </thead>
    <tbody>
     
     <tr>
        <td>${collabMore.nom}</td>
        <td>${collabMore.prenom}</td>
        <td>${collabMore.intitulePoste}</td>
        <td>${collabMore.departement.nom}</td>
        <td>${collabMore.matricule}</td>
        <td>${collabMore.banque}</td>
        <td>${collabMore.bic}</td>
        <td>${collabMore.iban}</td>
        <td>${collabMore.numSecure}</td>
        <td>${collabMore.actif}</td>
        <td>${collabMore.adresse}</td>
        <td>${collabMore.dateHeureCreation}</td>
     </tr>
    </tbody>
  </table>
</div>
</div>
<!--  --> 	
<!-- ------------------------------Barre de recherche-------------------------- -->

	<div class="container">
	<div class="zoneRecherche">
	<form  accept-charset="UTF-8">
		<div class="row">
			<div class="col-lg-4">
				<div class="infosGaucheRecherche">
					<span>Rechercher un nom ou un prénom qui commence par</span>
				</div>
			</div>
			<div class="col-lg-3">
				<div class="infosDroiteRecherche">
					<input type="text" id="inputRecherche" name="inputRecherche" placeholder="Nom || Prénom*" class="form-control">
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
			
			<div class= "col-lg-3" >
				<div class= "infosDroiteRecherche" >
						<select class="form-control" id="choixSelected" name="choixSelected" >
							<optgroup label = "Departement*" >
					        <option value="Comptabilité">Comptabilité</option>
					        <option value="Resssources humaines">Ressources humaines</option>
					        <option value="Informatique">Informatique</option>
					        </optgroup>
					    </select>
				</div>
			</div>
		</div>
		</form>
	</div>
	
</div>
<!-- -------------------------------------Fin de zone de Recherche----------------------------------------------------------- -->

<!-- -------------------------------------Mise a jour interface-------------------------------------------------------------- -->
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
				<div  class="buttonAction"><a id="buttonDetail" href="/sgp/collaborateurs/lister?matriculeCollabMore=${collab.matricule}">More</a></div>
				<div class="buttonAction"><a href="/sgp/collaborateurs/editer?matriculeCollab=${collab.matricule}">Edit</a></div>
			</div>
		<div class="divInfos">
			<div class="infosGauche">
				<span>Fonction</span><br>
				<span>Département</span><br>
				<span>Email</span><br>
				<span>Tél</span><br>
			</div>
			<div class="infosDroite">
				<span>${collab.intitulePoste}</span><br>
				<span>${collab.departement.nom}</span><br>
				<span>${collab.emailPro}</span><br>
				<span>075429654</span><br>
			</div>
		</div>
		</div>
	</div>
</c:forEach>
	</div>
</div>

<!-- Results after recherche -->

	<div class="container">	
<h2>Les collaborateurs</h2>	
	<div class="row">
<c:forEach var="collab" items="${listCollabsAfterRecherecheByAlpha}"  >	
	<div class="col-lg-4">
		<div class="myBox">
			<div class="nomPrenom">
				<span>${collab.nom}</span>
				<span>${collab.prenom}</span>
			</div>
			<hr>
			<div id="image"><img src="<%=request.getContextPath()%>/images/dev_man_young.png"></div>
			<div class="actions">
				<div  class="buttonAction"><a id="buttonDetail" href="/sgp/collaborateurs/lister?matriculeCollabMore=${collab.matricule}">More</a></div>
				<div class="buttonAction"><a href="/sgp/collaborateurs/editer?matriculeCollab=${collab.matricule}">Edit</a></div>
			</div>
		<div class="divInfos">
			<div class="infosGauche">
				<span>Fonction</span><br>
				<span>Département</span><br>
				<span>Email</span><br>
				<span>Tél</span><br>
			
			</div>

			<div class="infosDroite">
				<span>${collab.intitulePoste}</span><br>
				<span>${collab.departement.nom}</span><br>
				<span>${collab.emailPro}</span><br>
				<span>075429654</span><br>
			
			</div>
		</div>
		</div>
	</div>
</c:forEach>
	</div>
</div>	
	
<!--  -->
</body>
</html>