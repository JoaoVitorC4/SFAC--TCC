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
public class FormadePagamentoMODEL {
    private int cod_formadepagamento;
    private String nome_formadepagamento;
    private float taxa_formadepagamento;

    /**
     * @return the cod_formadepagamento
     */
    public int getCod_formadepagamento() {
        return cod_formadepagamento;
    }

    /**
     * @param cod_formadepagamento the cod_formadepagamento to set
     */
    public void setCod_formadepagamento(int cod_formadepagamento) {
        this.cod_formadepagamento = cod_formadepagamento;
    }

    /**
     * @return the nome_formadepagamento
     */
    public String getNome_formadepagamento() {
        return nome_formadepagamento;
    }

    /**
     * @param nome_formadepagamento the nome_formadepagamento to set
     */
    public void setNome_formadepagamento(String nome_formadepagamento) {
        this.nome_formadepagamento = nome_formadepagamento;
    }

    /**
     * @return the taxa_formadepagamento
     */
    public float getTaxa_formadepagamento() {
        return taxa_formadepagamento;
    }

    /**
     * @param taxa_formadepagamento the taxa_formadepagamento to set
     */
    public void setTaxa_formadepagamento(float taxa_formadepagamento) {
        this.taxa_formadepagamento = taxa_formadepagamento;
    }
}
