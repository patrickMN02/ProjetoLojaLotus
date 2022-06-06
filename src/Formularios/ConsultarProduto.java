
package Formularios;

import DriveConexao.MySQL;
import Objetos.Fornecedor;
import Objetos.Produto;
import java.awt.Toolkit;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;


public class ConsultarProduto extends javax.swing.JFrame {

    Produto novoProduto = new Produto();
    MySQL conecta = new MySQL();
    
    public ConsultarProduto() {
        initComponents();
        setIcon();
        
    }
    
    private void buscarProduto(Produto novoProduto){
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
                    + "codBarras,"
                    + "precoCusto,"
                    + "precoVenda,"
                    + "colecao,"
                    + "marca,"
                    + "tipo_tecido,"
                    + "cor,"
                    + "tamanho"
                 + " FROM"
                     + "Produto"
                + ";"
            );
        
            DefaultTableModel mp = (DefaultTableModel) tabelaConsulta.getModel();
            
            while(this.conecta.getResultSet().next()){           
                String coluna0 = this.conecta.getResultSet().getString("id").toString().trim();
                String coluna1 = this.conecta.getResultSet().getString("codBarras").toString().trim();
                String coluna2 = this.conecta.getResultSet().getString("precoCusto").toString().trim();
                String coluna3 = this.conecta.getResultSet().getString("precoVenda").toString().trim();
                String coluna4 = this.conecta.getResultSet().getString("colecao").toString().trim();
                String coluna5 = this.conecta.getResultSet().getString("marca").toString().trim();
                String coluna6 = this.conecta.getResultSet().getString("tipo_tecido").toString().trim();
                String coluna7 = this.conecta.getResultSet().getString("cor").toString().trim();
                String coluna8 = this.conecta.getResultSet().getString("tamanho").toString().trim();
                
                mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3, coluna4 , coluna5, coluna6, coluna7, coluna8});
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
        setTitle("CONSULTAR PRODUTO - [LÓTUS CAMISETARIA]");
        setName("AlterarProduto"); // NOI18N

        jLabel1.setText("Consultar/Alterar Produto");

        jLabel2.setText("Campo:");

        jctipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cód Produto", "Cód Barras", "Descrição", "Preço Custo", "Preço Venda", "Cor", "Tamanho", "Marca", "Tipo Tecido" }));
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
                "Cód Produto", "Cód Barras", "Descrição", "Preço Custo", "Preço Venda", "Cor", "Tamanho", "Marca", "Tipo Tecido"
            }
        ));
        tabelaConsulta.setColumnSelectionAllowed(true);
        jScrollPane2.setViewportView(tabelaConsulta);
        tabelaConsulta.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);

        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/lupa.png"))); // NOI18N
        jButton2.setText("Buscar Produto");
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
                            .addComponent(jLabel1))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jScrollPane2))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(151, 151, 151)
                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(400, 400, 400)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(256, Short.MAX_VALUE))
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
                .addContainerGap(49, Short.MAX_VALUE))
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
        buscarProduto(novoProduto);
    }//GEN-LAST:event_jButton2ActionPerformed

    private void campoArgumentoKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_campoArgumentoKeyReleased
        // TODO add your handling code here:
        this.conecta.conectaBanco();        
        String tipo = " ";
        
        String escolha = jctipo.getSelectedItem().toString().trim();

        if(escolha.equals("Cód Produto")){
        tipo = " "+"id";
        }
        if(escolha.equals("Preço custo")){
        tipo = " "+"precoCusto";
        }   
        if(escolha.equals("Cor")){
        tipo = " "+"cor";
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
                    + "codBarras,"
                    + "precoCusto,"
                    + "precoVenda,"
                    + "colecao,"
                    + "marca,"
                    + "tipo_tecido,"
                    + "cor,"
                    + "tamanho"
                 + " FROM"
                     + "Produto"
                + ";"
            );
        
            DefaultTableModel mp = (DefaultTableModel) tabelaConsulta.getModel();
            
            while(this.conecta.getResultSet().next()){           
                String coluna0 = this.conecta.getResultSet().getString("id").toString().trim();
                String coluna1 = this.conecta.getResultSet().getString("codBarras").toString().trim();
                String coluna2 = this.conecta.getResultSet().getString("precoCusto").toString().trim();
                String coluna3 = this.conecta.getResultSet().getString("precoVenda").toString().trim();
                String coluna4 = this.conecta.getResultSet().getString("colecao").toString().trim();
                String coluna5 = this.conecta.getResultSet().getString("marca").toString().trim();
                String coluna6 = this.conecta.getResultSet().getString("tipo_tecido").toString().trim();
                String coluna7 = this.conecta.getResultSet().getString("cor").toString().trim();
                String coluna8 = this.conecta.getResultSet().getString("tamanho").toString().trim();
                
                mp.addRow(new String[]{coluna0, coluna1, coluna2, coluna3, coluna4 , coluna5, coluna6, coluna7, coluna8});
                }
            } catch (Exception e) {            
                
            JOptionPane.showMessageDialog(this, e);
            
        }finally{            
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
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ConsultarProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ConsultarProduto().setVisible(true);
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
