/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
 *
 * @author aquin
 */
public class ConexaoDAO {

    private String caminho = "jdbc:postgresql://localhost:5432/";
    private String usuario = "postgres";
    private String senha = "1234";
    private Connection con = null;
    private String bancoPrincipal = "TCC";

    public Connection conectaPostgre() {

        try {
            Class.forName("org.postgresql.Driver");
            try {
                con = DriverManager.getConnection(caminho + bancoPrincipal, usuario, senha);
               // JOptionPane.showMessageDialog(null, "Conectado com sucesso!!!");
            } catch (SQLException ex) {
                Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
            }
        } catch (ClassNotFoundException ex) {
            System.out.println("Classe não encontrada");
            Logger.getLogger(ConexaoDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return con;
    }
    
    public static void closeConection(Connection con){  
        if(con != null){
            try {
                con.close();
            } catch (SQLException ex) {
                System.err.println("Erro" +ex);
            }
        }
    }
    
    public static void closeConection(Connection con, PreparedStatement pgsql){  
        if(pgsql != null){
            try {
                pgsql.close();
            } catch (SQLException ex) {
                System.err.println("Erro" +ex);
            }
        }
        closeConection(con);
    }
    public static void closeConection(Connection con, PreparedStatement pgsql, ResultSet rs){  
        if(rs != null){
            try {
                rs.close();
            } catch (SQLException ex) {
                System.err.println("Erro" +ex);
            }
        }
        closeConection(con,pgsql);
    }

}
