package VIEW;

import DAO.ArquivosDAO;
import DTO.ArquivosDTO;
import DTO.ProcessosDTO;
import LOG.Log;
import DAO.GerenciadorIO;
import DAO.GerenteDeImagens;
import static VIEW.TelaUsuario.id_processo;
import java.awt.FlowLayout;
import java.io.File;
import java.util.ArrayList;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.filechooser.FileFilter;
import javax.swing.table.DefaultTableModel;
import org.slf4j.LoggerFactory;

public class ConsultarProcesso extends javax.swing.JFrame {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log.class);
    private int id_arquivo;
    
    public ConsultarProcesso() {
        id_arquivo=0;
        initComponents();
        listarArquivos();
        setLayout(new FlowLayout());
        campoDownload.setBackground(new java.awt.Color(204, 204, 204));
        campoDownload.setForeground(new java.awt.Color(255, 255, 255));
        campoExcluir.setBackground(new java.awt.Color(204, 204, 204));
        campoExcluir.setForeground(new java.awt.Color(255, 255, 255));
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel2 = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoArquivos = new javax.swing.JTable();
        campoDownload = new javax.swing.JButton();
        campoCarregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        campoExcluir = new javax.swing.JButton();
        campoVoltar = new javax.swing.JButton();

        jLabel2.setText("jLabel2");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        campoArquivos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoArquivos = new javax.swing.JTable(){
            public boolean isCellEditable(int rowIndex, int colIndex){
                return false;
            }
        };
        campoArquivos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null},
                {null, null},
                {null, null},
                {null, null},
                {null, null}
            },
            new String [] {
                "ID", "Nome"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        campoArquivos.setGridColor(new java.awt.Color(255, 255, 255));
        campoArquivos.getTableHeader().setResizingAllowed(false);
        campoArquivos.getTableHeader().setReorderingAllowed(false);
        campoArquivos.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                campoArquivosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(campoArquivos);

        campoDownload.setBackground(new java.awt.Color(70, 130, 180));
        campoDownload.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoDownload.setForeground(new java.awt.Color(255, 255, 255));
        campoDownload.setText("Baixar documento");
        campoDownload.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoDownloadActionPerformed(evt);
            }
        });

        campoCarregar.setBackground(new java.awt.Color(70, 130, 180));
        campoCarregar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoCarregar.setForeground(new java.awt.Color(255, 255, 255));
        campoCarregar.setText("Carregar Documento");
        campoCarregar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCarregarActionPerformed(evt);
            }
        });

        jLabel1.setText("Documentos");

        campoExcluir.setBackground(new java.awt.Color(70, 130, 180));
        campoExcluir.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        campoExcluir.setText("Excluir documento");
        campoExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoExcluirActionPerformed(evt);
            }
        });

        campoVoltar.setBackground(new java.awt.Color(70, 130, 180));
        campoVoltar.setFont(new java.awt.Font("Arial", 1, 14)); // NOI18N
        campoVoltar.setForeground(new java.awt.Color(255, 255, 255));
        campoVoltar.setText("Voltar");
        campoVoltar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoVoltarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(35, 35, 35)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(167, 167, 167)
                        .addComponent(campoVoltar, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(94, 94, 94)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoDownload, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoExcluir, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(171, 171, 171)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(192, 192, 192)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 25, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(101, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(campoDownload)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoExcluir)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoCarregar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoVoltar)
                .addGap(14, 14, 14))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCarregarActionPerformed
        //CarregarArquivos ca = new CarregarArquivos();
        //ca.setVisible(true);
        GerenteDeImagens gdi = new GerenteDeImagens();
        ArquivosDTO obj = new ArquivosDTO();
        
        gdi.escolherImagem(jLabel3);
        
        System.out.println(gdi.getUrlImagem());
        obj.SalvarArquivo(TelaUsuario.id_processo, gdi.getUrlImagem());
        listarArquivos();      
    }//GEN-LAST:event_campoCarregarActionPerformed

    private void campoDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDownloadActionPerformed
        
        if(id_arquivo!=0)
        {
            //DownloadArquivos da = new DownloadArquivos();
            //da.setVisible(true);
            //dispose();
            JFrame parentFrame = new JFrame();
 
JFileChooser fileChooser = new JFileChooser();
fileChooser.setDialogTitle("Specify a file to save");   
 
int userSelection = fileChooser.showSaveDialog(parentFrame);
 String caminho = "";
         if (userSelection == JFileChooser.APPROVE_OPTION) {
    File fileToSave = fileChooser.getSelectedFile();
    caminho = fileToSave.getAbsolutePath();
    System.out.println("Save as file: " + fileToSave.getAbsolutePath());
}
ArquivosDTO salv = new ArquivosDTO();
salv.BaixarArquivo(id_arquivo,caminho);
            
            
            //GerenteDeImagens gdi = new GerenteDeImagens();
        //ArquivosDTO obj = new ArquivosDTO();
        
       //gdi.escolherImagem(jLabel3);
        //gdi.gravarImagem("C:\\acelera", WIDTH, HEIGHT, "C:\\acelera");
       // System.out.println(gdi.getUrlImagem());
        //obj.BaixarArquivo(TelaUsuario.id_processo, gdi.getUrlImagem());
        }
        
    }//GEN-LAST:event_campoDownloadActionPerformed

    private void campoArquivosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_campoArquivosMouseClicked
        // TODO add your handling code here:
        campoDownload.setBackground(new java.awt.Color(70, 130, 180));
        campoDownload.setForeground(new java.awt.Color(255, 255, 255));
        campoExcluir.setBackground(new java.awt.Color(70, 130, 180));
        campoExcluir.setForeground(new java.awt.Color(255, 255, 255));
        id_arquivo=(int)campoArquivos.getValueAt(campoArquivos.getSelectedRow(), 0);
        System.out.println(id_arquivo);
        
    }//GEN-LAST:event_campoArquivosMouseClicked

    private void campoExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoExcluirActionPerformed
        // TODO add your handling code here:
        if(id_arquivo!=0)
        {
            ArquivosDTO del = new ArquivosDTO();
            del.ExcluirArquivo(id_arquivo);
            
           ConsultarProcesso cp = new ConsultarProcesso();
           cp.setVisible(true);
           dispose();
        }
    }//GEN-LAST:event_campoExcluirActionPerformed

    private void campoVoltarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoVoltarActionPerformed
        // TODO add your handling code here:
        TelaUsuario tu = new TelaUsuario();
        tu.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoVoltarActionPerformed

    private void listarArquivos(){
        try{
            ArquivosDAO arq = new ArquivosDAO();
            System.out.println("ID: " +TelaUsuario.id_processo);
            DefaultTableModel model = (DefaultTableModel) campoArquivos.getModel();
            model.setNumRows(0);
            ArrayList<ArquivosDTO> lista = arq.pesquisarArquivos();
            
            for(int i=0;i<lista.size();i++){
                model.addRow(new Object[]{
                   lista.get(i).getId_arquivo(),
                   lista.get(i).getNome(),
                });
            }
            LOGGER.info("Os processos foram listados com sucesso.");
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Processos" + erro);
            LOGGER.error("Falha ao listar os processos.");
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTable campoArquivos;
    private javax.swing.JButton campoCarregar;
    private javax.swing.JButton campoDownload;
    private javax.swing.JButton campoExcluir;
    private javax.swing.JButton campoVoltar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
