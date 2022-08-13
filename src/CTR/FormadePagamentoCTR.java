/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.ConexaoDAO;
import DAO.FormadePagamentoDAO;
import MODEL.FormadePagamentoMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author C4
 */
public class FormadePagamentoCTR {
  
        public void insereFORMADEPAGAMENTOCTR( String nome_formadepagamento, float taxa_formadepagamento){
    FormadePagamentoMODEL objformadepagamento = new FormadePagamentoMODEL();
         
     objformadepagamento.setNome_formadepagamento(nome_formadepagamento);
     objformadepagamento.setTaxa_formadepagamento(taxa_formadepagamento);

        FormadePagamentoDAO objdao = new FormadePagamentoDAO();
      
        objdao.insereFormadePagamento(objformadepagamento);
    }
    
         public void AlteraFormadePagamentoCTR(String nome_fpagamento,float taxa_fpagamento, int cod_fpagamento)
    {
        // Cria um objeto da MODEL
        FormadePagamentoMODEL objformadepagamento = new FormadePagamentoMODEL();
        //Envia por meio de SET o valor de nome
        objformadepagamento.setNome_formadepagamento(nome_fpagamento);
        objformadepagamento.setTaxa_formadepagamento(taxa_fpagamento);
        objformadepagamento.setCod_formadepagamento(cod_fpagamento);
        
        //Declara objeto da DAO
        FormadePagamentoDAO objdao = new FormadePagamentoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraFormadePagamento(objformadepagamento);
    }
    

    public ResultSet PesquisarFORMADEPAGAMENTOCTR(String nome_formadepagamento){
        
        FormadePagamentoDAO objtel = new FormadePagamentoDAO();
        
        return objtel.PesquisarFormadePagamento(nome_formadepagamento);
    
    }
    
    
    
    public List<FormadePagamentoMODEL> ListaFormadePagamentoBD()
    {
        List<FormadePagamentoMODEL> aformadepagamento = new ArrayList<>();
        FormadePagamentoDAO objdao = new FormadePagamentoDAO();
        ResultSet rsformadepagamento = objdao.listaFormadePagamento();
        
        try {
            while(rsformadepagamento.next())
            {
                FormadePagamentoMODEL gs = new FormadePagamentoMODEL();
                gs.setCod_formadepagamento(rsformadepagamento.getInt("cod_fpagamento"));
                gs.setNome_formadepagamento(rsformadepagamento.getString("nome_fpagamento"));
                gs.setTaxa_formadepagamento(rsformadepagamento.getFloat("taxa_fpagamento"));
                aformadepagamento.add(gs);
            }    
            
            return aformadepagamento;
                } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
        public List<FormadePagamentoMODEL> PegarFormadePagamentoBD(int cod_formadepagamento)
    {
        List<FormadePagamentoMODEL> aformadepagamento = new ArrayList<>();
        FormadePagamentoDAO objdao = new FormadePagamentoDAO();
        ResultSet rsformadepagamento = objdao.pegarIDFormadePagamento(cod_formadepagamento);
        
        try {
            while(rsformadepagamento.next())
            {
                FormadePagamentoMODEL gs = new FormadePagamentoMODEL();
                gs.setNome_formadepagamento(rsformadepagamento.getString("nome_formadepagamento"));
                gs.setTaxa_formadepagamento(rsformadepagamento.getFloat("taxa_fpagamento"));
                
                aformadepagamento.add(gs);
            }    
            
            return aformadepagamento;
                } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    /*/    
        public void DesativaFormadePagamentoCTR(boolean status_cli, int id_cli)
     {
         // Cria um objeto da MODEL
        FormadePagamentoMODEL objformadepagamento = new FormadePagamentoMODEL();
        //Envia por meio de SET o valor de nome
        objformadepagamento.setStatus_formadepagamento(status_cli);
        objformadepagamento.setId_formadepagamento(id_cli);
        
        //Declara objeto da DAO
        FormadePagamentoDAO objdao = new FormadePagamentoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.DesativarFormadePagamento(objformadepagamento);
     }
        /*/
    
     public void ExcluiFormadePagamentoCTR(int cod_formadepagamento)
     {
         FormadePagamentoMODEL objformadepagamento = new FormadePagamentoMODEL();
         
         objformadepagamento.setCod_formadepagamento(cod_formadepagamento);
         
         FormadePagamentoDAO objdao = new FormadePagamentoDAO();
         objdao.ExcluirFormadePagamento(objformadepagamento);
     }
    
    
}
