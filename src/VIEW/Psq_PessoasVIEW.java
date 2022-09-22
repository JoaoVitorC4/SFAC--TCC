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
import MODEL.UsuarioMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.Vector;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author aquin
 */
public class Psq_PessoasVIEW extends javax.swing.JFrame {
    
    ResultSet rspessoa;
    PessoaVIEW objpessoa = new PessoaVIEW();
    EstadoCTR objestado = new EstadoCTR();
    CidadeCTR objcidade = new CidadeCTR();
    GrupoCTR objgrupo = new GrupoCTR();
    UsuarioCTR objusuario = new UsuarioCTR();
    List<EstadoMODEL> listEstado;
    List<CidadeMODEL> listCidade;
    List<GrupoMODEL> listGrupo;
    List<UsuarioMODEL> listUsuario;
    
    //

    public Psq_PessoasVIEW() {
        initComponents();
        pesquisarPessoa();
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
        txtPesquisar = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPessoa = new javax.swing.JTable();
        btnPesquisar = new javax.swing.JButton();
        btnDeletar = new javax.swing.JButton();
        btnNovo = new javax.swing.JButton();
        btnEditar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);

        jLabel1.setText("Pesquisar :");

        txtPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtPesquisarActionPerformed(evt);
            }
        });

        tblPessoa.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblPessoa.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPessoaMouseClicked(evt);
            }
        });
        tblPessoa.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                tblPessoaKeyPressed(evt);
            }
        });
        jScrollPane1.setViewportView(tblPessoa);

        btnPesquisar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/pesquisa.png"))); // NOI18N
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnDeletar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/deletar.png"))); // NOI18N
        btnDeletar.setText("Deletar");
        btnDeletar.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnDeletar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarActionPerformed(evt);
            }
        });

        btnNovo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/adicionar.png"))); // NOI18N
        btnNovo.setText("Novo");
        btnNovo.setHorizontalAlignment(javax.swing.SwingConstants.LEADING);
        btnNovo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNovoActionPerformed(evt);
            }
        });

        btnEditar.setIcon(new javax.swing.ImageIcon(getClass().getResource("/icones/editar.png"))); // NOI18N
        btnEditar.setText("Editar");
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
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 119, Short.MAX_VALUE)
                        .addComponent(btnEditar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnDeletar, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 284, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                .addGroup(layout.createSequentialGroup()
                    .addGap(65, 65, 65)
                    .addComponent(btnNovo, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addContainerGap(232, Short.MAX_VALUE)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txtPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtPesquisarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtPesquisarActionPerformed

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
       pesquisarPessoa();
       
    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblPessoaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPessoaMouseClicked
        if(evt.getClickCount() == 2)
        {        
            objpessoa.opcao="Alterar";
        
            int linha = tblPessoa.getSelectedRow();
            
            objpessoa.cod_pessoa = (int) tblPessoa.getValueAt(linha, 0);
            objpessoa.txtNomePessoa.setText((String) tblPessoa.getValueAt(linha, 1));
            objpessoa.txtEnderecoPessoa.setText((String) tblPessoa.getValueAt(linha, 2));
            objpessoa.txtBairroPessoa.setText((String) tblPessoa.getValueAt(linha, 3));
            objpessoa.txtNumeroPessoa.setText((String) tblPessoa.getValueAt(linha, 4));
            
            listCidade = objcidade.pegarCidadeBD
            ((int) tblPessoa.getValueAt(linha, 5));
            
            objpessoa.cmbCidade.setSelectedItem
            (listCidade.get(0).getNome_cidade());
            
          /*  listEstado = objestado.pegarEstadoBD
            ((int) tblPessoa.getValueAt(linha, 5));
           
            objpessoa.cmbEstado.setSelectedItem
            (listEstado.get(0).getNome_estado());
            */
            objpessoa.txtCEPPessoa.setText((String) tblPessoa.getValueAt(linha, 6));
            objpessoa.txtTelefonePessoa.setText((String) tblPessoa.getValueAt(linha, 7));
            objpessoa.txtCPFPessoa.setText((String) tblPessoa.getValueAt(linha, 8));
            
            listGrupo = objgrupo.PegarGrupoBD
            ((int) tblPessoa.getValueAt(linha, 9));
           
            objpessoa.cmbGrupoPessoa.setSelectedItem
            (listGrupo.get(0).getNome_grupo());
            
            listUsuario = objusuario.pegarUsuarioBD
            ((int) tblPessoa.getValueAt(linha, 10));
            
            objpessoa.cmbUsuario.setSelectedIndex
            (listUsuario.get(0).getUsuario_perfil());   
    
            objpessoa.setVisible(true);
            
            this.dispose();
        }
        
        
    }//GEN-LAST:event_tblPessoaMouseClicked

    private void tblPessoaKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_tblPessoaKeyPressed

        
            objpessoa.opcao="Alterar";
        
            int linha = tblPessoa.getSelectedRow();
            
            objpessoa.cod_pessoa = (int) tblPessoa.getValueAt(linha, 0);
            objpessoa.txtNomePessoa.setText((String) tblPessoa.getValueAt(linha, 1));
            objpessoa.txtEnderecoPessoa.setText((String) tblPessoa.getValueAt(linha, 2));
            objpessoa.txtBairroPessoa.setText((String) tblPessoa.getValueAt(linha, 3));
            objpessoa.txtNumeroPessoa.setText((String) tblPessoa.getValueAt(linha, 4));
            
            listCidade = objcidade.pegarCidadeBD
            ((int) tblPessoa.getValueAt(linha, 5));
            
            objpessoa.cmbCidade.setSelectedItem
            (listCidade.get(0).getNome_cidade());
            
          /*  listEstado = objestado.pegarEstadoBD
            ((int) tblPessoa.getValueAt(linha, 5));
           
            objpessoa.cmbEstado.setSelectedItem
            (listEstado.get(0).getNome_estado());
            */
            objpessoa.txtCEPPessoa.setText((String) tblPessoa.getValueAt(linha, 6));
            objpessoa.txtTelefonePessoa.setText((String) tblPessoa.getValueAt(linha, 7));
            objpessoa.txtCPFPessoa.setText((String) tblPessoa.getValueAt(linha, 8));
            
            listGrupo = objgrupo.PegarGrupoBD
            ((int) tblPessoa.getValueAt(linha, 9));
           
            objpessoa.cmbGrupoPessoa.setSelectedItem
            (listGrupo.get(0).getNome_grupo());
            
            listUsuario = objusuario.pegarUsuarioBD
            ((int) tblPessoa.getValueAt(linha, 10));
            
            objpessoa.cmbUsuario.setSelectedItem
            (listUsuario.get(0).getUsuario_perfil());   
    
            objpessoa.setVisible(true);
            
            this.dispose();
    }//GEN-LAST:event_tblPessoaKeyPressed

    private void btnEditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEditarActionPerformed

            objpessoa.opcao="Alterar";
        
            int linha = tblPessoa.getSelectedRow();
            
            objpessoa.cod_pessoa = (int) tblPessoa.getValueAt(linha, 0);
            objpessoa.txtNomePessoa.setText((String) tblPessoa.getValueAt(linha, 1));
            objpessoa.txtEnderecoPessoa.setText((String) tblPessoa.getValueAt(linha, 2));
            objpessoa.txtBairroPessoa.setText((String) tblPessoa.getValueAt(linha, 3));
            objpessoa.txtNumeroPessoa.setText((String) tblPessoa.getValueAt(linha, 4));
            
            listCidade = objcidade.pegarCidadeBD
            ((int) tblPessoa.getValueAt(linha, 5));
            
            objpessoa.cmbCidade.setSelectedItem
            (listCidade.get(0).getNome_cidade());
            
            /*listEstado = objestado.pegarEstadoBD
            ((int) tblPessoa.getValueAt(linha, 5));
           
            objpessoa.cmbEstado.setSelectedItem
            (listEstado.get(0).getNome_estado());
            */
            objpessoa.txtCEPPessoa.setText((String) tblPessoa.getValueAt(linha, 6));
            objpessoa.txtTelefonePessoa.setText((String) tblPessoa.getValueAt(linha, 7));
            objpessoa.txtCPFPessoa.setText((String) tblPessoa.getValueAt(linha, 8));
            
            listGrupo = objgrupo.PegarGrupoBD
            ((int) tblPessoa.getValueAt(linha, 9));
           
            objpessoa.cmbGrupoPessoa.setSelectedItem
            (listGrupo.get(0).getNome_grupo());
            
            listUsuario = objusuario.pegarUsuarioBD
            ((int) tblPessoa.getValueAt(linha, 10));
            
            objpessoa.cmbUsuario.setSelectedItem
            (listUsuario.get(0).getUsuario_perfil());   
    
            objpessoa.setVisible(true);
            
            this.dispose();
    }//GEN-LAST:event_btnEditarActionPerformed

    private void btnNovoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNovoActionPerformed
       PessoaVIEW objtelapessoa = new PessoaVIEW();
       
       objtelapessoa.opcao = "Inserir";
       
        objtelapessoa.setVisible(true);
            this.dispose();
    }//GEN-LAST:event_btnNovoActionPerformed

    private void btnDeletarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarActionPerformed
        String [] options = new String[] {"Sim","Não"};
        
        Object ret = JOptionPane.showOptionDialog
    (null, "Tem certeza que deseja excluir: " 
            +objpessoa.txtNomePessoa.getText() + "?","AVISO", JOptionPane.YES_NO_OPTION,
            JOptionPane.QUESTION_MESSAGE, null, options, options[0]);
        
        if(options[Integer.valueOf(ret.toString())].equals("Sim"))
        {
            ExcluirPessoa();
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
            java.util.logging.Logger.getLogger(Psq_PessoasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(Psq_PessoasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(Psq_PessoasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(Psq_PessoasVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
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
                new Psq_PessoasVIEW().setVisible(true);
            }
        });
    }
       
   
        public void pesquisarPessoa(){
        
            PessoaCTR objctr = new PessoaCTR();
            
            rspessoa = objctr.PesquisarPESSOACTR(txtPesquisar.getText());
        
            preenche_pessoa();
        
        }
    
    
    public void preenche_pessoa(){
        
        String [] colunas = {"Cod" ,"Nome", "Endereço","Bairro","N°","Cidade","Estado","CEP","Telefone","CPF","Grupo","Usuario"};
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
            while (rspessoa.next())
            {
               Vector regVetor = new Vector();
               
               regVetor.add(rspessoa.getInt("cod_pessoa"));
                regVetor.add(rspessoa.getString("nome_pessoa"));
                 regVetor.add(rspessoa.getString("endereco_pessoa"));              
                 regVetor.add(rspessoa.getString("bairro_pessoa"));              
                 regVetor.add(rspessoa.getString("numero_pessoa"));              
                 regVetor.add(rspessoa.getInt("cidade_pessoa"));              
                 regVetor.add(rspessoa.getString("cep_pessoa"));                  
                 regVetor.add(rspessoa.getString("telefone_pessoa"));              
                 regVetor.add(rspessoa.getString("cpf_pessoa"));              
                 regVetor.add(rspessoa.getInt("grupo_pessoa"));              
                 regVetor.add(rspessoa.getInt("usuario_pessoa"));                  
                   
               dados.add(regVetor);
               tablemodel.addRow(regVetor);
            }  
            tblPessoa.setModel(tablemodel);
            
        } catch (SQLException ex) {
            Logger.getLogger(Psq_PessoasVIEW.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    public void ExcluirPessoa()
    {
        PessoaCTR objpes = new PessoaCTR();
        
        int linha = tblPessoa.getSelectedRow();
            
        objpessoa.cod_pessoa = (int) tblPessoa.getValueAt(linha, 0);
        
        
        objpes.ExcluiUsuarioCTR(objpessoa.cod_pessoa);
    }
    
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletar;
    private javax.swing.JButton btnEditar;
    private javax.swing.JButton btnNovo;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JTable tblPessoa;
    private javax.swing.JTextField txtPesquisar;
    // End of variables declaration//GEN-END:variables

}