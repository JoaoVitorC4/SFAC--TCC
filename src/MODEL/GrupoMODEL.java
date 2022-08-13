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
public class GrupoMODEL {
    private int cod_grupo;
    private String nome_grupo;

    /**
     * @return the nome_grupo
     */
    public String getNome_grupo() {
        return nome_grupo;
    }

    /**
     * @param nome_grupo the nome_grupo to set
     */
    public void setNome_grupo(String nome_grupo) {
        this.nome_grupo = nome_grupo;
    }

    /**
     * @return the cod_grupo
     */
    public int getCod_grupo() {
        return cod_grupo;
    }

    /**
     * @param cod_grupo the cod_grupo to set
     */
    public void setCod_grupo(int cod_grupo) {
        this.cod_grupo = cod_grupo;
    }
}
