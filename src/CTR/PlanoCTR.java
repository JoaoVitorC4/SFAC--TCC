/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.PlanoDAO;
import MODEL.PlanoMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author C4
 */
public class PlanoCTR {
  
        public void inserePLANOCTR( String nome_plano,float valor_plano, int qtd_dependente, int qtd_convidado){
            PlanoMODEL objplano = new PlanoMODEL();
         
            objplano.setNome_plano(nome_plano);

            PlanoDAO objdao = new PlanoDAO();
      
            objdao.inserePlano(objplano);
    }
    
        public void AlteraPlanoCTR(String nome_plano,float valor_plano, int qtd_dependente, int qtd_convidado, int cod_plano)
    {
        // Cria um objeto da MODEL
        PlanoMODEL objplano = new PlanoMODEL();
        //Envia por meio de SET o valor de nome
        objplano.setNome_plano(nome_plano);
        objplano.setCod_plano(cod_plano);
        
        //Declara objeto da DAO
        PlanoDAO objdao = new PlanoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraPlano(objplano);
    }
    

    public ResultSet PesquisarPLANOCTR(String nome_plano){
        
        PlanoDAO objtel = new PlanoDAO();
        
        return objtel.PesquisarPlano(nome_plano);
    
    }
    
    
    
    public List<PlanoMODEL> ListaPlanoBD()
    {
        List<PlanoMODEL> aplano = new ArrayList<>();
        PlanoDAO objdao = new PlanoDAO();
        ResultSet rsplano = objdao.listaPlano();
        
        try {
            while(rsplano.next())
            {
                PlanoMODEL gs = new PlanoMODEL();
                gs.setCod_plano(rsplano.getInt("cod_plano"));
                gs.setNome_plano(rsplano.getString("nome_plano"));
                gs.setValor_plano(rsplano.getFloat("valor_plano"));
                gs.setQtd_dependente(rsplano.getInt("qtd_dependente"));
                gs.setQtd_convidado(rsplano.getInt("qtd_convidado"));
                aplano.add(gs);
            }    
            
            return aplano;
                } catch (SQLException ex) {
            Logger.getLogger(PlanoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
        public List<PlanoMODEL> PegarPlanoBD(int cod_plano)
    {
        List<PlanoMODEL> aplano = new ArrayList<>();
        PlanoDAO objdao = new PlanoDAO();
        ResultSet rsplano = objdao.pegarIDPlano(cod_plano);
        
        try {
            while(rsplano.next())
            {
                PlanoMODEL gs = new PlanoMODEL();
                gs.setNome_plano(rsplano.getString("nome_plano"));
                
                aplano.add(gs);
            }    
            
            return aplano;
                } catch (SQLException ex) {
            Logger.getLogger(PlanoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    /*/    
        public void DesativaPlanoCTR(boolean status_cli, int id_cli)
     {
         // Cria um objeto da MODEL
        PlanoMODEL objplano = new PlanoMODEL();
        //Envia por meio de SET o valor de nome
        objplano.setStatus_plano(status_cli);
        objplano.setId_plano(id_cli);
        
        //Declara objeto da DAO
        PlanoDAO objdao = new PlanoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.DesativarPlano(objplano);
     }
        /*/
    
     public void ExcluiPlanoCTR(int cod_plano)
     {
         PlanoMODEL objplano = new PlanoMODEL();
         
         objplano.setCod_plano(cod_plano);
         
         PlanoDAO objdao = new PlanoDAO();
         objdao.ExcluirPlano(objplano);
     }
    
    
}
