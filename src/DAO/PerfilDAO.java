/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PerfilMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author C4
 */
public class PerfilDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void inserePerfil(PerfilMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into perfil(nome_perfil) values (?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_perfil());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perfil Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

public void AlteraPerfil(PerfilMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update perfil set "
                + "nome_perfil = ?"
                + "where cod_perfil = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_perfil());
            pgsql.setInt(2, gs.getCod_perfil());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perfil Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public ResultSet PesquisarPerfil (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from perfil where upper(nome_perfil) like upper(?) order by cod_perfil";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaPerfil()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from perfil";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
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
        String sql = "select * from perfil inner join contato on cod_perfil = fk_cod_perfil where cod_perfil =" +cod_perfil;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
     /*/
         public void DesativarPerfil(PerfilMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update perfil set"
                + " status_perfil = ? "
                + "where id_perfil = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_perfil());
            pgsql.setInt(2, gs.getId_perfil());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_perfil() == true)
            {
               JOptionPane.showMessageDialog(null, "Perfil Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Perfil Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirPerfil(PerfilMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from perfil where"
                + " cod_perfil = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_perfil());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Perfil Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(PerfilDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
