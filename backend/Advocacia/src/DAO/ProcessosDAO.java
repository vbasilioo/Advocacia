package DAO;

import DTO.ProcessosDTO;
import LOG.Log;
import DAO.UsuariosDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ProcessosDAO{
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ProcessosDTO> tabela = new ArrayList<>();
    private int[] processos;
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    public String cliente;
    public String usuarios;
    
    public ResultSet listarProcessos(){
        conn = new ConexaoDAO().conectaDB();
        String sql = "SELECT * FROM processos ORDER BY id_processo";
        
        try{
            pstm = conn.prepareStatement(sql);
            LOGGER.info("Os processos foram carregados com sucesso.");
            CredencialDAO.gerarLog("Os processos foram carregados com sucesso.");
            return pstm.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro em Listar Processos!" + erro);
            LOGGER.error("Os processos não foram carregados.");
            CredencialDAO.gerarLog("Os processos não foram carregados.");
            return null;
        }
    }
    
    public ArrayList<ProcessosDTO> pesquisarProcessos(){
        String sql = "SELECT * FROM processos";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                
                for(int i=0;i< CredencialDAO.qProcessos; i++)
                {
                    if(CredencialDAO.processos[i] == rs.getInt("id_processo"))
                    {                        
                        ProcessosDTO prodto = new ProcessosDTO();
                        prodto.setId_processo(rs.getInt("id_processo"));
                        prodto.setCliente(rs.getString("cliente"));
                        prodto.setUsuario_associado(UsuariosDAO.ids2nomes(rs.getString("usuario_associado")));
                        tabela.add(prodto);
                        break;
                    }
                    
                }
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ProcessosDAO" + erro);
        }
        return tabela;
    }
    
    public void cadastrarProcessos(ProcessosDTO prodto){
        String sql = "INSERT INTO processos(id_processo, cliente, usuario_associado)"
                + "values (?,?,?)";
        
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setInt(1, prodto.getId_processo());
            pstm.setString(2, prodto.getCliente());
            pstm.setString(3, prodto.getUsuario_associado());
            pstm.execute();
            JOptionPane.showMessageDialog(null, "Processo cadastrado com sucesso!");
            LOGGER.info("Um processo foi cadastrado com sucesso.");
            CredencialDAO.gerarLog("Um processo foi cadastrado com sucesso.");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarProcessosDAO: " + erro);
            LOGGER.error("O processo não foi cadastrado.");
            CredencialDAO.gerarLog("O processo não foi cadastrado.");
        }
    }
    
    public void consultarProcessos(int id)
    {
        String selectSQL = "SELECT usuario_associado, cliente FROM processos WHERE id_processo = "+id;
        rs = null;
        
        conn = new ConexaoDAO().conectaDB();
        try
        {
            pstm = conn.prepareStatement(selectSQL);
            rs = pstm.executeQuery();
            System.out.println(rs);
            rs.next();
            cliente=rs.getString("cliente");
            usuarios=rs.getString("usuario_associado");
            
            }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }
    }
    
    public void editarProcesso(int id, String cliente, String usuarios)
    {
            String sql = "UPDATE processos SET cliente = ?, usuario_associado = ?"
                + "WHERE id_processo = ?";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, cliente);
            pstm.setString(2, usuarios);
            pstm.setInt(3, id);
            
            pstm.execute();
            LOGGER.info("Os dados do processo foram atualizados.");
            CredencialDAO.gerarLog("Os dados do processo foram atualizados.");
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Editar Processo" + erro);
            LOGGER.error("Não foi possível atualizar os dados do processo.");
            CredencialDAO.gerarLog("Não foi possível atualizar os dados do processo.");
        }
    }
    
    public void excluirProcesso(int id)
    {
        String selectSQL = "DELETE FROM Processos WHERE id_processo = ?";
        rs = null;
        
        conn = new ConexaoDAO().conectaDB();
        
        try 
        {
            pstm = conn.prepareStatement(selectSQL);
            pstm.setInt(1, id);
            //pstm.setString(2, nome);
            pstm.execute();
           
        }
        catch (SQLException e) {
            System.out.println(e.getMessage());
        }
    }
    public static void cadastProcessos(String cliente, String ids){
        String sql = "INSERT INTO processos(cliente, usuario_associado)"
                + "values (?,?)";
        
        Connection con = new ConexaoDAO().conectaDB();
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, cliente);
            ps.setString(2, ids);
            ps.execute();
            JOptionPane.showMessageDialog(null, "Processo cadastrado com sucesso!");
            LOGGER.info("Um processo foi cadastrado com sucesso.");
            CredencialDAO.gerarLog("Um rocesso foi cadastrado com sucesso.");
            ps.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "CadastrarProcessosDAO: " + erro);
            LOGGER.error("O processo não foi cadastrado.");
            CredencialDAO.gerarLog("O processo não foi cadastrado.");
        }
    }
    
    public static int ultId()
    {
        int id=0;
        
        String selectSQL = "SELECT id_processo FROM processos";
        ResultSet rs = null;
        
        Connection conn = new ConexaoDAO().conectaDB();
        try
        {
            PreparedStatement pstm = conn.prepareStatement(selectSQL);
            rs = pstm.executeQuery();
            System.out.println(rs);
            while(rs.next())
            {
              if(rs.getInt("id_processo")>id) id=rs.getInt("id_processo");
            }
            
            }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }
        return id;
    }
    
    }

