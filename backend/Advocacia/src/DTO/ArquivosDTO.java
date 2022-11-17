package DTO;

import DAO.ConexaoDAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.ResultSet;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import javax.swing.JFileChooser;

public class ArquivosDTO {
    
    private int id_arquivo;
    private String nome;
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
   
    
    public void SalvarArquivo(int id, String nome)
    {
        String updateSQL = "INSERT INTO arquivos (id_processo, nome, arquivo) " +"values (?,?,?) ";
        
        conn = new ConexaoDAO().conectaDB();
        
        try  {

            // read the file
            File file = new File(nome);
            FileInputStream input = new FileInputStream(file);
            pstm = conn.prepareStatement(updateSQL);
            
            pstm.setInt(1, id);
            boolean v=false;
            int pos=0;
            for(pos=nome.length()-1; pos>=0; pos--)
            {
                if(nome.charAt(pos)=='\\')break;
            }
            pos++;
            String n="";
            for(int i=pos; i<nome.length(); i++)
            {
                n+=nome.charAt(i);
            }
            
            
            System.out.println(n);
            pstm.setString(2, n);
            pstm.setBinaryStream(3, input);
            System.out.println("Reading file " + file.getAbsolutePath());
            System.out.println("Store file in the database.");
            pstm.execute();
            pstm.close();
            
    }
        catch(SQLException | FileNotFoundException e) {
            System.out.println(e.getMessage());
        } 
}
    
    public void BaixarArquivo(int id)
    {
        String selectSQL = "SELECT arquivo, nome FROM arquivos WHERE id_arquivo = ?";
        rs = null;
        
        conn = new ConexaoDAO().conectaDB();
        
        try 
        {
            pstm = conn.prepareStatement(selectSQL);
            pstm.setInt(1, id);
            //pstm.setString(2, nome);
            rs = pstm.executeQuery();
            
            File file = new File(rs.getString("nome"));
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
    public int getId_arquivo() {
        return id_arquivo;
    }

    public void setId_arquivo(int id_arquivo) {
        this.id_arquivo = id_arquivo;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    /*
    public static void main(String[] args) {
        ArquivosDTO obj = new ArquivosDTO();
        obj.SalvarArquivo(1, "hello.pdf");

    }*/}
