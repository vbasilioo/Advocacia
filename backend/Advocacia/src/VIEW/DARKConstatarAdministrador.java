package VIEW;

import LOG.Log;
import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.border.Border;
import org.slf4j.LoggerFactory;

public class DARKConstatarAdministrador extends javax.swing.JFrame {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public DARKConstatarAdministrador() {
        initComponents();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoEmail = new javax.swing.JTextField();
        campoMensagem = new javax.swing.JTextField();
        campoEnviar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contatar Administrador");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        campoEmail.setBorder(null);

        campoMensagem.setBorder(null);

        campoEnviar.setBackground(new java.awt.Color(102, 102, 102));
        campoEnviar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoEnviar.setForeground(new java.awt.Color(51, 51, 51));
        campoEnviar.setText("Enviar");
        campoEnviar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoEnviar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEnviarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(204, 204, 204));
        jLabel1.setText("E-mail para contato");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(204, 204, 204));
        jLabel2.setText("Mensagem");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoEmail, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(campoMensagem))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel2)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(108, 108, 108))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addComponent(campoEnviar, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28))
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

    private void campoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnviarActionPerformed
        
        DARKERROConstatarAdministrador erroadm = new DARKERROConstatarAdministrador();
        erroadm.setVisible(true);
        if((campoMensagem.getText().isEmpty())&&(campoEmail.getText().isEmpty())){
            erroadm.setVisible(true);
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            campoMensagem.setBorder(border);
            campoEmail.setBorder(border);
        }
        else if((campoMensagem.getText().isEmpty())&&(campoEmail.getText().length() > 0)){
            erroadm.setVisible(true);
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            campoMensagem.setBorder(border);
            campoEmail.setBorder(border);
        }
        else if((campoEmail.getText().isEmpty())&&(campoMensagem.getText().length() > 0)){
            erroadm.setVisible(true);
            Border border = BorderFactory.createLineBorder(Color.RED, 2);
            campoMensagem.setBorder(border);
            campoEmail.setBorder(border);
        }
        else{
            campoMensagem.setBackground(new Color(248,248,255));
            campoEmail.setBackground(new Color(248,248,255));
            LOGGER.info("A mensagem foi enviada para o administrador com sucesso.");
        }
    }//GEN-LAST:event_campoEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEmail;
    private javax.swing.JButton campoEnviar;
    private javax.swing.JTextField campoMensagem;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
