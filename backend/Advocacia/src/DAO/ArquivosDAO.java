/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import VIEW.DARKTelaUsuario;
import DTO.ArquivosDTO;
import VIEW.TelaUsuario;
import LOG.Log;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
/**
 *
 * @author SaMuK
 */
public class ArquivosDAO {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    ArrayList<ArquivosDTO> tabela = new ArrayList<>();
    private int[] arquivos;
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public ResultSet listarArquivos(){
        conn = new ConexaoDAO().conectaDB();
        String sql = "SELECT * FROM arquivos WHERE id_processo = " +TelaUsuario.id_processo +" ORDER BY id_arquivo";
        
        try{
            pstm = conn.prepareStatement(sql);
            LOGGER.info("Os arquivos foram carregados com sucesso.");
            return pstm.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro em Listar Arquivos!" + erro);
            LOGGER.error("Os Arquivos não foram carregados");
            return null;
        }
    }
    
    public ResultSet DARKlistarArquivos(){
        conn = new ConexaoDAO().conectaDB();
        String sql = "SELECT * FROM arquivos WHERE id_processo = " +DARKTelaUsuario.id_processo +" ORDER BY id_arquivo";
        
        try{
            pstm = conn.prepareStatement(sql);
            LOGGER.info("Os arquivos foram carregados com sucesso.");
            return pstm.executeQuery();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Erro em Listar Arquivos!" + erro);
            LOGGER.error("Os Arquivos não foram carregados");
            return null;
        }
    }
    
    public ArrayList<ArquivosDTO> pesquisarArquivos(){
        String sql = "SELECT * FROM arquivos WHERE id_processo = " +TelaUsuario.id_processo +" ORDER BY id_arquivo";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ArquivosDTO arq = new ArquivosDTO();
                arq.setId_arquivo(rs.getInt("id_arquivo"));
                arq.setNome(rs.getString("nome"));
                tabela.add(arq);
                        
                   
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ProcessosDAO" + erro);
        }
        return tabela;
    }
    
    public ArrayList<ArquivosDTO> DARKpesquisarArquivos(){
        String sql = "SELECT * FROM arquivos WHERE id_processo = " +DARKTelaUsuario.id_processo +" ORDER BY id_arquivo";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            pstm = conn.prepareStatement(sql);
            rs = pstm.executeQuery();
            
            while(rs.next()){
                ArquivosDTO arq = new ArquivosDTO();
                arq.setId_arquivo(rs.getInt("id_arquivo"));
                arq.setNome(rs.getString("nome"));
                tabela.add(arq);
                        
                   
            }
            
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ProcessosDAO" + erro);
        }
        return tabela;
    }
    
}
