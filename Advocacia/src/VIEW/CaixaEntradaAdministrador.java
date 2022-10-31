package VIEW;

import DAO.MensagensDAO;
import DTO.MensagensDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class CaixaEntradaAdministrador extends javax.swing.JFrame {

    public CaixaEntradaAdministrador() {
        initComponents();
        listarMensagens();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaMensagem = new javax.swing.JTable();
        campoEmail = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        campoTexto = new javax.swing.JTextPane();
        jLabel2 = new javax.swing.JLabel();
        campoLimpar = new javax.swing.JButton();
        campoID = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        campoResolvido = new javax.swing.JButton();
        campoRetornar = new javax.swing.JButton();

        jButton1.setText("jButton1");

        jLabel3.setText("jLabel3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

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
        tabelaMensagem.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaMensagem.getTableHeader().setResizingAllowed(false);
        tabelaMensagem.getTableHeader().setReorderingAllowed(false);
        tabelaMensagem.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaMensagemMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaMensagem);

        jLabel1.setText("E-mail");

        jScrollPane2.setViewportView(campoTexto);

        jLabel2.setText("Comentario");

        campoLimpar.setText("Limpar Informações");
        campoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLimparActionPerformed(evt);
            }
        });

        jLabel4.setText("Mensagem nº");

        campoResolvido.setText("Problema resolvido");
        campoResolvido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoResolvidoActionPerformed(evt);
            }
        });

        campoRetornar.setText("Retornar");
        campoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 199, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel1)
                                    .addComponent(jLabel2))
                                .addGap(57, 57, 57)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel4)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(campoID))))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(campoLimpar, javax.swing.GroupLayout.PREFERRED_SIZE, 182, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(107, 107, 107))))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 409, javax.swing.GroupLayout.PREFERRED_SIZE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addComponent(campoRetornar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoResolvido)
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 109, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(12, 12, 12)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(campoLimpar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 62, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoResolvido)
                    .addComponent(campoRetornar))
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoResolvidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoResolvidoActionPerformed
        excluirMensagem();
        listarMensagens();
    }//GEN-LAST:event_campoResolvidoActionPerformed

    private void campoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRetornarActionPerformed
        TelaAdministrador telaadm = new TelaAdministrador();
        telaadm.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoRetornarActionPerformed

    private void campoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_campoLimparActionPerformed

    private void tabelaMensagemMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaMensagemMouseClicked
        carregarCampos();
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
