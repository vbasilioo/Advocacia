package VIEW;
package DAO;

public class CRUD extends javax.swing.JFrame {

    public CRUD() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuItem1 = new javax.swing.JMenuItem();
        jMenuItem2 = new javax.swing.JMenuItem();
        jMenuItem3 = new javax.swing.JMenuItem();
        jMenuItem4 = new javax.swing.JMenuItem();
        jMenuItem5 = new javax.swing.JMenuItem();
        jMenuBar1 = new javax.swing.JMenuBar();
        crudCadastrar = new javax.swing.JMenu();
        crudCadastrarFuncionarios = new javax.swing.JMenuItem();
        crudCadastrarProcesso = new javax.swing.JMenuItem();
        crudAlterar = new javax.swing.JMenu();
        crudAlterarFuncionarios = new javax.swing.JMenuItem();
        crudConsultar = new javax.swing.JMenu();
        crudListaFuncionarios = new javax.swing.JMenuItem();
        crudExcluir = new javax.swing.JMenu();
        crudExcluirFuncionarios = new javax.swing.JMenuItem();

        jMenuItem1.setText("jMenuItem1");

        jMenuItem2.setText("jMenuItem2");

        jMenuItem3.setText("jMenuItem3");

        jMenuItem4.setText("jMenuItem4");

        jMenuItem5.setText("jMenuItem5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        crudCadastrar.setText("Cadastrar");
        crudCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudCadastrarActionPerformed(evt);
            }
        });

        crudCadastrarFuncionarios.setText("Cadastrar Funcionários");
        crudCadastrarFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudCadastrarFuncionariosActionPerformed(evt);
            }
        });
        crudCadastrar.add(crudCadastrarFuncionarios);

        crudCadastrarProcesso.setText("Cadastrar Processo");
        crudCadastrarProcesso.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudCadastrarProcessoActionPerformed(evt);
            }
        });
        crudCadastrar.add(crudCadastrarProcesso);

        jMenuBar1.add(crudCadastrar);

        crudAlterar.setText("Alterar");

        crudAlterarFuncionarios.setText("Alterar Funcionários");
        crudAlterar.add(crudAlterarFuncionarios);

        jMenuBar1.add(crudAlterar);

        crudConsultar.setText("Consultar");

        crudListaFuncionarios.setText("Lista de Funcionários");
        crudListaFuncionarios.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                crudListaFuncionariosActionPerformed(evt);
            }
        });
        crudConsultar.add(crudListaFuncionarios);

        jMenuBar1.add(crudConsultar);

        crudExcluir.setText("Excluir");

        crudExcluirFuncionarios.setText("Excluir Funcionário");
        crudExcluir.add(crudExcluirFuncionarios);

        jMenuBar1.add(crudExcluir);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 762, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 482, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void crudCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudCadastrarActionPerformed
        //
    }//GEN-LAST:event_crudCadastrarActionPerformed
    
    private void crudCadastrarFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudCadastrarFuncionariosActionPerformed
        new CadastrarFuncionarios().setVisible(true);
        dispose();
    }//GEN-LAST:event_crudCadastrarFuncionariosActionPerformed

    private void crudListaFuncionariosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudListaFuncionariosActionPerformed

    }//GEN-LAST:event_crudListaFuncionariosActionPerformed

    private void crudCadastrarProcessoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_crudCadastrarProcessoActionPerformed
        new CadastrarProcesso().setVisible(true);
        dispose();
    }//GEN-LAST:event_crudCadastrarProcessoActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenu crudAlterar;
    private javax.swing.JMenuItem crudAlterarFuncionarios;
    private javax.swing.JMenu crudCadastrar;
    private javax.swing.JMenuItem crudCadastrarFuncionarios;
    private javax.swing.JMenuItem crudCadastrarProcesso;
    private javax.swing.JMenu crudConsultar;
    private javax.swing.JMenu crudExcluir;
    private javax.swing.JMenuItem crudExcluirFuncionarios;
    private javax.swing.JMenuItem crudListaFuncionarios;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuItem jMenuItem1;
    private javax.swing.JMenuItem jMenuItem2;
    private javax.swing.JMenuItem jMenuItem3;
    private javax.swing.JMenuItem jMenuItem4;
    private javax.swing.JMenuItem jMenuItem5;
    // End of variables declaration//GEN-END:variables
}
