package DAO;
import DTO.CredencialDTO;
import LOG.Log;
import DTO.LogDTO;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CredencialDAO{
    
    private Connection conn;
    private PreparedStatement pstm;
    private ResultSet rs;
    
    public static int id;
    public static String nome;
    public static int cargo;
    private static String idProcessos;
    private static int tamString;
    public static int qProcessos;
    public static int processos[];
    public static String logs;
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public static void Gerar(String NOME) //Método Principal
    {
        nome = NOME;
        qProcessos = 1;
        CredencialDTO conn = new CredencialDTO();
        conn.getConnection(nome);
        id = conn.id;
        cargo = conn.cargo;
        baixarLog();
        if(cargo!=0)
        {
        idProcessos = conn.idProcessos;
        if (idProcessos.equals("0")) qProcessos=0;
        if(qProcessos == 0)
        {
            tamString = 0;
        }
        else
        {
            tamString=idProcessos.length();
            qProcessos = nIds(tamString, idProcessos);
            processos = new int[qProcessos];
            processos = str2arr(qProcessos, tamString, idProcessos);
        }
        }

    }
    
    public static void Atualizar() //Atualizar dados
    {
        Gerar(nome);
    }
    public static void Reset()
    {
        id = cargo = qProcessos = 0;
        nome = idProcessos = "";
        processos = new int[0];
        
    }
        
    public static int nIds(int tam, String str)//Retorna o número de ids de processos contidos na String
    {
        int quant=0;
        
        for(int i=0; i<tam; i++)
        {
            if(str.charAt(i)==',') quant++;
        } 
        return quant;
    }
    
    
    public static int[] str2arr(int q, int tam, String str)//Retorna um array de tamanho nProcs com os ids de cada processo contido na String 
    {
        int[] ids = new int[q];
        int pos=0;
        ids[pos]=pos;
        for(int i=0; i<tam; i++)
        {
            if(str.charAt(i)==',')
            {
                pos++;
                if(pos==q)break;
                ids[pos]=0;                
            }
            else ids[pos]=ids[pos]*10 + (str.charAt(i) - '0');
        }
        return ids;         
    }
    public static void gerarLog(String log)
    {
        logs+="%" +log;
        salvarLog();
        baixarLog();
    }
    
    public static void salvarLog()
    {
        String sql = "UPDATE logs SET Logs = ?"
            + "WHERE Nome = 'Log'";
        Connection conn = new ConexaoDAO().conectaDB();
        
        try{
            PreparedStatement pstm;
            pstm = conn.prepareStatement(sql);
            pstm.setString(1, logs);
            
            pstm.execute();
            pstm.close();
        }catch(SQLException erro){
            JOptionPane.showMessageDialog(null, "Atualizar log" + erro);
            LOGGER.error("Não foi possível atualizar os logs");
            CredencialDAO.gerarLog("Não foi possível atualizar os logs.");
        }
    }
    public static void baixarLog()
    {
        String selectSQL = "SELECT Logs FROM logs WHERE Nome = 'Log'";
        ResultSet rs = null;
        
        Connection conn = new ConexaoDAO().conectaDB();
        try
        {
            PreparedStatement pstm = conn.prepareStatement(selectSQL);
            rs = pstm.executeQuery();
            System.out.println(rs);
            rs.next();
            logs=rs.getString("Logs");
            
            }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }    
        
    }
    
    
    /*public static void testeLog(String log)
    {
        logs=log;
    }*/
}