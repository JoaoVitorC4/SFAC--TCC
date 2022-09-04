/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.PerfilDAO;
import MODEL.PerfilMODEL;
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
public class PerfilCTR {
  
        public void inserePERFILCTR( String nome_perfil){
            PerfilMODEL objperfil = new PerfilMODEL();
         
            objperfil.setNome_perfil(nome_perfil);

            PerfilDAO objdao = new PerfilDAO();
      
            objdao.inserePerfil(objperfil);
    }
    
        public void AlteraPerfilCTR(String nome_perfil, int cod_perfil)
    {
        // Cria um objeto da MODEL
        PerfilMODEL objperfil = new PerfilMODEL();
        //Envia por meio de SET o valor de nome
        objperfil.setNome_perfil(nome_perfil);
        objperfil.setCod_perfil(cod_perfil);
        
        //Declara objeto da DAO
        PerfilDAO objdao = new PerfilDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraPerfil(objperfil);
    }
    

    public ResultSet PesquisarPERFILCTR(String nome_perfil){
        
        PerfilDAO objtel = new PerfilDAO();
        
        return objtel.PesquisarPerfil(nome_perfil);
    
    }
    
    
    
    public List<PerfilMODEL> ListaPerfilBD()
    {
        List<PerfilMODEL> aperfil = new ArrayList<>();
        PerfilDAO objdao = new PerfilDAO();
        ResultSet rsperfil = objdao.listaPerfil();
        
        try {
            while(rsperfil.next())
            {
                PerfilMODEL gs = new PerfilMODEL();
                gs.setCod_perfil(rsperfil.getInt("cod_perfil"));
                gs.setNome_perfil(rsperfil.getString("nome_perfil"));
                aperfil.add(gs);
            }    
            
            return aperfil;
                } catch (SQLException ex) {
            Logger.getLogger(PerfilCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
        public List<PerfilMODEL> PegarPerfilBD(int cod_perfil)
    {
        List<PerfilMODEL> aperfil = new ArrayList<>();
        PerfilDAO objdao = new PerfilDAO();
        ResultSet rsperfil = objdao.pegarIDPerfil(cod_perfil);
        
        try {
            while(rsperfil.next())
            {
                PerfilMODEL gs = new PerfilMODEL();
                gs.setNome_perfil(rsperfil.getString("nome_perfil"));
                
                aperfil.add(gs);
            }    
            
            return aperfil;
                } catch (SQLException ex) {
            Logger.getLogger(PerfilCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
        
        
    }
    
    /*/    
        public void DesativaPerfilCTR(boolean status_cli, int id_cli)
     {
         // Cria um objeto da MODEL
        PerfilMODEL objperfil = new PerfilMODEL();
        //Envia por meio de SET o valor de nome
        objperfil.setStatus_perfil(status_cli);
        objperfil.setId_perfil(id_cli);
        
        //Declara objeto da DAO
        PerfilDAO objdao = new PerfilDAO();
        //Utiliza método insere e parametro MODEL
        objdao.DesativarPerfil(objperfil);
     }
        /*/
    
     public void ExcluiPerfilCTR(int cod_perfil)
     {
         PerfilMODEL objperfil = new PerfilMODEL();
         
         objperfil.setCod_perfil(cod_perfil);
         
         PerfilDAO objdao = new PerfilDAO();
         objdao.ExcluirPerfil(objperfil);
     }
    
    
}
