package com.irctc.endpoint;

import javax.jws.WebService;

@WebService(endpointInterface = "com.irctc.endpoint.ERailService")
public class ERailImpl implements ERailService {

	@Override
	public TicketInfo bookTrainTicket(PassengerInfo pe, JourneyInfo jo) {

			TicketInfo info=new TicketInfo();
			info.setTrainNumber(jo.getTrainNum());
			info.setTrainName(jo.getTrainName());
			info.setFrom(jo.getFrom());
			info.setTo(jo.getTo());
			info.setStatus("Waiting");
			info.setTicketFare(565.34);
			info.setPassengerAge(info.getPassengerAge());
			info.setPassengerName(pe.getPassengerName());
			info.setPanNumber(pe.getPanNumber());
			info.setAdharNumber(pe.getAdharNumber());
		return info;
	}

}
