/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import MODEL.PessoaMODEL;
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
public class PessoaDAO {
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void inserePessoa(PessoaMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into pessoa(nome_pessoa,endereco_pessoa,bairro_pessoa,"
                   + "numero_pessoa,cidade_pessoa,cep_pessoa,telefone_pessoa,cpf_pessoa,grupo_pessoa,"
                   + "usuario_pessoa) values (?,?,?,?,?,?,?,?,?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_pessoa().toUpperCase());
            pgsql.setString(2, gs.getEndereco_pessoa().toUpperCase());
            pgsql.setString(3, gs.getBairro_pessoa().toUpperCase());
            pgsql.setString(4, gs.getNumero_pessoa());
            pgsql.setInt(5, gs.getCidade_pessoa());
            pgsql.setString(6, gs.getCep_pessoa());
            pgsql.setString(7, gs.getTelefone_pessoa());
            pgsql.setString(8, gs.getCpf_pessoa());
            pgsql.setInt(9, gs.getGrupo_pessoa());
            //pgsql.setByte(10, gs.getBiometria_pessoa());
            pgsql.setInt(10, gs.getUsuario_pessoa());
            
 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
           
   
    }



public void AlteraPessoa(PessoaMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "update pessoa set nome_pessoa = ?,endereco_pessoa = ?,bairro_pessoa = ?,"
                   + "numero_pessoa = ?,cidade_pessoa = ?,cep_pessoa = ?,telefone_pessoa = ?,"
                   + "cpf_pessoa = ?,grupo_pessoa = ?,usuario_pessoa = ? where cod_pessoa = ?";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_pessoa().toUpperCase());
            pgsql.setString(2, gs.getEndereco_pessoa().toUpperCase());
            pgsql.setString(3, gs.getBairro_pessoa().toUpperCase());
            pgsql.setString(4, gs.getNumero_pessoa());
            pgsql.setInt(5, gs.getCidade_pessoa());
            pgsql.setString(6, gs.getCep_pessoa());
            pgsql.setString(7, gs.getTelefone_pessoa());
            pgsql.setString(8, gs.getCpf_pessoa());
            pgsql.setInt(9, gs.getGrupo_pessoa());
            //pgsql.setByte(10, gs.getBiometria_pessoa());
            pgsql.setInt(10, gs.getUsuario_pessoa());
            
            
            pgsql.setInt(11, gs.getCod_pessoa());
            
 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa Alterada com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
           
   
    }

     public ResultSet listaPessoa()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from pessoa order by cod_pessoa";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }finally{
        cb.closeConection(con);
        }
         return rs;
    }

     public ResultSet PesquisarPessoa (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from pessoa where upper(nome_pessoa) like upper(?) order by cod_pessoa";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
         
         return rs;
     }
     
     
     
      public ResultSet PesquisarPessoaPeloCPF (String cpf){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from pessoa where cpf_pessoa = ?";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + cpf + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
         
         return rs;
     }
     
     
     
      public ResultSet pegarIDPessoa(int cod_pessoa)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from pessoa where cod_pessoa =" +cod_pessoa;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }finally{
        cb.closeConection(con);
        }
         return rs;
    }
     
      
      public ResultSet pegarIDPessoaPeloCPF(String cpf_pessoa)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from pessoa where cpf_pessoa =" +"'"+cpf_pessoa+"'";
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }finally{
        cb.closeConection(con);
        }
         return rs;
    }
      
     
      
          public void ExcluirPessoa(PessoaMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from pessoa where"
                + " cod_pessoa = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_pessoa());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Pessoa Excluído com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(PessoaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
        cb.closeConection(con);
        }
    }
     
     
     
     
}
