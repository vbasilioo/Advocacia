package DAO;
import DTO.UsuariosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class UsuariosDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuariosDTO> tabela = new ArrayList<>();
    
    public ResultSet autenticarUsuario(UsuariosDTO usuariosdto){
        conn = new ConexaoDAO().conectaDB();
        
        try{
            String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha_usuario = ?";
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, usuariosdto.getNome_usuario());
            pstm.setString(2, usuariosdto.getSenha_usuario());
            rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO AUTENTICAR: " + erro);
            return null;
        }
        
    }
    
    public void cadastrarUsuario(UsuariosDTO funcdto){
        String sql = "INSERT INTO usuarios(id_usuario, nome_usuario, senha_usuario, email_usuario, cargo_usuario, id_processo_associado)"
                + "values (?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcdto.getId_usuario());
            pstm.setString(2, funcdto.getNome_usuario());
            pstm.setString(3, funcdto.getSenha_usuario());
            pstm.setString(4, funcdto.getEmail_usuario());
            pstm.setString(5, funcdto.getCargo_usuario());
            pstm.setString(6, funcdto.getId_processo_associado());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Usuário cadastrado com sucesso!");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarUsuariosDAO: " + erro);
        }
    }
    
    public ArrayList<UsuariosDTO> pesquisarUsuario(){
        String sql = "SELECT * FROM usuarios";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();   
            
            while(rs.next()){
                UsuariosDTO funcdto = new UsuariosDTO();
                funcdto.setNome_usuario(rs.getString("nome_usuario"));
                funcdto.setSenha_usuario(rs.getString("senha_usuario"));
                funcdto.setEmail_usuario(rs.getString("email_usuario"));
                funcdto.setCargo_usuario(rs.getString("cargo_usuario"));
                funcdto.setId_processo_associado(rs.getString("id_processo_associado"));
                tabela.add(funcdto);
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuariosDAO" + erro);
        }
        return tabela;
    }
    
    public void editarUsuario(UsuariosDTO funcdto){
        String sql = "UPDATE usuarios SET nome_usuario = ?, senha_usuario = ?, cargo_usuario = ?, id_processo_associado = ?"
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
    
    /*public void excluirFuncionario(UsuariosDTO funcdto){
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
    }*/
    
    public ResultSet listarUsuarios(){
        conn = new ConexaoDAO().conectaDB();
        String sql = "SELECT * FROM usuarios ORDER BY id_usuario";
        
        try{
            pstm = conn.prepareStatement(sql);
            return pstm.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro em Listar Usuários!" + erro);
            return null;
        }
    }
    
}