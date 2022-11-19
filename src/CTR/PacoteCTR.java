/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.PacoteDAO;
import MODEL.PacoteMODEL;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Codinhoto
 */
public class PacoteCTR {

    public List<PacoteMODEL> ListaPacoteBD() {
        List<PacoteMODEL> apacote = new ArrayList<>();
        PacoteDAO objdao = new PacoteDAO();
        ResultSet rspacote = objdao.listaPacote();

        try {
            while (rspacote.next()) {
                PacoteMODEL gs = new PacoteMODEL();
                gs.setCod_pacote(rspacote.getInt("cod_pacote"));
                gs.setPessoa_pacote(rspacote.getInt("nome_pacote"));
                gs.setPlano_pacote(rspacote.getInt("plano_pacote"));
                gs.setGrupo_pacote(rspacote.getInt("grupo_plano"));
                gs.setVencimento_pacote(rspacote.getDate("vencimento_plano"));
                gs.setIdentificacao_pacote(rspacote.getInt("identificacao_pacote"));

                apacote.add(gs);
            }
            return apacote;

        } catch (SQLException ex) {
            Logger.getLogger(PacoteCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PacoteMODEL> pegarPacoteBD(int id_pacote) {
        List<PacoteMODEL> apacote = new ArrayList<>();
        PacoteDAO objdao = new PacoteDAO();
        ResultSet rspacote = objdao.pegarIDPacote(id_pacote);

        try {
            while (rspacote.next()) {
                PacoteMODEL gs = new PacoteMODEL();
                gs.setPessoa_pacote(rspacote.getInt("identificacao_pacote"));

                apacote.add(gs);
            }
            return apacote;

        } catch (SQLException ex) {
            Logger.getLogger(PacoteCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public int QtdDependenteCTR(int identificacao_pacote) {
        int qtd_dependentes_pacote = 0;
        PacoteDAO objdao = new PacoteDAO();
        ResultSet rspacote = objdao.QtdDependente(identificacao_pacote);

        try {
            while (rspacote.next()) {
//                PacoteMODEL gs = new PacoteMODEL();
//                gs.setPessoa_pacote(rspacote.getInt("identificacao_pacote"));
//
              qtd_dependentes_pacote= rspacote.getInt("total");
            }
            return qtd_dependentes_pacote;

        } catch (SQLException ex) {
            Logger.getLogger(PacoteCTR.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
    
     public int QtdTitularesCTR(int identificacao_pacote) {
        int qtd_titulares_pacote = 0;
        PacoteDAO objdao = new PacoteDAO();
        ResultSet rspacote = objdao.QtdTitulares(identificacao_pacote);

        try {
            while (rspacote.next()) {
//                PacoteMODEL gs = new PacoteMODEL();
//                gs.setPessoa_pacote(rspacote.getInt("identificacao_pacote"));
//
              qtd_titulares_pacote= rspacote.getInt("total");
            }
            return qtd_titulares_pacote;

        } catch (SQLException ex) {
            Logger.getLogger(PacoteCTR.class.getName()).log(Level.SEVERE, null, ex);
            return 0;
        }
    }
    
 
  
        public void inserePACOTECTR(int pessoa_pacote, int plano_pacote, int grupo_plano, Date vencimento_pacote, int identificacao_pacote){
           
            PacoteMODEL objpacote = new PacoteMODEL();
         
            objpacote.setPessoa_pacote(pessoa_pacote);
            objpacote.setPlano_pacote(plano_pacote);
            objpacote.setGrupo_pacote(grupo_plano);
            objpacote.setVencimento_pacote(vencimento_pacote);
            objpacote.setIdentificacao_pacote(identificacao_pacote);

            PacoteDAO objdao = new PacoteDAO();
      
            objdao.inserePacote(objpacote);
    }
    
        public void AlteraPacoteCTR(int pessoa_pacote, int plano_pacote, int grupo_plano, Date vencimento_pacote, int identificacao_pacote, int cod_pacote)
    {
        // Cria um objeto da MODEL
        PacoteMODEL objpacote = new PacoteMODEL();
        //Envia por meio de SET o valor de nome
        objpacote.setPessoa_pacote(pessoa_pacote);
        objpacote.setPlano_pacote(plano_pacote);
        objpacote.setGrupo_pacote(grupo_plano);
        objpacote.setVencimento_pacote(vencimento_pacote);
        objpacote.setIdentificacao_pacote(identificacao_pacote);
        
        objpacote.setCod_pacote(cod_pacote);
        
        //Declara objeto da DAO
        PacoteDAO objdao = new PacoteDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraPacote(objpacote);
    }
    

    public ResultSet PesquisarPACOTECTR(String nome){
        
        PacoteDAO objtel = new PacoteDAO();
        
        return objtel.PesquisarPacote(nome);
    
    }

        public ResultSet PesquisarIDENTIFICACAOCTR(String nome){
        
        PacoteDAO objtel = new PacoteDAO();
        
        return objtel.PesquisarIdentificacao(nome);
    
    }
    
        public ResultSet PesquisarVIEWPACOTECTR(String nome){
        
        PacoteDAO objtel = new PacoteDAO();
        
        return objtel.PesquisarVIEWPacote(nome);
    
    }
        
        
        
   public void ExcluiPacoteCTR(int cod_pacote)
     {
         PacoteMODEL objpacote = new PacoteMODEL();
         
         objpacote.setCod_pacote(cod_pacote);
         
         PacoteDAO objdao = new PacoteDAO();
         objdao.ExcluirPacote(objpacote);
     }
    
    
    
}
