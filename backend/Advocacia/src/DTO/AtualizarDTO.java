package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class AtualizarDTO {
    
     //Dados do Banco de Dados//
    private final String nomeBD = "advocacia"; //Nome do banco de dados
    
    private final String unameBD = "advocacia"; //Nome do usuario do banco de dados
    private final String senhaBD = "12345"; //Senha do banco de dados
    
    private  String nomeTabela = "";
    private String colunaID = "id_usuario"; 
    private String colunaIDs = "id_processo_associado";
    
    private String ids;
    
    public void ConectarDB(String nome)
    {
        
    }
    
    public String getIds(String db, int id)
    {
         nomeTabela = db;
         
         if(db.equals("usuarios"))
         {
             colunaID = "id_usuario";
             colunaIDs = "id_processo_associado";
         }
         else if(db.equals("processos"))
         {
             colunaID = "id_processo";
             colunaIDs = "usuario_associado";
         }
         
        try
        {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/" +nomeBD;
            Class.forName(driver);
            
            String sql = "SELECT " +colunaID +", " +colunaIDs +"  FROM " +nomeTabela;
            Connection conn = DriverManager.getConnection(url, unameBD, senhaBD);
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);
            
            while (rs.next())
            {
                if(id == rs.getInt(colunaID))
                {
                    //System.out.println("id: " +id);
                    ids = rs.getString(colunaIDs);
                    //System.out.println("str: " +ids);                    
                    break;
                }
            }
            
        }catch(Exception e){System.out.println(e);}
        
        return ids;
    }
    
    public void setIds(String db, int id, String str)
    {
        nomeTabela = db;
         
         if(db.equals("usuarios"))
         {
             colunaID = "id_usuario";
             colunaIDs = "id_processo_associado";
         }
         else if(db.equals("processos"))
         {
             colunaID = "id_processo";
             colunaIDs = "usuario_associado";
         }
         
        try
        {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/" +nomeBD;
            Class.forName(driver);
            
            String sql = "UPDATE " +db +" SET " +colunaIDs +" = ?" +" WHERE " +colunaID +" = " +id;
            Connection conn = DriverManager.getConnection(url, unameBD, senhaBD);
            PreparedStatement pstm = conn.prepareStatement(sql);
            pstm.setString(1, str);
            pstm.execute();
            pstm.close();
            //ResultSet rs = pstm.executeQuery(sql);
            //System.out.println("Enviado");
                                
            
            
        }catch(Exception e){System.out.println(e);}
        
    }
    
}
