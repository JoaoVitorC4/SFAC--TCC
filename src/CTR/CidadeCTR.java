/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.CidadeDAO;
import DAO.EstadoDAO;
import MODEL.CidadeMODEL;
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
public class CidadeCTR {
    
    public List<CidadeMODEL> ListaCidadeBD(int cidade_uf) {
        List<CidadeMODEL> acidade = new ArrayList<>();
        CidadeDAO objdao = new CidadeDAO();
        ResultSet rscidade = objdao.listaCidade(cidade_uf);

        try {
            while (rscidade.next()) {
                CidadeMODEL gs = new CidadeMODEL();
                gs.setCod_cidade(rscidade.getInt("cod_cidade"));
                gs.setNome_cidade(rscidade.getString("nome_cidade"));
                gs.setCidade_uf(rscidade.getInt("cidade_uf"));
                
                acidade.add(gs);
            }
            return acidade;

        } catch (SQLException ex) {
            Logger.getLogger(CidadeCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<CidadeMODEL> pegarCidadeBD(int cod_cidade) {
        List<CidadeMODEL> acidade = new ArrayList<>();
        CidadeDAO objdao = new CidadeDAO();
        ResultSet rscidade = objdao.pegarIDCidade(cod_cidade);

        try {
            while (rscidade.next()) {
                CidadeMODEL gs = new CidadeMODEL();
                gs.setCod_cidade(rscidade.getInt("cod_cidade"));
                gs.setNome_cidade(rscidade.getString("nome_cidade"));
                gs.setCidade_uf(rscidade.getInt("cidade_uf"));

                acidade.add(gs);
            }
            return acidade;

        } catch (SQLException ex) {
            Logger.getLogger(EstadoCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
}
