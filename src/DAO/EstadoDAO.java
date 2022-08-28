/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Codinhoto
 */
public class EstadoDAO {
    Connection con;
    PreparedStatement pgsql;
    Statement st;
    
    public ResultSet listaEstado()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from estado order by cod_uf";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                   
        } catch (SQLException ex) {
          
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
                
    }
    
    public ResultSet pegarIDEstado(int id_cidade)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from estado e "
                + "inner join cidade c on e.cod_uf = c.fk_estado where c.cod_cidade = " + id_cidade;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                   
        } catch (SQLException ex) {
          
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
                
    }
    
    
}
