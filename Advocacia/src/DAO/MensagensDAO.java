package DAO;

import DTO.MensagensDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class MensagensDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<MensagensDTO> tabela = new ArrayList<>();
    
    public void enviarMensagem(MensagensDTO msgdto){
        conn = new ConexaoDAO().conectaDB();
        String sql = "INSERT INTO mensagens (email_usuario, mensagem_usuario) VALUES (?,?)";
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, msgdto.getId_mensagem());
            pstm.setString(2, msgdto.getMensagem_usuario());
            pstm.setString(3, msgdto.getEmail_usuario());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Mensagem enviada com sucesso!");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ERRO: Cadastrar Mensagem!" + erro);
        }
    }
    
    public ResultSet listarMensagens(){
        conn = new ConexaoDAO().conectaDB();
        String sql = "SELECT * FROM mensagens ORDER BY id_mensagem";
        
        try{
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro em Listar Mensagens!" + erro);
            return null;
        }
    }
    
    public ArrayList<MensagensDTO> pesquisarMensagem(){
        String sql = "SELECT * FROM mensagens";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();   
            
            while(rs.next()){
                MensagensDTO msgdto = new MensagensDTO();
                msgdto.setEmail_usuario(rs.getString("email_usuario"));
                msgdto.setId_mensagem(rs.getInt("id_mensagem"));
                msgdto.setMensagem_usuario(rs.getString("mensagem_usuario"));
                tabela.add(msgdto);
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "MensagensDAO" + erro);
        }
        return tabela;
    }
    
    public void excluirMensagem(MensagensDTO msgdto){
        String sql = "DELETE FROM mensagens WHERE id_mensagem = ?";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, msgdto.getId_mensagem());
            pstm.execute();
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Problema resolvido." + erro);
        }
    }
    
}
