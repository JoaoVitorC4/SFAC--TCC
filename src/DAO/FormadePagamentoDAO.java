/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.FormadePagamentoMODEL;
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
public class FormadePagamentoDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void insereFormadePagamento(FormadePagamentoMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into formadepagamento(nome_fpagamento,taxa_fpagamento) values (?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_formadepagamento().toUpperCase());
            pgsql.setFloat(2, gs.getTaxa_formadepagamento());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Forma de Pagamento Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoDAO.closeConection(con, pgsql);
        }
           
   
    }

public void AlteraFormadePagamento(FormadePagamentoMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update formadepagamento set "
                + "nome_fpagamento = ?,taxa_fpagamento = ?"
                + "where cod_fpagamento = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_formadepagamento().toUpperCase());
            pgsql.setFloat(2, gs.getTaxa_formadepagamento());
            pgsql.setInt(3, gs.getCod_formadepagamento());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Forma de Pagamento Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoDAO.closeConection(con, pgsql);
        }
    }

     public ResultSet PesquisarFormadePagamento (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from formadepagamento where upper(nome_fpagamento) like upper(?) order by cod_fpagamento";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaFormadePagamento()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from formadepagamento";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
    
        public ResultSet pegarIDFormadePagamento(int cod_formadepagamento)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from formadepagamento where cod_fpagamento =" +cod_formadepagamento;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
     /*/
         public void DesativarFormadePagamento(FormadePagamentoMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update formadepagamento set"
                + " status_formadepagamento = ? "
                + "where id_formadepagamento = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_formadepagamento());
            pgsql.setInt(2, gs.getId_formadepagamento());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_formadepagamento() == true)
            {
               JOptionPane.showMessageDialog(null, "FormadePagamento Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "FormadePagamento Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirFormadePagamento(FormadePagamentoMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from formadepagamento where"
                + " cod_fpagamento = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_formadepagamento());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "FormadePagamento Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(FormadePagamentoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            ConexaoDAO.closeConection(con, pgsql);
        }
    }
     
     
}
