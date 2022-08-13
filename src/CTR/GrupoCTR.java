/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.GrupoDAO;
import MODEL.GrupoMODEL;
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
public class GrupoCTR {
  
        public void insereGRUPOCTR( String nome_grupo){
    GrupoMODEL objgrupo = new GrupoMODEL();
         
     objgrupo.setNome_grupo(nome_grupo);

        GrupoDAO objdao = new GrupoDAO();
      
        objdao.insereGrupo(objgrupo);
    }
    
        public void AlteraGrupoCTR(String nome_grupo, int cod_grupo)
    {
        // Cria um objeto da MODEL
        GrupoMODEL objgrupo = new GrupoMODEL();
        //Envia por meio de SET o valor de nome
        objgrupo.setNome_grupo(nome_grupo);
        objgrupo.setCod_grupo(cod_grupo);
        
        //Declara objeto da DAO
        GrupoDAO objdao = new GrupoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraGrupo(objgrupo);
    }
    

    public ResultSet PesquisarGRUPOCTR(String nome_grupo){
        
        GrupoDAO objtel = new GrupoDAO();
        
        return objtel.PesquisarGrupo(nome_grupo);
    
    }
    
    
    
    public List<GrupoMODEL> ListaGrupoBD()
    {
        List<GrupoMODEL> agrupo = new ArrayList<>();
        GrupoDAO objdao = new GrupoDAO();
        ResultSet rsgrupo = objdao.listaGrupo();
        
        try {
            while(rsgrupo.next())
            {
                GrupoMODEL gs = new GrupoMODEL();
                gs.setCod_grupo(rsgrupo.getInt("cod_grupo"));
                gs.setNome_grupo(rsgrupo.getString("nome_grupo"));
                agrupo.add(gs);
            }    
            
            return agrupo;
                } catch (SQLException ex) {
            Logger.getLogger(GrupoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
        public List<GrupoMODEL> PegarGrupoBD(int cod_grupo)
    {
        List<GrupoMODEL> agrupo = new ArrayList<>();
        GrupoDAO objdao = new GrupoDAO();
        ResultSet rsgrupo = objdao.pegarIDGrupo(cod_grupo);
        
        try {
            while(rsgrupo.next())
            {
                GrupoMODEL gs = new GrupoMODEL();
                gs.setNome_grupo(rsgrupo.getString("nome_grupo"));
                
                agrupo.add(gs);
            }    
            
            return agrupo;
                } catch (SQLException ex) {
            Logger.getLogger(GrupoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    /*/    
        public void DesativaGrupoCTR(boolean status_cli, int id_cli)
     {
         // Cria um objeto da MODEL
        GrupoMODEL objgrupo = new GrupoMODEL();
        //Envia por meio de SET o valor de nome
        objgrupo.setStatus_grupo(status_cli);
        objgrupo.setId_grupo(id_cli);
        
        //Declara objeto da DAO
        GrupoDAO objdao = new GrupoDAO();
        //Utiliza método insere e parametro MODEL
        objdao.DesativarGrupo(objgrupo);
     }
        /*/
    
     public void ExcluiGrupoCTR(int cod_grupo)
     {
         GrupoMODEL objgrupo = new GrupoMODEL();
         
         objgrupo.setCod_grupo(cod_grupo);
         
         GrupoDAO objdao = new GrupoDAO();
         objdao.ExcluirGrupo(objgrupo);
     }
    
    
}
