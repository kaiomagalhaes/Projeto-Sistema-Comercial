/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.siscom.bean;

import java.io.Serializable;
import javax.persistence.Column;
import javax.persistence.Embeddable;

/**
 *
 * @author Kaio
 */
@Embeddable
public class NfeDetPK implements Serializable {
    @Column(name = "COD_PRODUTO", nullable = false)
    private String codProduto;
    @Column(name = "NUMERO_NFE_CAB", nullable = false)
    private int numeroNfeCab;

    public NfeDetPK() {
    }

    public NfeDetPK(String codProduto, int numeroNfeCab) {
        this.codProduto = codProduto;
        this.numeroNfeCab = numeroNfeCab;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getNumeroNfeCab() {
        return numeroNfeCab;
    }

    public void setNumeroNfeCab(int numeroNfeCab) {
        this.numeroNfeCab = numeroNfeCab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        hash += (int) numeroNfeCab;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof NfeDetPK)) {
            return false;
        }
        NfeDetPK other = (NfeDetPK) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        if (this.numeroNfeCab != other.numeroNfeCab) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.bean.estoque.NfeDetPK[codProduto=" + codProduto + ", numeroNfeCab=" + numeroNfeCab + "]";
    }

}
