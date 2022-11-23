/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CTR.EntradaCTR;
import MODEL.EntradaMODEL;
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
public class EntradaDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void insereEntrada(EntradaMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into entrada (dataehota_entrada, pessoa_entrada) values (?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setTimestamp(1, gs.getDataehora_entrada());
            pgsql.setInt(2, gs.getPessoa_entrada());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrada Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

public void AlteraEntrada(EntradaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update entrada set "
                + "dataehora_entrada = ?,pessoa_entrada = ?"
                + "where cod_entrada = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setTimestamp(1, gs.getDataehora_entrada());
            pgsql.setInt(2, gs.getPessoa_entrada());

            pgsql.setInt(3, gs.getCod_entrada());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrada Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public ResultSet PesquisarEntrada (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from entrada where pessoa_entrada::text like (?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaEntrada()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from entrada order by cod_entrada";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
    
        public ResultSet pegarIDEntrada(int cod_entrada)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from entrada where cod_entrada =" +cod_entrada;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
        
        
        public ResultSet pegarUtimaIDEntradaPelaPessoa(int pessoa_entrada)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "SELECT * FROM entrada where pessoa_entrada ="+pessoa_entrada+"ORDER BY cod_entrada DESC LIMIT 1" ;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
        
        
        
        
        
    public List<EntradaMODEL> ListaEntradaBD() {
        List<EntradaMODEL> aentrada = new ArrayList<>();
        EntradaDAO objdao = new EntradaDAO();
        ResultSet rsentrada = objdao.listaEntrada();

        try {
            while (rsentrada.next()) {
                EntradaMODEL gs = new EntradaMODEL();
                gs.setCod_entrada(rsentrada.getInt("cod_entrada"));
                gs.setDataehora_entrada(rsentrada.getTimestamp("dataehora_entrada"));
                gs.setPessoa_entrada(rsentrada.getInt("pessoa_entrada"));
               
                aentrada.add(gs);
            }
            return aentrada;

        } catch (SQLException ex) {
            Logger.getLogger(EntradaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<EntradaMODEL> pegarEntradaBD(int id_cidade) {
        List<EntradaMODEL> aentrada = new ArrayList<>();
        EntradaDAO objdao = new EntradaDAO();
        ResultSet rsentrada = objdao.pegarIDEntrada(id_cidade);

        try {
            while (rsentrada.next()) {
                EntradaMODEL gs = new EntradaMODEL();
                gs.setDataehora_entrada(rsentrada.getTimestamp("dataehora_entrada"));

                aentrada.add(gs);
            }
            return aentrada;

        } catch (SQLException ex) {
            Logger.getLogger(EntradaCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     /*/
         public void DesativarEntrada(EntradaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update entrada set"
                + " status_entrada = ? "
                + "where id_entrada = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_entrada());
            pgsql.setInt(2, gs.getId_entrada());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_entrada() == true)
            {
               JOptionPane.showMessageDialog(null, "Entrada Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Entrada Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirEntrada(EntradaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from entrada where"
                + " cod_entrada = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_entrada());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Entrada Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(EntradaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
