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
                <h4 class='alert-heading'>Muito bem!</h4>
                    <p>Aêêê! Você conseguiu ler essa mensagem de alerta. Esse texto vai ter quer se extender um pouquinho pra você conseguir ver como o espaçamento dentro de um alerta funciona.</p>
                    <hr>
                    <p class='mb-0'>Sempre que precisar, use utilitários de margem para manter as coisas perfeitas.</p>
            </div>";
    }else{
        echo 'Data Not Updated';
    }
        mysqli_close($connect);
    }

    ?>

<!DOCTYPE html>
    <html>
        <head>
            <title>SIGEA</title>
            <meta charset="UTF-8">
            <meta name="viewport" content="width=device-width, initial-scale=1.0">
            <link rel="stylesheet" href="style.css" />
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-Zenh87qX5JnK2Jl0vWa8Ck2rdkQ2Bzep5IDxbcnCeuOxjzrPF/et3URy9Bv1WTRi" crossorigin="anonymous">
    </head>
    <body>
        <div class="container">
            <nav class="navbar bg-light">
                <div class="container-fluid">
                    <form action="update.php" method="post">
                        <input type="text" name="id_usuario" placeholder="ID" required><br><br>
                        <input type="text" name="nome_usuario" placeholder="Nome" required><br><br>
                        <input type="password" name="senha_usuario" placeholder="Senha" required><br><br>
                        <input type="text" name="email_usuario" placeholder="E-mail" required><br><br>
                        <input type="number" name="cargo_usuario" placeholder="Cargo" required><br><br>
                        <input type="submit" name="update" class="btn btn-success" value="Atualizar">
                    </form>
                    <form action="painel.php">
                        <input type="submit" class="btn btn-warning" value="Retornar">
                    </form>
                </div>
            </div>
        </body>
    </html>