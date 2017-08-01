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
<h1>Les collaborateurs</h1>


<ul>
		<%
		List<Collaborateur> listeCollaborateurs = (List<Collaborateur>) request.getAttribute("listeCollaborateurs");
		for (Collaborateur collab : listeCollaborateurs) {
		%>
				<li><%= collab.getMatricule() %></li>
				<li><%= collab.getNom() %></li>
				<li><%= collab.getPrenom() %></li>
		<%
		}
		%>
</ul>


</body>
</html>