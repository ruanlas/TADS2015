<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!doctype html>
<html>
	<head>
		<meta charset="ISO-8859-1">
		<title>Teste</title>
	</head>
	<body>
		<h1>Dados vindos do servlet</h1>
		<ul>
			<c:forEach var="i" items="${dados}">
				<li>${i}</li>
			</c:forEach>
		</ul>
	</body>
</html>
