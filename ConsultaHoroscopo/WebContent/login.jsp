<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
	Aquí va el login
	<form id="idFrmLogin" name="frmLogin" action="/ConsultaHoroscopo/" method="POST">
		Usuario: <input type="text" id="idUsuario" name="usuario" />
		Password: <input type="password" id="idPassword" name="password" />
		<button type = "submit" id="idBtnLogin">Login</button>
	</form>
</body>
</html>