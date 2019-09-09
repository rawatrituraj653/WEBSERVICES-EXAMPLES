package com.bse.stockendpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface IStockExchange {
	
	@WebMethod
	public  @WebResult Double findStockPrice(@WebParam String companyName);

}
