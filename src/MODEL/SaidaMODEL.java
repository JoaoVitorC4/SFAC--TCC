/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

import java.sql.Timestamp;

/**
 *
 * @author LOUISE
 */
public class SaidaMODEL {
    private int cod_saida;
    private Timestamp dataehora_saida;
    private int saida_entrada;

    /**
     * @return the cod_saida
     */
    public int getCod_saida() {
        return cod_saida;
    }

    /**
     * @param cod_saida the cod_saida to set
     */
    public void setCod_saida(int cod_saida) {
        this.cod_saida = cod_saida;
    }

    /**
     * @return the dataehora_saida
     */
    public Timestamp getDataehora_saida() {
        return dataehora_saida;
    }

    /**
     * @param dataehora_saida the dataehora_saida to set
     */
    public void setDataehora_saida(Timestamp dataehora_saida) {
        this.dataehora_saida = dataehora_saida;
    }

    /**
     * @return the saida_entrada
     */
    public int getSaida_entrada() {
        return saida_entrada;
    }

    /**
     * @param saida_entrada the saida_entrada to set
     */
    public void setSaida_entrada(int saida_entrada) {
        this.saida_entrada = saida_entrada;
    }
}
