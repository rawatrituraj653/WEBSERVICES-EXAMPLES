package com.irctc.endpoint.impl;

import javax.jws.WebService;

import com.irctc.endpoint.ERail;
import com.irctc.request.binding.JourneyInfo;
import com.irctc.request.binding.PassengerInfo;
import com.irctc.response.binding.TicketInfo;

@WebService(endpointInterface = "com.irctc.endpoint.ERail")
public class ERailImpl implements ERail{

	public ERailImpl() {
		System.out.println("ERailImpl:: executed");
	}
	
	@Override
	public TicketInfo bookTrainTicket(PassengerInfo pInfo, JourneyInfo jInfo) {	
		
		
		System.out.println("BookTrainTicket:: executed");
		
		TicketInfo tInfo=new  TicketInfo();
		tInfo.setTrainNo(jInfo.getTrainNum());
		tInfo.setTrainName(jInfo.getTrainName());
		tInfo.setName(pInfo.getName());
		tInfo.setAge(pInfo.getAge());
		tInfo.setPanNum(pInfo.getPanNum());
		tInfo.setAdharNum(pInfo.getAdharNum());
		tInfo.setFrom(jInfo.getFrom());
		tInfo.setTo(jInfo.getTo());
		tInfo.setTicketFare(1265.00);
		tInfo.setStatus("waitng RWF/10");
		
		return tInfo;
	}
}
