/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MODEL;

/**
 *
 * @author C4
 */
public class StatusMODEL {
    private int cod_status;
    private String nome_status;
    private boolean libera_status;

    /**
     * @return the cod_status
     */
    public int getCod_status() {
        return cod_status;
    }

    /**
     * @param cod_status the cod_status to set
     */
    public void setCod_status(int cod_status) {
        this.cod_status = cod_status;
    }

    /**
     * @return the nome_status
     */
    public String getNome_status() {
        return nome_status;
    }

    /**
     * @param nome_status the nome_status to set
     */
    public void setNome_status(String nome_status) {
        this.nome_status = nome_status;
    }

    /**
     * @return the libera_status
     */
    public boolean isLibera_status() {
        return libera_status;
    }

    /**
     * @param libera_status the libera_status to set
     */
    public void setLibera_status(boolean libera_status) {
        this.libera_status = libera_status;
    }
}
