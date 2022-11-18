package VIEW;

import DAO.ArquivosDAO;
import DTO.ArquivosDTO;
import DTO.ProcessosDTO;
import LOG.Log;
import static VIEW.TelaUsuario.id_processo;
import java.awt.FlowLayout;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import org.slf4j.LoggerFactory;

public class ConsultarProcesso extends javax.swing.JFrame {

    private static final org.slf4j.Logger LOGGER = LoggerFactory.getLogger(Log.class);
    
    public ConsultarProcesso() {
        initComponents();
        listarArquivos();
        setLayout(new FlowLayout());
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        campoArquivos = new javax.swing.JTable();
        campoDownload = new javax.swing.JButton();
        campoCarregar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

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
        campoArquivos.setColumnSelectionAllowed(false);
        campoArquivos.setGridColor(new java.awt.Color(255, 255, 255));
        campoArquivos.getTableHeader().setResizingAllowed(false);
        campoArquivos.getTableHeader().setReorderingAllowed(false);
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

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 357, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoCarregar, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(61, 61, 61))))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(142, 142, 142)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 85, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(70, 70, 70)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(campoDownload)
                .addGap(18, 18, 18)
                .addComponent(campoCarregar)
                .addContainerGap(22, Short.MAX_VALUE))
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

    private void campoCarregarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCarregarActionPerformed
        CarregarArquivos ca = new CarregarArquivos();
        ca.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoCarregarActionPerformed

    private void campoDownloadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoDownloadActionPerformed
        DownloadArquivos da = new DownloadArquivos();
        da.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoDownloadActionPerformed

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
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
