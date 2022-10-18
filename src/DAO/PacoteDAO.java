/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CTR.PacoteCTR;
import MODEL.PacoteMODEL;
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
public class PacoteDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void inserePacote(PacoteMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into pacote(pessoa_pacote,plano_pacote,grupo_pacote,vencimento_pacote,identificacao_pacote) values (?,?,?,?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getPessoa_pacote());
            pgsql.setInt(2, gs.getPlano_pacote());
            pgsql.setInt(3, gs.getGrupo_pacote());
            pgsql.setDate(4, gs.getVencimento_pacote());
            pgsql.setInt(5, gs.getIdentificacao_pacote());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pacote Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

public void AlteraPacote(PacoteMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update pacote set "
                + "pessoa_pacote = ?, plano_pacote = ?, grupo_pacote = ?, vencimento_pacote = ?, identificacao_pacote = ?"
                + "where cod_pacote = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getPessoa_pacote());
            pgsql.setInt(2, gs.getPlano_pacote());
            pgsql.setInt(3, gs.getGrupo_pacote());
            pgsql.setDate(4, gs.getVencimento_pacote());
            pgsql.setInt(5, gs.getIdentificacao_pacote());

            pgsql.setInt(6, gs.getCod_pacote());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pacote Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public ResultSet PesquisarPacote (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from pacote where identificacao_pacote::text like (?) order by identificacao_pacote";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaPacote()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from pacote";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
    
        public ResultSet pegarIDPacote(int cod_pacote)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from pacote where cod_pacote =" +cod_pacote;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
        
    public List<PacoteMODEL> ListaPacoteBD() {
        List<PacoteMODEL> apacote = new ArrayList<>();
        PacoteDAO objdao = new PacoteDAO();
        ResultSet rspacote = objdao.listaPacote();

        try {
            while (rspacote.next()) {
                PacoteMODEL gs = new PacoteMODEL();
                gs.setCod_pacote(rspacote.getInt("cod_pacote"));
                gs.setPessoa_pacote(rspacote.getInt("pessoa_pacote"));
                gs.setPlano_pacote(rspacote.getInt("plano_pacote"));
                gs.setGrupo_pacote(rspacote.getInt("grupo_pessoa"));
                gs.setVencimento_pacote(rspacote.getDate("vencimento_pacote"));
                gs.setIdentificacao_pacote(rspacote.getInt("identificacao_pacote"));

                apacote.add(gs);
            }
            return apacote;

        } catch (SQLException ex) {
            Logger.getLogger(PacoteCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<PacoteMODEL> pegarPacoteBD(int id_pacote) {
        List<PacoteMODEL> apacote = new ArrayList<>();
        PacoteDAO objdao = new PacoteDAO();
        ResultSet rspacote = objdao.pegarIDPacote(id_pacote);

        try {
            while (rspacote.next()) {
                PacoteMODEL gs = new PacoteMODEL();
                gs.setIdentificacao_pacote(rspacote.getInt("identificacao_pacote"));

                apacote.add(gs);
            }
            return apacote;

        } catch (SQLException ex) {
            Logger.getLogger(PacoteCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     /*/
         public void DesativarPacote(PacoteMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update pacote set"
                + " status_pacote = ? "
                + "where id_pacote = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_pacote());
            pgsql.setInt(2, gs.getId_pacote());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_pacote() == true)
            {
               JOptionPane.showMessageDialog(null, "Pacote Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Pacote Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirPacote(PacoteMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from pacote where"
                + " cod_pacote = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_pacote());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pacote Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(PacoteDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
