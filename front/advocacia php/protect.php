<?php

    if(!isset($_SESSION)){
        session_start();
    }

    if(!isset($_SESSION['id_usuario'])){
        die('Você não está logado! <p><a href=\"index.php\">Entrar</a></p>');
    }

?>