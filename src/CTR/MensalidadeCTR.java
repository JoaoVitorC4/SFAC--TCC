/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package CTR;

import DAO.MensalidadeDAO;
import MODEL.MensalidadeMODEL;
import java.sql.Date;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author Codinhoto
 */
public class MensalidadeCTR {

    public List<MensalidadeMODEL> ListaMensalidadeBD() {
        List<MensalidadeMODEL> amensalidade = new ArrayList<>();
        MensalidadeDAO objdao = new MensalidadeDAO();
        ResultSet rsmensalidade = objdao.listaMensalidade();

        try {
            while (rsmensalidade.next()) {
                MensalidadeMODEL gs = new MensalidadeMODEL();
                gs.setCod_mensalidade(rsmensalidade.getInt("cod_mensalidade"));
                gs.setEmissao_mensalidade(rsmensalidade.getDate("emissao_mensalidade"));
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
  
        public void insereMENSALIDADECTR(Date emissao_mensalidade, Date vencimento_mensalidade, float valor_mensalidade, float valor_pago_mensalidade, 
                float juros_mensalidade, float desconto_mensalidade, int mensalidade_formadepagamento, int mensalidade_status, int mensalidade_plano){
           
            MensalidadeMODEL objmensalidade = new MensalidadeMODEL();
         
            objmensalidade.setEmissao_mensalidade(emissao_mensalidade);
            objmensalidade.setVencimento_mensalidade(vencimento_mensalidade);
            objmensalidade.setValor_mensalidade(valor_mensalidade);
            objmensalidade.setValor_pago_mensalidade(valor_pago_mensalidade);
            objmensalidade.setJuros_mensalidade(juros_mensalidade);
            objmensalidade.setDesconto_mensalidade(desconto_mensalidade);
            objmensalidade.setMensalidade_formadepagamento(mensalidade_formadepagamento);
            objmensalidade.setMensalidade_status(mensalidade_status);
            objmensalidade.setMensalidade_plano(mensalidade_plano);

            MensalidadeDAO objdao = new MensalidadeDAO();
      
            objdao.insereMensalidade(objmensalidade);
    }
    
        public void AlteraMensalidadeCTR(Date emissao_mensalidade, Date vencimento_mensalidade, float valor_mensalidade, float valor_pago_mensalidade, 
                float juros_mensalidade, float desconto_mensalidade, int mensalidade_formadepagamento, int mensalidade_status, int mensalidade_plano, 
                int cod_mensalidade)
    {
        // Cria um objeto da MODEL
        MensalidadeMODEL objmensalidade = new MensalidadeMODEL();
        //Envia por meio de SET o valor de nome
        objmensalidade.setEmissao_mensalidade(emissao_mensalidade);
        objmensalidade.setVencimento_mensalidade(vencimento_mensalidade);
        objmensalidade.setValor_mensalidade(valor_mensalidade);
        objmensalidade.setValor_pago_mensalidade(valor_pago_mensalidade);
        objmensalidade.setJuros_mensalidade(juros_mensalidade);
        objmensalidade.setDesconto_mensalidade(desconto_mensalidade);
        objmensalidade.setMensalidade_formadepagamento(mensalidade_formadepagamento);
        objmensalidade.setMensalidade_status(mensalidade_status);
        objmensalidade.setMensalidade_plano(mensalidade_plano);
        objmensalidade.setCod_mensalidade(cod_mensalidade);
        
        //Declara objeto da DAO
        MensalidadeDAO objdao = new MensalidadeDAO();
        //Utiliza método insere e parametro MODEL
        objdao.AlteraMensalidade(objmensalidade);
    }
    

    public ResultSet PesquisarMENSALIDADECTR(String nome){
        
        MensalidadeDAO objtel = new MensalidadeDAO();
        
        return objtel.PesquisarMensalidade(nome);
    
    }

        
   public void ExcluiMensalidadeCTR(int cod_mensalidade)
     {
         MensalidadeMODEL objmensalidade = new MensalidadeMODEL();
         
         objmensalidade.setCod_mensalidade(cod_mensalidade);
         
         MensalidadeDAO objdao = new MensalidadeDAO();
         objdao.ExcluirMensalidade(objmensalidade);
     }
    
    
    
}
