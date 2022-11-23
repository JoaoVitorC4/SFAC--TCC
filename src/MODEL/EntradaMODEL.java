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
public class EntradaMODEL {
    private int cod_entrada;
    private Timestamp dataehora_entrada;
    private int pessoa_entrada;

    /**
     * @return the cod_entrada
     */
    public int getCod_entrada() {
        return cod_entrada;
    }

    /**
     * @param cod_entrada the cod_entrada to set
     */
    public void setCod_entrada(int cod_entrada) {
        this.cod_entrada = cod_entrada;
    }

    /**
     * @return the dataehora_entrada
     */
    public Timestamp getDataehora_entrada() {
        return dataehora_entrada;
    }

    /**
     * @param dataehora_entrada the dataehora_entrada to set
     */
    public void setDataehora_entrada(Timestamp dataehora_entrada) {
        this.dataehora_entrada = dataehora_entrada;
    }

    /**
     * @return the pessoa_entrada
     */
    public int getPessoa_entrada() {
        return pessoa_entrada;
    }

    /**
     * @param pessoa_entrada the pessoa_entrada to set
     */
    public void setPessoa_entrada(int pessoa_entrada) {
        this.pessoa_entrada = pessoa_entrada;
    }
}
