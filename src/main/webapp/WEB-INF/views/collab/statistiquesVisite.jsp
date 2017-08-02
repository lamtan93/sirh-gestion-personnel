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

<title>Insert title here</title>
</head>
<body>


<div class="container">	
	<h2>Statistiques</h2>	
	
		<table class="table table-hover">
				<thead>	
					<tr>
							<th>Chemin</th>
							<th>Nombre de visite(s)</th>
							<th>Temps d'éxécution</th>
							
					</tr>
				</thead>
				
				<tbody>	
				
						<c:forEach var="stat" items="${listVisiteWeb}"  >
						 	<tr>
							 	<td>${stat.chemin}</td>
								<td>${stat.id}</td>
								<td>${stat.tempsExecution}</td>
								
							</tr>
					 
						</c:forEach>
				</tbody>			
						
						
		</table>	
</div>
			



</body>

</html>