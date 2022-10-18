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
public class PacoteMODEL {
    private int cod_pacote;
    private int pessoa_pacote;
    private int plano_pacote;
    private int grupo_pacote;
    private Date vencimento_pacote; 
    private int identificacao_pacote;

    /**
     * @return the cod_pacote
     */
    public int getCod_pacote() {
        return cod_pacote;
    }

    /**
     * @param cod_pacote the cod_pacote to set
     */
    public void setCod_pacote(int cod_pacote) {
        this.cod_pacote = cod_pacote;
    }

    /**
     * @return the pessoa_pacote
     */
    public int getPessoa_pacote() {
        return pessoa_pacote;
    }

    /**
     * @param pessoa_pacote the pessoa_pacote to set
     */
    public void setPessoa_pacote(int pessoa_pacote) {
        this.pessoa_pacote = pessoa_pacote;
    }

    /**
     * @return the plano_pacote
     */
    public int getPlano_pacote() {
        return plano_pacote;
    }

    /**
     * @param plano_pacote the plano_pacote to set
     */
    public void setPlano_pacote(int plano_pacote) {
        this.plano_pacote = plano_pacote;
    }

    /**
     * @return the grupo_pacote
     */
    public int getGrupo_pacote() {
        return grupo_pacote;
    }

    /**
     * @param grupo_pacote the grupo_pacote to set
     */
    public void setGrupo_pacote(int grupo_pacote) {
        this.grupo_pacote = grupo_pacote;
    }

    /**
     * @return the vencimento_pacote
     */
    public Date getVencimento_pacote() {
        return vencimento_pacote;
    }

    /**
     * @param vencimento_pacote the vencimento_pacote to set
     */
    public void setVencimento_pacote(Date vencimento_pacote) {
        this.vencimento_pacote = vencimento_pacote;
    }

    /**
     * @return the identificacao_pacote
     */
    public int getIdentificacao_pacote() {
        return identificacao_pacote;
    }

    /**
     * @param identificacao_pacote the identificacao_pacote to set
     */
    public void setIdentificacao_pacote(int identificacao_pacote) {
        this.identificacao_pacote = identificacao_pacote;
    }
}
