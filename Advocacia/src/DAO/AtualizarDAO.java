/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DAO;

import DTO.AtualizarDTO;


/**
 *
 * @author SaMuK
 */
public class AtualizarDAO {
    
   
    public void Excluir(int id, String db, String str)
    {
        CredencialDAO obj = new CredencialDAO();
        int q = obj.nIds(str.length(), str);
        int ids[];
        ids = new int[q];
        ids = obj.str2arr(q, str.length(), str);        
        AtualizarDTO conn = new AtualizarDTO();
        for(int i=0; i<q; i++)
        {
            conn.setIds(db, ids[i],RemoverID(conn.getIds(db, ids[i]), id));            
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
        //System.out.println("new string: " +nstr);
        return nstr;
    }
    
    /*
    public static void main (String[] args)
    {
        AtualizarDAO obj = new AtualizarDAO();
        obj.RemoverID("1,11,121,211,112,111,", 1);
    }*/
}
