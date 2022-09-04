/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.ConexaoDAO;
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
 * @author Codinhoto
 */
public class PerfilCTR {

    public List<PerfilMODEL> ListaPerfilBD() {
        List<PerfilMODEL> aperfil = new ArrayList<>();
        PerfilDAO objdao = new PerfilDAO();
        ResultSet rsperfil = objdao.listaPerfil();

        try {
            while (rsperfil.next()) {
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
    
    public List<PerfilMODEL> pegarPerfilBD(int cod_perfil) {
        List<PerfilMODEL> aperfil = new ArrayList<>();
        PerfilDAO objdao = new PerfilDAO();
        ResultSet rsperfil = objdao.pegarIDPerfil(cod_perfil);

        try {
            while (rsperfil.next()) {
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

}
