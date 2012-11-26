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
public class ReqDetPK implements Serializable {
    @Column(name = "COD_PRODUTO", nullable = false)
    private String codProduto;
    @Column(name = "COD_REQ_CAB", nullable = false)
    private int codReqCab;

    public ReqDetPK() {
    }

    public ReqDetPK(String codProduto, int codReqCab) {
        this.codProduto = codProduto;
        this.codReqCab = codReqCab;
    }

    public String getCodProduto() {
        return codProduto;
    }

    public void setCodProduto(String codProduto) {
        this.codProduto = codProduto;
    }

    public int getCodReqCab() {
        return codReqCab;
    }

    public void setCodReqCab(int codReqCab) {
        this.codReqCab = codReqCab;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        hash += (int) codReqCab;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof ReqDetPK)) {
            return false;
        }
        ReqDetPK other = (ReqDetPK) object;
        if ((this.codProduto == null && other.codProduto != null) || (this.codProduto != null && !this.codProduto.equals(other.codProduto))) {
            return false;
        }
        if (this.codReqCab != other.codReqCab) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.bean.compras.ReqDetPK[codProduto=" + codProduto + ", codReqCab=" + codReqCab + "]";
    }

}
