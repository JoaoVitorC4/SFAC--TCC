/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.SaidaDAO;
import MODEL.SaidaMODEL;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Codinhoto
 */
public class SaidaCTR {

    public List<SaidaMODEL> ListaSaidaBD() {
        List<SaidaMODEL> asaida = new ArrayList<>();
        SaidaDAO objdao = new SaidaDAO();
        ResultSet rssaida = objdao.listaSaida();

        try {
            while (rssaida.next()) {
                SaidaMODEL gs = new SaidaMODEL();
                gs.setCod_saida(rssaida.getInt("cod_saida"));
                gs.setDataehora_saida(rssaida.getTimestamp("dataehora_saida"));
                gs.setSaida_entrada(rssaida.getInt("saida_entrada"));

                asaida.add(gs);
            }
            return asaida;

        } catch (SQLException ex) {
            Logger.getLogger(SaidaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    public List<SaidaMODEL> pegarSaidaBD(int cod_saida) {
        List<SaidaMODEL> asaida = new ArrayList<>();
        SaidaDAO objdao = new SaidaDAO();
        ResultSet rssaida = objdao.pegarIDSaida(cod_saida);

        try {
            while (rssaida.next()) {
                SaidaMODEL gs = new SaidaMODEL();
                gs.setDataehora_saida(rssaida.getTimestamp("dataehora_saida"));

                asaida.add(gs);
            }
            return asaida;

        } catch (SQLException ex) {
            Logger.getLogger(SaidaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
  
        public void insereSAIDACTR(Timestamp dataehora_saida, int saida_entrada){
           
            SaidaMODEL objsaida = new SaidaMODEL();
         
            objsaida.setDataehora_saida(dataehora_saida);
            objsaida.setSaida_entrada(saida_entrada);

            SaidaDAO objdao = new SaidaDAO();
      
            objdao.insereSaida(objsaida);
    }
    
        public void AlteraSaidaCTR(Timestamp dataehora_saida, int saida_entrada, int cod_saida)
    {
        // Cria um objeto da MODEL
        SaidaMODEL objsaida = new SaidaMODEL();
        //Envia por meio de SET o valor de nome
        objsaida.setDataehora_saida(dataehora_saida);
        objsaida.setSaida_entrada(saida_entrada);
        
        objsaida.setCod_saida(cod_saida);
        
        //Declara objeto da DAO
        SaidaDAO objdao = new SaidaDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraSaida(objsaida);
    }
    

    public ResultSet PesquisarSAIDACTR(String pessoa_saida){
        
        SaidaDAO objtel = new SaidaDAO();
        
        return objtel.PesquisarSaida(pessoa_saida);
    
    }
    
    

        
   public void ExcluiSaidaCTR(int cod_saida)
     {
         SaidaMODEL objsaida = new SaidaMODEL();
         
         objsaida.setCod_saida(cod_saida);
         
         SaidaDAO objdao = new SaidaDAO();
         objdao.ExcluirSaida(objsaida);
     }
    
    
    
}
