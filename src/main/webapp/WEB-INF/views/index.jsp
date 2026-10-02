<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" %>
<!DOCTYPE html>
<html lang="fr">
<head>
    <meta charset="UTF-8">
    <title>Ma première page JSP</title>
</head>
<body>

    <h1>Bienvenue sur ma page JSP</h1>

    <form action="${pageContext.request.contextPath}/dev/user" method="post">
        <label for="name">Nom :</label>
        <input type="text" id="name" name="name" required>
        <label for="age">Âge :</label>
        <input type="number" id="age" name="age" required>
        <label for="montant">Montant :</label>
        <input type="number" id="montant" name="montant" step="0.01" required>
        <input type="submit" value="Envoyer">
    </form>

</body>
</html>
