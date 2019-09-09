package com.bse.stockendpoint.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bse.stockendpoint.service.StockService;

@Controller
public class AppController {

	@Autowired
	private StockService service;
	
	@RequestMapping("/getdata")
	public String getMsg(Model model ) {
		
		model.addAttribute("msg", service.getInfo("TCS"));
		return "input";
	}
}
