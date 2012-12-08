/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package br.com.siscom.bean;

import java.beans.PropertyChangeListener;
import java.beans.PropertyChangeSupport;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Transient;

/**
 *
 * @author Kaio
 */
@Entity
@Table(name = "venda_cab",schema = "")
@NamedQueries({@NamedQuery(name = "VendaCab.findByCodVendaCab", query = "SELECT v FROM VendaCab v WHERE v.codVendaCab = :codVendaCab"), @NamedQuery(name = "VendaCab.findByCodCliente", query = "SELECT v FROM VendaCab v WHERE v.codCliente = :codCliente"), @NamedQuery(name = "VendaCab.findByCodCartao", query = "SELECT v FROM VendaCab v WHERE v.codCartao = :codCartao"), @NamedQuery(name = "VendaCab.findByCodFuncionario", query = "SELECT v FROM VendaCab v WHERE v.codFuncionario = :codFuncionario"), @NamedQuery(name = "VendaCab.findByCodTipoPgto", query = "SELECT v FROM VendaCab v WHERE v.codTipoPgto = :codTipoPgto"), @NamedQuery(name = "VendaCab.findByCodCfop", query = "SELECT v FROM VendaCab v WHERE v.codCfop = :codCfop"), @NamedQuery(name = "VendaCab.findByDataVendaCab", query = "SELECT v FROM VendaCab v WHERE v.dataVendaCab = :dataVendaCab"), @NamedQuery(name = "VendaCab.findByVlrVendaCab", query = "SELECT v FROM VendaCab v WHERE v.vlrVendaCab = :vlrVendaCab"), @NamedQuery(name = "VendaCab.findByDescontoVendaCab", query = "SELECT v FROM VendaCab v WHERE v.descontoVendaCab = :descontoVendaCab"), @NamedQuery(name = "VendaCab.findByTotalVendaCab", query = "SELECT v FROM VendaCab v WHERE v.totalVendaCab = :totalVendaCab"), @NamedQuery(name = "VendaCab.findByNumParcelasVendaCab", query = "SELECT v FROM VendaCab v WHERE v.numParcelasVendaCab = :numParcelasVendaCab"), @NamedQuery(name = "VendaCab.findByPriVencVendaCab", query = "SELECT v FROM VendaCab v WHERE v.priVencVendaCab = :priVencVendaCab"), @NamedQuery(name = "VendaCab.findByNumNfVendaCab", query = "SELECT v FROM VendaCab v WHERE v.numNfVendaCab = :numNfVendaCab")})
public class VendaCab implements Serializable {
    @Transient
    private PropertyChangeSupport changeSupport = new PropertyChangeSupport(this);
    private static final long serialVersionUID = 1L;
    @Id @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Column(name = "COD_VENDA_CAB", nullable = false)
    private Integer codVendaCab;
    @Column(name = "COD_CLIENTE")
    private Integer codCliente;
    @Column(name = "COD_CARTAO")
    private Integer codCartao;
    @Column(name = "COD_FUNCIONARIO")
    private Integer codFuncionario;
    @Column(name = "COD_TIPO_PGTO")
    private Integer codTipoPgto;
    @Column(name = "COD_CFOP")
    private Integer codCfop;
    @Column(name = "DATA_VENDA_CAB")
    @Temporal(TemporalType.DATE)
    private Date dataVendaCab;
    @Column(name = "VLR_VENDA_CAB")
    private Double vlrVendaCab;
    @Column(name = "DESCONTO_VENDA_CAB")
    private Double descontoVendaCab;
    @Column(name = "TOTAL_VENDA_CAB")
    private Double totalVendaCab;
    @Column(name = "NUM_PARCELAS_VENDA_CAB")
    private Integer numParcelasVendaCab;
    @Column(name = "PRI_VENC_VENDA_CAB")
    @Temporal(TemporalType.DATE)
    private Date priVencVendaCab;
    @Column(name = "NUM_NF_VENDA_CAB")
    private Integer numNfVendaCab;
    @OneToMany(cascade = CascadeType.ALL, mappedBy = "vendaCab")
    private Collection<VendaDet> vendaDetCollection;

    public VendaCab() {
    }

    public VendaCab(Integer codVendaCab) {
        this.codVendaCab = codVendaCab;
    }

    public Integer getCodVendaCab() {
        return codVendaCab;
    }

    public void setCodVendaCab(Integer codVendaCab) {
        Integer oldCodVendaCab = this.codVendaCab;
        this.codVendaCab = codVendaCab;
        changeSupport.firePropertyChange("codVendaCab", oldCodVendaCab, codVendaCab);
    }

    public Integer getCodCliente() {
        return codCliente;
    }

    public void setCodCliente(Integer codCliente) {
        Integer oldCodCliente = this.codCliente;
        this.codCliente = codCliente;
        changeSupport.firePropertyChange("codCliente", oldCodCliente, codCliente);
    }

    public Integer getCodCartao() {
        return codCartao;
    }

