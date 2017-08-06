<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/monStyle.css">
<script src="<%=request.getContextPath()%>/js/monJs.js"></script>
<title>Editer collaborateur</title>

<c:import url="/index.html"/>
</head>
<body>


<div class="well">
			<div id="myBorder"  class="col-lg-offset-4" >
				<span id="labelNewCollab" class="label label-default ">Editer Collaborateur</span>
				<c:if test="${not empty message}">
					<span id="labelMessage" class="label label-default ">${message}</span>
				</c:if>
				<!-- <span class="label label-default"><a href="collaborateurs/lister" class="list-group-item">Voir List</a></span> -->
				<div id="myForm">
				
					<form method="POST" accept-charset="UTF-8"   >
					
						<div class="row" >
							<div class="col-lg-5 col-lg-offset-1 " >
								<input class="form-control" type="text" id="inputNom" name="inputNom" placeholder="Nom*" value="${collabCurrent.nom}" disabled>
							</div>
							<div class="col-lg-5  " >
								<input class="form-control" type="text" id="inputPrenom" name="inputPrenom" placeholder="Prenom*" value="${collabCurrent.prenom}" disabled>
							</div>
						</div>
						<br>

						<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputDateNaissance" name="inputDateNaissance" placeholder="Date de naissance*" value="${collabCurrent.dateNaissance}" disabled><br>
								</div>
						</div>

							<div class="row">
								<div class="col-lg-10 col-lg-offset-1">
									<input class="form-control" type="text" id="inputAdresse" name="inputAdresse" placeholder="Adresse*" value="${collabCurrent.adresse}" >
								</div>
							</div>
							
							<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputNumeroSecure" name="inputNumeroSecure" placeholder="Numéro de sécurité sociale*" value="${collabCurrent.numSecure}" disabled><br>
								</div>
							</div>
							
							<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputIntitulePoste" name="inputIntitulePoste" placeholder="Intitulé poste actuel*: ${collabCurrent.intitulePoste}" required="required"><br>
								</div>
							</div>
							
							<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputDepartement" name="inputDepartement" placeholder="Département actuel*: ${collabCurrent.departement.nom}" required="required"><br>
								</div>
							</div>
							
							<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputBanque" name="inputBanque" placeholder="Banque actuelle*: ${collabCurrent.banque} *" required="required"><br>
								</div>
							</div>
							
							
							<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputBic" name="inputBic" placeholder="Bic actuel*: ${collabCurrent.bic}" required="required"><br>
								</div>
							</div>
							
							<div class="row">
								<div class="col-lg-10 col-lg-offset-1"><br>
									<input class="form-control" type="date" id="inputIban" name="inputIban" placeholder="Iban actuel*: ${collabCurrent.iban}" required="required"><br>
								</div>
							</div>
							
							<div class="row">
								<div class="col-lg-offset-3" >
									
									<input id="buttonCreate" class="btn btn-default  " type="submit" name="" value="Modifier">
									
								</div>
							</div>
				
					</form>
				</div>
		</div>	
	</div>

</body>
</html>