package DAO;

import DTO.AtualizarDTO;

public class AtualizarDAO {
    
   
    public void Excluir(int id, String db, String str)
    {
        CredencialDAO obj = new CredencialDAO();
        //System.out.println("tam: " +str.length());
        int tam = str.length();
        int q = obj.nIds(tam, str);
        int ids[];
        ids = new int[q];
        ids = obj.str2arr(q, tam, str);        
        AtualizarDTO conn = new AtualizarDTO();
        for(int i=0; i<q; i++)
        {
            
            conn.setIds(db, ids[i],RemoverID(conn.getIds(db, ids[i]), id));
           // System.out.println("------------------");
        }
        
    }
    
    public String RemoverID(String str, int alvo)
    {
        //System.out.println("string: " + str);
        String nstr="";
        int tamString = str.length();
        CredencialDAO obj = new CredencialDAO();
        int qids = obj.nIds(tamString, str);
        int ids[];
        ids = new int[qids];
        ids = obj.str2arr(qids, tamString, str);
        for(int i=0; i<qids; i++)
        {
            if(ids[i] != alvo)
            {
                nstr+= Integer.toString(ids[i]) +",";
            }
        }
        //System.out.println("new str: " +nstr);
        return nstr;
    }
    
    /*
    public static void main (String[] args)
    {
        AtualizarDAO obj = new AtualizarDAO();
        obj.Excluir( 2, "usuarios", "2,3,");
    }*/
}
