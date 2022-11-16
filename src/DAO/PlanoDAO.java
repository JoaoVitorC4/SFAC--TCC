/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PlanoMODEL;
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
public class PlanoDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void inserePlano(PlanoMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into plano(nome_plano,valor_plano,qtd_dependente,qtd_convidado) values (?,?,?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_plano().toUpperCase());
            pgsql.setFloat(2, gs.getValor_plano());
            pgsql.setInt(3, gs.getQtd_dependente());
            pgsql.setInt(4, gs.getQtd_convidado());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Plano Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

public void AlteraPlano(PlanoMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update plano set "
                + "nome_plano = ?, valor_plano = ?, qtd_dependente = ?, qtd_convidado = ?"
                + "where cod_plano = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_plano().toUpperCase());
            pgsql.setFloat(2, gs.getValor_plano());
            pgsql.setInt(3, gs.getQtd_dependente());
            pgsql.setInt(4, gs.getQtd_convidado());
            
            pgsql.setInt(5, gs.getCod_plano());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Plano Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public ResultSet PesquisarPlano (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from plano where upper(nome_plano) like upper(?) order by cod_plano";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaPlano()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from plano";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
    
        public ResultSet pegarIDPlano(int cod_plano)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from plano where cod_plano =" +cod_plano;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
         public ResultSet pegarNOMEPlano(String nome_plano)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        ResultSet rs = null;
        
        
        String sql = "select * from plano where upper(nome_plano) like upper(?) order by cod_plano";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome_plano + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
 
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
     /*/
         public void DesativarPlano(PlanoMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update plano set"
                + " status_plano = ? "
                + "where id_plano = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_plano());
            pgsql.setInt(2, gs.getId_plano());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_plano() == true)
            {
               JOptionPane.showMessageDialog(null, "Plano Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Plano Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirPlano(PlanoMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from plano where"
                + " cod_plano = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_plano());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Plano Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(PlanoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
