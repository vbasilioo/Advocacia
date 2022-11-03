package VIEW;

import DAO.UsuariosDAO;
import DTO.UsuariosDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class JanelaDadosUsuario extends javax.swing.JFrame {

    public JanelaDadosUsuario() {
        initComponents();
        listarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        campoEmail = new javax.swing.JTextField();
        campoProcessos = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        campoSalvar = new javax.swing.JButton();
        campoCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoCancelar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();
        campoLimpar = new javax.swing.JButton();
        campoCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Formulário de Dados do Usuário");

        jLabel2.setText("Nome");

        jLabel3.setText("Email");

        jLabel4.setText("Senha");

        jLabel5.setText("Processos");

        campoSalvar.setText("Salvar");
        campoSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSalvarActionPerformed(evt);
            }
        });

        jLabel6.setText("Cargo");

        campoCancelar.setText("Cancelar");
        campoCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCancelarActionPerformed(evt);
            }
        });

        tabelaUsuarios.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
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
        tabelaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        jScrollPane1.setViewportView(tabelaUsuarios);

        campoLimpar.setText("Limpar Campos");
        campoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLimparActionPerformed(evt);
            }
        });

        campoCarregar.setText("Carregar Informações");
        campoCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(51, 51, 51)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 306, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(84, 84, 84)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
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
                            .addComponent(campoCargo, javax.swing.GroupLayout.DEFAULT_SIZE, 152, Short.MAX_VALUE)
                            .addComponent(campoCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoLimpar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addGap(24, 24, 24)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40)
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
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCarregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoLimpar)
                .addGap(18, 18, 18)
                .addComponent(campoSalvar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCancelar)
                .addGap(33, 33, 33))
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

    private void campoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCarregarActionPerformed
        carregarCampos();
    }//GEN-LAST:event_campoCarregarActionPerformed

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
        int id_usuario, cargo_usuario;
        String nome_usuario, senha_usuario, email_usuario, id_processo_associado;
        
        nome_usuario = campoNome.getText();
        senha_usuario = campoSenha.getText();
        email_usuario = campoEmail.getText();
        cargo_usuario = Integer.parseInt(campoCargo.getText());
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
    private javax.swing.JButton campoCarregar;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JButton campoLimpar;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoProcessos;
    private javax.swing.JButton campoSalvar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
