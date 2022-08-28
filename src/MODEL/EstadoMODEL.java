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
public class EstadoMODEL {
    private int cod_uf;
    private String nome_estado;
    private String sigla_uf;

    /**
     * @return the cod_uf
     */
    public int getCod_uf() {
        return cod_uf;
    }

    /**
     * @param cod_uf the cod_uf to set
     */
    public void setCod_uf(int cod_uf) {
        this.cod_uf = cod_uf;
    }

    /**
     * @return the nome_estado
     */
    public String getNome_estado() {
        return nome_estado;
    }

    /**
     * @param nome_estado the nome_estado to set
     */
    public void setNome_estado(String nome_estado) {
        this.nome_estado = nome_estado;
    }

    /**
     * @return the sigla_uf
     */
    public String getSigla_uf() {
        return sigla_uf;
    }

    /**
     * @param sigla_uf the sigla_uf to set
     */
    public void setSigla_uf(String sigla_uf) {
        this.sigla_uf = sigla_uf;
    }
}
