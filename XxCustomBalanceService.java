package br.com.ya;

import java.util.List;
import javax.ejb.Remote;

@Remote
public interface XxCustomBalanceService {
    XxCustomBalance persistXxCustomBalance(XxCustomBalance xxcustombalance) ;
    
    List<XxCustomBalance> getXxCustomBalance();

    XxCustomBalance getXxCustomBalance(String custName);

}
