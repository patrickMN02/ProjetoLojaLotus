
package Formularios;

import DriveConexao.MySQL;
import Objetos.Produto;
import java.awt.Toolkit;
import javax.swing.JOptionPane;

import java.awt.Toolkit;


public class CadastroProduto extends javax.swing.JFrame {

    
    MySQL conecta = new MySQL();
    Produto novoProduto = new Produto();
    
    public CadastroProduto() {
        initComponents();
        setIcon();
        
    }
    
    private void cadastraProduto(Produto novoProduto){
        this.conecta.conectaBanco();
        
        novoProduto.setId(campoCodProduto.getText());
        novoProduto.setCodBarras(campoCodBarras.getText());
        novoProduto.setPrecoCusto(campoPrecoCusto.getText());
        novoProduto.setPrecoVenda(campoPrecoVenda.getText());
        novoProduto.setColecao(campoColecao.getText());
        novoProduto.setMarca(campoMarca.getText());
        novoProduto.setTecido((String)(campoTecido.getSelectedItem()));
        novoProduto.setCor((String)(campoCor.getSelectedItem()));
        novoProduto.setTamanho((String)(campoTamanho.getSelectedItem()));
        
        
        try{
            this.conecta.insertSql("INSERT INTO Produto ("
                    + "id,"
                    + "codBarras,"
                    + "precoCusto,"
                    + "precoVenda,"
                    + "colecao,"
                    + "marca,"
                    + "tipo_tecido,"
                    + "cor,"
                    + "tamanho"                    
                + ") VALUES ( "
                    + "'" + novoProduto.getId() + "'," 
                    + "'" + novoProduto.getCodBarras() + "'," 
                    + "'" + novoProduto.getPrecoCusto() + "'," 
                    + "'" + novoProduto.getPrecoVenda() + "'," 
                    + "'" + novoProduto.getColecao() + "',"          
                    + "'" + novoProduto.getMarca() + "',"          
                    + "'" + novoProduto.getTipo_tecido() + "',"          
                    + "'" + novoProduto.getCor() + "',"          
                    + "'" + novoProduto.getTamanho() + "'"            
            
            + "); ");          
        
        }catch(Exception e){
            System.out.println("Erro ao cadastrar produto " +  e.getMessage());
            JOptionPane.showMessageDialog(null, "Erro ao cadastrar produto");
        
        }finally{            
            this.conecta.fechaBanco();
            JOptionPane.showMessageDialog(null, "Produto cadastrado com sucesso");
            
                   
        }
    
    
    
    
    
    }
    

    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTextField5 = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        campoPrecoCusto = new javax.swing.JTextField();
        campoColecao = new javax.swing.JTextField();
        campoPrecoVenda = new javax.swing.JTextField();
        campoMarca = new javax.swing.JTextField();
        campoTecido = new javax.swing.JComboBox<>();
        campoCor = new javax.swing.JComboBox<>();
        campoTamanho = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnApagar = new javax.swing.JButton();
        campoCodProduto = new javax.swing.JFormattedTextField();
        campoCodBarras = new javax.swing.JFormattedTextField();

        jLabel6.setText("jLabel6");

        jLabel7.setText("jLabel7");

        jTextField5.setText("jTextField5");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("CADASTRO DE PRODUTOS - [LÓTUS CAMISETARIA]");
        setMaximizedBounds(new java.awt.Rectangle(0, 0, 310, 500));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/123.png"))); // NOI18N
        jLabel1.setText("Cód. Produto:");

        jLabel2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/codigo-de-barras.png"))); // NOI18N
        jLabel2.setText("Cód. Barras:");

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/price-tag.png"))); // NOI18N
        jLabel3.setText("Preço Venda");

        jLabel4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dinheiro.png"))); // NOI18N
        jLabel4.setText("Preço Custo:");

        jLabel5.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/season.png"))); // NOI18N
        jLabel5.setText("Coleção:");

        jLabel8.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/paleta-de-cores.png"))); // NOI18N
        jLabel8.setText("Cor:");

        jLabel9.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/fita-metrica.png"))); // NOI18N
        jLabel9.setText("Tamanho:");

        jLabel10.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/marca-registrada.png"))); // NOI18N
        jLabel10.setText("Marca:");

        jLabel11.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/algodao.png"))); // NOI18N
        jLabel11.setText("Tipo Tecido:");

        campoTecido.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "ALGODÃO", "COURO", "LÃ", "SEDA", "SINTÉTICOS", "POLIESTER" }));

        campoCor.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "AMARELO", "AZUL", "BRANCO", "CINZA", "MARROM", "PRETO", "VERDE", "VERMELHO" }));
        campoCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                campoCorActionPerformed(evt);
            }
        });

        campoTamanho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "PP", "P", "M", "G", "GG", "XG" }));

        btnSalvar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/dados-verificados.png"))); // NOI18N
        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnApagar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/cancelar.png"))); // NOI18N
        btnApagar.setText("Cancelar");
        btnApagar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApagarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(btnApagar)
                .addGap(80, 80, 80)
                .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 10, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(campoPrecoCusto, javax.swing.GroupLayout.DEFAULT_SIZE, 171, Short.MAX_VALUE)
                            .addComponent(campoCodProduto)
                            .addComponent(campoCodBarras)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(campoColecao, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(campoPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel10, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11)
                            .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 93, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoTecido, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, 171, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, 173, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(20, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(campoCodProduto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoCodBarras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoPrecoCusto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoPrecoVenda, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 16, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(campoColecao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel10)
                    .addComponent(campoMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(campoTecido, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(campoCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(campoTamanho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(64, 64, 64)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnApagar)
                    .addComponent(btnSalvar))
                .addContainerGap(43, Short.MAX_VALUE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void campoCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_campoCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_campoCorActionPerformed

    private void btnApagarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApagarActionPerformed
        // Botão Sair
        this.dispose();
    }//GEN-LAST:event_btnApagarActionPerformed

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        // TODO add your handling code here:
        cadastraProduto(novoProduto);
    }//GEN-LAST:event_btnSalvarActionPerformed

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
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(CadastroProduto.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new CadastroProduto().setVisible(true);
            }
        });
    }

    private void setIcon() {
         setIconImage(Toolkit.getDefaultToolkit().getImage(getClass().getResource("camisetas.png")));
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApagar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JFormattedTextField campoCodBarras;
    private javax.swing.JFormattedTextField campoCodProduto;
    private javax.swing.JTextField campoColecao;
    private javax.swing.JComboBox<String> campoCor;
    private javax.swing.JTextField campoMarca;
    private javax.swing.JTextField campoPrecoCusto;
    private javax.swing.JTextField campoPrecoVenda;
    private javax.swing.JComboBox<String> campoTamanho;
    private javax.swing.JComboBox<String> campoTecido;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField jTextField5;
    // End of variables declaration//GEN-END:variables

    
}
