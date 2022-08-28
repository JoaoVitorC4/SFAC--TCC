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
public class CidadeMODEL {
    
    private int cod_cidade;
    private String nome_cidade;
    private int cidade_uf;

    /**
     * @return the cod_cidade
     */
    public int getCod_cidade() {
        return cod_cidade;
    }

    /**
     * @param cod_cidade the cod_cidade to set
     */
    public void setCod_cidade(int cod_cidade) {
        this.cod_cidade = cod_cidade;
    }

    /**
     * @return the nome_cidade
     */
    public String getNome_cidade() {
        return nome_cidade;
    }

    /**
     * @param nome_cidade the nome_cidade to set
     */
    public void setNome_cidade(String nome_cidade) {
        this.nome_cidade = nome_cidade;
    }

    /**
     * @return the cidade_uf
     */
    public int getCidade_uf() {
        return cidade_uf;
    }

    /**
     * @param cidade_uf the cidade_uf to set
     */
    public void setCidade_uf(int cidade_uf) {
        this.cidade_uf = cidade_uf;
    }
}
