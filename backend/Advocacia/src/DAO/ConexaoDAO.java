package DAO;

import LOG.Log;
import java.sql.Connection;
import javax.swing.JOptionPane;
import java.sql.DriverManager;
import java.sql.SQLException;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class ConexaoDAO{
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public Connection conectaDB(){
        Connection conn = null;
        try{
            String url = "jdbc:mysql://localhost:3306/advocacia?user=root&password=";
            conn = DriverManager.getConnection(url);
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "ConexaoDAO" + erro.getMessage());
            LOGGER.error("O banco de dados não foi conectado.");
            CredencialDAO.gerarLog("O banco de dados não foi conectado.");
        }
        return conn;
    }
}