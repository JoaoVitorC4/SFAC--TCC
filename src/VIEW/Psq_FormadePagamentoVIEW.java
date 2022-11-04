/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;


import CTR.FormadePagamentoCTR;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.border.Border;
import javax.swing.table.DefaultTableModel;
import javax.xml.bind.ParseConversionEvent;

/**
 *
 * @author aquin
 */
public class Psq_FormadePagamentoVIEW extends javax.swing.JFrame {
    ResultSet rsformadepagamento;
    FormadePagamentoVIEW objformadepagamento = new FormadePagamentoVIEW();


    public Psq_FormadePagamentoVIEW() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/LOGO SFAC.png")).getImage());
        ativabotoes();
        pesquisarFormadePagamento();
        CoresdosBotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The formadepagamentoent of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        txtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblFormadePagamento = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Forma de Pagamento");

        jLabel1.setText("Pesquisar :");

        txtPesquisar.setBorder(new RoundedBorder(2));
        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        tblFormadePagamento = new javax.swing.JTable()
        {
            public boolean isCellEditable(int rollIndex, int colIndex){
                return false;
            }
        };
        tblFormadePagamento.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblFormadePagamento.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblFormadePagamentoMouseClicked(evt);
            }
        });
        tblFormadePagamento.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblFormadePagamentoKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblFormadePagamento);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa.png"))); // NOI18N
        btnPesquisar.setBorder(new RoundedBorder(7));
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/deletar.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setBorder(new RoundedBorder(7));
        btnDeletar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setBorder(new RoundedBorder(7));
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
        btnEditar.setBorder(new RoundedBorder(7));
        btnEditar.setHorizontalAlignment(javax.swing.SwingConstants.LEFT);
        btnEditar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEditarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 670, Short.MAX_VALUE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnDeletar, javax.swing.GroupLayout.DEFAULT_SIZE, 133, Short.MAX_VALUE)
                            .addComponent(btnEditar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 543, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                    .addContainerGap(745, Short.MAX_VALUE)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGap(8, 8, 8)))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(8, 8, 8)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(txtPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(btnPesquisar, javax.swing.GroupLayout.PREFERRED_SIZE, 43, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
        );

        getAccessibleContext().setAccessibleDescription("Forma de Pagamento");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       pesquisarFormadePagamento();
       
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblFormadePagamentoMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblFormadePagamentoMouseClicked
        if(evt.getClickCount() == 2)
        {
objformadepagamento.opcao = "Alterar";
            float objtxfpagamento = 0;
            
            int linha = tblFormadePagamento.getSelectedRow();
            
            objformadepagamento.cod_formadepagamento = (int) tblFormadePagamento.getValueAt(linha, 0);
            objformadepagamento.txtCod_formadepagamento.setText((String)Integer.toString(objformadepagamento.cod_formadepagamento));
            objformadepagamento.txtnome_formadepagamento.setText((String)tblFormadePagamento.getValueAt(linha, 1));
            //objformadepagamento.txtnome_formadepagamento.equals((Float)tblFormadePagamento.getValueAt(linha, 2));
            
            objtxfpagamento = (Float)(tblFormadePagamento.getValueAt(linha, 2));
            //define o valor em outra variavel do tipo float
            
            objformadepagamento.txtTaxa_formadepagamento.setText((String)Float.toString(objtxfpagamento));
            //passa o valor da variavel em float para o campo da tela view
            
            
            objformadepagamento.setVisible(true);
            objformadepagamento.setLocationRelativeTo(null);
                this.dispose();
        }
        
        
    }//GEN-LAST:event_tblFormadePagamentoMouseClicked

    private void tblFormadePagamentoKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblFormadePagamentoKeyPressed
