package DAO;
import DTO.CredencialDTO;

public class CredencialDAO{
    
    public static int id;
    public static String nome;
    public static int cargo;
    private static String idProcessos;
    private static int tamString;
    public static int qProcessos;
    public static int processos[];
    
    public void Gerar(String NOME) //Método Principal
    {
        nome = NOME;
        qProcessos = 1;
        CredencialDTO conn = new CredencialDTO();
        conn.getConnection(nome);
        id = conn.id;
        cargo = conn.cargo;
        idProcessos = conn.idProcessos;
        if (idProcessos.equals("0")) qProcessos=0;
        if(qProcessos == 0)
        {
            tamString = 0;
        }
        else
        {
            tamString=idProcessos.length();
            qProcessos = nProcs();
            processos = new int[qProcessos];
            processos = str2arr();
        }
        
            
    }
    
    public void Atualizar() //Atualizar dados
    {
        Gerar(nome);
    }
    public void Reset()
    {
        id = cargo = qProcessos = 0;
        nome = idProcessos = "";
        processos = new int[0];
        
    }
        
    private int nProcs()//Retorna o número de ids de processos contidos na String
    {
        int quant=0;
        for(int i=0; i<tamString; i++)
        {
            if(idProcessos.charAt(i)==',') quant++;
        } 
        return quant;
    }
    
    
    private int[] str2arr()//Retorna um array de tamanho nProcs com os ids de cada processo contido na String 
    {
        int[] ids = new int[qProcessos];
        int pos=0;
        ids[pos]=pos;
        for(int i=0; i<tamString; i++)
        {
            if(idProcessos.charAt(i)==',')
            {
                pos++;
                if(pos==qProcessos)break;
                ids[pos]=0;                
            }
            else ids[pos]=ids[pos]*10 + (idProcessos.charAt(i) - '0');
        }
        return ids;         
    }
    
}
