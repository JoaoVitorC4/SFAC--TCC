/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CTR.FormadePagamentoCTR;

/**
 *
 * @author LOUISE
 */
public class FormadePagamentoVIEW extends javax.swing.JFrame {
    
    public String opcao = "Inserir";
    
    public static int cod_formadepagamento;
   // Psq_FormadePagamentoVIEW objformadepagamentotbl;
    
    /**
     * 
     * Creates new form FormadePagamentoVIEW
     */
    public FormadePagamentoVIEW() {
        initComponents();
        desativacampo();
        limparCampos();
        //Psq_FormadePagamentoVIEW objformadepagamentotbl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtCod_formadepagamento = new javax.swing.JTextField();
        txtnome_formadepagamento = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTaxa_formadepagamento = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Cadastro de Forma de Pagamento");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código:");

        jLabel3.setText("Descrição:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtnome_formadepagamento.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtnome_formadepagamentoActionPerformed(evt);
            }
        });

        jLabel4.setText("Taxa:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtnome_formadepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod_formadepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(292, 292, 292)
                        .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtTaxa_formadepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(308, 308, 308)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(72, 72, 72)
                        .addComponent(btnSalvar)
                        .addGap(4, 4, 4))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(59, 59, 59)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(txtCod_formadepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(2, 2, 2))))
                            .addComponent(jLabel1))
                        .addGap(18, 18, 18)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(txtnome_formadepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(17, 17, 17)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtTaxa_formadepagamento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                        .addComponent(btnCancelar)
                        .addGap(31, 31, 31))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        
        
        if(opcao.equals("Inserir"))
        {               
            Psq_FormadePagamentoVIEW objformadepagamentotbl = new Psq_FormadePagamentoVIEW();
           String nova_taxa = txtTaxa_formadepagamento.getText();
           
           nova_taxa = nova_taxa.replace(",", ".");
           
           txtTaxa_formadepagamento.setText(nova_taxa);
           
           insereformadepagamento(); 
                limparCampos();
                    objformadepagamentotbl.setVisible(true);
                        objformadepagamentotbl.pesquisarFormadePagamento();
                            this.dispose();
                        
        }
        else if(opcao.equals("Alterar"))
        {
            Psq_FormadePagamentoVIEW objformadepagamentotbl = new Psq_FormadePagamentoVIEW();
            
           String nova_taxa = txtTaxa_formadepagamento.getText();
           
           nova_taxa = nova_taxa.replace(",", ".");
           
           txtTaxa_formadepagamento.setText(nova_taxa);
           
            
            alteraformadepagamento();
                limparCampos();
                    objformadepagamentotbl.setVisible(true);
                        objformadepagamentotbl.pesquisarFormadePagamento();
                            this.dispose();
                        
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Psq_FormadePagamentoVIEW objformadepagamentotbl = new Psq_FormadePagamentoVIEW();
            objformadepagamentotbl.setVisible(true);
                objformadepagamentotbl.pesquisarFormadePagamento();
                    this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void txtNome_grupoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNome_grupoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNome_grupoActionPerformed

    private void txtnome_formadepagamentoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtnome_formadepagamentoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtnome_formadepagamentoActionPerformed

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
            java.util.logging.Logger.getLogger(FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FormadePagamentoVIEW().setVisible(true);
            }
        });
    }
    
        public void limparCampos(){
           txtnome_formadepagamento.setText("");        
           txtTaxa_formadepagamento.setText("");        
        }
    
    public void desativacampo(){
        txtCod_formadepagamento.setEditable(false);
    }
    
        
    public void insereformadepagamento(){
        FormadePagamentoCTR objctr = new FormadePagamentoCTR();

            objctr.insereFORMADEPAGAMENTOCTR(txtnome_formadepagamento.getText(),Float.parseFloat(txtTaxa_formadepagamento.getText()));
}
     public void alteraformadepagamento()
    {
        FormadePagamentoCTR objfpagamento = new FormadePagamentoCTR();
        
            objfpagamento.AlteraFormadePagamentoCTR(txtnome_formadepagamento.getText(), 
                Float.parseFloat(txtTaxa_formadepagamento.getText()), cod_formadepagamento);
    }
    
    
    public void pesquisaformadepagamento(){
    FormadePagamentoCTR objctr = new FormadePagamentoCTR();
    objctr.PesquisarFORMADEPAGAMENTOCTR(txtnome_formadepagamento.getText());
    }
    
    
    public void psqformadepagamento(){
    Psq_FormadePagamentoVIEW psqtel = new Psq_FormadePagamentoVIEW();
    psqtel.setVisible(rootPaneCheckingEnabled);
           
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    public javax.swing.JTextField txtCod_formadepagamento;
    public javax.swing.JTextField txtTaxa_formadepagamento;
    public javax.swing.JTextField txtnome_formadepagamento;
    // End of variables declaration//GEN-END:variables
}
