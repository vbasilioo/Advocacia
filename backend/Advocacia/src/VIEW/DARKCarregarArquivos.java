package VIEW;

import UTILS.GerenteDeImagens;
import DTO.ArquivosDTO; 
import java.awt.FlowLayout;

public class DARKCarregarArquivos extends javax.swing.JFrame {

    GerenteDeImagens gdi = new GerenteDeImagens();
    ArquivosDTO obj = new ArquivosDTO();
    
    public DARKCarregarArquivos() {
        initComponents();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        upload = new javax.swing.JLabel();
        botaoUpload = new javax.swing.JButton();
        botaoRetornar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        upload.setIcon(new javax.swing.ImageIcon(getClass().getResource("/ICONS/pesquisar.png"))); // NOI18N
        upload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        upload.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                uploadMouseClicked(evt);
            }
        });

        botaoUpload.setBackground(new java.awt.Color(102, 102, 102));
        botaoUpload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoUpload.setForeground(new java.awt.Color(51, 51, 51));
        botaoUpload.setText("Upload");
        botaoUpload.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoUpload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoUploadActionPerformed(evt);
            }
        });

        botaoRetornar.setBackground(new java.awt.Color(102, 102, 102));
        botaoRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoRetornar.setForeground(new java.awt.Color(51, 51, 51));
        botaoRetornar.setText("Retornar");
        botaoRetornar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetornarActionPerformed(evt);
            }
        });

        jLabel1.setBackground(new java.awt.Color(204, 204, 204));
        jLabel1.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("Escolha o arquivo:");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(upload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(botaoUpload, javax.swing.GroupLayout.DEFAULT_SIZE, 184, Short.MAX_VALUE)
                            .addComponent(botaoRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(115, 115, 115)
                        .addComponent(jLabel1)))
                .addContainerGap(88, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(upload, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(botaoUpload, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void uploadMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_uploadMouseClicked
        if(evt.getClickCount()==2){
            gdi.escolherImagem(upload);
            obj.SalvarArquivo(122, "hello.pdf");
        }
    }//GEN-LAST:event_uploadMouseClicked

    private void botaoUploadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoUploadActionPerformed
        
    }//GEN-LAST:event_botaoUploadActionPerformed

    private void botaoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetornarActionPerformed
        DARKConsultarProcesso dcp = new DARKConsultarProcesso();
        dcp.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoRetornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoRetornar;
    private javax.swing.JButton botaoUpload;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JLabel upload;
    // End of variables declaration//GEN-END:variables
}
