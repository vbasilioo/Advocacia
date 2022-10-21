package DAO;
import DTO.FuncionariosDTO;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class FuncionariosDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<FuncionariosDTO> tabela = new ArrayList<>();
    
    public ResultSet autenticarFuncionario(FuncionariosDTO usuariosdto){
        conn = new ConexaoDAO().conectaDB();
        
        try{
            String sql = "SELECT * FROM usuarios WHERE nome_usuario = ? AND senha_usuario = ?";
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcodto.getNome_usuario());
            pstm.setString(2, funcdto.getSenha_usuario());
            
            ResultSet rs = pstm.executeQuery();
            return rs;
            
        }catch (SQLException erro){
            JOptionPane.showMessageDialog(null, "UsuarioDAO: " + erro);
            return null;
        }
        
    }
    
    public void cadastrarFuncionario(FuncionariosDTO funcdto){
        String sql = "INSERT INTO funcionarios(id_funcionario, nome_funcionario, telefone_funcionario, cpf_funcionario, email_funcionario, endereco_funcionario, sexo_funcionario, comentarios_funcionario, imagem_funcionario) values(?,?,?,?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcdto.getId_funcionario());
            pstm.setString(2, funcdto.getNome_funcionario());
            pstm.setString(3, funcdto.getTelefone_funcionario());
            pstm.setString(4, funcdto.getCpf_funcionario());
            pstm.setString(5, funcdto.getEmail_funcionario());
            pstm.setString(6, funcdto.getEndereco_funcionario());
            pstm.setString(7, funcdto.getSexo_funcionario());
            pstm.setString(8, funcdto.getComentarios_funcionario());
            pstm.setString(9, funcdto.getImagem_funcionario());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Funcionário(a) cadastro(a) com sucesso!");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarFuncionariosDAO: " + erro);
        }
    }
    
    public ArrayList<FuncionariosDTO> pesquisarFuncionario(){
        String sql = "SELECT * FROM funcionarios";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();   
            
            while(rs.next()){
                FuncionariosDTO funcdto = new FuncionariosDTO();
                funcdto.setId_funcionario(rs.getInt("id_funcionario"));
                funcdto.setNome_funcionario(rs.getString("nome_funcionario"));
                funcdto.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                funcdto.setCpf_funcionario(rs.getString("cpf_funcionario"));
                funcdto.setEmail_funcionario(rs.getString("email_funcionario"));
                funcdto.setEndereco_funcionario(rs.getString("endereco_funcionario"));
                funcdto.setComentarios_funcionario(rs.getString("comentarios_funcionario"));
                funcdto.setImagem_funcionario(rs.getString("imagem_funcionario"));
                tabela.add(funcdto);
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "FuncionariosDAO" + erro);
        }
        return tabela;
    }
    
    public void editarFuncionario(FuncionariosDTO funcdto){
        String sql = "UPDATE funcionarios SET nome_funcionario = ?, telefone_funcionario = ?, cpf_funcionario = ?, email_funcionario = ?, endereco_funcionario = ?, comentarios_funcionario = ?, imagem_funcionario = ? WHERE id_funcionario = ?";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, funcdto.getNome_funcionario());
            pstm.setString(2, funcdto.getTelefone_funcionario());
            pstm.setString(3, funcdto.getCpf_funcionario());
            pstm.setString(4, funcdto.getEmail_funcionario());
            pstm.setString(5, funcdto.getEndereco_funcionario());
            pstm.setString(6, funcdto.getComentarios_funcionario());
            pstm.setString(7, funcdto.getImagem_funcionario());
            pstm.setInt(8, funcdto.getId_funcionario());
            pstm.execute();
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Editar Funcionario" + erro);
        }
    }
    
    public void excluirFuncionario(FuncionariosDTO funcdto){
        String sql = "DELETE FROM funcionarios WHERE id_funcionario = ?";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, funcdto.getId_funcionario());
            pstm.execute();
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Excluir Funcionario" + erro);
        }
    }
    
}