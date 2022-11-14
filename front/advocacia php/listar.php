<?php

    include('conexao.php');

    $query_usuarios = "SELECT nome_usuario, email_usuario, id_processo_associado 
                    FROM usuarios
                    ORDER BY id_usuario"
    $res_usuarios = $conn->prepare($query_usuarios);
    $res_usuarios->execute();

    if(($res_usuarios) && ($res_usuarios->rowCount() != 0)){
        while($row_usuario = $res_usuarios->fetch(PDO::FETCH_ASSOC)){
            var_dump($row_usuario);
        }

        $return = ['status' => true, 'dados' => $dados];
    }else{
        $return = ['status' => false, 'msg' => "<p style='color: #f00;'>ERRO: Nenhum usuário encontrado.</p>"];
    }

    echo json_encode($return);
?>