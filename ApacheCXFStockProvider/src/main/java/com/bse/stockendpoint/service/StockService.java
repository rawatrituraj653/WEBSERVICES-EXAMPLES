package com.bse.stockendpoint.service;

import org.springframework.stereotype.Service;

@Service
public class StockService {

	public Double getInfo(String companyName) {
		
		
		if(companyName.equals("TCS")) {
			return 465.50;
		}
		else if(companyName.equals("IBM")){
			return 459.70;
		}
		
		else {
			return 450.00;
		
		}
		
	}

	
}