objformadepagamento.opcao = "Alterar";
            float objtxfpagamento = 0;
            
            int linha = tblFormadePagamento.getSelectedRow();
            
            objformadepagamento.cod_formadepagamento = (int) tblFormadePagamento.getValueAt(linha, 0);
            objformadepagamento.txtCod_formadepagamento.setText((String)Integer.toString(objformadepagamento.cod_formadepagamento));
            objformadepagamento.txtnome_formadepagamento.setText((String)tblFormadePagamento.getValueAt(linha, 1));
            //objformadepagamento.txtnome_formadepagamento.equals((Float)tblFormadePagamento.getValueAt(linha, 2));
            
            objtxfpagamento = (Float)(tblFormadePagamento.getValueAt(linha, 2));
            //define o valor em outra variavel do tipo float
            
            objformadepagamento.txtTaxa_formadepagamento.setText((String)Float.toString(objtxfpagamento));
            //passa o valor da variavel em float para o campo da tela view
            
            
            objformadepagamento.setVisible(true);
            objformadepagamento.setLocationRelativeTo(null);
                this.dispose();
    }//GEN-LAST:event_tblFormadePagamentoKeyPressed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
        objformadepagamento.opcao = "Inserir";
        desativabotoes();
        
        FormadePagamentoVIEW objtelaformadepagamento = new FormadePagamentoVIEW();
            objtelaformadepagamento.txtTaxa_formadepagamento.setText("0"); //define o valor do campo na nova tela que vai ser aberta
            
            
            objtelaformadepagamento.setVisible(true);    
            objtelaformadepagamento.setLocationRelativeTo(null);
                this.dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed
            objformadepagamento.opcao = "Alterar";
            float objtxfpagamento = 0;
            
            int linha = tblFormadePagamento.getSelectedRow();
            
            objformadepagamento.cod_formadepagamento = (int) tblFormadePagamento.getValueAt(linha, 0);
            objformadepagamento.txtCod_formadepagamento.setText((String)Integer.toString(objformadepagamento.cod_formadepagamento));
            objformadepagamento.txtnome_formadepagamento.setText((String)tblFormadePagamento.getValueAt(linha, 1));
            //objformadepagamento.txtnome_formadepagamento.equals((Float)tblFormadePagamento.getValueAt(linha, 2));
            
            objtxfpagamento = (Float)(tblFormadePagamento.getValueAt(linha, 2));
            //define o valor em outra variavel do tipo float
            
            objformadepagamento.txtTaxa_formadepagamento.setText((String)Float.toString(objtxfpagamento));
            //passa o valor da variavel em float para o campo da tela view
            
            
            objformadepagamento.setVisible(true);
            objformadepagamento.setLocationRelativeTo(null);
                this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
    String [] options = new String[] {"Sim","Não"};
        
        Object ret = JOptionPane.showOptionDialog
    (null, "Tem certeza que deseja excluir: " 
            +objformadepagamento.txtnome_formadepagamento.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            ExcluirFormadePagamento();
        }
    }//GEN-LAST:event_btnDeletarActionPerformed

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
            java.util.logging.Logger.getLogger(Psq_FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Psq_FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Psq_FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Psq_FormadePagamentoVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
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
                new Psq_FormadePagamentoVIEW().setVisible(true);
            }
        });
    }
        public void CoresdosBotoes(){
        Color cornovo = new Color(192, 255, 206);
        Color coreditar = new Color(251, 246, 138);
        Color cordeletar = new Color(251, 138, 138);
        btnNovo.setBackground(cornovo);
        btnEditar.setBackground(coreditar);
        btnDeletar.setBackground(cordeletar);
        }
   
        public void pesquisarFormadePagamento(){
        
            FormadePagamentoCTR objformadepagamento = new FormadePagamentoCTR();
            
            rsformadepagamento = objformadepagamento.PesquisarFORMADEPAGAMENTOCTR(txtPesquisar.getText());
        
            preenche_conformadepagamento();
        
        }
    
    
    public void preenche_conformadepagamento(){
        
        String [] colunas = {"Código" ,"Descrição" ,"Taxa"};
        String [][] linhas = {};
        
            DefaultTableModel tablemodel = new DefaultTableModel(linhas,colunas)
        {
            public boolean CelulaEditavel(int rowIndex, int mColIndex)
            {
                return false;
            }
        };
    
            Vector < Vector> dados = new Vector();
    
        try {
            while (rsformadepagamento.next())
            {
               Vector regVetor = new Vector();
               
               regVetor.add(rsformadepagamento.getInt("cod_fpagamento"));
                regVetor.add(rsformadepagamento.getString("nome_fpagamento"));             
                regVetor.add(rsformadepagamento.getFloat("taxa_fpagamento"));             
                   
               dados.add(regVetor);
               tablemodel.addRow(regVetor);
            }  
            tblFormadePagamento.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Psq_FormadePagamentoVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
    public void ExcluirFormadePagamento()
    {
        FormadePagamentoCTR objgru = new FormadePagamentoCTR();
        
        int linha = tblFormadePagamento.getSelectedRow();
            
        objformadepagamento.cod_formadepagamento = (int) tblFormadePagamento.getValueAt(linha, 0);
        
        
        objgru.ExcluiFormadePagamentoCTR(objformadepagamento.cod_formadepagamento);
    }
    
    
    public void desativabotoes(){
        btnDeletar.setEnabled(false);
        btnEditar.setEnabled(false);
        btnNovo.setEnabled(false);
    }
    
    
        public void ativabotoes(){
        btnDeletar.setEnabled(true);
        btnEditar.setEnabled(true);
        btnNovo.setEnabled(true);
    }
        
           private static class RoundedBorder implements Border {
        
        private int radius;
        
        RoundedBorder(int radius) {
            this.radius = radius;
        }
        public Insets getBorderInsets(Component c) {
            return new Insets(this.radius+1, this.radius+1, this.radius+2, this.radius);
        }

        public boolean isBorderOpaque() {
            return true;
        }

        public void paintBorder(Component c, Graphics g, int x, int y, int width, int height) {
            g.drawRoundRect(x,y,width-1,height-1,radius,radius);
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnDeletar;
    public javax.swing.JButton btnEditar;
    public javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblFormadePagamento;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

}
