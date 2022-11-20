<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <link rel="stylesheet" href="login.css">
    <title>SIGEA</title>
</head>
<body>
    <form action="" method="POST">
        <h3>SIGEA</h3>
        <input id="usuario" type="text" name="usuario" placeholder="Digite o seu usuário." />
        <input type="password" name="senha" placeholder="Digite a sua senha." />
        <input type="submit" name="acao" value="Entrar" />
        <br><br>
        <?php
            include('conexao.php');

            if(isset($_POST['usuario']) || isset($_POST['senha'])){
                if(strlen($_POST['usuario']) == 0) echo "<div class='alert alert-danger' role='alert'>
                                                            <center>Preencha o campo <b>usuário</b>!</center>
                                                        </div>";
                else if(strlen($_POST['senha']) == 0) echo "<div class='alert alert-danger' role='alert'>
                                                                <center>Preencha o campo <b>senha</b>!</center>
                                                            </div>";
                else if((strlen($_POST['usuario']) == 0) && (strlen($_POST['senha']) == 0)) echo "<div class='alert alert-danger' role='alert'>
                                                                                                    <center>Preencha o campo <b>usuário</b> e o campo <b>senha</b>!</center>
                                                                                                </div>";
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
                        echo "<div class='alert alert-danger' role='alert'>
                                <center><b>Usuário</b> ou <b>senha</b> incorretos!</center>
                            </div>";
                    }
                }        
            }
        ?>
    </form>

    <script src="login.js"></script>
</body>
</html>