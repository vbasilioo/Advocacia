package DTO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;



public class CredencialDTO{
    
    //Dados do Banco de Dados//
    private final String nomeBD = "advocacia"; //Nome do banco de dados
    private final String nomeTabela = "usuarios"; //Nome da tabela
    private final String unameBD = "advocacia"; //Nome do usuario do banco de dados
    private final String senhaBD = "12345"; //Senha do banco de dados
    private final String colunaIDusuario = "id_usuario"; //nome da coluna com o id do usuario
    private final String colunaNOMEusuario = "nome_usuario"; //nome da coluna com o nome do usuario
    private final String colunaCARGOusuario = "cargo_usuario"; //nome da coluna com o cargo do usuario
    private final String colunaIDprocessos = "id_processo_associado"; //come da coluna com os ids dos processos
    
    //Atributos da Classe//
    public int id;
    public String nome;
    public int cargo;
    public String idProcessos;
    
    public Connection getConnection(String NOME)// throws Exception
    {
        nome = NOME;
        try
        {
            String driver = "com.mysql.cj.jdbc.Driver";
            String url = "jdbc:mysql://localhost:3306/" +nomeBD;
            Class.forName(driver);
            
            String sql = "SELECT " +colunaIDusuario +", " +colunaNOMEusuario +", " +colunaCARGOusuario +", " +colunaIDprocessos +"  FROM " +nomeTabela;
            Connection conn = DriverManager.getConnection(url, unameBD, senhaBD);
            PreparedStatement pstm = conn.prepareStatement(sql);
            ResultSet rs = pstm.executeQuery(sql);
            
            while (rs.next())
            {
                if(nome.equals(rs.getString(colunaNOMEusuario)))
                {
                    id = rs.getInt(colunaIDusuario);
                    cargo = rs.getInt(colunaCARGOusuario);
                    idProcessos = rs.getString(colunaIDprocessos);                    
                    break;
                }
            }
            
            return conn;
        }catch(Exception e){System.out.println(e);}
        
        return null;
    }
    
}
