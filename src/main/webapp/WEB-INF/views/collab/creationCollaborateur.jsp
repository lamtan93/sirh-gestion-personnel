<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">

<title>Creation de collaborateur</title>
</head>
<body>

	<form method="POST" class="form-group" >
	
			<input type="text" id="inputNom" name="inputNom" placeholder="Nom" class="form-control" required="required"></input>
			<input type="text" id="inputPrenom" name="inputPrenom" placeholder="Prenom" class="form-control" required="required"></input> 	
			<input type="date" id="inputDateNaissance" name="inputDateNaissance"  class="form-control" required="required"></input> 
			<input type="text" id="inputAdresse" name="inputAdresse"  placeholder="Adresse" class="form-control" required="required"></input>
			<input type="text" id="inputNumeroSecure" name="numeroSecure" placeholder="Numéro de sécurité sociale" class="form-control" required="required"></input>
			
			<input type="submit" class="btn btn-primary btn-success"  value="Créer"/>
		
	</form>


</body>
</html>