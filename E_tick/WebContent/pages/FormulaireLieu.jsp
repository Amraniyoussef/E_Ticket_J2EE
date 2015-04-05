<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>
<form action="lieu.do" method="post" id="usrform">
Nom :<input type="text" name="nomLieu"></br></br>
Nombre de catégorie :<input type="text" name="nbCategorie"></br></br>
Capacité :<input type="text" name="capacite"></br></br>
<input type="submit" value="Ajouter">
</form></br>
Adress : <textarea rows="4" cols="50" name="adresse" form="usrform"/>
</body>
</html>