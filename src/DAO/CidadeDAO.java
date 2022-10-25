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
public class CidadeDAO {
        Connection con;
    PreparedStatement pgsql;
    Statement st;
    
    public ResultSet listaCidade(int cidade_uf)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from cidade where cidade_uf = " 
                                                        + cidade_uf;
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,
                    ResultSet.TYPE_SCROLL_INSENSITIVE);
            
           rs = st.executeQuery(sql);
                       
        } catch (SQLException ex) {
            Logger.getLogger(EstadoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return rs;
        
        
    }
    
    public ResultSet pegarIDCidade(int cod_cidade)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from cidade where cod_cidade = " 
                                                        + cod_cidade;
        
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
