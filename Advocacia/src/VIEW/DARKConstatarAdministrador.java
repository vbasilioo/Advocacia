package VIEW;

import java.awt.Color;
import java.awt.FlowLayout;
import javax.swing.JButton;

public class DARKConstatarAdministrador extends javax.swing.JFrame {

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

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Contatar Administrador");

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        campoEmail.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "E-mail para contato", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 14))); // NOI18N

        campoMensagem.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Mensagem", javax.swing.border.TitledBorder.LEFT, javax.swing.border.TitledBorder.TOP, new java.awt.Font("Arial", 0, 14))); // NOI18N

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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoEmail)
                    .addComponent(campoMensagem))
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(159, Short.MAX_VALUE)
                .addComponent(campoEnviar)
                .addGap(114, 114, 114))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(38, 38, 38)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoMensagem, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(campoEnviar)
                .addContainerGap(33, Short.MAX_VALUE))
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

    private void campoEnviarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEnviarActionPerformed
        
        DARKERROConstatarAdministrador erroadm = new DARKERROConstatarAdministrador();
        erroadm.setVisible(true);
        /*if((campoMensagem.getText().isEmpty())&&(campoEmail.getText().isEmpty())){
            erroadm.setVisible(true);
            campoMensagem.setBackground(new Color(255,0,0));
            campoEmail.setBackground(new Color(255,0,0));
        }
        else if((campoMensagem.getText().isEmpty())&&(campoEmail.getText().length() > 0)){
            erroadm.setVisible(true);
            campoMensagem.setBackground(new Color(255,0,0));
            campoEmail.setBackground(new Color(248,248,255));
        }
        else if((campoEmail.getText().isEmpty())&&(campoMensagem.getText().length() > 0)){
            erroadm.setVisible(true);
            campoEmail.setBackground(new Color(255,0,0));
            campoMensagem.setBackground(new Color(248,248,255));
        }
        else{
            campoMensagem.setBackground(new Color(248,248,255));
            campoEmail.setBackground(new Color(248,248,255));
        }*/
    }//GEN-LAST:event_campoEnviarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoEmail;
    private javax.swing.JButton campoEnviar;
    private javax.swing.JTextField campoMensagem;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
