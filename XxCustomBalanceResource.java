package br.com.ya.webservice;

import br.com.ya.XxCustomBalance;
import br.com.ya.XxCustomBalanceServiceLocal;

import java.util.List;

import javax.ejb.EJB;
import javax.ejb.Stateless;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;

@Stateless
@Path("webservice")
@Consumes("application/json")
@Produces("application/json") 

public class XxCustomBalanceResource {
    @EJB
    XxCustomBalanceServiceLocal xxcustombalanceService;

    public XxCustomBalanceResource() {
        super();
    }   

    @GET
    @Produces("application/json")
    @Path("/")
    public List<XxCustomBalance> findAll() {
       return xxcustombalanceService.getXxCustomBalance();
    }
}
