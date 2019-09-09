package com.bse.stockendpoint.impl;

import javax.jws.WebService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.bse.stockendpoint.IStockExchange;
import com.bse.stockendpoint.service.StockService;

@WebService(endpointInterface = "com.bse.stockendpoint.IStockExchange")
@Component
public class StockExchangeImpl implements IStockExchange{

	
	@Autowired
	private StockService service;
	
	
	public StockExchangeImpl() {
	
		System.out.println("StockExchangeImpl::: Executed");
	}
	
	
	@Override
	public Double findStockPrice(String companyName) {
		System.out.println(service);
		return service.getInfo(companyName);

	}
}
