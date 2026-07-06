<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<%@ page import="java.util.List" %>

<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <title>Liste</title>
</head>
<body>
    <h1>Liste</h1>

    <%
        List<String> list = (List<String>) request.getAttribute("list");

        if (list != null) {
            if (list.isEmpty()) {
    %>
                <p>Aucun élément dans la liste.</p>
    <%
            } else {
    %>
            <p>Éléments de la liste :</p>
                <ul>
                    <%
                        for (String item : list) {
                    %>
                            <li><%= item %></li>
                    <%
                        }
                    %>
                </ul>
    <%
            }
        } else {
    %>
            <p>Attribut "list" introuvable ou invalide.</p>
    <%
        }
    %>
</body>
</html>
