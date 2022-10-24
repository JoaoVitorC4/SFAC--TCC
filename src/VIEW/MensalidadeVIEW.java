/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CTR.FormadePagamentoCTR;
import CTR.GrupoCTR;
import CTR.PerfilCTR;
import CTR.MensalidadeCTR;
import CTR.PessoaCTR;
import CTR.PlanoCTR;
import CTR.StatusCTR;
import MODEL.FormadePagamentoMODEL;
import MODEL.GrupoMODEL;
import MODEL.PerfilMODEL;
import MODEL.MensalidadeMODEL;
import MODEL.PessoaMODEL;
import MODEL.PlanoMODEL;
import MODEL.StatusMODEL;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author LOUISE
 */
public class MensalidadeVIEW extends javax.swing.JFrame {
    
    public String opcao ="Inserir";
    
    public static int cod_mensalidade;
    
    Psq_MensalidadeVIEW objmensalidadetbl;
    List<FormadePagamentoMODEL> listFormadepagamento = null;
    List<PlanoMODEL> listPlano = null;
    List<StatusMODEL> listStatus = null;
    int itemformadepagamento;
    int itemplano;
    int itemstatus;
    Date vencimento;
    
    String novo_valor;
    String novo_valor_pago;
    String novo_juros;
    String novo_desconto;

    /**
     * 
     * Creates new form MensalidadeVIEW
     */
    public MensalidadeVIEW() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/LOGO SFAC.png")).getImage());
        //desativacampo();
        //limparCampos();
        carregaformadepagamentocmb();
        carregaplanocmb();
        carregastatuscmb();
        Coresbotoes();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    
    
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jList1 = new javax.swing.JList<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        jList2 = new javax.swing.JList<>();
        jRadioButtonMenuItem1 = new javax.swing.JRadioButtonMenuItem();
        jLabel1 = new javax.swing.JLabel();
        btnSalvar = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        btnCancelar = new javax.swing.JButton();
        txtCod_mensalidade = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbPlano_mensalidade = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbStatus_Mensalidade = new javax.swing.JComboBox<>();
        cmbFormadepagamento_mensalidade = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtValor_mensalidade = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtValor_pago_mensalidade = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        txtJuros_mensalidade = new javax.swing.JTextField();
        jLabel11 = new javax.swing.JLabel();
        txtDesconto_mensalidade = new javax.swing.JTextField();
        txtEmissao_mensalidade = new com.toedter.calendar.JDateChooser();
        txtVencimento_mensalidade = new com.toedter.calendar.JDateChooser();

        jList1.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane1.setViewportView(jList1);

        jList2.setModel(new javax.swing.AbstractListModel<String>() {
            String[] strings = { "Item 1", "Item 2", "Item 3", "Item 4", "Item 5" };
            public int getSize() { return strings.length; }
            public String getElementAt(int i) { return strings[i]; }
        });
        jScrollPane2.setViewportView(jList2);

