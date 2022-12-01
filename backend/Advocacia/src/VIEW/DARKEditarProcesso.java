package VIEW;

import DAO.CredencialDAO;
import DAO.ProcessosDAO;
import DAO.UsuariosDAO;
import static DAO.UsuariosDAO.consultarNome;
import DTO.ArquivosDTO;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;


public class DARKEditarProcesso extends javax.swing.JFrame {

    public static String[] nomes;
    public static int[] us;
    public static int id;
    public static int selec;
    private String text; 
    public static Vector<String> vecNomes = new Vector<>();
    public static Vector<Integer> vecIds = new Vector<>();
    public static Vector<String> proc = new Vector<String>();
    public static Vector<Integer> users = new Vector<Integer>();
    
    public DARKEditarProcesso() {
        
        
            
        
        text=DARKConsultarProcesso.usuarios;
        if(DARKSelecionarUsuarios.adicionarDark)
        {
            text+=DARKSelecionarUsuarios.id +",";
            System.out.println("id: " +text);
            users.addElement(DARKSelecionarUsuarios.id);
            proc.addElement("add");
            System.out.println(" proc: " +proc);
            System.out.println("users:" +users);
            DARKSelecionarUsuarios.addUsuarios(false);
        }
        initComponents();
        id=0;
        selec = -1;
        labelID.setText("Processo nº" +DARKTelaUsuario.id_processo);
        fieldNome.setText(DARKConsultarProcesso.cliente);
        lista(text);
        
        
        
        
    }
    private void lista(String ids)
    {        
        int qUsuarios;
        qUsuarios = CredencialDAO.nIds(ids.length(), ids);
        us = new int[qUsuarios];
        us=CredencialDAO.str2arr(qUsuarios, ids.length(), ids);
        listAdvogados.setSelectionMode(ListSelectionModel.SINGLE_SELECTION);
        nomes = new String[qUsuarios];
        vecIds.clear();
        vecNomes.clear();
        for(int i=0; i<qUsuarios; i++)
        {
            vecIds.add(i, us[i]);
            vecNomes.add(i, (String)consultarNome(vecIds.elementAt(i)));
            nomes[i]= consultarNome(us[i]);
                        
        }
        listAdvogados.setListData(nomes);
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        listAdvogados = new javax.swing.JList<>();
        jLabel3 = new javax.swing.JLabel();
        fieldNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        labelID = new javax.swing.JLabel();
        buttonAdicionar = new javax.swing.JButton();
        buttonRemover = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        buttonCancelar = new javax.swing.JButton();
        buttonSalvar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        listAdvogados.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        listAdvogados.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        listAdvogados.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listAdvogadosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(listAdvogados);

        jLabel3.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel3.setText("Advogados associados:");

        fieldNome.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                fieldNomeActionPerformed(evt);
            }
        });

        jLabel2.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel2.setText("Nome do cliente:");

        labelID.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        labelID.setText("Processo n°");

        buttonAdicionar.setBackground(new java.awt.Color(102, 102, 102));
        buttonAdicionar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonAdicionar.setForeground(new java.awt.Color(51, 51, 51));
        buttonAdicionar.setText("Adicionar advogado");
        buttonAdicionar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonAdicionar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonAdicionarActionPerformed(evt);
            }
        });

        buttonRemover.setBackground(new java.awt.Color(102, 102, 102));
        buttonRemover.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonRemover.setForeground(new java.awt.Color(51, 51, 51));
        buttonRemover.setText("Remover selecionado");
        buttonRemover.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonRemover.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonRemoverActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Excluir processo");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        buttonCancelar.setBackground(new java.awt.Color(102, 102, 102));
        buttonCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonCancelar.setForeground(new java.awt.Color(51, 51, 51));
        buttonCancelar.setText("Cancelar");
        buttonCancelar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarActionPerformed(evt);
            }
        });

        buttonSalvar.setBackground(new java.awt.Color(102, 102, 102));
        buttonSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonSalvar.setForeground(new java.awt.Color(51, 51, 51));
        buttonSalvar.setText("Salvar");
        buttonSalvar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonSalvarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(96, 96, 96)
                        .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(buttonRemover, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jButton1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addComponent(buttonAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(19, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(11, 11, 11)
                .addComponent(labelID)
                .addGap(18, 18, 18)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 96, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(buttonAdicionar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(buttonRemover, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(13, 13, 13)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 65, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
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

    private void fieldNomeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_fieldNomeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_fieldNomeActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        // TODO add your handling code here:
        DARKJanelaConfirmação djc = new DARKJanelaConfirmação();
        djc.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void buttonCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarActionPerformed
        // TODO add your handling code here:
        proc.clear();
        users.clear();
        DARKConsultarProcesso dcp = new DARKConsultarProcesso();
        dcp.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonCancelarActionPerformed

    private void buttonSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonSalvarActionPerformed
        // TODO add your handling code here:
        System.out.println("Salvar");
        System.out.println(" proc: " +proc);
        System.out.println("users:" +users);        
        for(int i=0; i<proc.size(); i++)
        {
            
            if(proc.elementAt(i).equals("add"))
            {
                System.out.println("ADD"); 
                System.out.println(" ao usuario: " +users.elementAt(i));
                System.out.println("id:" +DARKTelaUsuario.id_processo);
                
                UsuariosDAO.addProcesso(users.elementAt(i), DARKTelaUsuario.id_processo);
            }
            else
            {
                System.out.println("REM");
                UsuariosDAO.remProcesso(users.elementAt(i), DARKTelaUsuario.id_processo);
            }
        }
        
        ProcessosDAO p = new ProcessosDAO();
        p.editarProcesso(DARKTelaUsuario.id_processo, fieldNome.getText(), text);
        DARKConsultarProcesso dcp = new DARKConsultarProcesso();
        dcp.setVisible(true);
        proc.clear();
        users.clear();        
        dispose();
    }//GEN-LAST:event_buttonSalvarActionPerformed

    private void listAdvogadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAdvogadosMouseClicked
        // TODO add your handling code here:
        selec = listAdvogados.getSelectedIndex();
        id=vecIds.elementAt(selec);
        System.out.println("id: " +id);
        
    }//GEN-LAST:event_listAdvogadosMouseClicked

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        // TODO add your handling code here:
        if(selec!=-1)
        {
        System.out.println("nome: " +vecNomes.elementAt(selec));
        listAdvogados.removeAll();
        proc.add("rem");
        users.add(vecIds.elementAt(selec));
        System.out.println(" proc: " +proc);
        System.out.println("users:" +users);
        vecIds.remove(selec);
        vecNomes.remove(selec);
        System.out.println("*");
        text = "";
        for(int i=0; i<vecIds.size(); i++) text+=vecIds.elementAt(i) +",";
        lista(text);
        System.out.println(text);      
        id=0;
        selec=-1;
        
        }
        
            
    }//GEN-LAST:event_buttonRemoverActionPerformed

    private void buttonAdicionarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonAdicionarActionPerformed
        // TODO add your handling code here:
        DARKSelecionarUsuarios dsu = new DARKSelecionarUsuarios();
        dsu.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonAdicionarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCancelar;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JButton buttonSalvar;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JList<String> listAdvogados;
    // End of variables declaration//GEN-END:variables
}
