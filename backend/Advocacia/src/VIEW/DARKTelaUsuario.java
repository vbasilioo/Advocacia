package VIEW;
import DAO.CredencialDAO;
import DAO.ProcessosDAO;
import DTO.ProcessosDTO;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class DARKTelaUsuario extends javax.swing.JFrame {
    
    public DARKTelaUsuario() {
        initComponents();
        listarProcessos();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton3 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        botaoCadastrar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaProcessos = new javax.swing.JTable();
        listarProcessos = new javax.swing.JButton();

        jButton3.setText("jButton3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        botaoCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        botaoCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        botaoCadastrar.setText("Cadastrar Processo");
        botaoCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(102, 102, 102));
        botaoSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(51, 51, 51));
        botaoSair.setText("Sair");
        botaoSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        tabelaProcessos.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaProcessos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabelaProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "ID", "Cliente", "Usuários Associados"
            }
        ));
        tabelaProcessos.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane2.setViewportView(tabelaProcessos);

        listarProcessos.setBackground(new java.awt.Color(102, 102, 102));
        listarProcessos.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        listarProcessos.setForeground(new java.awt.Color(51, 51, 51));
        listarProcessos.setText("Consultar Processos");
        listarProcessos.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        listarProcessos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listarProcessosActionPerformed(evt);
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
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(149, 149, 149)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(botaoSair, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(botaoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(listarProcessos, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 117, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(16, 16, 16)
                .addComponent(listarProcessos, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(131, 131, 131))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, 297, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        Login login = new Login();
        CredencialDAO.Reset();
        login.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        DARKCadastrarProcesso cp = new DARKCadastrarProcesso();
        cp.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void listarProcessosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listarProcessosActionPerformed
        DARKConsultarProcesso dcp = new DARKConsultarProcesso();
        dcp.setVisible(true);
        dispose();
    }//GEN-LAST:event_listarProcessosActionPerformed

    private void listarProcessos(){
        try{
            ProcessosDAO usudao = new ProcessosDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaProcessos.getModel();
            model.setNumRows(0);
            ArrayList<ProcessosDTO> lista = usudao.pesquisarProcessos();
                
            for(int i=0;i<lista.size();i++){
                model.addRow(new Object[]{
                   lista.get(i).getId_processo(),
                   lista.get(i).getCliente(),
                   lista.get(i).getUsuario_associado()
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Usuarios" + erro);
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoSair;
    private javax.swing.JButton jButton3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JButton listarProcessos;
    private javax.swing.JTable tabelaProcessos;
    // End of variables declaration//GEN-END:variables
}
