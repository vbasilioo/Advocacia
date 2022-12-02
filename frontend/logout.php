<?php

    if(!isset($_SESION)){
        session_start();
    }

    session_destroy();
    header("Location: index.php");

?>