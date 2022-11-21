/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package VIEW;

import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ListSelectionModel;

/**
 *
 * @author SaMuK
 */
public class SelecionarUsuarios extends javax.swing.JFrame {

    public static Vector<String> nomes = new Vector<>();
    public static Vector<Integer> ids = new Vector<>();
    public static String text;
    public static int id;
    public static String nome;
    public static boolean adicionar;
    /**
     * Creates new form SelecionarUsuarios
     */
    public SelecionarUsuarios() {
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
        nomes.clear();
        ids.clear();
        text="";
        nome="";
        id=0;
        adicionar = false;
        initComponents();
        carregarLista();
        
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();
        buttonCancelar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        listaUsuarios.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listaUsuarios);

        buttonCancelar.setText("Cancelar");
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(buttonAdicionar)
                        .addGap(28, 28, 28)
                        .addComponent(buttonCancelar)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar)
                    .addComponent(buttonAdicionar))
                .addContainerGap(23, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        id=0;
        nome="";
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        // TODO add your handling code here:
        if(id!=0)
        {
            adicionar=true;
            EditarProcesso ep = new EditarProcesso();
            ep.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void listaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosMouseClicked
        // TODO add your handling code here:
        id=ids.elementAt(listaUsuarios.getSelectedIndex());
        nome=nomes.elementAt(listaUsuarios.getSelectedIndex());
    }//GEN-LAST:event_listaUsuariosMouseClicked

    
    private void carregarLista()
    {
        listaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int tam = EditarProcesso.vecIds.size();
        String selectSQL = "SELECT nome_usuario, id_usuario, cargo_usuario FROM usuarios";
        ResultSet result = null;
        PreparedStatement ps;
        boolean b=false;
        Connection c = new ConexaoDAO().conectaDB();
        try
        {
            ps = c.prepareStatement(selectSQL);
            result = ps.executeQuery();
            System.out.println(result);
            while(result.next())
            {
                for(int i=0; i<tam; i++)
                {
                    if(result.getInt("cargo_usuario")==0)break;
                    if(result.getInt("id_usuario")==EditarProcesso.vecIds.elementAt(i))break;
                    if(i==tam-1)b=true;
                }
                if(b)
                {
                    nomes.add(result.getString("nome_usuario"));
                    ids.add(result.getInt("id_usuario"));
                }
            }
            String[] nomesvec;
            nomesvec = new String[nomes.size()];
            for(int i=0; i<nomes.size(); i++)
            {
                nomesvec[i]=nomes.elementAt(i);
            }
            listaUsuarios.setListData(nomesvec);
            }catch(SQLException erro){
            System.out.println(erro.getMessage());
        }
        
    }
    
    public static void addUsuarios(boolean x)
    {
        adicionar=x;
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
