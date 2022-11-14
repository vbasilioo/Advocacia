<?php
    include('conexao.php');

    if(isset($_POST['usuario']) || isset($_POST['senha'])){
        if(strlen($_POST['usuario']) == 0) echo 'Preencha o campo usuário!';
        else if(strlen($_POST['senha']) == 0) echo 'Preencha o campo senha!';
        else if((strlen($_POST['usuario']) == 0) && (strlen($_POST['senha']) == 0)) echo 'Preencha o campo usuário e o campo senha!';
        else{

            $usuario = $conn->real_escape_string($_POST['usuario']);
            $senha = $conn->real_escape_string($_POST['senha']);
            $sql_code = "SELECT * FROM usuarios WHERE nome_usuario = '$usuario' AND senha_usuario = '$senha'";
            $sql_query = $conn->query($sql_code) or die("Falha na execução do banco de dados: " . $conn->error);
            
            $quantidade = $sql_query->num_rows;

            if($quantidade == 1){
                $usuario = $sql_query->fetch_assoc();

                if(!isset($_SESSION)){
                    session_start();
                }

                $_SESSION['id_usuario'] = $usuario['id_usuario'];
                $_SESSION['nome_usuario'] = $usuario['nome_usuario'];

                header("Location: painel.php");

            }else{
                echo 'Usuário ou senha incorretos!';
            }
        }        
    }
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="login.css">
    <title>Advocacia</title>
</head>
<body>
    <form action="" method="POST">
        <h3>ADVOCACIA</h3>
        <input id="usuario" type="text" name="usuario" placeholder="Digite o seu usuário." />
        <input type="password" name="senha" placeholder="Digite a sua senha." />
        <input type="submit" name="acao" value="Entrar" />
    </form>

    <script src="login.js"></script>
</body>
</html>