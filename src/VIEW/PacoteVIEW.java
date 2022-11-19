/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VIEW;

import CTR.GrupoCTR;
import CTR.PerfilCTR;
import CTR.PacoteCTR;
import CTR.PessoaCTR;
import CTR.PlanoCTR;
import MODEL.GrupoMODEL;
import MODEL.PerfilMODEL;
import MODEL.PacoteMODEL;
import MODEL.PessoaMODEL;
import MODEL.PlanoMODEL;
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
public class PacoteVIEW extends javax.swing.JFrame {
    
    public String opcao ="Inserir";
    
    public static int cod_pacote;
    public int indentificacao_pacote;
    
    Psq_PacoteVIEW objpacotetbl;
    List<PessoaMODEL> listPessoa = null;
    List<PlanoMODEL> listPlano = null;
    List<GrupoMODEL> listGrupo = null;
    List<PacoteMODEL> listPacote = null;
    int itempessoa;
    int itemplano;
    int itemgrupo;
    Date vencimento;

    /**
     * 
     * Creates new form PacoteVIEW
     */
    public PacoteVIEW() {
        initComponents();
        this.setIconImage(new javax.swing.ImageIcon(getClass().getResource("/icones/LOGO SFAC.png")).getImage());
        //desativacampo();
        //limparCampos();
        carregapessoacmb();
        carregaplanocmb();
        carregagrupocmb();
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
        txtCod_pacote = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        cmbGrupo_pacote = new javax.swing.JComboBox<>();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        cmbPlano_pacote = new javax.swing.JComboBox<>();
        cmbPessoa_pacote = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtIdentificacao_pacote = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        txtVencimento_pacote = new com.toedter.calendar.JDateChooser();

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
        setTitle("Cadastro de Pacote");
        setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        jLabel1.setText("Cadastro de Pacote");

        btnSalvar.setText("Salvar");
        btnSalvar.setBorder(new RoundedBorder(7));
        btnSalvar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSalvarActionPerformed(evt);
            }
        });

        jLabel2.setText("Código do Pacote:");

        btnCancelar.setText("Cancelar");
        btnCancelar.setBorder(new RoundedBorder(7));
        btnCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCancelarActionPerformed(evt);
            }
        });

        txtCod_pacote.setEditable(false);
        txtCod_pacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCod_pacoteActionPerformed(evt);
            }
        });

        jLabel4.setText("Pessoa Pacote:");

        cmbGrupo_pacote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbGrupo_pacote.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbGrupo_pacoteItemStateChanged(evt);
            }
        });
        cmbGrupo_pacote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbGrupo_pacoteMouseClicked(evt);
            }
        });
        cmbGrupo_pacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbGrupo_pacoteActionPerformed(evt);
            }
        });

        jLabel5.setText("Grupo Pacote:");

        jLabel6.setText("Plano Pacote:");

        cmbPlano_pacote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPlano_pacote.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPlano_pacoteItemStateChanged(evt);
            }
        });
        cmbPlano_pacote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPlano_pacoteMouseClicked(evt);
            }
        });
        cmbPlano_pacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPlano_pacoteActionPerformed(evt);
            }
        });

        cmbPessoa_pacote.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        cmbPessoa_pacote.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cmbPessoa_pacoteItemStateChanged(evt);
            }
        });
        cmbPessoa_pacote.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                cmbPessoa_pacoteMouseClicked(evt);
            }
        });
        cmbPessoa_pacote.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbPessoa_pacoteActionPerformed(evt);
            }
        });

        jLabel7.setText("Vencimento Pacote:");

        jLabel8.setText("Identificação Pacote:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel7, javax.swing.GroupLayout.DEFAULT_SIZE, 102, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbGrupo_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtVencimento_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 166, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jLabel8, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cmbPlano_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtIdentificacao_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cmbPessoa_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 296, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtCod_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 56, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addGap(52, 52, 52)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnSalvar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnCancelar, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(58, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(72, 72, 72))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(33, 33, 33)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtCod_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(11, 11, 11)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel8)
                            .addComponent(txtIdentificacao_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel4))
                            .addComponent(cmbPessoa_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(6, 6, 6)
                                .addComponent(jLabel6))
                            .addComponent(cmbPlano_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(3, 3, 3)
                                .addComponent(jLabel5))
                            .addComponent(cmbGrupo_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(btnSalvar)
                        .addGap(27, 27, 27)
                        .addComponent(btnCancelar)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(txtVencimento_pacote, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(18, Short.MAX_VALUE))
        );

        layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {cmbGrupo_pacote, txtVencimento_pacote});

        getAccessibleContext().setAccessibleDescription("Cadastro de Pacote");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnSalvarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSalvarActionPerformed

        if(opcao.equals("Inserir"))
        {
           Psq_PacoteVIEW objpacote = new Psq_PacoteVIEW();
            
           inserepacote(); 
           limparCampos();
           objpacote.setVisible(true);
           objpacote.setLocationRelativeTo(null);
           objpacote.pesquisarPacote();
           this.dispose();
        }
        else if(opcao.equals("Alterar"))
        {
            Psq_PacoteVIEW objpacote = new Psq_PacoteVIEW();
            
            alterapacote();
            limparCampos();
            objpacote.setVisible(true);
            objpacote.setLocationRelativeTo(null);
            objpacote.pesquisarPacote();
            this.dispose();
        }

    }//GEN-LAST:event_btnSalvarActionPerformed

    private void btnCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCancelarActionPerformed
        Psq_PacoteVIEW psqtela = new Psq_PacoteVIEW();
            psqtela.setVisible(true);
            psqtela.setLocationRelativeTo(null);
            psqtela.pesquisarPacote();
                this.dispose();
    }//GEN-LAST:event_btnCancelarActionPerformed

    private void cmbGrupo_pacoteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbGrupo_pacoteItemStateChanged
        itemgrupo = cmbGrupo_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbGrupo_pacoteItemStateChanged
  
    private void cmbGrupo_pacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbGrupo_pacoteActionPerformed
        // TODO add your handling code here:
       itemgrupo = cmbGrupo_pacote.getSelectedIndex();
        // JOptionPane.showMessageDialog(null, "Item: "+item);
    }//GEN-LAST:event_cmbGrupo_pacoteActionPerformed

    private void cmbGrupo_pacoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbGrupo_pacoteMouseClicked
        itemgrupo = cmbGrupo_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbGrupo_pacoteMouseClicked

    private void cmbPessoa_pacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPessoa_pacoteActionPerformed
        itempessoa = cmbPessoa_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbPessoa_pacoteActionPerformed

    private void cmbPlano_pacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbPlano_pacoteActionPerformed
        itemplano = cmbPlano_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbPlano_pacoteActionPerformed

    private void cmbPlano_pacoteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPlano_pacoteItemStateChanged
        itemplano = cmbPlano_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbPlano_pacoteItemStateChanged

    private void cmbPlano_pacoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPlano_pacoteMouseClicked
       itemplano = cmbPlano_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbPlano_pacoteMouseClicked

    private void cmbPessoa_pacoteItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cmbPessoa_pacoteItemStateChanged
        itempessoa = cmbPessoa_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbPessoa_pacoteItemStateChanged

    private void cmbPessoa_pacoteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_cmbPessoa_pacoteMouseClicked
        itempessoa = cmbPessoa_pacote.getSelectedIndex();
    }//GEN-LAST:event_cmbPessoa_pacoteMouseClicked

    private void txtCod_pacoteActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCod_pacoteActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCod_pacoteActionPerformed

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
            java.util.logging.Logger.getLogger(PacoteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(PacoteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(PacoteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(PacoteVIEW.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new PacoteVIEW().setVisible(true);
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
           txtIdentificacao_pacote.setText("");        
        }
    
    public void desativacampo(){
        txtCod_pacote.setEditable(false);
    }
          
    public void inserepacote(){
        
       int perfil_selecicionado;
       
       int qtd_dependente;
       int qtd_titulares;
       

       int teste = listPlano.get(itemplano).getQtd_dependente();
       PacoteCTR objctr = new PacoteCTR();
      
      qtd_titulares = objctr.QtdTitularesCTR(Integer.parseInt(txtIdentificacao_pacote.getText()));
       
      qtd_dependente = objctr.QtdDependenteCTR(Integer.parseInt(txtIdentificacao_pacote.getText()));
     
      if(listGrupo.get(itemgrupo).getNome_grupo().equals("TITULARES") && qtd_titulares >= 1){
//          if(qtd_titulares >= 1){
       JOptionPane.showMessageDialog(null, "Só pode ter um Titular por pacote gerado !"
                   +"\n Confira os dados informados");
          //}
      }
      else if(listGrupo.get(itemgrupo).getNome_grupo().equals("DEPENDENTES") && teste <= qtd_dependente){
        JOptionPane.showMessageDialog(null, "Quantidade de Dependentes do pacote exedida !"
                    +"\n A quantidade máxima de dependentes nesse pacote é de "+qtd_dependente);
    
    }
//          
//      java.util.Date utilDate = txtVencimento_pacote.getDate();
//      java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//       
//       
//       indentificacao_pacote = Integer.parseInt(txtIdentificacao_pacote.getText());
//       
//        objctr.inserePACOTECTR(listPessoa.get(itempessoa).getCod_pessoa(),
//                                listPlano.get(itemplano).getCod_plano(),
//                                listGrupo.get(itemgrupo).getCod_grupo(), 
//                                sqlDate,
//                                indentificacao_pacote);
//      
      
      
      
//      if(listGrupo.get(itemgrupo).getNome_grupo().equals("DEPENDENTES")){
//         
//            if(teste <= qtd_dependente ){
//            JOptionPane.showMessageDialog(null, "Quantidade de Dependentes do pacote exedida !"
//                    +" A quantidade maxima de dependentes nesse pacote é de "+qtd_dependente);
//            }
      
      else{
          
      java.util.Date utilDate = txtVencimento_pacote.getDate();
      java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
       
       
       indentificacao_pacote = Integer.parseInt(txtIdentificacao_pacote.getText());
       
        objctr.inserePACOTECTR(listPessoa.get(itempessoa).getCod_pessoa(),
                                listPlano.get(itemplano).getCod_plano(),
                                listGrupo.get(itemgrupo).getCod_grupo(), 
                                sqlDate,
                                indentificacao_pacote);
      
      
      
      

}
//       java.util.Date utilDate = txtVencimento_pacote.getDate();
//       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//       
//       
//       indentificacao_pacote = Integer.parseInt(txtIdentificacao_pacote.getText());
//       
//        objctr.inserePACOTECTR(listPessoa.get(itempessoa).getCod_pessoa(),
//                                listPlano.get(itemplano).getCod_plano(),
//                                listGrupo.get(itemgrupo).getCod_grupo(), 
//                                sqlDate,
//                                indentificacao_pacote);
       //SimpleDateFormat formatadata = new SimpleDateFormat("dd/MM/yyyy");
       
//       java.util.Date utilDate = txtVencimento_pacote.getDate();
//       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());
//       
//       
//       indentificacao_pacote = Integer.parseInt(txtIdentificacao_pacote.getText());
//       
//        objctr.inserePACOTECTR(listPessoa.get(itempessoa).getCod_pessoa(),
//                                listPlano.get(itemplano).getCod_plano(),
//                                listGrupo.get(itemgrupo).getCod_grupo(), 
//                                sqlDate,
//                                indentificacao_pacote);
//    
    
    
    }
    
    
    public void alterapacote()
    {
        
        
        int perfil_selecicionado;
       
       int qtd_dependente;
       int qtd_titulares;
       

       int teste = listPlano.get(itemplano).getQtd_dependente();
       PacoteCTR objctr = new PacoteCTR();
      
      qtd_titulares = objctr.QtdTitularesCTR(Integer.parseInt(txtIdentificacao_pacote.getText()));
       
      qtd_dependente = objctr.QtdDependenteCTR(Integer.parseInt(txtIdentificacao_pacote.getText()));
     
      if(listGrupo.get(itemgrupo).getNome_grupo().equals("TITULARES") && qtd_titulares >= 1){
//          if(qtd_titulares >= 1){
       JOptionPane.showMessageDialog(null, "Só pode ter um Titular por pacote gerado !"
                   +"\n Confira os dados informados");
          //}
      }
      else if(listGrupo.get(itemgrupo).getNome_grupo().equals("DEPENDENTES") && teste <= qtd_dependente){
        JOptionPane.showMessageDialog(null, "Quantidade de Dependentes do pacote exedida !"
                    +"\n A quantidade máxima de dependentes nesse pacote é de "+qtd_dependente);
    
    }
        
//        int qtd_dependente;
//       int teste = listPlano.get(itemplano).getQtd_dependente();
//       PacoteCTR objctr = new PacoteCTR();
//       
//      qtd_dependente = objctr.QtdDependenteCTR(Integer.parseInt(txtIdentificacao_pacote.getText()));
//     
//      if(listGrupo.get(itemgrupo).getNome_grupo().equals("DEPENDENTES")){
//         
//            if(teste <= qtd_dependente ){
//            JOptionPane.showMessageDialog(null, "Quantidade de Dependentes do pacote exedida !"
//                    +" A quantidade maxima de dependentes nesse pacote é de "+qtd_dependente);
//            }
//      
//      
//      else{
//        
//        
//        
//        PacoteCTR objpacote = new PacoteCTR();
//        
//       java.util.Date utilDate = txtVencimento_pacote.getDate();
//       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());      
//        
//       indentificacao_pacote = Integer.parseInt(txtIdentificacao_pacote.getText());
//       
//        objpacote.AlteraPacoteCTR(listPessoa.get(itempessoa).getCod_pessoa(),
//                                listPlano.get(itemplano).getCod_plano(),
//                                listGrupo.get(itemgrupo).getCod_grupo(),
//                                sqlDate,
//                                indentificacao_pacote,
//                                cod_pacote);
//            }
//            }
       
      else{
 
       PacoteCTR objpacote = new PacoteCTR();
        
       java.util.Date utilDate = txtVencimento_pacote.getDate();
       java.sql.Date sqlDate = new java.sql.Date(utilDate.getTime());      
        
       indentificacao_pacote = Integer.parseInt(txtIdentificacao_pacote.getText());
       
        objpacote.AlteraPacoteCTR(listPessoa.get(itempessoa).getCod_pessoa(),
                                listPlano.get(itemplano).getCod_plano(),
                                listGrupo.get(itemgrupo).getCod_grupo(),
                                sqlDate,
                                indentificacao_pacote,
                                cod_pacote);
         
      }    
    }
    

    public void carregapessoacmb()
    {
        PessoaCTR objpessoa = new PessoaCTR();
        listPessoa = objpessoa.ListaPessoaBD();
        cmbPessoa_pacote.removeAllItems();
        int i = 0;
        
        while(i < listPessoa.size())
        {
            cmbPessoa_pacote.addItem(listPessoa.get(i).getNome_pessoa());
            i++;
        }
        
    }
    
     public void carregaplanocmb()
    {
        PlanoCTR objplano = new PlanoCTR();
        listPlano = objplano.ListaPlanoBD();
        cmbPlano_pacote.removeAllItems();
        int i = 0;
        
        while(i < listPlano.size())
        {
            cmbPlano_pacote.addItem(listPlano.get(i).getNome_plano());
            i++;
        }
        
    }
     
     
     
      public void carregagrupocmb()
    {
        GrupoCTR objgrupo = new GrupoCTR();
        listGrupo = objgrupo.ListaGrupoBD();
        cmbGrupo_pacote.removeAllItems();
        int i = 0;
        
        while(i < listGrupo.size())
        {
            cmbGrupo_pacote.addItem(listGrupo.get(i).getNome_grupo());
            i++;
        }
        
    }
    
    
    
    public void pesquisapacote(){
    PacoteCTR objctr = new PacoteCTR();
    objctr.PesquisarPACOTECTR(txtIdentificacao_pacote.getText());
    }
    
    
    public void psqpacote(){
    Psq_PacoteVIEW psqtel = new Psq_PacoteVIEW();
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
    public static javax.swing.JComboBox<String> cmbGrupo_pacote;
    public static javax.swing.JComboBox<String> cmbPessoa_pacote;
    public static javax.swing.JComboBox<String> cmbPlano_pacote;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JList<String> jList1;
    private javax.swing.JList<String> jList2;
    private javax.swing.JRadioButtonMenuItem jRadioButtonMenuItem1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    public javax.swing.JTextField txtCod_pacote;
    public javax.swing.JTextField txtIdentificacao_pacote;
    public com.toedter.calendar.JDateChooser txtVencimento_pacote;
    // End of variables declaration//GEN-END:variables
}
