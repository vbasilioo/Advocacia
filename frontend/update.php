<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <link rel="stylesheet" href="style.css" />
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    <title>SIGEA</title>
</head>
<body>
    
    <div class="container text-center">
        <div class="row">
            <div class="col">
                
            </div>
            <div class="col-6">
                <br><br><br><br>
                <form action="update.php" method="post">
                    <input type="text" name="id_usuario" placeholder="ID" required><br><br>
                    <input type="text" name="nome_usuario" placeholder="Nome" required><br><br>
                    <input type="password" name="senha_usuario" placeholder="Senha" required><br><br>
                    <input type="text" name="email_usuario" placeholder="E-mail" required><br><br>
                    <input type="text" name="cargo_usuario" placeholder="Cargo" required><br><br>
                    <input type="submit" name="update" class="btn btn-success" value="Atualizar">
                </form>
            </div>
            <div class="col">
                
            </div>
        </div>
        <div class="row">
            <div class="col">
                
            </div>
            <div class="col-5">
                <br>
                <form action="painel.php">
                    <input type="submit" class="btn btn-warning" value="Retornar">
                </form>
                <?php

                    if(isset($_POST['update'])){
                    
                    $hostname = "localhost";
                    $username = "advocacia";
                    $password = "12345";
                    $databaseName = "advocacia";
                    
                    $connect = mysqli_connect($hostname, $username, $password, $databaseName);
                    
                    $id_usuario = $_POST['id_usuario'];
                    $nome_usuario = $_POST['nome_usuario'];
                    $senha_usuario = $_POST['senha_usuario'];
                    $email_usuario = $_POST['email_usuario'];
                    $cargo_usuario = $_POST['cargo_usuario'];
                            
                    $query = "UPDATE `usuarios` SET `nome_usuario`='".$nome_usuario."', `senha_usuario`='".$senha_usuario."', `email_usuario`='".$email_usuario."',`cargo_usuario`= '".$cargo_usuario."' WHERE `id_usuario` = $id_usuario";
                    
                    $result = mysqli_query($connect, $query);

                    if($result){
                        echo "<div class='alert alert-success' role='alert'>
                                Você obeteve <b>sucesso</b> editando o usuário!
                                </div>";
                    }else{
                        echo "<div class='alert alert-danger' role='alert'>
                                Falha ao editar o usuário!
                                </div>";
                    }
                        mysqli_close($connect);
                    }

                ?>
            </div>
            <div class="col">
                
            </div>
        </div>
    </div>
</body>
</html>