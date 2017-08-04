<%@page import="java.util.List"%>
<%@ page language="java" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix = "fmt" uri = "http://java.sun.com/jsp/jstl/fmt" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<link rel="stylesheet" href="<%=request.getContextPath()%>/bootstrap-3.3.7-
dist/css/bootstrap.css">

<link rel="stylesheet" href="<%=request.getContextPath()%>/css/monStyle.css">
<title>Insert title here</title>
<c:import url="/index.html"/>
</head>
<body>
	
	<div class="container">	
<h2>Activités depuis le démarrage de l'application</h2>	
		<table class="table table-hover">
				<thead>	
					<tr>
							<th>Date/Heure</th>
							<th>Matricule</th>
							<th>Type d'activité</th>
						
					</tr>
				</thead>
				
				<tbody>	
					<c:forEach var="activCollab" items="${listCollabActivites}"  >
					 	<tr>
						 	<td>
						 	<fmt:formatDate type="both" dateStyle="short" value="${activCollab.dateHeure}" />
						 	 </td>
							<td>${activCollab.matricule}</td>
							<td>${activCollab.typeCollabEvt}</td>
						</tr>
				 
					</c:forEach>
				</tbody>			
						
						
		</table>	
</div>


</body>
</html>