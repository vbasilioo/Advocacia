package VIEW;

import DAO.MensagensDAO;
import DTO.MensagensDTO;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DARKCaixaEntradaAdministrador extends javax.swing.JFrame {

    public DARKCaixaEntradaAdministrador() {
        initComponents();
        listarMensagens();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        campoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMensagem = new javax.swing.JTable();
        campoLimpar = new javax.swing.JButton();
        campoRetornar = new javax.swing.JButton();
        campoResolvido = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        jScrollPane2.setViewportView(campoTexto);

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Comentario");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("E-mail");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Mensagem nº");

        tabelaMensagem = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabelaMensagem.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Usuário", "ID", "Mensagem"
            }
        ));
        tabelaMensagem.setCellSelectionEnabled(true);
        tabelaMensagem.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaMensagem.getTableHeader().setResizingAllowed(false);
        tabelaMensagem.getTableHeader().setReorderingAllowed(false);
        tabelaMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMensagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMensagem);

        campoLimpar.setBackground(new java.awt.Color(102, 102, 102));
        campoLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoLimpar.setForeground(new java.awt.Color(51, 51, 51));
        campoLimpar.setText("Limpar Informações");
        campoLimpar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLimparActionPerformed(evt);
            }
        });

        campoRetornar.setBackground(new java.awt.Color(102, 102, 102));
        campoRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoRetornar.setForeground(new java.awt.Color(51, 51, 51));
        campoRetornar.setText("Retornar");
        campoRetornar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRetornarActionPerformed(evt);
            }
        });

        campoResolvido.setBackground(new java.awt.Color(102, 102, 102));
        campoResolvido.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoResolvido.setForeground(new java.awt.Color(51, 51, 51));
        campoResolvido.setText("Problema resolvido");
        campoResolvido.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoResolvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoResolvidoActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(57, 57, 57)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(27, 27, 27))
                                    .addComponent(campoID)))
                            .addComponent(jScrollPane2)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 454, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(140, 140, 140)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoResolvido, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 191, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoResolvido, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoResolvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoResolvidoActionPerformed
        excluirMensagem();
        listarMensagens();
    }//GEN-LAST:event_campoResolvidoActionPerformed

    private void campoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRetornarActionPerformed
        DARKTelaAdministrador telaadm = new DARKTelaAdministrador();
        telaadm.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoRetornarActionPerformed

    private void campoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_campoLimparActionPerformed

    private void tabelaMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMensagemMouseClicked
        if(evt.getClickCount()==2){
            carregarCampos();
        }
    }//GEN-LAST:event_tabelaMensagemMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoID;
    private javax.swing.JButton campoLimpar;
    private javax.swing.JButton campoResolvido;
    private javax.swing.JButton campoRetornar;
    private javax.swing.JTextPane campoTexto;
    private javax.swing.JButton jButton1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTable tabelaMensagem;
    // End of variables declaration//GEN-END:variables

    private void listarMensagens(){
        try{
            MensagensDAO msgdao = new MensagensDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaMensagem.getModel();
            model.setNumRows(0);
            ArrayList<MensagensDTO> lista = msgdao.pesquisarMensagem();
            
            for(int i=0;i<lista.size();i++){
                model.addRow(new Object[]{
                   lista.get(i).getEmail_usuario(),
                   lista.get(i).getId_mensagem(),
                   lista.get(i).getMensagem_usuario()
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Usuarios" + erro);
        }
    }
    
    private void limparCampos(){
        campoEmail.setText("");
        campoID.setText("");
        campoTexto.setText("");
    }
    
    private void carregarCampos(){
        int setar = tabelaMensagem.getSelectedRow();
        campoEmail.setText(tabelaMensagem.getModel().getValueAt(setar, 0).toString());
        campoID.setText(tabelaMensagem.getModel().getValueAt(setar, 1).toString());
        campoTexto.setText(tabelaMensagem.getModel().getValueAt(setar, 2).toString());
    }
    
    private void excluirMensagem(){
        int id_mensagem;
        id_mensagem = Integer.parseInt(campoID.getText());
        
        MensagensDTO msgdto = new MensagensDTO();
        msgdto.setId_mensagem(id_mensagem);
        
        MensagensDAO msgdao = new MensagensDAO();
        msgdao.excluirMensagem(msgdto);
    }

}
