package VIEW;
import DAO.CredencialDAO;
import DTO.UsuariosDTO;
import DAO.UsuariosDAO;
import LOG.Log;
import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Point;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.awt.Color;
import static java.lang.Thread.sleep;
import javax.swing.border.Border;
import javax.swing.BorderFactory;
import org.slf4j.LoggerFactory;

public class DARKLogin extends javax.swing.JFrame {
    
    Connection conn;
    PreparedStatement pstm;
    ResultSet rs;
    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log.class);

    private Point point = new Point();
    
    public DARKLogin() {
        initComponents();
        setLayout(new FlowLayout());
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenu1 = new javax.swing.JMenu();
        jMenu2 = new javax.swing.JMenu();
        jPasswordField1 = new javax.swing.JPasswordField();
        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        Login = new javax.swing.JPanel();
        campoUsuario = new javax.swing.JTextField();
        campoSenha = new javax.swing.JPasswordField();
        botaoEntrar = new javax.swing.JButton();
        botaoSair = new javax.swing.JButton();
        campoEsqueci = new javax.swing.JToggleButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel5 = new javax.swing.JLabel();
        botaoClaro = new javax.swing.JButton();
        botaoEscuro = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();

        jMenu1.setText("jMenu1");

        jMenu2.setText("jMenu2");

        jPasswordField1.setText("jPasswordField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Login");
        setBackground(new java.awt.Color(255, 255, 255));
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        setMinimumSize(new java.awt.Dimension(400, 410));
        setName("Login"); // NOI18N
        setUndecorated(true);
        setResizable(false);
        setSize(new java.awt.Dimension(400, 410));
        addMouseMotionListener(new java.awt.event.MouseMotionAdapter() {
            public void mouseDragged(java.awt.event.MouseEvent evt) {
                formMouseDragged(evt);
            }
        });
        addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                formMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                formMousePressed(evt);
            }
        });

        Login.setBackground(new java.awt.Color(102, 102, 102));

        campoUsuario.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoUsuario.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        campoUsuario.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                campoUsuarioFocusGained(evt);
            }
        });
        campoUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoUsuarioMouseClicked(evt);
            }
        });
        campoUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoUsuarioActionPerformed(evt);
            }
        });

        campoSenha.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoSenha.setToolTipText("");
        campoSenha.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));

        botaoEntrar.setBackground(new java.awt.Color(204, 204, 204));
        botaoEntrar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoEntrar.setForeground(new java.awt.Color(51, 51, 51));
        botaoEntrar.setText("Entrar");
        botaoEntrar.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoEntrar.setBorderPainted(false);
        botaoEntrar.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoEntrar.setFocusPainted(false);
        botaoEntrar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoEntrarMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoEntrarMouseExited(evt);
            }
        });
        botaoEntrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEntrarActionPerformed(evt);
            }
        });

        botaoSair.setBackground(new java.awt.Color(204, 204, 204));
        botaoSair.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoSair.setForeground(new java.awt.Color(51, 51, 51));
        botaoSair.setText("Sair");
        botaoSair.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        botaoSair.setBorderPainted(false);
        botaoSair.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        botaoSair.setFocusPainted(false);
        botaoSair.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoSairMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoSairMouseExited(evt);
            }
        });
        botaoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoSairActionPerformed(evt);
            }
        });

        campoEsqueci.setBackground(new java.awt.Color(204, 204, 204));
        campoEsqueci.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoEsqueci.setForeground(new java.awt.Color(51, 51, 51));
        campoEsqueci.setText("Esqueci minha senha");
        campoEsqueci.setBorder(null);
        campoEsqueci.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                campoEsqueciMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                campoEsqueciMouseExited(evt);
            }
        });
        campoEsqueci.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEsqueciActionPerformed(evt);
            }
        });

        jPanel2.setBackground(new java.awt.Color(51, 51, 51));
        jPanel2.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel5.setFont(new java.awt.Font("Arial", 1, 36)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(153, 153, 153));
        jLabel5.setText("SIGEA");

        botaoClaro.setBackground(new java.awt.Color(51, 51, 51));
        botaoClaro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoClaro.setForeground(new java.awt.Color(153, 153, 153));
        botaoClaro.setText("TEMA CLARO");
        botaoClaro.setBorderPainted(false);
        botaoClaro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoClaroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoClaroMouseExited(evt);
            }
        });
        botaoClaro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoClaroActionPerformed(evt);
            }
        });

        botaoEscuro.setBackground(new java.awt.Color(51, 51, 51));
        botaoEscuro.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        botaoEscuro.setForeground(new java.awt.Color(153, 153, 153));
        botaoEscuro.setText("TEMA ESCURO");
        botaoEscuro.setBorderPainted(false);
        botaoEscuro.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseEntered(java.awt.event.MouseEvent evt) {
                botaoEscuroMouseEntered(evt);
            }
            public void mouseExited(java.awt.event.MouseEvent evt) {
                botaoEscuroMouseExited(evt);
            }
        });
        botaoEscuro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoEscuroActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel3.setForeground(new java.awt.Color(153, 153, 153));
        jLabel3.setText("Sistema de Gerenciamento");

        jLabel4.setFont(new java.awt.Font("Arial", 2, 18)); // NOI18N
        jLabel4.setForeground(new java.awt.Color(153, 153, 153));
        jLabel4.setText("para Escritório de Advocacia");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(botaoClaro, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(botaoEscuro, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(252, 252, 252)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGap(64, 64, 64)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addGap(65, 65, 65)
                                .addComponent(jLabel5))
                            .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel2Layout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(jLabel3))))))
                .addContainerGap(74, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addComponent(jLabel5)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel4)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(76, 76, 76)
                .addComponent(botaoEscuro)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(botaoClaro)
                .addContainerGap())
        );

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setText("Usuário");

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Senha");

        javax.swing.GroupLayout LoginLayout = new javax.swing.GroupLayout(Login);
        Login.setLayout(LoginLayout);
        LoginLayout.setHorizontalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(campoSenha, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addComponent(campoUsuario, javax.swing.GroupLayout.DEFAULT_SIZE, 360, Short.MAX_VALUE)
                        .addComponent(botaoEntrar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addComponent(campoEsqueci, javax.swing.GroupLayout.PREFERRED_SIZE, 361, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2))
                .addContainerGap(23, Short.MAX_VALUE))
        );
        LoginLayout.setVerticalGroup(
            LoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, LoginLayout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(campoSenha, javax.swing.GroupLayout.PREFERRED_SIZE, 51, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(botaoEntrar, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(botaoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(36, 36, 36)
                .addComponent(campoEsqueci, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(43, 43, 43))
            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Login, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void botaoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_botaoSairActionPerformed

    private void botaoEntrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEntrarActionPerformed
        Point p = this.getLocation();
        DARKLogin Login = this;
        new Thread(){
            @Override
            public void run(){
                try{
                    Logar();
                    for(int i=0;i<5;i++){   
                        Login.setLocation(p.x - 10, p.y);
                        sleep(30);
                        Login.setLocation(p.x + 10, p.y);
                        sleep(30);
                    }
                    if((campoUsuario.getText().isEmpty())&&(campoSenha.getText().isEmpty())){
                            Border border = BorderFactory.createLineBorder(Color.RED, 2);
                            campoUsuario.setBorder(border);
                            campoSenha.setBorder(border);
                            LOGGER.info("O usuário não inseriu o 'usuário' e a 'senha' para autenticação.");
                            CredencialDAO.gerarLog("O usuário não inseriu o 'usuário' e a 'senha' para autenticação.");
                        }
                        else if((campoUsuario.getText().isEmpty())&&(campoSenha.getText().length() > 0)){
                            Border border = BorderFactory.createLineBorder(Color.RED, 2);
                            Border border2 = BorderFactory.createLineBorder(Color.BLACK, 1);
                            campoUsuario.setBorder(border);
                            campoSenha.setBorder(border2);
                            LOGGER.info("O usuário não inseriu o 'usuário' para autenticação.");
                            CredencialDAO.gerarLog("O usuário não inseriu o 'usuário' para autenticação.");
                        }
                        else if((campoSenha.getText().isEmpty())&&(campoUsuario.getText().length() > 0)){
                            Border border = BorderFactory.createLineBorder(Color.RED, 2);
                            Border border2 = BorderFactory.createLineBorder(Color.BLACK, 1);
                            campoUsuario.setBorder(border2);
                            campoSenha.setBorder(border);
                            LOGGER.info("O usuário não inseriu a 'senha' para autenticação.");
                            CredencialDAO.gerarLog("O usuário não inseriu a 'senha' para autenticação.");
                        }else if((campoSenha.getText().length() > 0)&&(campoUsuario.getText().length() > 0)){
                            Border border = BorderFactory.createLineBorder(Color.RED, 2);
                            campoUsuario.setBorder(border);
                            campoSenha.setBorder(border);
                        }
                }catch(InterruptedException ex){ 
                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    LOGGER.error("O usuário não conseguiu realizar a autenticação por falha na tela de login.");
                    CredencialDAO.gerarLog("O usuário não conseguiu realizar a autenticação por falha na tela de login.");
                }
            }
        }.start();
    }//GEN-LAST:event_botaoEntrarActionPerformed

    private void botaoEntrarMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEntrarMouseEntered
        
    }//GEN-LAST:event_botaoEntrarMouseEntered

    private void botaoSairMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseEntered
        
    }//GEN-LAST:event_botaoSairMouseEntered

    private void botaoEntrarMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEntrarMouseExited
       
    }//GEN-LAST:event_botaoEntrarMouseExited

    private void botaoSairMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoSairMouseExited
        
    }//GEN-LAST:event_botaoSairMouseExited

    private void formMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseClicked
        
    }//GEN-LAST:event_formMouseClicked

    private void formMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMousePressed
        point.x = evt.getX();
        point.y = evt.getY();
    }//GEN-LAST:event_formMousePressed

    private void formMouseDragged(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_formMouseDragged
        Point p = this.getLocation();
        this.setLocation(p.x + evt.getX() - point.x, p.y + evt.getY() - point.y);
    }//GEN-LAST:event_formMouseDragged

    private void campoEsqueciActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEsqueciActionPerformed
        new DARKConstatarAdministrador().setVisible(true);
    }//GEN-LAST:event_campoEsqueciActionPerformed

    private void campoUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoUsuarioMouseClicked
        campoUsuario.setText("");
    }//GEN-LAST:event_campoUsuarioMouseClicked

    private void campoUsuarioFocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_campoUsuarioFocusGained
       
    }//GEN-LAST:event_campoUsuarioFocusGained

    private void botaoEscuroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoEscuroActionPerformed
        DARKLogin darklog = new DARKLogin();
        darklog.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoEscuroActionPerformed

    private void campoEsqueciMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEsqueciMouseEntered
        
    }//GEN-LAST:event_campoEsqueciMouseEntered

    private void campoEsqueciMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoEsqueciMouseExited
       
    }//GEN-LAST:event_campoEsqueciMouseExited

    private void botaoEscuroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEscuroMouseEntered
        
    }//GEN-LAST:event_botaoEscuroMouseEntered

    private void botaoEscuroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoEscuroMouseExited
        
    }//GEN-LAST:event_botaoEscuroMouseExited

    private void botaoClaroMouseEntered(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoClaroMouseEntered
        
    }//GEN-LAST:event_botaoClaroMouseEntered

    private void botaoClaroMouseExited(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_botaoClaroMouseExited
        
    }//GEN-LAST:event_botaoClaroMouseExited

    private void campoUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoUsuarioActionPerformed
        
    }//GEN-LAST:event_campoUsuarioActionPerformed

    private void botaoClaroActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoClaroActionPerformed
        Login log = new Login();
        log.setVisible(true);
        dispose();
    }//GEN-LAST:event_botaoClaroActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel Login;
    private javax.swing.JButton botaoClaro;
    private javax.swing.JButton botaoEntrar;
    private javax.swing.JButton botaoEscuro;
    private javax.swing.JButton botaoSair;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JToggleButton campoEsqueci;
    private javax.swing.JPasswordField campoSenha;
    private javax.swing.JTextField campoUsuario;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu2;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPasswordField jPasswordField1;
    // End of variables declaration//GEN-END:variables

        
