package DAO;
import DTO.CredencialDTO;

public class CredencialDAO{
    
    public int id;
    public String nome;
    public int cargo;
    private String idProcessos;
    private int tamString;
    public int qProcessos;
    public int processos[];
    
    public void Credencial(String NOME) //Método Principal
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
    
    public void atCredenciais() //Atualizar dados
    {
        Credencial(nome);
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
    
    
    // Exemplo (Eliminar /* para testar
    /*public static void main(String args[])
    {
        CredencialDAO obj = new CredencialDAO();  
        obj.Credencial("vinicius"); //Método principal
    
        System.out.println("nome_usuario: " +obj.nome); //Atributos
        System.out.println("id_usuario: " +obj.id);
        System.out.println("cargo_usuario: " +obj.cargo);
        System.out.println("nº de processos: " +obj.qProcessos);    
        for(int i=0; i< obj.qProcessos; i++) System.out.println("processo " +(i+1) +": " +obj.processos[i]); //Maneira de acessar processos
    }*/
    
}
