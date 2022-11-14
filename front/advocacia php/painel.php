<?php
    include('protect.php');
?>

<!DOCTYPE html>
<html lang="en">
<head>
    <meta charset="UTF-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <link rel="stylesheet" href="style.css" />
    <link href='https://unpkg.com/boxicons@2.1.4/css/boxicons.min.css' rel='stylesheet'>
    <meta name="viewport" content="width=device-width, initial-scale=1.0">
    <title>CRUD</title>
</head>
<body>

    <div class="container">
        <div class="title">
            <span>Bem-vindo ao painel, <b><?php echo $_SESSION['nome_usuario']; ?></b>.</span>
        </div>
        <div class="header">
            <span>Sistema Gerencial de Advocacia</span>
            <button onclick="openModal()" id="new">Incluir</button>
        </div>
        <div class="divTable">
            <table>
                <thead>
                    <tr>
                        <th>Nome</th>
                        <th>Processos</th>
                        <th>Cliente</th>
                        <th>Arquivos</th>
                        <th class="acao">Editar</th>
                        <th class="acao">Excluir</th>
                    </tr>
                </thead>
                <tbody>
                    AAAAA
                </tbody>
            </table>
        </div>
        <div class="modal-container">
            <div class="modal">
                <form>
                    <label for="m-nome">Nome</label>
                    <input id="m-nome" type="text" required />

                    <label for="m-funcao">Função</label>
                    <input id="m-funcao" type="text" required />

                    <label for="m-salario">Salário</label>
                    <input id="m-salario" type="text" required />
                    <button id="btnSalvar">Salvar</button>
                </form>
            </div>
        </div>
    </div>

    <script src="script.js"></script>
</body>
</html>