private void Logar(){
    try{
        
        String nome_usuario, senha_usuario;
        nome_usuario = campoUsuario.getText();
        senha_usuario = campoSenha.getText();

        UsuariosDTO funcdto = new UsuariosDTO();
        funcdto.setNome_usuario(nome_usuario);
        funcdto.setSenha_usuario(senha_usuario);

        UsuariosDAO funcdao = new UsuariosDAO();
        ResultSet rsusuariosdao = funcdao.autenticarUsuario(funcdto);
      
        if(rsusuariosdao.next()){
            CredencialDAO credencial = new CredencialDAO();
            credencial.Gerar(campoUsuario.getText());
                if(credencial.cargo==0){
                    DARKTelaAdministrador tadm = new DARKTelaAdministrador();
                    tadm.setVisible(true);
                    dispose();
                    LOGGER.info("O usuário acessou o sistema com o cargo [0] (Administrador).");
                    CredencialDAO.gerarLog("O usuário acessou o sitema com o cargo [1] (Usuário).");
                }
                else if(credencial.cargo==1){
                    DARKTelaUsuario tusu = new DARKTelaUsuario();
                    tusu.setVisible(true);
                    dispose();
                    LOGGER.info("O usuário acessou o sistema com o cargo [1] (Usuário).");
                    CredencialDAO.gerarLog("O usuário acessou o sistema com o cargo [1] (Usuário).");
                }else{
                    Border border = BorderFactory.createLineBorder(Color.RED, 1);
                    campoUsuario.setBorder(border);
                    campoSenha.setBorder(border);
                    LOGGER.info("O usuário não conseguiu acessar.");
                    CredencialDAO.gerarLog("O usuário não conseguiu acessar.");
                }
            }  
    }catch(SQLException erro){
        JOptionPane.showMessageDialog(null, "LOGAR" + erro);
        LOGGER.info("O usuário não conseguiu realizar o login.");
        CredencialDAO.gerarLog("O usuário não conseguiu realizar o login.");
    }
}

}
