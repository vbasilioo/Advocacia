package VIEW;

import DAO.ProcessosDAO;
import DTO.ProcessosDTO;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class ConsultarProcesso extends javax.swing.JFrame {

    public ConsultarProcesso() {
        initComponents();
        listarProcessos();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        campoProcessos = new javax.swing.JTable();
        campoLista = new javax.swing.JButton();
        campoDownload = new javax.swing.JButton();
        campoCarregar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        campoProcessos.setFont(new java.awt.Font("Arial", 0, 12)); // NOI18N
        campoProcessos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null},
                {null, null, null},
                {null, null, null},
                {null, null, null}
            },
            new String [] {
                "Processo", "Cliente", "Usuários Associados"
            }
        ));
        campoProcessos.setGridColor(new java.awt.Color(255, 255, 255));
        campoProcessos.getTableHeader().setResizingAllowed(false);
        campoProcessos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(campoProcessos);

        campoLista.setText("Lista de Documentos");

        campoDownload.setText("Baixar documento selecionado");

        campoCarregar.setText("Carregar Documento");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(116, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(campoLista, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoDownload, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(campoCarregar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(107, 107, 107))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(37, 37, 37)
                .addComponent(campoLista)
                .addGap(18, 18, 18)
                .addComponent(campoDownload)
                .addGap(18, 18, 18)
                .addComponent(campoCarregar)
                .addGap(0, 38, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listarProcessos(){
        try{
            ProcessosDAO prodao = new ProcessosDAO();
            DefaultTableModel model = (DefaultTableModel) campoProcessos.getModel();
            model.setNumRows(0);
            ArrayList<ProcessosDTO> lista = prodao.pesquisarProcessos();
            
            for(int i=0;i<lista.size();i++){
                model.addRow(new Object[]{
                   lista.get(i).getId_processo(),
                   lista.get(i).getCliente()
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Processos" + erro);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campoCarregar;
    private javax.swing.JButton campoDownload;
    private javax.swing.JButton campoLista;
    private javax.swing.JTable campoProcessos;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
