package com.nit.calc.impl;

import javax.jws.WebService;

import com.nit.calc.ICalculator;

@WebService(endpointInterface = "com.nit.calc.ICalculator")
public class CalculatorImpl  implements ICalculator{
		
	public CalculatorImpl() {
		System.out.println("Default Constructor"
				+"Thread :"+Thread.currentThread().getName()
				+",hascode:"+this.hashCode());
		
	}
	
	@Override
	public Integer additon(Integer num1, Integer num2) {
		System.out.println("=======Sum Method========");
		Integer sum=0;
		try {	
			sum=num1+num2;
			System.out.println("Sum Of Two Number :"+ sum);
			return sum;
		}catch (Exception e) {
			
		System.out.println("Exception occured:"+e.toString());
			return -1;
		}
	}
	
	@Override
	public Integer substract(Integer num1, Integer num2) {
		System.out.println("=======Sub. Method========");
		Integer sub=0;
		try {
		sub=num1-num2;
		System.out.println("Substraction is :"+sub);
		return sub;
		}
		catch (Exception e) {
			System.out.println("Exception Ocurred: "+ e.toString());
			return sub;
		} 
	}

	@Override
	public Integer multiple(Integer num1, Integer num2) {
		System.out.println("=======Mul. Method========");
		Integer mul=0;
		try {
		mul=num1*num2;
		System.out.println("Substraction is :"+mul);
		return mul;
		}
		catch (Exception e) {
			System.out.println("Exception Ocurred: "+ e.toString());
			return mul;
		} 
	}
	@Override
	public Integer division(Integer num1, Integer num2) {
		System.out.println("=======Div. Method========");
		Integer div=0;
		try {
		div=num1%num2;
		System.out.println("Substraction is :"+div);
		return div;
		}
		catch (Exception e) {
			System.out.println("Exception Ocurred: "+ e.toString());
			return div;
		} 
		
	}

	@Override
	public Integer remaider(Integer num1, Integer num2) {
		System.out.println("=======Rem. Method========");
		Integer rem=0;
		try {
		rem=num1%num2;
		System.out.println("Substraction is :"+rem);
		return rem;
		}
		catch (Exception e) {
			System.out.println("Exception Ocurred: "+ e.toString());
			return rem;
		} 
		
	}
	
}
