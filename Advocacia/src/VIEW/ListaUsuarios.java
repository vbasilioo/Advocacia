package VIEW;
import DAO.UsuariosDAO;
import DTO.UsuariosDTO;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import java.util.ArrayList;

public class ListaUsuarios extends javax.swing.JFrame {
    
    public ListaUsuarios() {
        initComponents();
        listarUsuarios();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        campoEditar = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabelaUsuarios = new javax.swing.JTable();

        jLabel1.setText("jLabel1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Lista de Usuários");

        campoEditar.setText("Editar");
        campoEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoEditarActionPerformed(evt);
            }
        });

        tabelaUsuarios.setFont(new java.awt.Font("Arial", 0, 14)); // NOI18N
        tabelaUsuarios.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Nome", "E-mail", "Cargo", "Processos"
            }
        ));
        tabelaUsuarios.setGridColor(new java.awt.Color(255, 255, 255));
        tabelaUsuarios.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tabelaUsuariosMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tabelaUsuarios);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 435, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(campoEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 156, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(135, 135, 135))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48)
                .addComponent(campoEditar)
                .addContainerGap(20, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoEditarActionPerformed
        JanelaDadosUsuario jaldados = new JanelaDadosUsuario();
        jaldados.setVisible(true);
        dispose();
    }//GEN-LAST:event_campoEditarActionPerformed

    private void tabelaUsuariosMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tabelaUsuariosMouseClicked
        // TODO add your handling code here:
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
                   lista.get(i).getEmail_usuario(),
                   lista.get(i).getCargo_usuario(),
                   lista.get(i).getId_processo_associado()
                });
            }
        }catch(Exception erro){
            JOptionPane.showMessageDialog(null, "Listar Usuarios" + erro);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton campoEditar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable tabelaUsuarios;
    // End of variables declaration//GEN-END:variables
}
