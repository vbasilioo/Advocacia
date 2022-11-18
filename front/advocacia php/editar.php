<?php
    session_start();

    include_once("conexao.php");

    $sql = "SELECT * FROM usuarios WHERE id_usuario = '2'";
    $result = mysqli_query($conn, $sql);
    $row_usuario = mysqli_fetch_assoc($result);
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <title>SIGEA</title>
</head>
<body>
    <h1>Editar Usuário</h1>

    <?php
        if(isset($_SESION['msg'])){
            echo $_SESSION['msg'];
            unset($_SESSION['msg']);
        }



    ?>
    <form method="POST" action="editar.php">
        <inputy type="hidden" name="id" value="<?php echo $row_usuario['id_usuario'] ?>">
        <label>Nome: </label>
        <input type="text" name="nome" placeholder="Digite o nome completo." value="<?php echo $row_usuario['nome_usuario']; ?>"><br><br>
        <label>E-mail: </label>
        <input type="text" name="email" placeholder="Digite o e-mail." value="<?php echo $row_usuario['email_usuario']; ?>"><br><br>
        <label>Cargo: </label>
        <input type="text" name="cargo" placeholder="Digite o cargo (0 ou 1)." value="<?php echo $row_usuario['cargo_usuario']; ?>"><br><br>
        <label>Processos: </label>
        <input type="text" name="processos" placeholder="Digite os processos (com vírgula após o término)." value="<?php echo $row_usuario['id_processo_associado']; ?>"><br><br>
        <input type="submit" value="Editar">
    </form>

    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.2.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-OERcA2EqjJCMA+/3y+gxIOqMEjwtxJY7qPCqsdltbNJuaOe923+mo//f6V8Qbsw3" crossorigin="anonymous"></script>
    <script src="https://unpkg.com/boxicons@2.1.4/dist/boxicons.js"></script>
</body>
</html>