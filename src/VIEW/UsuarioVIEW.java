/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CTR.GrupoCTR;
import CTR.PerfilCTR;
import CTR.UsuarioCTR;
import MODEL.GrupoMODEL;
import MODEL.PerfilMODEL;
import MODEL.UsuarioMODEL;
import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.border.Border;

/**
 *
 * @author LOUISE
 */
public class UsuarioVIEW extends javax.swing.JFrame {
    
    public String opcao ="Inserir";
    
    public static int cod_usuario;
    
    Psq_UsuarioVIEW objusuariotbl;
    List<PerfilMODEL> listPerfil = null;
    int item;

    /**
     * 
     * Creates new form UsuarioVIEW
     */
    public UsuarioVIEW() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/LOGO SFAC.png")).getImage());
        //desativacampo();
        //limparCampos();
        carregaperfilcmb();

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
        txtCod_usuario = new javax.swing.JTextField();
        txtNome_usuario = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtSenha_usuario = new javax.swing.JTextField();
        cmbUsuario_perfil = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Cadastro de Usuário");

        jLabel1.setText("Cadastro de Usuário");

        btnSalvar.setText("Salvar");
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código do Usuário:");

        jLabel3.setText("Nome do Usuário:");

        btnCancelar.setText("Cancelar");
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        jLabel4.setText("Senha do Usuário:");

        cmbUsuario_perfil.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbUsuario_perfil.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbUsuario_perfilItemStateChanged(evt);
            }
        });
        cmbUsuario_perfil.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbUsuario_perfilMouseClicked(evt);
            }
        });
        cmbUsuario_perfil.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbUsuario_perfilActionPerformed(evt);
            }
        });

        jLabel5.setText("Perfil Usuário:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 153, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(265, 265, 265))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCod_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(174, 174, 174)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.DEFAULT_SIZE, 88, Short.MAX_VALUE)))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(cmbUsuario_perfil, javax.swing.GroupLayout.Alignment.LEADING, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtSenha_usuario, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 296, Short.MAX_VALUE)))
                .addGap(33, 33, 33))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1)
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(txtCod_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(txtNome_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jLabel3))
                    .addComponent(btnSalvar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtSenha_usuario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cmbUsuario_perfil, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(btnCancelar))
                .addContainerGap(16, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Cadastro de Usuário");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if(opcao.equals("Inserir"))
        {
           Psq_UsuarioVIEW objusuario = new Psq_UsuarioVIEW();
            
           insereusuario(); 
           limparCampos();
           objusuario.setVisible(true);
           objusuario.pesquisarUsuario();
           this.dispose();
        }
        else if(opcao.equals("Alterar"))
        {
            Psq_UsuarioVIEW objusuario = new Psq_UsuarioVIEW();
            
            alterausuario();
            limparCampos();
            objusuario.setVisible(true);
            objusuario.pesquisarUsuario();
            this.dispose();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Psq_UsuarioVIEW psqtela = new Psq_UsuarioVIEW();
            psqtela.setVisible(true);
            psqtela.pesquisarUsuario();
                this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbUsuario_perfilItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbUsuario_perfilItemStateChanged
        
    }//GEN-LAST:event_cmbUsuario_perfilItemStateChanged
  
    private void cmbUsuario_perfilActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbUsuario_perfilActionPerformed
        // TODO add your handling code here:
       item = cmbUsuario_perfil.getSelectedIndex();
        // JOptionPane.showMessageDialog(null, "Item: "+item);
    }//GEN-LAST:event_cmbUsuario_perfilActionPerformed

    private void cmbUsuario_perfilMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbUsuario_perfilMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_cmbUsuario_perfilMouseClicked

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
            java.util.logging.Logger.getLogger(UsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(UsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(UsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(UsuarioVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new UsuarioVIEW().setVisible(true);
            }
        });
    }
    
        public void limparCampos(){
           txtNome_usuario.setText("");        
        }
    
    public void desativacampo(){
        txtCod_usuario.setEditable(false);
    }
        
    public void insereusuario(){
        
       int perfil_selecicionado;
       
        
       UsuarioCTR objctr = new UsuarioCTR();
        
        
       
        objctr.insereUSUARIOCTR(txtNome_usuario.getText(), 
                                txtSenha_usuario.getText(), 
                                listPerfil.get(item).getCod_perfil());
    
    }
    
    
    
    
    public void alterausuario()
    {
        UsuarioCTR objusuario = new UsuarioCTR();
        
        objusuario.AlteraUsuarioCTR(txtNome_usuario.getText(), 
                                txtSenha_usuario.getText(), 
                                listPerfil.get(item).getCod_perfil(), cod_usuario);
    
    }
    

    public void carregaperfilcmb()
    {
        PerfilCTR objperfil = new PerfilCTR();
        listPerfil = objperfil.ListaPerfilBD();
        cmbUsuario_perfil.removeAllItems();
        int i = 0;
        
        while(i < listPerfil.size())
        {
            cmbUsuario_perfil.addItem(listPerfil.get(i).getNome_perfil());
            i++;
        }
        
    }
    
    
    public void pesquisausuario(){
    UsuarioCTR objctr = new UsuarioCTR();
    objctr.PesquisarUSUARIOCTR(txtNome_usuario.getText());
    }
    
    
    public void psqusuario(){
    Psq_UsuarioVIEW psqtel = new Psq_UsuarioVIEW();
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
    public static javax.swing.JComboBox<String> cmbUsuario_perfil;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    public javax.swing.JTextField txtCod_usuario;
    public javax.swing.JTextField txtNome_usuario;
    public javax.swing.JTextField txtSenha_usuario;
    // End of variables declaration//GEN-END:variables
}
