package VIEW;
import DAO.ConsultarDAO;

public class Consultar extends javax.swing.JFrame {

    ConsultarDAO consultdao = new ConsultarDAO();
    
    public Consultar() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        campoConsulta1 = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        campoPesquisa = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoTabela = new javax.swing.JTable();
        botaoImprimir = new javax.swing.JToggleButton();
        botaoRetornar = new javax.swing.JButton();
        botaoConsultar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Consultar");
        setBackground(new java.awt.Color(255, 255, 255));

        campoConsulta1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Nome", "CPF", "Sexo" }));

        jLabel1.setText("Consultar por:");

        jLabel2.setText("Digite a pesquisa:");

        campoTabela.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Nome", "CPF", "Sexo", "Endereco"
            }
        ));
        jScrollPane1.setViewportView(campoTabela);
        if (campoTabela.getColumnModel().getColumnCount() > 0) {
            campoTabela.getColumnModel().getColumn(3).setResizable(false);
        }

        botaoImprimir.setText("Imprimir");

        botaoRetornar.setText("Retornar");
        botaoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoRetornarActionPerformed(evt);
            }
        });

        botaoConsultar.setText("Consultar");
        botaoConsultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoConsultarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jLabel2))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(campoConsulta1, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(campoPesquisa, javax.swing.GroupLayout.PREFERRED_SIZE, 325, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(botaoRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(74, 74, 74)
                        .addComponent(botaoImprimir, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(botaoConsultar)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoPesquisa, javax.swing.GroupLayout.DEFAULT_SIZE, 30, Short.MAX_VALUE)
                    .addComponent(campoConsulta1))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 303, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoImprimir)
                    .addComponent(botaoRetornar)
                    .addComponent(botaoConsultar))
                .addContainerGap(82, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoRetornarActionPerformed
        new CRUD().setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoRetornarActionPerformed

    private void botaoConsultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoConsultarActionPerformed
        
    }//GEN-LAST:event_botaoConsultarActionPerformed



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JToggleButton botaoConsultar;
    private javax.swing.JToggleButton botaoImprimir;
    private javax.swing.JButton botaoRetornar;
    private javax.swing.JComboBox<String> campoConsulta1;
    private javax.swing.JTextField campoPesquisa;
    private javax.swing.JTable campoTabela;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
