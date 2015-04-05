<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

<form action="client.do" method="post" id="usrform">
Nom :<input type="text" name="nomClient"></br></br>
Prénom :<input type="text" name="prenomClient"></br></br>
Téléphone :<input type="text" name="telClient"></br></br>
Login :<input type="text" name="loginClient"></br></br>
Mots de passe :<input type="text" name="passClient"></br></br>

<input type="submit" value="Ajouter">
</form>
Adress : <textarea rows="4" cols="50" name="adresseClient" form="usrform"/>
</body>
</html>