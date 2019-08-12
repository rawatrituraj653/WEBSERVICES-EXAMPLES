package com.nit.calc;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

@WebService(name = "Calc")
public interface ICalculator {
	
	@WebMethod
	public @WebResult Integer additon( @WebParam Integer num1, @WebParam Integer num2);
	
	@WebMethod
	public @WebResult Integer substract( @WebParam Integer num1, @WebParam Integer num2);

	@WebMethod
	public @WebResult Integer multiple( @WebParam Integer num1, @WebParam Integer num2);
	
	@WebMethod
	public @WebResult Integer division( @WebParam Integer num1, @WebParam Integer num2);
	
	@WebMethod
	public @WebResult Integer remaider( @WebParam Integer num1, @WebParam Integer num2);
}
