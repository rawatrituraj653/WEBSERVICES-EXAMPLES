package com.bse.stockendpoint.impl.consumer;

import com.bse.stockendpoint.impl.IStockExchange;
import com.bse.stockendpoint.impl.StockExchangeImplService;

public class StockConsumer {

	public static void main(String[] args) {
		
		StockExchangeImplService service=new StockExchangeImplService();
		IStockExchange exchange=service.getPort(IStockExchange.class);
		
		System.out.println("Request sedning..........");
		Double prices= exchange.findStockPrice("INFOSYS");
		System.out.println("Stock Prices:  "+prices);
		
		
	}
}
