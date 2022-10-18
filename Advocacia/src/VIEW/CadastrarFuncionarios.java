package VIEW;
import DAO.ConexaoDAO;
import DTO.FuncionariosDTO;
import DAO.FuncionariosDAO;
import UTILS.GerenteDeImagens;
import java.sql.ResultSet;
import java.sql.SQLException;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class CadastrarFuncionarios extends javax.swing.JFrame{

    ResultSet rs;
    GerenteDeImagens gerenteDeImagens = new GerenteDeImagens();
    FuncionariosDAO cadfuncdao = new FuncionariosDAO();
    FuncionariosDTO funcdto = new FuncionariosDTO();
    
    public CadastrarFuncionarios(){
        initComponents();
        listarValores();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        buttonGroup2 = new javax.swing.ButtonGroup();
        buttonGroup3 = new javax.swing.ButtonGroup();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        campoMasculino = new javax.swing.JRadioButton();
        campoFeminino = new javax.swing.JRadioButton();
        campoNaoIdentificado = new javax.swing.JRadioButton();
        Telefone = new javax.swing.JLabel();
        campoEmail = new javax.swing.JTextField();
        campoTelefone = new javax.swing.JTextField();
        campoNome = new javax.swing.JTextField();
        campoCPF = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        campoEndereco = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        imagemF = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        botaoExcluir = new javax.swing.JButton();
        botaoCadastrar = new javax.swing.JButton();
        jTextField6 = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoComentarios = new javax.swing.JTextArea();
        jPanel4 = new javax.swing.JPanel();
        campoSair = new javax.swing.JButton();
        campoRetornar = new javax.swing.JButton();
        alterarFuncionario = new javax.swing.JButton();
        campoID = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        botaoPesquisar = new javax.swing.JButton();
        campoLimpar = new javax.swing.JButton();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaFuncionario = new javax.swing.JTable();
        campoCarregar = new javax.swing.JToggleButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Cadastro de Funcionários");
        setResizable(false);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        jLabel1.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("Cadastrar Funcionários");
        jLabel1.setBorder(javax.swing.BorderFactory.createEtchedBorder());

        jLabel2.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel2.setText("Nome");

        jLabel3.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel3.setText("Telefone");

        jLabel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel4.setText("E-mail");

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));
        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Sexo", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Arial", 1, 14))); // NOI18N

        campoMasculino.setBackground(new java.awt.Color(255, 255, 255));
        campoMasculino.setText("Masculino");

        campoFeminino.setBackground(new java.awt.Color(255, 255, 255));
        campoFeminino.setText("Feminino");

        campoNaoIdentificado.setBackground(new java.awt.Color(255, 255, 255));
        campoNaoIdentificado.setText("Não identificado");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(campoNaoIdentificado)
                    .addComponent(campoFeminino)
                    .addComponent(campoMasculino))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(campoMasculino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoFeminino)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoNaoIdentificado)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        Telefone.setBackground(new java.awt.Color(255, 255, 255));
        Telefone.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        Telefone.setText("CPF");

        jLabel5.setBackground(new java.awt.Color(255, 255, 255));
        jLabel5.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel5.setText("Endereço");

        jLabel7.setBackground(new java.awt.Color(255, 255, 255));
        jLabel7.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel7.setText("Comentários");

        imagemF.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/cliente.png"))); // NOI18N
        imagemF.setBorder(javax.swing.BorderFactory.createEtchedBorder());
        imagemF.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        imagemF.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                imagemFMouseClicked(evt);
            }
        });

        jPanel3.setBackground(new java.awt.Color(255, 255, 255));

        botaoExcluir.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoExcluir.setText("Excluir");
        botaoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoExcluirActionPerformed(evt);
            }
        });

        botaoCadastrar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        botaoCadastrar.setText("Cadastrar");
        botaoCadastrar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoCadastrarActionPerformed(evt);
            }
        });

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icons/pesquisar.png"))); // NOI18N

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(4, 4, 4)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(botaoExcluir, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoCadastrar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jTextField6)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(botaoCadastrar)
                    .addComponent(botaoExcluir))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jTextField6)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        campoComentarios.setColumns(20);
        campoComentarios.setRows(5);
        jScrollPane1.setViewportView(campoComentarios);

        jPanel4.setBackground(new java.awt.Color(255, 255, 255));
        jPanel4.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N

        campoSair.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campoSair.setText("Sair");
        campoSair.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoSairActionPerformed(evt);
            }
        });

        campoRetornar.setFont(new java.awt.Font("Arial", 1, 12)); // NOI18N
        campoRetornar.setText("Retornar");
        campoRetornar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoRetornarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addComponent(campoSair, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoRetornar, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                .addComponent(campoSair)
                .addComponent(campoRetornar))
        );

        alterarFuncionario.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        alterarFuncionario.setText("Alterar");
        alterarFuncionario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                alterarFuncionarioActionPerformed(evt);
            }
        });

        campoID.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        jLabel6.setText("ID");

        botaoPesquisar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        botaoPesquisar.setText("Pesquisar");
        botaoPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                botaoPesquisarActionPerformed(evt);
            }
        });

        campoLimpar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campoLimpar.setText("Limpar");
        campoLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoLimparActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addContainerGap())
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(alterarFuncionario, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(35, 35, 35)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(campoID)
                                    .addComponent(imagemF)))
                            .addComponent(botaoPesquisar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoLimpar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(36, 36, 36)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(campoCPF)
                                    .addComponent(campoNome)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel5)
                                            .addComponent(Telefone)
                                            .addComponent(jLabel4)
                                            .addComponent(jLabel2))
                                        .addGap(0, 319, Short.MAX_VALUE))
                                    .addComponent(campoEmail)
                                    .addComponent(campoEndereco))
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addGap(21, 21, 21)
                                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(10, 10, 10))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(jLabel3)
                                                .addGap(75, 75, 75))
                                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                                .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap())))))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jScrollPane1)
                                .addContainerGap())))))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(38, 38, 38)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(campoNome, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(campoTelefone, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Telefone)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoCPF, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoEmail, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoEndereco, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 0, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(54, 54, 54)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(campoID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(imagemF, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(alterarFuncionario)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(botaoPesquisar)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(campoLimpar)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 124, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
        );

        tabelaFuncionario.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Nome", "Telefone", "CPF", "E-mail", "Endereco", "Sexo", "Comentarios", "Imagem"
            }
        ));
        jScrollPane2.setViewportView(tabelaFuncionario);

        campoCarregar.setFont(new java.awt.Font("Tahoma", 1, 12)); // NOI18N
        campoCarregar.setText("Carregar");
        campoCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCarregarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane2)
                .addContainerGap())
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoCarregar)
                .addGap(357, 357, 357))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 185, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoCarregar)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoRetornarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoRetornarActionPerformed
        CRUD Crud = new CRUD();
        Crud.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoRetornarActionPerformed

    private void campoSairActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoSairActionPerformed
        System.exit(0);
    }//GEN-LAST:event_campoSairActionPerformed

    private void botaoCadastrarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoCadastrarActionPerformed
        cadastrarFuncionario();
        listarValores();
        limparCampos();
    }//GEN-LAST:event_botaoCadastrarActionPerformed

    private void botaoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoExcluirActionPerformed
        excluirFuncionario();
        listarValores();
        limparCampos();
    }//GEN-LAST:event_botaoExcluirActionPerformed

    private void imagemFMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_imagemFMouseClicked
        if(evt.getClickCount()==2){
            gerenteDeImagens.escolherImagem(imagemF);
        }
    }//GEN-LAST:event_imagemFMouseClicked

    private void alterarFuncionarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_alterarFuncionarioActionPerformed
        editarFuncionario();
        listarValores();
        limparCampos();
    }//GEN-LAST:event_alterarFuncionarioActionPerformed

    private void botaoPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_botaoPesquisarActionPerformed
        listarValores();
    }//GEN-LAST:event_botaoPesquisarActionPerformed

    private void campoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCarregarActionPerformed
        carregarCampos();
    }//GEN-LAST:event_campoCarregarActionPerformed

    private void campoLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoLimparActionPerformed
        limparCampos();
    }//GEN-LAST:event_campoLimparActionPerformed

    private void editarFuncionario(){
        int id_funcionario;
        String nome_funcionario, telefone_funcionario, cpf_funcionario, email_funcionario, endereco_funcionario, comentarios_funcionario, imagem_funcionario;
        
        id_funcionario = Integer.parseInt(campoID.getText());
        nome_funcionario =  campoNome.getText();
        telefone_funcionario = campoTelefone.getText();
        cpf_funcionario = campoCPF.getText();
        email_funcionario = campoEmail.getText();
        endereco_funcionario = campoEndereco.getText();
        comentarios_funcionario = campoComentarios.getText();
        imagem_funcionario = imagemF.getText();
        
        funcdto.setId_funcionario(id_funcionario);
        funcdto.setNome_funcionario(nome_funcionario);
        funcdto.setTelefone_funcionario(telefone_funcionario);
        funcdto.setCpf_funcionario(cpf_funcionario);
        funcdto.setEmail_funcionario(email_funcionario);
        funcdto.setEndereco_funcionario(endereco_funcionario);
        funcdto.setComentarios_funcionario(comentarios_funcionario);
        funcdto.setImagem_funcionario(imagem_funcionario);
        
        FuncionariosDAO funcdao = new FuncionariosDAO();
        funcdao.editarFuncionario(funcdto);
    }
    
    private void listarValores(){
        try{
            FuncionariosDAO funcdao = new FuncionariosDAO();
            DefaultTableModel model = (DefaultTableModel) tabelaFuncionario.getModel();
            model.setNumRows(0);
            ArrayList<FuncionariosDTO> tabela = funcdao.pesquisarFuncionario();
            
            for(int i=0;i<tabela.size();i++){
                model.addRow(new Object[]{
                   tabela.get(i).getId_funcionario(), 
                   tabela.get(i).getNome_funcionario(),
                   tabela.get(i).getTelefone_funcionario(),
                   tabela.get(i).getCpf_funcionario(),
                   tabela.get(i).getEmail_funcionario(),
                   tabela.get(i).getEndereco_funcionario(),
                   tabela.get(i).getComentarios_funcionario(),
                   tabela.get(i).getImagem_funcionario()
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Valores VIEW" + erro);
        }
    }
    
    private void carregarCampos(){
        int setar = tabelaFuncionario.getSelectedRow();
        
        campoID.setText(tabelaFuncionario.getModel().getValueAt(setar, 0).toString());
        campoNome.setText(tabelaFuncionario.getModel().getValueAt(setar, 1).toString());
        campoTelefone.setText(tabelaFuncionario.getModel().getValueAt(setar, 2).toString());
        campoCPF.setText(tabelaFuncionario.getModel().getValueAt(setar, 3).toString());
        campoEmail.setText(tabelaFuncionario.getModel().getValueAt(setar, 4).toString());
        campoEndereco.setText(tabelaFuncionario.getModel().getValueAt(setar, 5).toString());
        campoComentarios.setText(tabelaFuncionario.getModel().getValueAt(setar, 6).toString());
        imagemF.setText(tabelaFuncionario.getModel().getValueAt(setar, 7).toString());
    }
    
    private void cadastrarFuncionario(){
        funcdto.setNome_funcionario(campoNome.getText());
        funcdto.setTelefone_funcionario(campoTelefone.getText());
        funcdto.setCpf_funcionario(campoCPF.getText());
        funcdto.setEmail_funcionario(campoEmail.getText());
        funcdto.setEndereco_funcionario(campoEndereco.getText());
        funcdto.setComentarios_funcionario(campoComentarios.getText());
        funcdto.setImagem_funcionario(imagemF.getText());
        if(campoMasculino.isSelected()){
            funcdto.setSexo_funcionario("Masculino");
        }else if(campoFeminino.isSelected()){
            funcdto.setSexo_funcionario("Feminino");
        }else if(campoNaoIdentificado.isSelected()){
            funcdto.setSexo_funcionario("Não identificado");
        }
        cadfuncdao.cadastrarFuncionario(funcdto);
    }
    
    private void limparCampos(){
        campoID.setText("");
        campoNome.setText("");
        campoTelefone.setText("");
        campoCPF.setText("");
        campoEmail.setText("");
        campoEndereco.setText("");
        campoComentarios.setText("");
        imagemF.setText("");
        campoNome.requestFocus();
    }

    private void excluirFuncionario(){
        int id_funcionario;
        
        id_funcionario = Integer.parseInt(campoID.getText());
        
        funcdto.setId_funcionario(id_funcionario);
        cadfuncdao.excluirFuncionario(funcdto);
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Telefone;
    private javax.swing.JButton alterarFuncionario;
    private javax.swing.JButton botaoCadastrar;
    private javax.swing.JButton botaoExcluir;
    private javax.swing.JButton botaoPesquisar;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.ButtonGroup buttonGroup2;
    private javax.swing.ButtonGroup buttonGroup3;
    private javax.swing.JTextField campoCPF;
    private javax.swing.JToggleButton campoCarregar;
    private javax.swing.JTextArea campoComentarios;
    private javax.swing.JTextField campoEmail;
    private javax.swing.JTextField campoEndereco;
    private javax.swing.JRadioButton campoFeminino;
    private javax.swing.JTextField campoID;
    private javax.swing.JButton campoLimpar;
    private javax.swing.JRadioButton campoMasculino;
    private javax.swing.JRadioButton campoNaoIdentificado;
    private javax.swing.JTextField campoNome;
    private javax.swing.JButton campoRetornar;
    private javax.swing.JButton campoSair;
    private javax.swing.JTextField campoTelefone;
    private javax.swing.JLabel imagemF;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField jTextField6;
    private javax.swing.JTable tabelaFuncionario;
    // End of variables declaration//GEN-END:variables

}
