/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.EstadoDAO;
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
public class EstadoCTR {

    public List<EstadoMODEL> ListaEstadoBD() {
        List<EstadoMODEL> aestado = new ArrayList<>();
        EstadoDAO objdao = new EstadoDAO();
        ResultSet rsestado = objdao.listaEstado();

        try {
            while (rsestado.next()) {
                EstadoMODEL gs = new EstadoMODEL();
                gs.setCod_uf(rsestado.getInt("cod_uf"));
                gs.setNome_estado(rsestado.getString("nome_estado"));
                gs.setSigla_uf(rsestado.getString("sigla_uf"));

                aestado.add(gs);
            }
            return aestado;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<EstadoMODEL> pegarEstadoBD(int id_cidade) {
        List<EstadoMODEL> aestado = new ArrayList<>();
        EstadoDAO objdao = new EstadoDAO();
        ResultSet rsestado = objdao.pegarIDEstado(id_cidade);

        try {
            while (rsestado.next()) {
                EstadoMODEL gs = new EstadoMODEL();
                gs.setNome_estado(rsestado.getString("nome_estado"));

                aestado.add(gs);
            }
            return aestado;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }

}
