package com.nit.calc.impl;


public class ClientApp {

	public static void main(String[] args) {
		
		CalculatorImplService calService=new CalculatorImplService();
		Calc calc= calService.getPort(Calc.class);
		Integer app=calc.additon(101, 200);
		System.out.println(app);
	
	}
}
