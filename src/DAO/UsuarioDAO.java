/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CTR.UsuarioCTR;
import MODEL.UsuarioMODEL;
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
public class UsuarioDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void insereUsuario(UsuarioMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into usuario(nome_usuario,senha_usuario,usuario_perfil) values (?,?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_usuario());
            pgsql.setString(2, gs.getSenha_usuario());
            pgsql.setInt(3, gs.getUsuario_perfil());

 
        
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

public void AlteraUsuario(UsuarioMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update usuario set "
                + "nome_usuario = ?,senha_usuario = ?, usuario_perfil = ?"
                + "where cod_usuario = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1, gs.getNome_usuario());
            pgsql.setString(2, gs.getSenha_usuario());
            pgsql.setInt(3, gs.getUsuario_perfil());

            pgsql.setInt(4, gs.getCod_usuario());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public ResultSet PesquisarUsuario (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from usuario where upper(nome_usuario) like upper(?) order by cod_usuario";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaUsuario()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from usuario";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
    
        public ResultSet pegarIDUsuario(int cod_usuario)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from usuario inner join contato on cod_usuario = fk_cod_usuario where cod_usuario =" +cod_usuario;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
        
    public List<UsuarioMODEL> ListaUsuarioBD() {
        List<UsuarioMODEL> ausuario = new ArrayList<>();
        UsuarioDAO objdao = new UsuarioDAO();
        ResultSet rsusuario = objdao.listaUsuario();

        try {
            while (rsusuario.next()) {
                UsuarioMODEL gs = new UsuarioMODEL();
                gs.setCod_usuario(rsusuario.getInt("cod_uf"));
                gs.setNome_usuario(rsusuario.getString("nome_usuario"));
                gs.setSenha_usuario(rsusuario.getString("senha_usuario"));
                gs.setUsuario_perfil(rsusuario.getInt("usuario_perfil"));

                ausuario.add(gs);
            }
            return ausuario;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<UsuarioMODEL> pegarUsuarioBD(int id_cidade) {
        List<UsuarioMODEL> ausuario = new ArrayList<>();
        UsuarioDAO objdao = new UsuarioDAO();
        ResultSet rsusuario = objdao.pegarIDUsuario(id_cidade);

        try {
            while (rsusuario.next()) {
                UsuarioMODEL gs = new UsuarioMODEL();
                gs.setNome_usuario(rsusuario.getString("nome_usuario"));

                ausuario.add(gs);
            }
            return ausuario;

        } catch (SQLException ex) {
            Logger.getLogger(UsuarioCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     /*/
         public void DesativarUsuario(UsuarioMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update usuario set"
                + " status_usuario = ? "
                + "where id_usuario = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_usuario());
            pgsql.setInt(2, gs.getId_usuario());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_usuario() == true)
            {
               JOptionPane.showMessageDialog(null, "Usuario Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Usuario Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirUsuario(UsuarioMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from usuario where"
                + " cod_usuario = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_usuario());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Usuario Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
