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
                <form action="updateMsg.php" method="post">
                    <input type="text" name="id_mensagem" placeholder="ID" required><br><br>
                    <input type="text" name="email_usuario" placeholder="Email" required><br><br>
                    <input type="text" name="mensagem_usuario" placeholder="Mensagem" required><br><br>
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
                <form action="mensagens.php">
                    <input type="submit" class="btn btn-warning" value="Retornar">
                </form>
                <?php

                    if(isset($_POST['update'])){
                    
                    $hostname = "localhost";
                    $username = "advocacia";
                    $password = "12345";
                    $databaseName = "advocacia";
                    
                    $connect = mysqli_connect($hostname, $username, $password, $databaseName);
                    
                    $id_mensagem = $_POST['id_mensagem'];
                    $email_usuario = $_POST['email_usuario'];
                    $mensagem_usuario = $_POST['mensagem_usuario'];
                            
                    $query = "UPDATE `mensagens` SET `email_usuario`='".$email_usuario."', `mensagem_usuario`='".$mensagem_usuario."' WHERE `id_mensagem` = $id_mensagem";
                    
                    $result = mysqli_query($connect, $query);

                    if($result){
                        echo "<div class='alert alert-success' role='alert'>
                                Você obeteve <b>sucesso</b> editando a mensagem!
                                </div>";
                    }else{
                        echo "<div class='alert alert-danger' role='alert'>
                                Falha ao editar a mensagem!
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