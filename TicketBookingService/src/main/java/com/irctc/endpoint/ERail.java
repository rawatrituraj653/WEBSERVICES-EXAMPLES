package com.irctc.endpoint;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;

import com.irctc.request.binding.JourneyInfo;
import com.irctc.request.binding.PassengerInfo;
import com.irctc.response.binding.TicketInfo;

@WebService(name="eRailService")
public interface ERail {
	
	@WebMethod(operationName="bookTrainTicket")
	public @WebResult(name ="ReturnTicketinfo") TicketInfo bookTrainTicket(@WebParam(name="PersonData") PassengerInfo  pInfo,@WebParam(name="journeyData")JourneyInfo jInfo);
}
