package VIEW;

import DAO.CredencialDAO;
import DAO.ProcessosDAO;
import DAO.UsuariosDAO;
import static DAO.UsuariosDAO.consultarNome;
import DTO.ArquivosDTO;
import java.util.Vector;
import javax.swing.JFrame;
import javax.swing.ListSelectionModel;


public class DARKCadastrarProcesso extends javax.swing.JFrame {

    public static String[] nomes;
    public static int[] us;
    public static int id;
    public static int selec;
    private static String text; 
    private static String cliente;
    public static Vector<String> vecNomes = new Vector<>();
    public static Vector<Integer> vecIds = new Vector<>();
    public static Vector<String> proc = new Vector<String>();
    public static Vector<Integer> users = new Vector<Integer>();
    
    public DARKCadastrarProcesso() {
        
        if(DARKSelecionarUsuarios.adicionarDark)
        {
            text+=DARKSelecionarUsuarios.id +",";
            System.out.println("id: " +text);
            users.addElement(DARKSelecionarUsuarios.id);
            DARKSelecionarUsuarios.addUsuarios(false);
        }
        else
        {
            if(!DARKSelecionarUsuarios.cancelarDark)
            {
                text=CredencialDAO.id +",";
                cliente="";
                DARKSelecionarUsuarios.setCancelarDark(false);
            }
        }
        initComponents();
        id=0;
        selec = -1;
        fieldNome.setText(cliente);
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
        buttonCancelarDark = new javax.swing.JButton();
        buttonCadastrar = new javax.swing.JButton();

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
        labelID.setText("Novo Processo");

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

        buttonCancelarDark.setBackground(new java.awt.Color(102, 102, 102));
        buttonCancelarDark.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonCancelarDark.setForeground(new java.awt.Color(51, 51, 51));
        buttonCancelarDark.setText("Cancelar");
        buttonCancelarDark.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCancelarDark.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCancelarDarkActionPerformed(evt);
            }
        });

        buttonCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        buttonCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        buttonCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        buttonCadastrar.setText("Cadastrar");
        buttonCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        buttonCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                buttonCadastrarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(fieldNome, javax.swing.GroupLayout.PREFERRED_SIZE, 263, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 159, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCadastrar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(buttonRemover)
                            .addComponent(buttonAdicionar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(buttonCancelarDark, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(19, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(labelID, javax.swing.GroupLayout.PREFERRED_SIZE, 92, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(labelID)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
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
                        .addGap(41, 41, 41)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(buttonCancelarDark, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(buttonCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
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

    private void buttonCancelarDarkActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCancelarDarkActionPerformed
        // TODO add your handling code here:
        proc.clear();
        users.clear();
        text="";
        DARKTelaUsuario dtu = new DARKTelaUsuario();
        dtu.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonCancelarDarkActionPerformed

    private void buttonCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonCadastrarActionPerformed
        // TODO add your handling code here:
        System.out.println("Salvar");  
        ProcessosDAO.cadastProcessos(cliente, text);
        int ultId = ProcessosDAO.ultId();
        for(int i=0; i<vecIds.size(); i++)
        {
            UsuariosDAO.addProcesso(vecIds.elementAt(i), ultId);  
        }
        
        DARKTelaUsuario dtu = new DARKTelaUsuario();
        dtu.setVisible(true);
        CredencialDAO.Atualizar();
        text="";        
        dispose();
    }//GEN-LAST:event_buttonCadastrarActionPerformed

    private void listAdvogadosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listAdvogadosMouseClicked
        // TODO add your handling code here:
        selec = listAdvogados.getSelectedIndex();
        id=vecIds.elementAt(selec);
        System.out.println("id: " +id);
        
    }//GEN-LAST:event_listAdvogadosMouseClicked

    private void buttonRemoverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_buttonRemoverActionPerformed
        // TODO add your handling code here:
        if((selec!=-1)&&(vecIds.elementAt(selec) != CredencialDAO.id))
        {
        System.out.println("selecionado: " +vecNomes.elementAt(selec)+", id usuario: " +CredencialDAO.id);
        listAdvogados.removeAll();       
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
        cliente=fieldNome.getText();
        DARKSelecionarUsuarios dsu = new DARKSelecionarUsuarios();
        dsu.setVisible(true);
        dispose();
    }//GEN-LAST:event_buttonAdicionarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton buttonAdicionar;
    private javax.swing.JButton buttonCadastrar;
    private javax.swing.JButton buttonCancelarDark;
    private javax.swing.JButton buttonRemover;
    private javax.swing.JTextField fieldNome;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel labelID;
    private javax.swing.JList<String> listAdvogados;
    // End of variables declaration//GEN-END:variables
}
