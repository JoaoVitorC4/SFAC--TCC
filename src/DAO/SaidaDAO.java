/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CTR.SaidaCTR;
import MODEL.SaidaMODEL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author C4
 */
public class SaidaDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void insereSaida(SaidaMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into saida (dataehora_saida, saida_entrada) values (?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setTimestamp(1, gs.getDataehora_saida());
            pgsql.setInt(2, gs.getSaida_entrada());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saída Registrada com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
           
    }

public void AlteraSaida(SaidaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update saida set "
                + "dataehora_saida = ?,saida_entrada = ?"
                + "where cod_saida = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setTimestamp(1, gs.getDataehora_saida());
            pgsql.setInt(2, gs.getSaida_entrada());

            pgsql.setInt(3, gs.getCod_saida());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saida Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
    }

     public ResultSet PesquisarSaida (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from saida where pessoa_saida::text like (?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
         
         return rs;
     }
     
     
     public ResultSet listaSaida()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from saida order by cod_saida";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }finally{
        cb.closeConection(con);
        }
         return rs;
    }
    
        public ResultSet pegarIDSaida(int cod_saida)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from saida where cod_saida =" +cod_saida;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }finally{
        cb.closeConection(con);
        }
         return rs;
    }
        
    public List<SaidaMODEL> ListaSaidaBD() {
        List<SaidaMODEL> asaida = new ArrayList<>();
        SaidaDAO objdao = new SaidaDAO();
        ResultSet rssaida = objdao.listaSaida();

        try {
            while (rssaida.next()) {
                SaidaMODEL gs = new SaidaMODEL();
                gs.setCod_saida(rssaida.getInt("cod_saida"));
                gs.setDataehora_saida(rssaida.getTimestamp("dataehora_saida"));
                gs.setSaida_entrada(rssaida.getInt("saida_entrada"));
               
                asaida.add(gs);
            }
            return asaida;

        } catch (SQLException ex) {
            Logger.getLogger(SaidaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<SaidaMODEL> pegarSaidaBD(int id_cidade) {
        List<SaidaMODEL> asaida = new ArrayList<>();
        SaidaDAO objdao = new SaidaDAO();
        ResultSet rssaida = objdao.pegarIDSaida(id_cidade);

        try {
            while (rssaida.next()) {
                SaidaMODEL gs = new SaidaMODEL();
                gs.setDataehora_saida(rssaida.getTimestamp("dataehora_saida"));

                asaida.add(gs);
            }
            return asaida;

        } catch (SQLException ex) {
            Logger.getLogger(SaidaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     /*/
         public void DesativarSaida(SaidaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update saida set"
                + " status_saida = ? "
                + "where id_saida = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_saida());
            pgsql.setInt(2, gs.getId_saida());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_saida() == true)
            {
               JOptionPane.showMessageDialog(null, "Saida Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Saida Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirSaida(SaidaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from saida where"
                + " cod_saida = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_saida());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Saida Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(SaidaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
    }
     
     
}
