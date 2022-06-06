
package Formularios;

import DriveConexao.MySQL;
import Objetos.Cliente;
import Objetos.Fornecedor;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarFornecedor extends javax.swing.JFrame {
    Fornecedor novoFornecedor = new Fornecedor();
    MySQL conecta = new MySQL();
    
    public ConsultarFornecedor() {
        initComponents();
        setIcon();
        
    }
    
     private void buscarFornecedor(Fornecedor novoFornecedor){
        this.conecta.conectaBanco();
        
        DefaultTableModel dtnConsulta = (DefaultTableModel)tabelaConsulta.getModel();
    int l = dtnConsulta.getRowCount();
    
    if (l < 0){
        while (l < 0){
            ((DefaultTableModel)tabelaConsulta.getModel()).removeRow(l - 1);
            l --;
        }
    }        
                
        try {
            this.conecta.executarSQL(
                   "SELECT "
                    + "id,"                    
                    + "cnpj,"
                    + "razaoSocial"
                 + " FROM"
                     + " CadastroFornecedor"
                + ";"
            );
        
            DefaultTableModel mp = (DefaultTableModel) tabelaConsulta.getModel();
            
            while(this.conecta.getResultSet().next()){           
                String coluna0 = this.conecta.getResultSet().getString("id").toString().trim();
                String coluna1 = this.conecta.getResultSet().getString("cnpj").toString().trim();
                String coluna2 = this.conecta.getResultSet().getString("razaoSocial").toString().trim();
                
                mp.addRow(new String[]{coluna0, coluna1, coluna2});
                }
            } catch (Exception e) {            
                
            JOptionPane.showMessageDialog(this, e);
            
        }finally{            
            this.conecta.fechaBanco();            
        }
        tamanhoColunas();
        tabelaConsulta.setAutoCreateRowSorter(true);
}
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jctipo = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        campoArgumento = new javax.swing.JTextField();
        jScrollPane2 = new javax.swing.JScrollPane();
        tabelaConsulta = new javax.swing.JTable();
        jButton2 = new javax.swing.JButton();
        jButton1 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CONSULTAR VENDEDOR - [LÓTUS CAMISETARIA]");
        setName("AlterarProduto"); // NOI18N

        jLabel1.setText("Consultar/Alterar Fornecedor");

        jLabel2.setText("Campo:");

        jctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cód Fornecedor", "CNPJ", "Razão Social", " " }));
        jctipo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jctipoActionPerformed(evt);
            }
        });

        jLabel3.setText("Critério:");

        campoArgumento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                campoArgumentoKeyReleased(evt);
            }
        });

        tabelaConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Cód Fornecedor", "CNPJ", "Razão Social"
            }
        ));
        tabelaConsulta.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabelaConsulta);
        tabelaConsulta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        jButton2.setText("Buscar Fornecedor");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/sair.png"))); // NOI18N
        jButton1.setText("Sair");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.png"))); // NOI18N
        jButton4.setText("Deletar");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addComponent(jLabel3))
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(campoArgumento, javax.swing.GroupLayout.PREFERRED_SIZE, 414, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jButton2))))
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 853, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(21, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(80, 80, 80)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(74, 74, 74))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jctipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoArgumento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(30, 30, 30)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 238, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton4))
                .addContainerGap(19, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void jctipoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jctipoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jctipoActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        //Botao Sair
        this.dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        // TODO add your handling code here:
        buscarFornecedor(novoFornecedor);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoArgumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoArgumentoKeyReleased
        // TODO add your handling code here:
        this.conecta.conectaBanco();        
        String tipo = " ";
        
        String escolha = jctipo.getSelectedItem().toString().trim();

        if(escolha.equals("Cód Fornecedor")){
        tipo = " "+"id";
        }
        if(escolha.equals("CNPJ")){
        tipo = " "+"cnpj";
        }   
        if(escolha.equals("Razão Social")){
        tipo = " "+"razaoSocial";
        }  
        String arg = campoArgumento.getText();
        
        String argumento = tipo +" "+ "like '"+ arg + "%'";
        this.conecta.conectaBanco();
        
        DefaultTableModel dtnConsulta = (DefaultTableModel)tabelaConsulta.getModel();
    int l = dtnConsulta.getRowCount();
    
    if (l < 0){
        while (l < 0){
            ((DefaultTableModel)tabelaConsulta.getModel()).removeRow(l - 1);
            l --;
        }
    }   
                
        try {       
            this.conecta.executarSQL(
                   "SELECT "
                    + "id,"                    
                    + "cnpj,"
                    + "razaoSocial"
                 + " FROM"
                     + " CadastroFornecedor"
                           + " WHERE "
                           + argumento + ""
                + ";"
            );
        
            DefaultTableModel mp = (DefaultTableModel) tabelaConsulta.getModel();
            
            while(this.conecta.getResultSet().next()){           
                String coluna0 = this.conecta.getResultSet().getString("id").toString().trim();
                String coluna1 = this.conecta.getResultSet().getString("cnpj").toString().trim();
                String coluna2 = this.conecta.getResultSet().getString("razaoSocial").toString().trim();
                
                mp.addRow(new String[]{coluna0, coluna1, coluna2});
                }
            } catch (Exception e) {            
            System.out.println("Fornecedor não encontrado" +  e.getMessage());    
            JOptionPane.showMessageDialog(this, e);
            
        }
        finally{            
            this.conecta.fechaBanco();            
        }
        tamanhoColunas();
        tabelaConsulta.setAutoCreateRowSorter(true); 
        
        
    
    }//GEN-LAST:event_campoArgumentoKeyReleased

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarFornecedor.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarFornecedor().setVisible(true);
            }
        });
    }

    private void setIcon() {
        setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("camisetas.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField campoArgumento;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton4;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JComboBox<String> jctipo;
    private javax.swing.JTable tabelaConsulta;
    // End of variables declaration//GEN-END:variables
public void tamanhoColunas(){
    tabelaConsulta.getColumnModel().getColumn(0).setMinWidth(100);
    tabelaConsulta.getColumnModel().getColumn(1).setMinWidth(250);
}


}
