package br.com.ya;

import java.util.List;
import javax.annotation.Resource;

import javax.ejb.SessionContext;
import javax.ejb.Stateless;

import javax.ejb.TransactionAttribute;

import javax.ejb.TransactionAttributeType;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;

@Stateless(name = "XxCustomBalanceService", mappedName = "CustomRESTApp-Model-XxCustomBalanceService")
public class XxCustomBalanceServiceBean implements XxCustomBalanceService, XxCustomBalanceServiceLocal {
    @Resource
    SessionContext sessionContext;
    @PersistenceContext(unitName = "Model")
    private EntityManager em;

    public XxCustomBalanceServiceBean() {
    }
    public XxCustomBalance persistXxCustomBalance(XxCustomBalance xxcustombalance) {
          em.persist(xxcustombalance);
          return xxcustombalance;
     }
               
        @TransactionAttribute(TransactionAttributeType.NOT_SUPPORTED)
        public List getXxCustomBalance() {
          return em.createNamedQuery("XxCustomBalance.findAll", XxCustomBalance.class).getResultList();
        }
        
    public XxCustomBalance getXxCustomBalance(String custName) {
        if (custName != null) {
            return em.find(XxCustomBalance.class, custName);
        }
        return null;
    }        

}
