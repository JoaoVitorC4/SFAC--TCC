/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.StatusDAO;
import DAO.EstadoDAO;
import MODEL.StatusMODEL;
import MODEL.EstadoMODEL;
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
public class StatusCTR {
    
    public List<StatusMODEL> ListaStatusBD() {
        List<StatusMODEL> astatus = new ArrayList<>();
        StatusDAO objdao = new StatusDAO();
        ResultSet rsstatus = objdao.listaStatus();

        try {
            while (rsstatus.next()) {
                StatusMODEL gs = new StatusMODEL();
                gs.setCod_status(rsstatus.getInt("cod_status"));
                gs.setNome_status(rsstatus.getString("nome_status"));
                gs.setLibera_status(rsstatus.getBoolean("libera_acesso"));
                
                astatus.add(gs);
            }
            return astatus;

        } catch (SQLException ex) {
            Logger.getLogger(StatusCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<StatusMODEL> pegarStatusBD(int cod_status) {
        List<StatusMODEL> astatus = new ArrayList<>();
        StatusDAO objdao = new StatusDAO();
        ResultSet rsstatus = objdao.pegarIDStatus(cod_status);

        try {
            while (rsstatus.next()) {
                StatusMODEL gs = new StatusMODEL();
                gs.setNome_status(rsstatus.getString("nome_status"));

                astatus.add(gs);
            }
            return astatus;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
