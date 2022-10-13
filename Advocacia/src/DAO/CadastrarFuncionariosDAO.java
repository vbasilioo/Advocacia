package DAO;
import DTO.CadastrarFuncionariosDTO;
import java.awt.List;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

public class CadastrarFuncionariosDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    
    public void cadastrarFuncionario(CadastrarFuncionariosDTO funcdto){
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
    
    public ArrayList<CadastrarFuncionariosDTO> pesquisarFuncionario(){
        ArrayList <CadastrarFuncionariosDTO> funcionarios = new ArrayList<>();
        
        try{

            pstm = conn.prepareStatement("SELECT * FROM funcionarios");
            rs = pstm.executeQuery();
            
            while(rs.next()){
                CadastrarFuncionariosDTO funcdto = new CadastrarFuncionariosDTO();
                funcdto.setId_funcionario(rs.getInt("id_funcionario"));
                funcdto.setNome_funcionario(rs.getString("nome_funcionario"));
                funcdto.setTelefone_funcionario(rs.getString("telefone_funcionario"));
                funcdto.setCpf_funcionario(rs.getString("cpf_funcionario"));
                funcdto.setEmail_funcionario(rs.getString("email_funcionario"));
                funcdto.setEndereco_funcionario(rs.getString("endereco_funcionario"));
                funcdto.setSexo_funcionario(rs.getString("sexo_funcionario"));
                funcdto.setComentarios_funcionario(rs.getString("comentarios_funcionario"));
                funcdto.setImagem_funcionario("imagem_funcionario");
                funcionarios.add(funcdto);
            }
        }catch(SQLException erro){
            Logger.getLogger(CadastrarFuncionariosDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
        return funcionarios;
    }
    
    public void deletar(CadastrarFuncionariosDTO funcdto){
        try{
            pstm = conn.prepareStatement("DELETE FROM funcionarios WHERE id=?");
            pstm.setInt(1, funcdto.getId_funcionario());
            JOptionPane.showMessageDialog(null, "Funcionário(a) deletado(a) com sucesso!");
        }catch(SQLException erro){
            Logger.getLogger(CadastrarFuncionariosDAO.class.getName()).log(Level.SEVERE, null, erro);
        }
    }
}