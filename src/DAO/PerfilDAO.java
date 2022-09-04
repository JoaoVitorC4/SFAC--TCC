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
public class PerfilDAO {
    Connection con;
    PreparedStatement pgsql;
    Statement st;
    
    public ResultSet listaPerfil()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from perfil order by cod_perfil";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                   
        } catch (SQLException ex) {
          
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
        return rs;
                
    }
    
    public ResultSet pegarIDPerfil(int cod_perfil)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from perfil e "
                + "inner join cidade c on e.cod_perfil = c.fk_perfil where c.cod_perfil = " + cod_perfil;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                   
        } catch (SQLException ex) {
          
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        } 
       
        return rs;
                
    }
    
    
}
