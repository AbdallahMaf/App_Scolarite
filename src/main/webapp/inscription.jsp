<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
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
        <form action="database.php" method="post">
            <p>Bienvenue</p>
           
            <input type="text" name="nom" id="nom" placeholder="Votre Nom" required>
            <input type="text" name="prenom" id="prenom" placeholder="Votre Prenom" required>
            <input type="email" name="email" id="email" placeholder="Votre Email" required>
            <input type="date" name="date" id="date" required>
            <input type="text" name="classe" id="classe" placeholder="Votre Classe" required>
            <input type="submit" value="Enregistrer">
            <a href="index.html">Vous avez dejà un compte?</a>

            <div class="drops">
                <div class="drop drop-1"></div>
                <div class="drop drop-2"></div>
                <div class="drop drop-3"></div>
                <div class="drop drop-4"></div>
                <div class="drop drop-5"></div>
            </div>

        </form>
    </div>

</body>


</html>