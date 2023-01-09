<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css">
    <title>Page d'Inscription</title>
</head>
 
<body>
    <link rel="preconnect" href="https://fonts.gstatic.com">
    <link href="https://fonts.googleapis.com/css2?family=Montserrat:wght@300;400;500&display=swap" rel="stylesheet">

    <div class="container">
        <form action="userservlet" method="post">
            <p>Connectez-vous</p>
            <input type="text" name="firstname" id="firstname" placeholder="Votre Prenom" required>
            <input type="text" name="lastname" id="lastname" placeholder="Votre Nom" required>
            <input type="email" name="email" id="email" placeholder="Votre Email" required>
            <input type="password" name="password" id="password" placeholder="Votre Mot de Passe" required>
            <input type="submit" value="Se Connecter">
            <a href="inscription.jsp">Inscrivez-vous ici...</a>

            <div class="drops">
                <div class="dr0op drop-1"></div>
                <div class="d rop drop-2"></div>
                <div class="drop drop-3"></div>
                <div class="drop drop-4"></div>
                <div class="drop drop-5"></div>
            </div>

        </form>
    </div>

</body>

</html>