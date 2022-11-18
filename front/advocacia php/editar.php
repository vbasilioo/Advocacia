<?php

    session_start();
    include_once("conexao.php");
    $id = filter_input(INPUT_GET, 'id_usuario', FILTER_SANITIZE_NUMBER_INT);
    $result_usuario = "SELECT * FROM usuarios WHERE id_usuario = '$id'";
    $resultado_usuario = mysqli_query($conn, $result_usuario);
    $row_usuario = mysqli_fetch_assoc($resultado_usuario);
?>

<!DOCTYPE html>
<html lang="pt-br">
	<head>
		<meta charset="utf-8">
		<title>SIGEA</title>		
	</head>
	<body>
		<?php
		if(isset($_SESSION['msg'])){
			echo $_SESSION['msg'];
			unset($_SESSION['msg']);
		}
		?>
		<form method="POST" action="proc_edit_usuario.php">
			<input type="hidden" name="id" value="<?php echo $row_usuario['id_usuario']; ?>">
			
			<label>Nome: </label>
			<input type="text" name="nome" placeholder="Digite o nome" value="<?php echo $row_usuario['nome_usuario']; ?>"><br><br>
			
			<label>E-mail: </label>
			<input type="email" name="email" placeholder="Digite o e-mail" value="<?php echo $row_usuario['email_usuario']; ?>"><br><br>
			
            <label>Cargo: </label>
			<input type="text" name="cargo" placeholder="Digite o cargo" value="<?php echo $row_usuario['cargo_usuario']; ?>"><br><br>
			
            <label>Processos: </label>
			<input type="text" name="processos" placeholder="Digite os processos" value="<?php echo $row_usuario['id_processo_associado']; ?>"><br><br>
			

			<input type="submit" value="Editar">
		</form>
	</body>
</html>