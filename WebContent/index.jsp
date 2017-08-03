<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Index</title>
</head>
<body>

	<h1>Primeira aula java web</h1>

	<form action="minhaservlet" method="post">
	
		<label for="nome">Nome:</label>
		<input type="text" id="nome" name="nome">
		
		<label for="email">Email:</label>
		<input type="text" id="email" name="email">
		
		<label for="tel">Telefone:</label>
		<input type="text" id="tel" name="tel">
		
		<input type="submit" value="enviar">
	</form>

</body>
</html>