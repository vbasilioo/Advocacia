package VIEW;

import DAO.UsuariosDAO;
import DTO.UsuariosDTO;
import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.BorderFactory;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;

public class JanelaDadosUsuario extends javax.swing.JFrame {

    public JanelaDadosUsuario() {
        initComponents();
        listarUsuarios();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        campoSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoCargo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoProcessos = new javax.swing.JTextField();
        campoLimpar = new javax.swing.JButton();
        campoSalvar = new javax.swing.JButton();
        campoCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        tabelaUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        tabelaUsuarios = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Nome", "Senha", "E-mail", "Cargo", "Processos"
            }
        ));
        tabelaUsuarios.setCellSelectionEnabled(true);
        tabelaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Senha");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cargo");

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Processos");

        campoLimpar.setBackground(new java.awt.Color(70, 130, 180));
        campoLimpar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoLimpar.setForeground(new java.awt.Color(255, 255, 255));
        campoLimpar.setText("Limpar Campos");
        campoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLimparActionPerformed(evt);
            }
        });

        campoSalvar.setBackground(new java.awt.Color(70, 130, 180));
        campoSalvar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoSalvar.setForeground(new java.awt.Color(255, 255, 255));
        campoSalvar.setText("Salvar");
        campoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalvarActionPerformed(evt);
            }
        });

        campoCancelar.setBackground(new java.awt.Color(70, 130, 180));
        campoCancelar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCancelar.setForeground(new java.awt.Color(255, 255, 255));
        campoCancelar.setText("Cancelar");
        campoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(117, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel6)
                    .addComponent(campoEmail)
                    .addComponent(campoSenha)
                    .addComponent(campoSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(campoProcessos)
                    .addComponent(campoNome)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(campoCargo)
                    .addComponent(campoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, 185, Short.MAX_VALUE))
                .addGap(98, 98, 98))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(52, 52, 52)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoProcessos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(42, 42, 42)
                .addComponent(campoLimpar)
                .addGap(18, 18, 18)
                .addComponent(campoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCancelar)
                .addGap(0, 35, Short.MAX_VALUE))
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

    private void campoSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSalvarActionPerformed
        editarUsuario();
        listarUsuarios();
        limparCampos();
    }//GEN-LAST:event_campoSalvarActionPerformed

    private void campoCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCancelarActionPerformed
        TelaAdministrador telaadm = new TelaAdministrador();
        telaadm.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoCancelarActionPerformed

    private void campoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_campoLimparActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        if(evt.getClickCount()==2){
            carregarCampos();
        }
    }//GEN-LAST:event_tabelaUsuariosMouseClicked

    private void listarUsuarios(){
        try{
            UsuariosDAO usudao = new UsuariosDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaUsuarios.getModel();
            model.setNumRows(0);
            ArrayList<UsuariosDTO> lista = usudao.pesquisarUsuario();
            
            for(int i=0;i<lista.size();i++){
                model.addRow(new Object[]{
                   lista.get(i).getNome_usuario(),
                   lista.get(i).getSenha_usuario(),
                   lista.get(i).getEmail_usuario(),
                   lista.get(i).getCargo_usuario(),
                   lista.get(i).getId_processo_associado()
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Usuarios" + erro);
        }
    }
    
    private void limparCampos(){
        campoNome.setText("");
        campoSenha.setText("");
        campoEmail.setText("");
        campoCargo.setText("");
        campoProcessos.setText("");
    }
    
    private void editarUsuario(){
        int id_usuario;
        String nome_usuario, senha_usuario, email_usuario, cargo_usuario, id_processo_associado;
        
        nome_usuario = campoNome.getText();
        senha_usuario = campoSenha.getText();
        email_usuario = campoEmail.getText();
        cargo_usuario = campoCargo.getText();
        id_processo_associado = campoProcessos.getText();
        
        UsuariosDTO usudto = new UsuariosDTO();
        usudto.setNome_usuario(nome_usuario);
        usudto.setSenha_usuario(senha_usuario);
        usudto.setEmail_usuario(email_usuario);
        usudto.setCargo_usuario(cargo_usuario);
        usudto.setId_processo_associado(id_processo_associado);
        
        UsuariosDAO usudao = new UsuariosDAO();
        usudao.editarUsuario(usudto);
    }
    
    private void carregarCampos(){
        int setar = tabelaUsuarios.getSelectedRow();
        
        campoNome.setText(tabelaUsuarios.getModel().getValueAt(setar, 0).toString());
        campoSenha.setText(tabelaUsuarios.getModel().getValueAt(setar, 1).toString());
        campoEmail.setText(tabelaUsuarios.getModel().getValueAt(setar, 2).toString());
        campoCargo.setText(tabelaUsuarios.getModel().getValueAt(setar, 3).toString());
        campoProcessos.setText(tabelaUsuarios.getModel().getValueAt(setar, 4).toString());
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campoCancelar;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JButton campoLimpar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoProcessos;
    private javax.swing.JButton campoSalvar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
