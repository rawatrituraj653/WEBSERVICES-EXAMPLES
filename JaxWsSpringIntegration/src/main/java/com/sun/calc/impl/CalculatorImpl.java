package com.sun.calc.impl;

import javax.jws.WebMethod;
import javax.jws.WebService;

import com.sun.calc.ICalculator;
import com.sun.calc.impl.service.CalcService;

@WebService(endpointInterface = "com.sun.calc.ICalculator")
public class CalculatorImpl implements ICalculator{

	private CalcService service;
	
	public CalculatorImpl() {
		System.out.println("CalculatorImpl:: executed");
	}
	
	@WebMethod(exclude = true)
	public void setService(CalcService service) {
		this.service = service;
	}



	@Override
	@WebMethod(operationName = "getSum")
	public Integer sum(Integer num1, Integer num2) {
		return service.sum(num1, num2);
	}
	
}
