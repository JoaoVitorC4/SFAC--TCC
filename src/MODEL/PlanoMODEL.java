/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author LOUISE
 */
public class PlanoMODEL {
    private int cod_plano;
    private String nome_plano;
    private float valor_plano;
    private int qtd_dependente;
    private int qtd_convidado;

    /**
     * @return the cod_plano
     */
    public int getCod_plano() {
        return cod_plano;
    }

    /**
     * @param cod_plano the cod_plano to set
     */
    public void setCod_plano(int cod_plano) {
        this.cod_plano = cod_plano;
    }

    /**
     * @return the nome_plano
     */
    public String getNome_plano() {
        return nome_plano;
    }

    /**
     * @param nome_plano the nome_plano to set
     */
    public void setNome_plano(String nome_plano) {
        this.nome_plano = nome_plano;
    }

    /**
     * @return the valor_plano
     */
    public float getValor_plano() {
        return valor_plano;
    }

    /**
     * @param valor_plano the valor_plano to set
     */
    public void setValor_plano(float valor_plano) {
        this.valor_plano = valor_plano;
    }

    /**
     * @return the qtd_dependente
     */
    public int getQtd_dependente() {
        return qtd_dependente;
    }

    /**
     * @param qtd_dependente the qtd_dependente to set
     */
    public void setQtd_dependente(int qtd_dependente) {
        this.qtd_dependente = qtd_dependente;
    }

    /**
     * @return the qtd_convidado
     */
    public int getQtd_convidado() {
        return qtd_convidado;
    }

    /**
     * @param qtd_convidado the qtd_convidado to set
     */
    public void setQtd_convidado(int qtd_convidado) {
        this.qtd_convidado = qtd_convidado;
    }
}
