

/*Tutorial Blob: https://www.mysqltutorial.org/mysql-jdbc-blob
JfileChooser: https://docs.oracle.com/javase/7/docs/api/javax/swing/JFileChooser.html
*/
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
/**
 *
 * @author SaMuK
 */
public class ArquivosDTO {
    
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
            pstm.setString(2, nome);
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
    
    public void BaixarArquivo(int id, String nome)
    {
        String selectSQL = "SELECT arquivo FROM arquivos WHERE id_processo = ? AND nome = ?";
        rs = null;
        
        conn = new ConexaoDAO().conectaDB();
        
        try 
        {
            pstm = conn.prepareStatement(selectSQL);
            pstm.setInt(1, id);
            pstm.setString(2, nome);
            rs = pstm.executeQuery();
            
            File file = new File(nome);
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
    
    public static void main(String[] args) {
        ArquivosDTO obj = new ArquivosDTO();
        obj.BaixarArquivo(122, "hello.pdf");

    }
}
