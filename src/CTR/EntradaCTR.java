/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.EntradaDAO;
import MODEL.EntradaMODEL;
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
public class EntradaCTR {

    public List<EntradaMODEL> ListaEntradaBD() {
        List<EntradaMODEL> aentrada = new ArrayList<>();
        EntradaDAO objdao = new EntradaDAO();
        ResultSet rsentrada = objdao.listaEntrada();

        try {
            while (rsentrada.next()) {
                EntradaMODEL gs = new EntradaMODEL();
                gs.setCod_entrada(rsentrada.getInt("cod_entrada"));
                gs.setDataehora_entrada(rsentrada.getTimestamp("dataehora_entrada"));
                gs.setPessoa_entrada(rsentrada.getInt("pessoa_entrada"));

                aentrada.add(gs);
            }
            return aentrada;

        } catch (SQLException ex) {
            Logger.getLogger(EntradaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
    public List<EntradaMODEL> pegarEntradaBD(int cod_entrada) {
        List<EntradaMODEL> aentrada = new ArrayList<>();
        EntradaDAO objdao = new EntradaDAO();
        ResultSet rsentrada = objdao.pegarIDEntrada(cod_entrada);

        try {
            while (rsentrada.next()) {
                EntradaMODEL gs = new EntradaMODEL();
                gs.setDataehora_entrada(rsentrada.getTimestamp("dataehora_entrada"));

                aentrada.add(gs);
            }
            return aentrada;

        } catch (SQLException ex) {
            Logger.getLogger(EntradaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
  
    public List<EntradaMODEL> pegarUltimaEntradaBDPeloCPF(int pessoa_entrada) {
        List<EntradaMODEL> aentrada = new ArrayList<>();
        EntradaDAO objdao = new EntradaDAO();
        ResultSet rsentrada = objdao.pegarUtimaIDEntradaPelaPessoa(pessoa_entrada);

        try {
            while (rsentrada.next()) {
                EntradaMODEL gs = new EntradaMODEL();
                gs.setCod_entrada(rsentrada.getInt("cod_entrada"));

                aentrada.add(gs);
            }
            return aentrada;

        } catch (SQLException ex) {
            Logger.getLogger(EntradaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    
    
        public void insereENTRADACTR(Timestamp dataehora_entrada, int pessoa_entrada){
           
            EntradaMODEL objentrada = new EntradaMODEL();
         
            objentrada.setDataehora_entrada(dataehora_entrada);
            objentrada.setPessoa_entrada(pessoa_entrada);

            EntradaDAO objdao = new EntradaDAO();
      
            objdao.insereEntrada(objentrada);
    }
    
        public void AlteraEntradaCTR(Timestamp dataehora_entrada, int pessoa_entrada, int cod_entrada)
    {
        // Cria um objeto da MODEL
        EntradaMODEL objentrada = new EntradaMODEL();
        //Envia por meio de SET o valor de nome
        objentrada.setDataehora_entrada(dataehora_entrada);
        objentrada.setPessoa_entrada(pessoa_entrada);
        
        objentrada.setCod_entrada(cod_entrada);
        
        //Declara objeto da DAO
        EntradaDAO objdao = new EntradaDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraEntrada(objentrada);
    }
    

    public ResultSet PesquisarENTRADACTR(String pessoa_entrada){
        
        EntradaDAO objtel = new EntradaDAO();
        
        return objtel.PesquisarEntrada(pessoa_entrada);
    
    }
    
    
        public ResultSet PesquisarENTRADAESAIDACTR(String pessoa_entrada){
        
        EntradaDAO objtel = new EntradaDAO();
        
        return objtel.PesquisarEntradaeSaida(pessoa_entrada);
    
    }
    

        
   public void ExcluiEntradaCTR(int cod_entrada)
     {
         EntradaMODEL objentrada = new EntradaMODEL();
         
         objentrada.setCod_entrada(cod_entrada);
         
         EntradaDAO objdao = new EntradaDAO();
         objdao.ExcluirEntrada(objentrada);
     }
    
    
    
}
