package VIEW;
import DTO.UsuariosDTO;
import DAO.UsuariosDAO;
import LOG.Log;
import java.awt.FlowLayout;
import org.slf4j.LoggerFactory;

public class DARKCadastrarUsuarioADM extends javax.swing.JFrame {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public DARKCadastrarUsuarioADM() {
        initComponents();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        campoRetornar = new javax.swing.JButton();
        campoCadastrar = new javax.swing.JButton();
        campoProcessos = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoCargo = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        campoSenha = new javax.swing.JPasswordField();
        jLabel4 = new javax.swing.JLabel();
        campoNome = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(102, 102, 102));

        campoRetornar.setBackground(new java.awt.Color(102, 102, 102));
        campoRetornar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoRetornar.setForeground(new java.awt.Color(51, 51, 51));
        campoRetornar.setText("Retornar");
        campoRetornar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRetornarActionPerformed(evt);
            }
        });

        campoCadastrar.setBackground(new java.awt.Color(102, 102, 102));
        campoCadastrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCadastrar.setForeground(new java.awt.Color(51, 51, 51));
        campoCadastrar.setText("Cadastrar");
        campoCadastrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCadastrarActionPerformed(evt);
            }
        });

        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Processos");

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("Cargo");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Email");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("Senha");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Formulário de Dados do Usuário");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(91, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel6)
                    .addComponent(campoEmail)
                    .addComponent(campoSenha)
                    .addComponent(campoCadastrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoProcessos)
                    .addComponent(campoNome)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(campoRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCargo))
                .addGap(88, 88, 88))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(29, 29, 29)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(8, 8, 8)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(11, 11, 11)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoCargo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoProcessos, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(27, 27, 27)
                .addComponent(campoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoRetornar, javax.swing.GroupLayout.DEFAULT_SIZE, 26, Short.MAX_VALUE)
                .addGap(25, 25, 25))
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

    private void campoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCadastrarActionPerformed
        
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
        usudao.cadastrarUsuario(usudto);
        
        LOGGER.info("O administrador cadastrou um usuário.");
    }//GEN-LAST:event_campoCadastrarActionPerformed

    private void campoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRetornarActionPerformed
        DARKTelaAdministrador telaadm = new DARKTelaAdministrador();
        telaadm.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoRetornarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campoCadastrar;
    private javax.swing.JTextField campoCargo;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoNome;
    private javax.swing.JTextField campoProcessos;
    private javax.swing.JButton campoRetornar;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    // End of variables declaration//GEN-END:variables
}
