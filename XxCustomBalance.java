package br.com.ya;

import java.io.Serializable;

import java.math.BigDecimal;
import java.util.List;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;

import javax.persistence.JoinColumn;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlTransient;

@Entity
@NamedQueries({ @NamedQuery(name = "XxCustomBalance.findAll", query = "select o from XxCustomBalance o") })
@XmlRootElement
@Table(name = "XX_CUSTOM_BALANCE")
public class XxCustomBalance implements Serializable {
    private static final long serialVersionUID = 6740851047020552864L;
    private BigDecimal balance;
    @Column(name = "CUST_NAME", length = 30)
    private String custName;
    @Column(name = "GROUP_ID")
    private BigDecimal groupId;
    @Id
    @Column(nullable = false)
    private BigDecimal id;

@XmlTransient
@ManyToOne
@JoinColumn(name = "GROUP_ID", insertable = false, updatable = false)
private XxCustomBalance xxcustombalance;
    
    @XmlTransient
    @OneToMany(mappedBy = "xxcustombalance", cascade = {CascadeType.PERSIST, CascadeType.MERGE} )
    private List<XxCustomBalance> xxcustombalanceList;
        
    public XxCustomBalance() {
    }

    public XxCustomBalance(BigDecimal balance, String custName, BigDecimal groupId, BigDecimal id) {
        this.balance = balance;
        this.custName = custName;
        this.groupId = groupId;
        this.id = id;
        this.xxcustombalance = xxcustombalance;
    }

    public BigDecimal getBalance() {
        return balance;
    }

    public void setBalance(BigDecimal balance) {
        this.balance = balance;
    }

    public String getCustName() {
        return custName;
    }

    public void setCustName(String custName) {
        this.custName = custName;
    }

    public BigDecimal getGroupId() {
        return groupId;
    } 

    public void setGroupId(BigDecimal groupId) {
        this.groupId = groupId;
    } 

    public BigDecimal getId() {
        return id;
    }

    public void setId(BigDecimal id) {
        this.id = id;
    }
    @XmlTransient
    public XxCustomBalance getXxCustomBalance() {
        return xxcustombalance;
    }
    
    public void setXxCustomBalance(XxCustomBalance xxcustombalance) {
        this.xxcustombalance = xxcustombalance;
    }
    
    @XmlTransient
    public List<XxCustomBalance> getXxCustomBalanceList() {
        return xxcustombalanceList;
    }
    
    public void setXxCustomBalanceList(List<XxCustomBalance> xxcustombalanceList) {
        this.xxcustombalanceList = xxcustombalanceList;
    }

}
