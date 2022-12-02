<?php

    $usuario = 'advocacia';
    $senha = '12345';
    $db = 'advocacia';
    $host = 'localhost';

    $conn = new mysqli($host, $usuario, $senha, $db);
    
    if($conn -> error){
        die('Falha ao conectar ao banco de dados: ' . $mysqli->error);
    }
?>