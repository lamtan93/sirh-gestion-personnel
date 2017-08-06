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
<title>Insert title here</title>
<c:import url="/index.html"/>
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