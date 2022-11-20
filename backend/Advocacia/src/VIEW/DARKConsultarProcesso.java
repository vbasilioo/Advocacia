package VIEW;

import DAO.ProcessosDAO;
import DTO.ProcessosDTO;
import LOG.Log;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.LoggerFactory;

public class DARKConsultarProcesso extends javax.swing.JFrame {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public DARKConsultarProcesso() {
        initComponents();
        listarProcessos();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoProcessos = new javax.swing.JTable();
        campoLista = new javax.swing.JButton();
        campoDownload = new javax.swing.JButton();
        campoCarregar = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        campoProcessos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoProcessos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        campoProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Processo", "Cliente", "Usuários Associados"
            }
        ));
        campoProcessos.setCellSelectionEnabled(true);
        campoProcessos.setGridColor(new java.awt.Color(255, 255, 255));
        campoProcessos.getTableHeader().setResizingAllowed(false);
        campoProcessos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(campoProcessos);

        campoLista.setBackground(new java.awt.Color(102, 102, 102));
        campoLista.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoLista.setForeground(new java.awt.Color(51, 51, 51));
        campoLista.setText("Lista de Documentos");
        campoLista.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        campoDownload.setBackground(new java.awt.Color(102, 102, 102));
        campoDownload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoDownload.setForeground(new java.awt.Color(51, 51, 51));
        campoDownload.setText("Baixar documento");
        campoDownload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDownloadActionPerformed(evt);
            }
        });

        campoCarregar.setBackground(new java.awt.Color(102, 102, 102));
        campoCarregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCarregar.setForeground(new java.awt.Color(51, 51, 51));
        campoCarregar.setText("Carregar Documento");
        campoCarregar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCarregarActionPerformed(evt);
            }
        });

        jButton1.setBackground(new java.awt.Color(102, 102, 102));
        jButton1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jButton1.setForeground(new java.awt.Color(51, 51, 51));
        jButton1.setText("Retornar");
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(campoLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(campoCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGap(55, 55, 55))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoLista, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(18, Short.MAX_VALUE))
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

    private void campoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCarregarActionPerformed
        DARKCarregarArquivos upload = new DARKCarregarArquivos();
        upload.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoCarregarActionPerformed

    private void campoDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDownloadActionPerformed
        DARKDownloadArquivos dda = new DARKDownloadArquivos();
        dda.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoDownloadActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        DARKTelaUsuario dtu = new DARKTelaUsuario();
        dtu.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void listarProcessos(){
        try{
            ProcessosDAO prodao = new ProcessosDAO();
            DefaultTableModel model = (DefaultTableModel) campoProcessos.getModel();
            model.setNumRows(0);
            ArrayList<ProcessosDTO> lista = prodao.pesquisarProcessos();
            
            for(int i=0;i<lista.size();i++){
                model.addRow(new Object[]{
                   lista.get(i).getId_processo(),
                   lista.get(i).getCliente(),
                   lista.get(i).getUsuario_associado()
                });
            }
            
            LOGGER.info("Os processos foram listados com sucesso.");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Processos" + erro);
            LOGGER.error("Falha ao listar os processos.");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campoCarregar;
    private javax.swing.JButton campoDownload;
    private javax.swing.JButton campoLista;
    private javax.swing.JTable campoProcessos;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
