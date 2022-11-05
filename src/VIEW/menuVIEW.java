/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Insets;
import javax.swing.border.Border;

/**
 *
 * @author LOUISE
 */
public class menuVIEW extends javax.swing.JFrame {

    /**
     * Creates new form menuVIEW
     */
    public menuVIEW() {
        initComponents();
        setExtendedState(MAXIMIZED_BOTH); //Deixa a tela em tela cheia 
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/LOGO SFAC.png")).getImage());
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnConfiguracoes = new javax.swing.JButton();
        btnPessoas = new javax.swing.JButton();
        btnopcoesadministrativas = new javax.swing.JButton();
        btnMensalidades = new javax.swing.JButton();
        btnPlanos = new javax.swing.JButton();
        btnPacote = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Menu");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        btnConfiguracoes.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/configuracoes.png"))); // NOI18N
        btnConfiguracoes.setText("Configurações");
        btnConfiguracoes.setBorder(new RoundedBorder(7));
        btnConfiguracoes.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnConfiguracoes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnConfiguracoes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnConfiguracoesActionPerformed(evt);
            }
        });

        btnPessoas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/perfil.png"))); // NOI18N
        btnPessoas.setText("Pessoas");
        btnPessoas.setBorder(new RoundedBorder(7));
        btnPessoas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPessoas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPessoas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPessoasActionPerformed(evt);
            }
        });

        btnopcoesadministrativas.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/opcoes administrativas.png"))); // NOI18N
        btnopcoesadministrativas.setText("Opções Administrativas");
        btnopcoesadministrativas.setToolTipText("");
        btnopcoesadministrativas.setBorder(new RoundedBorder(7));
        btnopcoesadministrativas.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnopcoesadministrativas.setMargin(new java.awt.Insets(2, 2, 2, 2));
        btnopcoesadministrativas.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnopcoesadministrativas.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnopcoesadministrativasActionPerformed(evt);
            }
        });

        btnMensalidades.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/calendario.png"))); // NOI18N
        btnMensalidades.setText("Mensalidades");
        btnMensalidades.setBorder(new RoundedBorder(7));
        btnMensalidades.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnMensalidades.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnMensalidades.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMensalidadesActionPerformed(evt);
            }
        });

        btnPlanos.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/planos.png"))); // NOI18N
        btnPlanos.setText("Planos");
        btnPlanos.setBorder(new RoundedBorder(7));
        btnPlanos.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPlanos.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPlanos.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPlanosActionPerformed(evt);
            }
        });

        btnPacote.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pacote.png"))); // NOI18N
        btnPacote.setText("Pacote");
        btnPacote.setBorder(new RoundedBorder(7));
        btnPacote.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);
        btnPacote.setVerifyInputWhenFocusTarget(false);
        btnPacote.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);
        btnPacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPacoteActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/SFAC.png"))); // NOI18N
        jLabel1.setToolTipText("");
        jLabel1.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));
        jLabel1.setHorizontalTextPosition(javax.swing.SwingConstants.CENTER);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(btnPessoas, javax.swing.GroupLayout.DEFAULT_SIZE, 117, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPacote, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnPlanos, javax.swing.GroupLayout.DEFAULT_SIZE, 114, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnMensalidades, javax.swing.GroupLayout.DEFAULT_SIZE, 143, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnopcoesadministrativas, javax.swing.GroupLayout.DEFAULT_SIZE, 167, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnConfiguracoes, javax.swing.GroupLayout.DEFAULT_SIZE, 147, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPlanos, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPessoas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnPacote, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnMensalidades, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnopcoesadministrativas, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnConfiguracoes, javax.swing.GroupLayout.PREFERRED_SIZE, 95, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 40, Short.MAX_VALUE)
                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap(89, Short.MAX_VALUE))
        );

        getAccessibleContext().setAccessibleDescription("Menu");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnPlanosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPlanosActionPerformed
        Psq_PlanoVIEW objtelaplano = new Psq_PlanoVIEW();
            objtelaplano.setVisible(true);
            objtelaplano.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPlanosActionPerformed

    private void btnConfiguracoesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnConfiguracoesActionPerformed
       LoginVIEW objtelalogin = new LoginVIEW();
       objtelalogin.setVisible(true);
       objtelalogin.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnConfiguracoesActionPerformed

    private void btnPessoasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPessoasActionPerformed
        Psq_PessoasVIEW objtelapessoa = new Psq_PessoasVIEW();
        objtelapessoa.setVisible(true);
        objtelapessoa.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPessoasActionPerformed

    private void btnopcoesadministrativasActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnopcoesadministrativasActionPerformed
        MenuAdministrativoVIEW objtelamenuadm = new MenuAdministrativoVIEW();
        objtelamenuadm.setVisible(true);
        objtelamenuadm.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnopcoesadministrativasActionPerformed

    private void btnPacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPacoteActionPerformed
        Psq_PacoteVIEW objtelapacote = new Psq_PacoteVIEW();
        objtelapacote.setVisible(true);
        objtelapacote.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnPacoteActionPerformed

    private void btnMensalidadesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMensalidadesActionPerformed
        Psq_MensalidadeVIEW objtelamensalidade = new Psq_MensalidadeVIEW();
        objtelamensalidade.setVisible(true);
        objtelamensalidade.setLocationRelativeTo(null);
    }//GEN-LAST:event_btnMensalidadesActionPerformed

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
            java.util.logging.Logger.getLogger(menuVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(menuVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(menuVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(menuVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new menuVIEW().setVisible(true);
            }
        });
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
    private javax.swing.JButton btnConfiguracoes;
    private javax.swing.JButton btnMensalidades;
    private javax.swing.JButton btnPacote;
    private javax.swing.JButton btnPessoas;
    private javax.swing.JButton btnPlanos;
    private javax.swing.JButton btnopcoesadministrativas;
    private javax.swing.JLabel jLabel1;
    // End of variables declaration//GEN-END:variables
}
