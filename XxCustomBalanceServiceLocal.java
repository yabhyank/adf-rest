package br.com.ya;

import java.util.List;

import javax.ejb.Local;

@Local
public interface XxCustomBalanceServiceLocal {
    XxCustomBalance persistXxCustomBalance(XxCustomBalance xxcustombalance) ;
    
    List<XxCustomBalance> getXxCustomBalance();

    XxCustomBalance getXxCustomBalance(String custName);
}
