package DAO;
import DTO.UsuariosDTO;
import LOG.Log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class UsuariosDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<UsuariosDTO> tabela = new ArrayList<>();
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
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
            LOGGER.error("Usuário não conseguiu a autenticação.");
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
            LOGGER.info("O administrador cadastrou um usuário com sucesso.");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarUsuariosDAO: " + erro);
            LOGGER.error("O administrador não conseguiu cadastrar um usuário.");
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
            
            LOGGER.info("O administrador pesquisou um usuário no banco de dados.");
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuariosDAO" + erro);
            LOGGER.error("O administrador não conseguiu realizar uma pesquisa no banco de dados.");
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
            LOGGER.info("O administrador conseguiu editar os dados de um usuário.");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Editar Usuário" + erro);
            LOGGER.error("O administrador não conseguiu editar os dados de um usuário.");
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
            LOGGER.info("O administrador conseguiu listar os usuários cadastrados.");
            return pstm.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro em Listar Usuários!" + erro);
            LOGGER.error("O administrador não conseguiu listar os usuários cadastrados");
            return null;
        }
    }
    
    public static String consultarNome(int id)
    {
        String nome="";
        String selectSQL = "SELECT nome_usuario FROM usuarios WHERE id_usuario = "+id;
        ResultSet result = null;
        PreparedStatement ps;
        Connection c = new ConexaoDAO().conectaDB();
        try
        {
            ps = c.prepareStatement(selectSQL);
            result = ps.executeQuery();
            System.out.println(result);
            result.next();
            nome=result.getString("nome_usuario");
            
            }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }
        
       return nome; 
    }
    
    
    public static String ids2nomes(String ids)
    {
        String nome = "";
        int qUsuarios;
        qUsuarios = CredencialDAO.nIds(ids.length(), ids);
        int[] us = new int[qUsuarios];
        us=CredencialDAO.str2arr(qUsuarios, ids.length(), ids);    
        for(int i=0; i<qUsuarios; i++)
        {
            nome+=" " +consultarNome(us[i]);
            if((i<qUsuarios-2)&&(qUsuarios>2))nome+=",";
            else if((i==qUsuarios-2)&&(qUsuarios>1))nome+=" e";
        }
        return nome;
    }
    
}