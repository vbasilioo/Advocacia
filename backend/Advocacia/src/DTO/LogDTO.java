package DTO;

import DAO.ConexaoDAO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;

public class LogDTO{
    
    private int id_log;
    private String nome;
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public void salvarLog(int id_log, String log){
        
        String sql = "INSERT INTO logs (id_log, nome, arquivo_log) " +"values (?,?,?) ";
        conn = new ConexaoDAO().conectaDB();
        
        try{
            File file = new File(log);
            FileInputStream input = new FileInputStream(file);
            pstm = conn.prepareStatement(sql);
            
            pstm.setInt(1, id_log);
            boolean v=false;
            int pos=0;
            for(pos=log.length()-1; pos>=0; pos--)
            {
                if(log.charAt(pos)=='\\')break;
            }
            pos++;
            String n="";
            for(int i=pos; i<log.length(); i++)
            {
                n+=log.charAt(i);
            }
            
            
            System.out.println(n);
            pstm.setString(2, n);
            pstm.setBinaryStream(3, input);
            System.out.println("Reading file " + file.getAbsolutePath());
            System.out.println("Store file in the database.");
            pstm.execute();
            pstm.close();
        }catch(SQLException | FileNotFoundException e){
            System.out.println(e.getMessage());
        } 
    }
    
    public void baixarLog(int id_log, String local){
        String selectSQL = "SELECT arquivo_log FROM logs WHERE id_log = ?";
        rs = null;
        
        conn = new ConexaoDAO().conectaDB();
        
        try
        {
            pstm = conn.prepareStatement(selectSQL);
            pstm.setInt(1, id_log);
            //pstm.setString(2, nome);
            rs = pstm.executeQuery();
            System.out.println(rs);
            System.out.println("id: "+id_log);
            //System.out.println("nome: "+rs.getString("nome"));
            System.out.println("---");
            
            File file = new File(local);
            FileOutputStream output = new FileOutputStream(file);
            System.out.println("Writing to file " + file.getAbsolutePath());
            while (rs.next()) {
                InputStream input = rs.getBinaryStream("arquivo");
                byte[] buffer = new byte[1024];
                while (input.read(buffer) > 0) {
                    output.write(buffer);
                }
            }
        }
        catch (SQLException | IOException e) {
            System.out.println(e.getMessage());
        } finally {
            try {
                if (rs != null) {
                    rs.close();
                }
            } catch (SQLException e) {
                System.out.println(e.getMessage());
            }
        }
    }

    public int getId_log() {
        return id_log;
    }

    public void setId_log(int id_log) {
        this.id_log = id_log;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Connection getConn() {
        return conn;
    }

    public void setConn(Connection conn) {
        this.conn = conn;
    }

    public PreparedStatement getPstm() {
        return pstm;
    }

    public void setPstm(PreparedStatement pstm) {
        this.pstm = pstm;
    }

    public ResultSet getRs() {
        return rs;
    }

    public void setRs(ResultSet rs) {
        this.rs = rs;
    }
    
}