        jRadioButtonMenuItem1.setSelected(true);
        jRadioButtonMenuItem1.setText("jRadioButtonMenuItem1");

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Mensalidade");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cadastro de Mensalidade");

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new RoundedBorder(7));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código da Mensalidade:");

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new RoundedBorder(7));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCod_mensalidade.setEditable(false);
        txtCod_mensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_mensalidadeActionPerformed(evt);
            }
        });

        jLabel4.setText("Forma de Pagamento:");

        cmbPlano_mensalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlano_mensalidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPlano_mensalidadeItemStateChanged(evt);
            }
        });
        cmbPlano_mensalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPlano_mensalidadeMouseClicked(evt);
            }
        });
        cmbPlano_mensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlano_mensalidadeActionPerformed(evt);
            }
        });

        jLabel5.setText("Plano Mensalidade:");

        jLabel6.setText("Status Mensalidade:");

        cmbStatus_Mensalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbStatus_Mensalidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbStatus_MensalidadeItemStateChanged(evt);
            }
        });
        cmbStatus_Mensalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbStatus_MensalidadeMouseClicked(evt);
            }
        });
        cmbStatus_Mensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbStatus_MensalidadeActionPerformed(evt);
            }
        });

        cmbFormadepagamento_mensalidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbFormadepagamento_mensalidade.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbFormadepagamento_mensalidadeItemStateChanged(evt);
            }
        });
        cmbFormadepagamento_mensalidade.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbFormadepagamento_mensalidadeMouseClicked(evt);
            }
        });
        cmbFormadepagamento_mensalidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbFormadepagamento_mensalidadeActionPerformed(evt);
            }
        });

        jLabel7.setText("Vencimento Mensalidade:");

        jLabel3.setText("Emissão Mensalidade:");

        jLabel8.setText("Valor Mensalidade:");

        jLabel9.setText("Valor Pago Mensalidade:");

        jLabel10.setText("Juros Mensalidade:");

        jLabel11.setText("Desconto Mensalidade:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(255, 255, 255))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 121, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(18, 18, 18)
                                    .addComponent(cmbFormadepagamento_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel8)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel10))
                                    .addGap(22, 22, 22)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtJuros_mensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(txtValor_mensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(txtValor_pago_mensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(txtDesconto_mensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, 151, Short.MAX_VALUE)
                                        .addComponent(txtEmissao_mensalidade, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbPlano_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(jLabel6)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(cmbStatus_Mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(54, 54, 54))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(18, 18, 18)
                                .addComponent(txtVencimento_mensalidade, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 115, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCod_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(367, 367, 367))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addComponent(btnSalvar)
                        .addGap(38, 38, 38)
                        .addComponent(btnCancelar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCod_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(10, 10, 10)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(6, 6, 6))
                            .addComponent(txtEmissao_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel7)
                            .addComponent(txtVencimento_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtValor_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtValor_pago_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(txtJuros_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(7, 7, 7)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtDesconto_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cmbFormadepagamento_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(14, 14, 14)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(cmbStatus_Mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(8, 8, 8)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cmbPlano_mensalidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(37, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Cadastro de Mensalidade");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
           
       
           novo_valor = txtValor_mensalidade.getText().replace(",", ".");
           txtValor_mensalidade.setText(novo_valor);
            novo_valor_pago = txtValor_pago_mensalidade.getText().replace(",", ".");
            txtValor_pago_mensalidade.setText(novo_valor_pago);
                novo_juros = txtJuros_mensalidade.getText().replace(",", ".");
                txtJuros_mensalidade.setText(novo_juros);
                    novo_desconto = txtDesconto_mensalidade.getText().replace(",", ".");
                    txtDesconto_mensalidade.setText(novo_desconto);
        if(opcao.equals("Inserir"))
        {
           Psq_MensalidadeVIEW objmensalidade = new Psq_MensalidadeVIEW();

           inseremensalidade(); 
           limparCampos();
           objmensalidade.setVisible(true);
           objmensalidade.setLocationRelativeTo(null);
           objmensalidade.pesquisarMensalidade();
           this.dispose();
        }
        else if(opcao.equals("Alterar"))
        {
            Psq_MensalidadeVIEW objmensalidade = new Psq_MensalidadeVIEW();
            
            alteramensalidade();
            limparCampos();
            objmensalidade.setVisible(true);
            objmensalidade.setLocationRelativeTo(null);
            objmensalidade.pesquisarMensalidade();
            this.dispose();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Psq_MensalidadeVIEW psqtela = new Psq_MensalidadeVIEW();
            psqtela.setVisible(true);
            psqtela.setLocationRelativeTo(null);
            psqtela.pesquisarMensalidade();
                this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbPlano_mensalidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPlano_mensalidadeItemStateChanged
        itemplano = cmbPlano_mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbPlano_mensalidadeItemStateChanged
  
    private void cmbPlano_mensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlano_mensalidadeActionPerformed
        // TODO add your handling code here:
       itemplano = cmbPlano_mensalidade.getSelectedIndex();
        // JOptionPane.showMessageDialog(null, "Item: "+item);
    }//GEN-LAST:event_cmbPlano_mensalidadeActionPerformed

    private void cmbPlano_mensalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPlano_mensalidadeMouseClicked
        itemplano = cmbPlano_mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbPlano_mensalidadeMouseClicked

    private void cmbFormadepagamento_mensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbFormadepagamento_mensalidadeActionPerformed
        itemformadepagamento = cmbFormadepagamento_mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbFormadepagamento_mensalidadeActionPerformed

    private void cmbStatus_MensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbStatus_MensalidadeActionPerformed
        itemstatus = cmbStatus_Mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbStatus_MensalidadeActionPerformed

    private void cmbStatus_MensalidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbStatus_MensalidadeItemStateChanged
         itemstatus = cmbStatus_Mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbStatus_MensalidadeItemStateChanged

    private void cmbStatus_MensalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbStatus_MensalidadeMouseClicked
        itemstatus = cmbStatus_Mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbStatus_MensalidadeMouseClicked

    private void cmbFormadepagamento_mensalidadeItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbFormadepagamento_mensalidadeItemStateChanged
        itemformadepagamento = cmbFormadepagamento_mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbFormadepagamento_mensalidadeItemStateChanged

    private void cmbFormadepagamento_mensalidadeMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbFormadepagamento_mensalidadeMouseClicked
        itemformadepagamento = cmbFormadepagamento_mensalidade.getSelectedIndex();
    }//GEN-LAST:event_cmbFormadepagamento_mensalidadeMouseClicked

    private void txtCod_mensalidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_mensalidadeActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCod_mensalidadeActionPerformed

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
            java.util.logging.Logger.getLogger(MensalidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(MensalidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(MensalidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(MensalidadeVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new MensalidadeVIEW().setVisible(true);
            }
        });
    }
    
        public void Coresbotoes(){
        Color salvarcor = new Color(62, 123, 242);
        Color cancelarcor = new Color(242, 62, 62);
        btnSalvar.setBackground(salvarcor);
        btnCancelar.setBackground(cancelarcor);
        }
    
        public void limparCampos(){
                 
        }
    
    public void desativacampo(){
        txtCod_mensalidade.setEditable(false);
    }
          
    public void inseremensalidade(){
        
       int perfil_selecicionado;
       
        
       MensalidadeCTR objctr = new MensalidadeCTR();

        
       //SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
       
       java.util.Date utilDateemi = txtEmissao_mensalidade.getDate();
       java.sql.Date sqlDateEmissao = new java.sql.Date(utilDateemi.getTime());
       
       java.util.Date utilDate = txtVencimento_mensalidade.getDate();
       java.sql.Date sqlDateVencimento = new java.sql.Date(utilDate.getTime());
       
       
        objctr.insereMENSALIDADECTR(sqlDateEmissao,
                                sqlDateVencimento,
                                Float.parseFloat(txtValor_mensalidade.getText()),
                                Float.parseFloat(txtValor_pago_mensalidade.getText()),
                                Float.parseFloat(txtJuros_mensalidade.getText()),
                                Float.parseFloat(txtDesconto_mensalidade.getText()),
                                listFormadepagamento.get(itemformadepagamento).getCod_formadepagamento(),
                                listStatus.get(itemstatus).getCod_status(),
                                listPlano.get(itemplano).getCod_plano());
    
    }
    
    
    
    
    public void alteramensalidade()
    {
        MensalidadeCTR objmensalidade = new MensalidadeCTR();
        
       java.util.Date utilDateemi = txtEmissao_mensalidade.getDate();
       java.sql.Date sqlDateEmissao = new java.sql.Date(utilDateemi.getTime());
       
       java.util.Date utilDate = txtVencimento_mensalidade.getDate();
       java.sql.Date sqlDateVencimento = new java.sql.Date(utilDate.getTime());     
        
       //indentificacao_mensalidade = Integer.parseInt(txtIdentificacao_mensalidade.getText());
       
        objmensalidade.AlteraMensalidadeCTR(sqlDateEmissao,
                                sqlDateVencimento,
                                Float.parseFloat(txtValor_mensalidade.getText()),
                                Float.parseFloat(txtValor_pago_mensalidade.getText()),
                                Float.parseFloat(txtJuros_mensalidade.getText()),
                                Float.parseFloat(txtDesconto_mensalidade.getText()),
                                listFormadepagamento.get(itemformadepagamento).getCod_formadepagamento(),
                                listStatus.get(itemstatus).getCod_status(),
                                listPlano.get(itemplano).getCod_plano(),
                                cod_mensalidade);
    
    }
    

    public void carregaformadepagamentocmb()
    {
        FormadePagamentoCTR objformadepagamento = new FormadePagamentoCTR();
        listFormadepagamento = objformadepagamento.ListaFormadePagamentoBD();
        cmbFormadepagamento_mensalidade.removeAllItems();
        int i = 0;
        
        while(i < listFormadepagamento.size())
        {
            cmbFormadepagamento_mensalidade.addItem(listFormadepagamento.get(i).getNome_formadepagamento());
            i++;
        }
        
    }
    
     public void carregaplanocmb()
    {
        PlanoCTR objplano = new PlanoCTR();
        listPlano = objplano.ListaPlanoBD();
        cmbPlano_mensalidade.removeAllItems();
        int i = 0;
        
        while(i < listPlano.size())
        {
            cmbPlano_mensalidade.addItem(listPlano.get(i).getNome_plano());
            i++;
        }
        
    }
     
     
     
      public void carregastatuscmb()
    {
        StatusCTR objstatus = new StatusCTR();
        listStatus = objstatus.ListaStatusBD();
        cmbStatus_Mensalidade.removeAllItems();
        int i = 0;
        
        while(i < listStatus.size())
        {
            cmbStatus_Mensalidade.addItem(listStatus.get(i).getNome_status());
            i++;
        }
        
    }
    
    
    
    public void pesquisamensalidade(){
        
    java.util.Date utilDate = txtVencimento_mensalidade.getDate();
    java.sql.Date sqlDateVencimento = new java.sql.Date(utilDate.getTime());       
        
        
    MensalidadeCTR objctr = new MensalidadeCTR();
    objctr.PesquisarMENSALIDADECTR(sqlDateVencimento.toString());
    }
    
    
    public void psqmensalidade(){
    Psq_MensalidadeVIEW psqtel = new Psq_MensalidadeVIEW();
    psqtel.setVisible(rootPaneCheckingEnabled);
           
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
    private javax.swing.JButton btnCancelar;
    private javax.swing.JButton btnSalvar;
    public static javax.swing.JComboBox<String> cmbFormadepagamento_mensalidade;
    public static javax.swing.JComboBox<String> cmbPlano_mensalidade;
    public static javax.swing.JComboBox<String> cmbStatus_Mensalidade;
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
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtCod_mensalidade;
    public javax.swing.JTextField txtDesconto_mensalidade;
    public com.toedter.calendar.JDateChooser txtEmissao_mensalidade;
    public javax.swing.JTextField txtJuros_mensalidade;
    public javax.swing.JTextField txtValor_mensalidade;
    public javax.swing.JTextField txtValor_pago_mensalidade;
    public com.toedter.calendar.JDateChooser txtVencimento_mensalidade;
    // End of variables declaration//GEN-END:variables
}
