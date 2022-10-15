package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class ConsultarDAO{
    
    public static ResultSet carregarTabela() throws SQLException{
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        conn = new ConexaoDAO().conectaDB();
        pstm = conn.prepareStatement(
                "SELECT nome_funcionario, telefone_funcionario, cpf_funcionario, email_funcionario, endereco_funcionario, sexo_funcionario, comentarios_funcionario, imagem_funcionario FROM funcionarios");
        rs = pstm.executeQuery();
        return rs;
    }
    
    public static ResultSet carregarTabela(String campoConsulta1, String campoPesquisa) throws SQLException{
        Connection conn;
        PreparedStatement pstm;
        ResultSet rs;
        String argumento = campoConsulta1+" "+"like '"+campoPesquisa+"%'";
        conn = new ConexaoDAO().conectaDB();
        pstm = conn.prepareStatement("SELECT nome_funcionario, telefone_funcionario, cpf_funcionario, email_funcionario, endereco_funcionario, sexo_funcionario, comentarios_funcionario, imagem_funcionario FROM funcionarios WHERE"+argumento+"");
        rs = pstm.executeQuery();   
        return rs;
    }
    
}
