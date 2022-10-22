package DAO;
import DTO.UsuariosDTO;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class UsuariosDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuariosDTO> tabela = new ArrayList<>();
    
    public ResultSet autenticarFuncionario(UsuariosDTO usuariosdto){
        conn = new ConexaoDAO().conectaDB();
        
        try{
            String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuariosdto.getNome_usuario());
            pstm.setString(2, usuariosdto.getSenha_usuario());
            
            rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
        
    }
    
    public void cadastrarFuncionario(UsuariosDTO funcdto){
        String sql = "INSERT INTO usuarios(id_usuario, nome_usuario, senha_usuario, cargo_usuario, id_processo.associado)"
                + "values (?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcdto.getId_usuario());
            pstm.setString(2, funcdto.getNome_usuario());
            pstm.setString(3, funcdto.getSenha_usuario());
            pstm.setString(4, funcdto.getCargo_usuario());
            pstm.setString(5, funcdto.getId_processo_associado());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarUsuariosDAO: " + erro);
        }
    }
    
    public ArrayList<UsuariosDTO> pesquisarFuncionario(){
        String sql = "SELECT * FROM usuarios";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();   
            
            while(rs.next()){
                UsuariosDTO funcdto = new UsuariosDTO();
                funcdto.setId_usuario(rs.getInt("id_usuario"));
                funcdto.setNome_usuario(rs.getString("nome_usuario"));
                funcdto.setSenha_usuario(rs.getString("senha_usuario"));
                funcdto.setCargo_usuario(rs.getString("cargo_usuario"));
                funcdto.setId_processo_associado(rs.getString("id_processo.associado"));
                tabela.add(funcdto);
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuariosDAO" + erro);
        }
        return tabela;
    }
    
    public void editarFuncionario(UsuariosDTO funcdto){
        String sql = "UPDATE usuarios SET nome_usuario = ?, senha_usuario = ?, cargo_usuario = ?, id_processo.associado = ?"
                + "WHERE id_usuario = ?";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcdto.getId_usuario());
            pstm.setString(2, funcdto.getNome_usuario());
            pstm.setString(3, funcdto.getSenha_usuario());
            pstm.setString(4, funcdto.getCargo_usuario());
            pstm.setString(5, funcdto.getId_processo_associado());
            pstm.execute();
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Editar Usuário" + erro);
        }
    }
    
    public void excluirFuncionario(UsuariosDTO funcdto){
        String sql = "DELETE FROM usuarios WHERE id_usuario = ?";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcdto.getId_usuario());
            pstm.execute();
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Excluir Usuário" + erro);
        }
    }
    
}