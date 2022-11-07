package VIEW;

import java.awt.FlowLayout;

public class TelaAdministrador extends javax.swing.JFrame {

    public TelaAdministrador() {
        initComponents();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoSair = new javax.swing.JButton();
        CampoLOGs = new javax.swing.JButton();
        campoConsultar = new javax.swing.JButton();
        campoCadastrar = new javax.swing.JButton();
        campoCaixaEntrada = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoSair.setBackground(new java.awt.Color(70, 130, 180));
        campoSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoSair.setForeground(new java.awt.Color(255, 255, 255));
        campoSair.setText("Sair");
        campoSair.setBorder(null);
        campoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSairActionPerformed(evt);
            }
        });

        CampoLOGs.setBackground(new java.awt.Color(70, 130, 180));
        CampoLOGs.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        CampoLOGs.setForeground(new java.awt.Color(255, 255, 255));
        CampoLOGs.setText("Consultar LOGs");
        CampoLOGs.setBorder(null);

        campoConsultar.setBackground(new java.awt.Color(70, 130, 180));
        campoConsultar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoConsultar.setForeground(new java.awt.Color(255, 255, 255));
        campoConsultar.setText("Consultar Usuários");
        campoConsultar.setBorder(null);
        campoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoConsultarActionPerformed(evt);
            }
        });

        campoCadastrar.setBackground(new java.awt.Color(70, 130, 180));
        campoCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCadastrar.setForeground(new java.awt.Color(255, 255, 255));
        campoCadastrar.setText("Cadastrar Usuário");
        campoCadastrar.setBorder(null);
        campoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastrarActionPerformed(evt);
            }
        });

        campoCaixaEntrada.setBackground(new java.awt.Color(70, 130, 180));
        campoCaixaEntrada.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCaixaEntrada.setForeground(new java.awt.Color(255, 255, 255));
        campoCaixaEntrada.setText("Caixa de Entrada");
        campoCaixaEntrada.setBorder(null);
        campoCaixaEntrada.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCaixaEntradaActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(campoSair, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(CampoLOGs, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCaixaEntrada, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCadastrar, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoConsultar, javax.swing.GroupLayout.DEFAULT_SIZE, 331, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(28, Short.MAX_VALUE)
                .addComponent(campoCaixaEntrada, javax.swing.GroupLayout.PREFERRED_SIZE, 41, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoConsultar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(CampoLOGs, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(campoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
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

    private void campoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSairActionPerformed
        Login login = new Login();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoSairActionPerformed

    private void campoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastrarActionPerformed
        CadastrarUsuarioADM cadusu = new CadastrarUsuarioADM();
        cadusu.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoCadastrarActionPerformed

    private void campoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoConsultarActionPerformed
        ListaUsuarios listar = new ListaUsuarios();
        listar.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoConsultarActionPerformed

    private void campoCaixaEntradaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCaixaEntradaActionPerformed
        CaixaEntradaAdministrador cea = new CaixaEntradaAdministrador();
        cea.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoCaixaEntradaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CampoLOGs;
    private javax.swing.JButton campoCadastrar;
    private javax.swing.JButton campoCaixaEntrada;
    private javax.swing.JButton campoConsultar;
    private javax.swing.JButton campoSair;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
