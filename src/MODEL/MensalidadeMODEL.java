/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.sql.Date;

/**
 *
 * @author C4
 */
public class MensalidadeMODEL {
    private int cod_mensalidade;
    private Date emissao_mensalidade;
    private Date vencimento_mensalidade;
    private float valor_mensalidade;
    private float valor_pago_mensalidade;
    private float juros_mensalidade;
    private float desconto_mensalidade;
    private int mensalidade_formadepagamento;
    private int mensalidade_status;
    private int mensalidade_plano;

    /**
     * @return the cod_mensalidade
     */
    public int getCod_mensalidade() {
        return cod_mensalidade;
    }

    /**
     * @param cod_mensalidade the cod_mensalidade to set
     */
    public void setCod_mensalidade(int cod_mensalidade) {
        this.cod_mensalidade = cod_mensalidade;
    }

    /**
     * @return the emissao_mensalidade
     */
    public Date getEmissao_mensalidade() {
        return emissao_mensalidade;
    }

    /**
     * @param emissao_mensalidade the emissao_mensalidade to set
     */
    public void setEmissao_mensalidade(Date emissao_mensalidade) {
        this.emissao_mensalidade = emissao_mensalidade;
    }

    /**
     * @return the valor_mensalidade
     */
    public float getValor_mensalidade() {
        return valor_mensalidade;
    }

    /**
     * @param valor_mensalidade the valor_mensalidade to set
     */
    public void setValor_mensalidade(float valor_mensalidade) {
        this.valor_mensalidade = valor_mensalidade;
    }

    /**
     * @return the valor_pago_mensalidade
     */
    public float getValor_pago_mensalidade() {
        return valor_pago_mensalidade;
    }

    /**
     * @param valor_pago_mensalidade the valor_pago_mensalidade to set
     */
    public void setValor_pago_mensalidade(float valor_pago_mensalidade) {
        this.valor_pago_mensalidade = valor_pago_mensalidade;
    }

    /**
     * @return the juros_mensalidade
     */
    public float getJuros_mensalidade() {
        return juros_mensalidade;
    }

    /**
     * @param juros_mensalidade the juros_mensalidade to set
     */
    public void setJuros_mensalidade(float juros_mensalidade) {
        this.juros_mensalidade = juros_mensalidade;
    }

    /**
     * @return the desconto_mensalidade
     */
    public float getDesconto_mensalidade() {
        return desconto_mensalidade;
    }

    /**
     * @param desconto_mensalidade the desconto_mensalidade to set
     */
    public void setDesconto_mensalidade(float desconto_mensalidade) {
        this.desconto_mensalidade = desconto_mensalidade;
    }

    /**
     * @return the mensalidade_formadepagamento
     */
    public int getMensalidade_formadepagamento() {
        return mensalidade_formadepagamento;
    }

    /**
     * @param mensalidade_formadepagamento the mensalidade_formadepagamento to set
     */
    public void setMensalidade_formadepagamento(int mensalidade_formadepagamento) {
        this.mensalidade_formadepagamento = mensalidade_formadepagamento;
    }

    /**
     * @return the mensalidade_status
     */
    public int getMensalidade_status() {
        return mensalidade_status;
    }

    /**
     * @param mensalidade_status the mensalidade_status to set
     */
    public void setMensalidade_status(int mensalidade_status) {
        this.mensalidade_status = mensalidade_status;
    }
    
    /**
     * @return the vencimento_mensalidade
     */
    public Date getVencimento_mensalidade() {
        return vencimento_mensalidade;
    }

    /**
     * @param vencimento_mensalidade the vencimento_mensalidade to set
     */
    public void setVencimento_mensalidade(Date vencimento_mensalidade) {
        this.vencimento_mensalidade = vencimento_mensalidade;
    }

    /**
     * @return the mensalidade_plano
     */
    public int getMensalidade_plano() {
        return mensalidade_plano;
    }

    /**
     * @param mensalidade_plano the mensalidade_plano to set
     */
    public void setMensalidade_plano(int mensalidade_plano) {
        this.mensalidade_plano = mensalidade_plano;
    }
}
