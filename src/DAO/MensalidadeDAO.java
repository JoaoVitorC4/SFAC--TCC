/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DAO;

import CTR.MensalidadeCTR;
import MODEL.MensalidadeMODEL;
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
public class MensalidadeDAO {
    
    Connection con;
    PreparedStatement pgsql;   
    Statement st;
    ResultSet rs;
    
    
    
public void insereMensalidade(MensalidadeMODEL gs){
    
           ConexaoDAO cb = new ConexaoDAO();
           con = cb.conectaPostgre();
           
           String sql = "insert into mensalidade(emissao_mensalidade, vencimento_mensalidade, valor_mensalidade, "
                   + "valor_pago_mensalidade, juros_mensalidade, desconto_mensalidade, mensalidade_formadepagamento, "
                   + "mensalidade_status, mensalidade_plano) values (?,?,?,?,?,?,?,?,?)";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setDate(1, gs.getEmissao_mensalidade());
            pgsql.setDate(2, gs.getVencimento_mensalidade());
            pgsql.setFloat(3, gs.getValor_mensalidade());
            pgsql.setFloat(4, gs.getValor_pago_mensalidade());
            pgsql.setFloat(5, gs.getJuros_mensalidade());
            pgsql.setFloat(6, gs.getDesconto_mensalidade());
            pgsql.setInt(7, gs.getMensalidade_formadepagamento());
            pgsql.setInt(8, gs.getMensalidade_status());
            pgsql.setInt(9, gs.getMensalidade_plano());

    
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mensalidade Cadastrado com Sucesso");
        
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
           
    }

public void AlteraMensalidade(MensalidadeMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update mensalidade set "
                + "emissao_mensalidade = ?, vencimento_mensalidade = ?, valor_mensalidade = ?,valor_pago_mensalidade = ?, juros_mensalidade = ?"
                +"desconto_mensalidade = ?, mensalidade_formadepagamento = ?, mensalidade_status = ?, mensalidade_plano = ?"
                + "where cod_mensalidade = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setDate(1, gs.getEmissao_mensalidade());
            pgsql.setDate(2, gs.getVencimento_mensalidade());
            pgsql.setFloat(3, gs.getValor_mensalidade());
            pgsql.setFloat(4, gs.getValor_pago_mensalidade());
            pgsql.setFloat(5, gs.getJuros_mensalidade());
            pgsql.setFloat(6, gs.getDesconto_mensalidade());
            pgsql.setInt(7, gs.getMensalidade_formadepagamento());
            pgsql.setInt(8, gs.getMensalidade_status());
            pgsql.setInt(9, gs.getMensalidade_plano());
            
            pgsql.setInt(10, gs.getCod_mensalidade());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mensalidade Alterado com Sucesso");
            
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

     public ResultSet PesquisarMensalidade (String nome){
         ConexaoDAO cb = new ConexaoDAO();
         con = cb.conectaPostgre();
         
         
         String sql = "select * from mensalidade where vencimento_mensalidade::text like (?) order by vencimento_mensalidade";
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setString(1,"%" + nome + "%");
            
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE, ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            
             rs = st.executeQuery(pgsql.toString());
            
        
        
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
         
         return rs;
     }
     
     
     public ResultSet listaMensalidade()
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from mensalidade";
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
    
        public ResultSet pegarIDMensalidade(int cod_mensalidade)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        ResultSet rs = null;
        String sql = "select * from mensalidade where cod_mensalidade =" +cod_mensalidade;
       
        
        try {
            st = con.createStatement(ResultSet.CONCUR_UPDATABLE,ResultSet.TYPE_SCROLL_INSENSITIVE);
            
            rs = st.executeQuery(sql);
            
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
            
           
        }
         return rs;
    }
        
    public List<MensalidadeMODEL> ListaMensalidadeBD() {
        List<MensalidadeMODEL> amensalidade = new ArrayList<>();
        MensalidadeDAO objdao = new MensalidadeDAO();
        ResultSet rsmensalidade = objdao.listaMensalidade();

        try {
            while (rsmensalidade.next()) {
                MensalidadeMODEL gs = new MensalidadeMODEL();
                gs.setCod_mensalidade(rsmensalidade.getInt("cod_mensalidade"));
                gs.setVencimento_mensalidade(rsmensalidade.getDate("emissao_mensalidade"));
                gs.setVencimento_mensalidade(rsmensalidade.getDate("vencimento_mensalidade"));
                gs.setValor_mensalidade(rsmensalidade.getFloat("valor_mensalidade"));
                gs.setValor_pago_mensalidade(rsmensalidade.getFloat("valor_pago_mensalidade"));
                gs.setJuros_mensalidade(rsmensalidade.getFloat("juros_mensalidade"));
                gs.setDesconto_mensalidade(rsmensalidade.getFloat("desconto_mensalidade"));
                gs.setMensalidade_formadepagamento(rsmensalidade.getInt("mensalidade_formadepagamento"));
                gs.setMensalidade_status(rsmensalidade.getInt("mensalidade_status"));
                gs.setMensalidade_plano(rsmensalidade.getInt("mensalidade_plano"));
           

                amensalidade.add(gs);
            }
            return amensalidade;

        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
    
    public List<MensalidadeMODEL> pegarMensalidadeBD(int id_mensalidade) {
        List<MensalidadeMODEL> amensalidade = new ArrayList<>();
        MensalidadeDAO objdao = new MensalidadeDAO();
        ResultSet rsmensalidade = objdao.pegarIDMensalidade(id_mensalidade);

        try {
            while (rsmensalidade.next()) {
                MensalidadeMODEL gs = new MensalidadeMODEL();
                gs.setCod_mensalidade(rsmensalidade.getInt("cod_mensalidade"));

                amensalidade.add(gs);
            }
            return amensalidade;

        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeCTR.class.getName()).log(Level.SEVERE, null, ex);
            return null;
        }
    }
     /*/
         public void DesativarMensalidade(MensalidadeMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "update mensalidade set"
                + " status_mensalidade = ? "
                + "where id_mensalidade = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setBoolean(1, gs.getstatus_mensalidade());
            pgsql.setInt(2, gs.getId_mensalidade());
            
            pgsql.executeUpdate();
            
            if(gs.getStatus_mensalidade() == true)
            {
               JOptionPane.showMessageDialog(null, "Mensalidade Ativado"); 
            }
            else            
            JOptionPane.showMessageDialog(null, "Mensalidade Desativado");
            
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    /*/
    
    public void ExcluirMensalidade(MensalidadeMODEL gs)
    {
        ConexaoDAO cb = new ConexaoDAO();
        con = cb.conectaPostgre();
        
        String sql = "delete from mensalidade where"
                + " cod_mensalidade = ?";
        
        try {
            pgsql = con.prepareStatement(sql);
            pgsql.setInt(1, gs.getCod_mensalidade());
            
            pgsql.executeUpdate();
            JOptionPane.showMessageDialog(null, "Mensalidade Excluído com Sucesso!");
            
        } catch (SQLException ex) {
            Logger.getLogger(MensalidadeDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
     
     
}
