package com.sun.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService
public interface ICalculator {

	@WebMethod
	public  @WebResult Integer  sum(@WebParam Integer num1,@WebParam Integer num2);
	
}
