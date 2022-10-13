package DAO;

import DTO.UsuariosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class UsuariosDAO{
    
    Connection conn;
    
    public ResultSet autenticarUsuario(UsuariosDTO usuariosdto){
        conn = new ConexaoDAO().conectaDB();
        
        try{
            String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuariosdto.getNome_usuario());
            pstm.setString(2, usuariosdto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
        
    }
    
}
