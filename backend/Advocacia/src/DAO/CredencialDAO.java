package DAO;
import DTO.CredencialDTO;
import LOG.Log;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class CredencialDAO{
    
    public static int id;
    public static String nome;
    public static int cargo;
    private static String idProcessos;
    private static int tamString;
    public static int qProcessos;
    public static int processos[];
    
    private static final Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public static void Gerar(String NOME) //Método Principal
    {
        nome = NOME;
        qProcessos = 1;
        CredencialDTO conn = new CredencialDTO();
        conn.getConnection(nome);
        id = conn.id;
        cargo = conn.cargo;
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
    
}