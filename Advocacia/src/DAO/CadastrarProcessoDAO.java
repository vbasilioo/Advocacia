package DAO;
import DTO.CadastrarProcessosDTO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class CadastrarProcessoDAO{
    
    Connection conn;
    PreparedStatement pstm;
    
    public void cadastrarProcesso(CadastrarProcessosDTO cadprocessos){
        String sql = "INSERT INTO processos(nome_processo, tipo_processo, natureza_processo, situacao_processo, artigo_processo, descricao_processo) values(?,?,?,?,?,?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cadprocessos.getNome_processo());
            pstm.setString(2, cadprocessos.getTipo_processo());
            pstm.setString(3, cadprocessos.getNatureza_processo());
            pstm.setString(4, cadprocessos.getSituacao_processo());
            pstm.setString(5, cadprocessos.getArtigo_processo());
            pstm.setString(6, cadprocessos.getDescricao_processo());
            pstm.execute();
            pstm.close();
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarProcessosDAO: " + erro);
        }
    }
    
}
