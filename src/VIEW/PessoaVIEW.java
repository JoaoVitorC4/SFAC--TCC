/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;


import CTR.CidadeCTR;
import CTR.EstadoCTR;
import CTR.GrupoCTR;
import CTR.PessoaCTR;
import CTR.UsuarioCTR;
import MODEL.CidadeMODEL;
import MODEL.EstadoMODEL;
import MODEL.GrupoMODEL;
import MODEL.PessoaMODEL;
import MODEL.UsuarioMODEL;
import java.awt.Color;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.List;
import javax.swing.border.Border;

/**
 *
 * @author USUARIO
 */
public class PessoaVIEW extends javax.swing.JFrame {
    
    public static int cod_pessoa;
    public static int cod_usuario;
    List<EstadoMODEL> listEstado;
    List<CidadeMODEL> listCidade = null;
    List<GrupoMODEL> listGrupo = null;
    List<UsuarioMODEL> listUsuario = null;
    int item_cidade;
    int item_grupo;
    int item_usuario;
    //List<UsuarioMODEL> listUsuario = null;
    String opcao = "Inserir";
    /**
     * Creates new form NewJFrame
     */
    public PessoaVIEW() {  
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/LOGO SFAC.png")).getImage());
        desativarBotoes();
        if(opcao == "Alterar"){
        
        }
        carregaestadocmb();
        carregacidadecmb();
        carregagrupocmb();
        carregausuariocmb();
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

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtCodPessoa = new javax.swing.JTextField();
        cmbGrupoPessoa = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        txtNomePessoa = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtEnderecoPessoa = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtNumeroPessoa = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtBairroPessoa = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        txtCEPPessoa = new javax.swing.JTextField();
        jLabel10 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        txtCPFPessoa = new javax.swing.JTextField();
        txtTelefonePessoa = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        jLabel14 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        imgBiometria = new javax.swing.JTextPane();
        cmbCidade = new javax.swing.JComboBox<>();
        cmbEstado = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        cmbUsuario = new javax.swing.JComboBox<>();
        btnSalvar = new javax.swing.JButton();
        btnCancelar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Pessoa");
        setFocusCycleRoot(false);

        jLabel1.setText("Cadastro de Pessoa");

        jLabel2.setText("Código da Pessoa :");

        jLabel3.setText("Grupo:");

        txtCodPessoa.setEditable(false);

        cmbGrupoPessoa.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGrupoPessoa.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGrupoPessoaItemStateChanged(evt);
            }
        });
        cmbGrupoPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbGrupoPessoaMouseClicked(evt);
            }
        });
        cmbGrupoPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGrupoPessoaActionPerformed(evt);
            }
        });

        jLabel4.setText("Nome :");

        jLabel5.setText("Endereço :");

        jLabel6.setText("N° :");

        txtNumeroPessoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtNumeroPessoaActionPerformed(evt);
            }
        });

        jLabel8.setText("Bairro :");

        jLabel9.setText("CEP :");

        jLabel10.setText("Cidade :");

        jLabel11.setText("UF :");

        jLabel12.setText("CPF :");

        jLabel13.setText("Telefone :");

        jLabel14.setText("Biometria :");

        jScrollPane1.setViewportView(imgBiometria);

        cmbCidade.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbCidade.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbCidadeActionPerformed(evt);
            }
        });

        cmbEstado.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbEstado.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbEstadoItemStateChanged(evt);
            }
        });
        cmbEstado.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbEstadoActionPerformed(evt);
            }
        });

        jLabel7.setText("Usuário:");

        cmbUsuario.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUsuario.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsuarioItemStateChanged(evt);
            }
        });
        cmbUsuario.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUsuarioMouseClicked(evt);
            }
        });
        cmbUsuario.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuarioActionPerformed(evt);
            }
        });

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new RoundedBorder(7));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new RoundedBorder(7));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(350, 350, 350))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel10))
                        .addGap(56, 56, 56)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtBairroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 316, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(86, 86, 86)
                                .addComponent(jLabel9)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(txtCEPPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 167, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(jLabel13)
                                            .addComponent(jLabel11)
                                            .addComponent(jLabel3))
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(cmbGrupoPessoa, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(cmbEstado, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(txtTelefonePessoa)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(13, 13, 13)
                                        .addComponent(cmbUsuario, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtCodPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtEnderecoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 499, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtNumeroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addComponent(jLabel14)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel12)
                        .addGap(70, 70, 70)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 147, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCPFPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, 243, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnSalvar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnCancelar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 89, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCodPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtNomePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtEnderecoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6)
                            .addComponent(txtNumeroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1)))
                .addGap(8, 8, 8)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel8)
                        .addComponent(txtBairroPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(1, 1, 1)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(txtCEPPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel11)
                        .addComponent(cmbEstado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(btnSalvar))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(jLabel10)
                        .addComponent(cmbCidade, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(9, 9, 9)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel12)
                    .addComponent(txtCPFPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel13)
                    .addComponent(txtTelefonePessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cmbGrupoPessoa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cmbUsuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel14, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(0, 22, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Cadastro de Pessoa");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void cmbGrupoPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGrupoPessoaActionPerformed
        item_grupo = cmbGrupoPessoa.getSelectedIndex();
    }//GEN-LAST:event_cmbGrupoPessoaActionPerformed

    private void txtNumeroPessoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtNumeroPessoaActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtNumeroPessoaActionPerformed

    private void cmbEstadoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbEstadoActionPerformed

    }//GEN-LAST:event_cmbEstadoActionPerformed

    private void cmbEstadoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbEstadoItemStateChanged
        if(listCidade == null)
        {

        }
        else
        {
            carregacidadecmb();
        }
    }//GEN-LAST:event_cmbEstadoItemStateChanged

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed
        if(opcao.equals("Inserir"))
        {
           Psq_PessoasVIEW objpessoa = new Psq_PessoasVIEW();
            
           inserepessoa(); 
           limparCampos();
           objpessoa.setVisible(true);
           objpessoa.setLocationRelativeTo(null);
           objpessoa.pesquisarPessoa();
           this.dispose();
        }
        else if(opcao.equals("Alterar"))
        {
            Psq_PessoasVIEW objpessoa = new Psq_PessoasVIEW();
            
            alterapessoa();
            limparCampos();
            objpessoa.setVisible(true);
            objpessoa.setLocationRelativeTo(null);
            objpessoa.pesquisarPessoa();
            this.dispose();
        }
    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Psq_PessoasVIEW objtela = new Psq_PessoasVIEW();
        objtela.setVisible(true);
        objtela.setLocationRelativeTo(null);
        objtela.pesquisarPessoa();
        
        this.dispose();

    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbUsuarioActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuarioActionPerformed
        item_usuario = cmbUsuario.getSelectedIndex();
    }//GEN-LAST:event_cmbUsuarioActionPerformed

    private void cmbCidadeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbCidadeActionPerformed
        item_cidade = cmbCidade.getSelectedIndex();
    }//GEN-LAST:event_cmbCidadeActionPerformed

    private void cmbUsuarioItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsuarioItemStateChanged
        item_usuario = cmbUsuario.getSelectedIndex();
    }//GEN-LAST:event_cmbUsuarioItemStateChanged

    private void cmbUsuarioMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUsuarioMouseClicked
        item_usuario = cmbUsuario.getSelectedIndex();
    }//GEN-LAST:event_cmbUsuarioMouseClicked

    private void cmbGrupoPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbGrupoPessoaMouseClicked
       item_grupo = cmbGrupoPessoa.getSelectedIndex();
    }//GEN-LAST:event_cmbGrupoPessoaMouseClicked

    private void cmbGrupoPessoaItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGrupoPessoaItemStateChanged
        item_grupo = cmbGrupoPessoa.getSelectedIndex();
    }//GEN-LAST:event_cmbGrupoPessoaItemStateChanged

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
            java.util.logging.Logger.getLogger(PessoaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PessoaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PessoaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PessoaVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PessoaVIEW().setVisible(true);
            }
        });
    }
    
    
    public void Coresbotoes(){
    Color salvarcor = new Color(62, 123, 242);
    Color cancelarcor = new Color(242, 62, 62);
    btnSalvar.setBackground(salvarcor);
    btnCancelar.setBackground(cancelarcor);
    }
    
    
    public void desativarBotoes(){
       
           txtCodPessoa.setEnabled(false);
        
       }
    
    
        public void ativarBotoes(){
           txtCodPessoa.setEnabled(true);

        }
    
        public void limparCampos(){
           txtCodPessoa.setText("");
  
        }
        
        
        
    public void carregagrupocmb()
    {
        GrupoCTR objgrupo = new GrupoCTR();
        listGrupo = objgrupo.ListaGrupoBD();
        cmbGrupoPessoa.removeAllItems();
        int i = 0;
        
        while(i < listGrupo.size())
        {
            cmbGrupoPessoa.addItem(listGrupo.get(i).getNome_grupo());
            i++;
        }
        
    }
        
        
        
    public void carregaestadocmb()
    {
        EstadoCTR objestado = new EstadoCTR();
        listEstado = objestado.ListaEstadoBD();
        cmbEstado.removeAllItems();
        int i = 0;
        
        while(i < listEstado.size())
        {
            cmbEstado.addItem(listEstado.get(i).getNome_estado());
            i++;
        }
        
    }
    
    public void carregacidadecmb()
    {
        CidadeCTR objcidade = new CidadeCTR();
        listCidade = objcidade.ListaCidadeBD
        (listEstado.get(cmbEstado.getSelectedIndex()).getCod_uf());
        
        cmbCidade.removeAllItems();
        int i = 0;
        
        while(i < listCidade.size())
        {
            cmbCidade.addItem(listCidade.get(i).getNome_cidade());
            i++;
        }
        
    }
    
        public void carregausuariocmb()
    {
        UsuarioCTR objusuario = new UsuarioCTR();
        listUsuario = objusuario.ListaUsuarioBD();
        
        cmbUsuario.removeAllItems();
        int i = 0;
        
        while(i < listUsuario.size())
        {
            cmbUsuario.addItem(listUsuario.get(i).getNome_usuario());
            i++;
        }
        
    }
        
        
    public void inserepessoa(){
        PessoaCTR objctr = new PessoaCTR();

            objctr.inserePESSOACTR(txtNomePessoa.getText(),txtEnderecoPessoa.getText(),txtBairroPessoa.getText(),
                txtNumeroPessoa.getText(),listCidade.get(item_cidade).getCod_cidade(),
                txtCEPPessoa.getText(),txtTelefonePessoa.getText(),
                txtCPFPessoa.getText(),listGrupo.get(item_grupo).getCod_grupo(),listUsuario.get(item_usuario).getCod_usuario());
}
     public void alterapessoa()
    {
        PessoaCTR objfpagamento = new PessoaCTR();
        
            objfpagamento.AlteraPessoaCTR(txtNomePessoa.getText(),txtEnderecoPessoa.getText(),txtBairroPessoa.getText(),
                txtNumeroPessoa.getText(),listCidade.get(item_cidade).getCod_cidade(),
                txtCEPPessoa.getText(),txtTelefonePessoa.getText(),
                txtCPFPessoa.getText(),listGrupo.get(item_grupo).getCod_grupo(),listUsuario.get(item_usuario).getCod_usuario(),cod_pessoa);
    }
    
    
    public void pesquisapessoa(){
    PessoaCTR objctr = new PessoaCTR();
    objctr.PesquisarPESSOACTR(txtNomePessoa.getText());
    }
    
        
    public void psqpessoa(){
    Psq_PessoasVIEW psqtel = new Psq_PessoasVIEW();
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
    public static javax.swing.JComboBox<String> cmbCidade;
    public static javax.swing.JComboBox<String> cmbEstado;
    public static javax.swing.JComboBox<String> cmbGrupoPessoa;
    public static javax.swing.JComboBox<String> cmbUsuario;
    public javax.swing.JTextPane imgBiometria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel14;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTextField txtBairroPessoa;
    public javax.swing.JTextField txtCEPPessoa;
    public javax.swing.JTextField txtCPFPessoa;
    public static javax.swing.JTextField txtCodPessoa;
    public javax.swing.JTextField txtEnderecoPessoa;
    public javax.swing.JTextField txtNomePessoa;
    public javax.swing.JTextField txtNumeroPessoa;
    public javax.swing.JTextField txtTelefonePessoa;
    // End of variables declaration//GEN-END:variables
}