    public void setCodCartao(Integer codCartao) {
        Integer oldCodCartao = this.codCartao;
        this.codCartao = codCartao;
        changeSupport.firePropertyChange("codCartao", oldCodCartao, codCartao);
    }

    public Integer getCodFuncionario() {
        return codFuncionario;
    }

    public void setCodFuncionario(Integer codFuncionario) {
        Integer oldCodFuncionario = this.codFuncionario;
        this.codFuncionario = codFuncionario;
        changeSupport.firePropertyChange("codFuncionario", oldCodFuncionario, codFuncionario);
    }

    public Integer getCodTipoPgto() {
        return codTipoPgto;
    }

    public void setCodTipoPgto(Integer codTipoPgto) {
        Integer oldCodTipoPgto = this.codTipoPgto;
        this.codTipoPgto = codTipoPgto;
        changeSupport.firePropertyChange("codTipoPgto", oldCodTipoPgto, codTipoPgto);
    }

    public Integer getCodCfop() {
        return codCfop;
    }

    public void setCodCfop(Integer codCfop) {
        Integer oldCodCfop = this.codCfop;
        this.codCfop = codCfop;
        changeSupport.firePropertyChange("codCfop", oldCodCfop, codCfop);
    }

    public Date getDataVendaCab() {
        return dataVendaCab;
    }

    public void setDataVendaCab(Date dataVendaCab) {
        Date oldDataVendaCab = this.dataVendaCab;
        this.dataVendaCab = dataVendaCab;
        changeSupport.firePropertyChange("dataVendaCab", oldDataVendaCab, dataVendaCab);
    }

    public Double getVlrVendaCab() {
        return vlrVendaCab;
    }

    public void setVlrVendaCab(Double vlrVendaCab) {
        Double oldVlrVendaCab = this.vlrVendaCab;
        this.vlrVendaCab = vlrVendaCab;
        changeSupport.firePropertyChange("vlrVendaCab", oldVlrVendaCab, vlrVendaCab);
    }

    public Double getDescontoVendaCab() {
        return descontoVendaCab;
    }

    public void setDescontoVendaCab(Double descontoVendaCab) {
        Double oldDescontoVendaCab = this.descontoVendaCab;
        this.descontoVendaCab = descontoVendaCab;
        changeSupport.firePropertyChange("descontoVendaCab", oldDescontoVendaCab, descontoVendaCab);
    }

    public Double getTotalVendaCab() {
        return totalVendaCab;
    }

    public void setTotalVendaCab(Double totalVendaCab) {
        Double oldTotalVendaCab = this.totalVendaCab;
        this.totalVendaCab = totalVendaCab;
        changeSupport.firePropertyChange("totalVendaCab", oldTotalVendaCab, totalVendaCab);
    }

    public Integer getNumParcelasVendaCab() {
        return numParcelasVendaCab;
    }

    public void setNumParcelasVendaCab(Integer numParcelasVendaCab) {
        Integer oldNumParcelasVendaCab = this.numParcelasVendaCab;
        this.numParcelasVendaCab = numParcelasVendaCab;
        changeSupport.firePropertyChange("numParcelasVendaCab", oldNumParcelasVendaCab, numParcelasVendaCab);
    }

    public Date getPriVencVendaCab() {
        return priVencVendaCab;
    }

    public void setPriVencVendaCab(Date priVencVendaCab) {
        Date oldPriVencVendaCab = this.priVencVendaCab;
        this.priVencVendaCab = priVencVendaCab;
        changeSupport.firePropertyChange("priVencVendaCab", oldPriVencVendaCab, priVencVendaCab);
    }

    public Integer getNumNfVendaCab() {
        return numNfVendaCab;
    }

    public void setNumNfVendaCab(Integer numNfVendaCab) {
        Integer oldNumNfVendaCab = this.numNfVendaCab;
        this.numNfVendaCab = numNfVendaCab;
        changeSupport.firePropertyChange("numNfVendaCab", oldNumNfVendaCab, numNfVendaCab);
    }

    public Collection<VendaDet> getVendaDetCollection() {
        return vendaDetCollection;
    }

    public void setVendaDetCollection(Collection<VendaDet> vendaDetCollection) {
        this.vendaDetCollection = vendaDetCollection;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (codVendaCab != null ? codVendaCab.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        // TODO: Warning - this method won't work in the case the id fields are not set
        if (!(object instanceof VendaCab)) {
            return false;
        }
        VendaCab other = (VendaCab) object;
        if ((this.codVendaCab == null && other.codVendaCab != null) || (this.codVendaCab != null && !this.codVendaCab.equals(other.codVendaCab))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "br.com.siscom.bean.VendaCab[codVendaCab=" + codVendaCab + "]";
    }

    public void addPropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.addPropertyChangeListener(listener);
    }

    public void removePropertyChangeListener(PropertyChangeListener listener) {
        changeSupport.removePropertyChangeListener(listener);
    }

}
