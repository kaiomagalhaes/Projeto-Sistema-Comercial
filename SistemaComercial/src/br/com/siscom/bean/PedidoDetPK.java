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
public class PedidoDetPK implements Serializable {
    @Column(name = "COD_PEDIDO_CAB", nullable = false)
    private int codPedidoCab;
    @Column(name = "COD_COT_CAB", nullable = false)
    private int codCotCab;
    @Column(name = "COD_PRODUTO", nullable = false)
    private String codProduto;
    @Column(name = "COD_REQ_CAB", nullable = false)
    private int codReqCab;

    public PedidoDetPK() {
    }

    public PedidoDetPK(int codPedidoCab, int codCotCab, String codProduto, int codReqCab) {
        this.codPedidoCab = codPedidoCab;
        this.codCotCab = codCotCab;
        this.codProduto = codProduto;
        this.codReqCab = codReqCab;
    }

    public int getCodPedidoCab() {
        return codPedidoCab;
    }

    public void setCodPedidoCab(int codPedidoCab) {
        this.codPedidoCab = codPedidoCab;
    }

    public int getCodCotCab() {
        return codCotCab;
    }

    public void setCodCotCab(int codCotCab) {
        this.codCotCab = codCotCab;
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
        hash += (int) codPedidoCab;
        hash += (int) codCotCab;
        hash += (codProduto != null ? codProduto.hashCode() : 0);
        hash += (int) codReqCab;
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof PedidoDetPK)) {
            return false;
        }
        PedidoDetPK other = (PedidoDetPK) object;
        if (this.codPedidoCab != other.codPedidoCab) {
            return false;
        }
        if (this.codCotCab != other.codCotCab) {
            return false;
        }
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
        return "br.com.siscom.bean.compras.PedidoDetPK[codPedidoCab=" + codPedidoCab + ", codCotCab=" + codCotCab + ", codProduto=" + codProduto + ", codReqCab=" + codReqCab + "]";
    }

}
