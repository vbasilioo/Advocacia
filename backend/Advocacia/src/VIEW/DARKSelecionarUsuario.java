package VIEW;

import DAO.ConexaoDAO;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Vector;
import javax.swing.ListSelectionModel;

public class DARKSelecionarUsuario extends javax.swing.JFrame {

    public static Vector<String> nomes = new Vector<>();
    public static Vector<Integer> ids = new Vector<>();
    public static String text;
    public static int id;
    public static String nome;
    public static boolean adicionar;
    public static boolean cancelar;

    public DARKSelecionarUsuario() {
        nomes.clear();
        ids.clear();
        text="";
        nome="";
        id=0;
        adicionar = false;
        cancelar= false;
        initComponents();
        carregarLista();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        buttonRetornar = new javax.swing.JButton();
        buttonAdicionar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        listaUsuarios = new javax.swing.JList<>();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        buttonRetornar.setBackground(new java.awt.Color(102, 102, 102));
        buttonRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonRetornar.setForeground(new java.awt.Color(51, 51, 51));
        buttonRetornar.setText("Cancelar");
        buttonRetornar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRetornarActionPerformed(evt);
            }
        });

        buttonAdicionar.setBackground(new java.awt.Color(102, 102, 102));
        buttonAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonAdicionar.setForeground(new java.awt.Color(51, 51, 51));
        buttonAdicionar.setText("Adicionar");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        listaUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(buttonRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void buttonRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRetornarActionPerformed
        id=0;
        nome="";
        cancelar =true;
        dispose();
    }//GEN-LAST:event_buttonRetornarActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        if(id!=0)
        {
            adicionar=true;
            DARKCadastrarProcesso dep = new DARKCadastrarProcesso();
            dep.setVisible(true);
            dispose();
        }
        
    }//GEN-LAST:event_buttonAdicionarActionPerformed

    private void listaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listaUsuariosMouseClicked
        id=ids.elementAt(listaUsuarios.getSelectedIndex());
        nome=nomes.elementAt(listaUsuarios.getSelectedIndex());
    }//GEN-LAST:event_listaUsuariosMouseClicked

    
    private void carregarLista()
    {
        listaUsuarios.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        int tam = DARKCadastrarProcesso.vecIds.size();
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
                    if(result.getInt("id_usuario")==DARKCadastrarProcesso.vecIds.elementAt(i))break;
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
    public static void setCancelar(boolean x)
    {
        cancelar=x;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonRetornar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JList<String> listaUsuarios;
    // End of variables declaration//GEN-END:variables
}
