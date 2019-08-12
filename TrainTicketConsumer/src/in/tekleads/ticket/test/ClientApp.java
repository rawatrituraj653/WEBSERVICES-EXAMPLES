package in.tekleads.ticket.test;

import java.math.BigInteger;

import javax.xml.datatype.DatatypeConfigurationException;
import javax.xml.datatype.DatatypeFactory;
import javax.xml.datatype.XMLGregorianCalendar;

import com.irctc.endpoint.JourneyInfo;
import com.irctc.endpoint.PassengerInfo;
import com.irctc.endpoint.TicketInfo;
import com.irctc.endpoint.impl.ERailImplService;
import com.irctc.endpoint.impl.ERailService;


public class ClientApp {

	public static void main(String[] args) {
	
		XMLGregorianCalendar calendar=null;
		try {
		calendar=	DatatypeFactory.newInstance().newXMLGregorianCalendar(new BigInteger("2019"), 11, 23, 8, 33, 23, null, 0);
		} catch (DatatypeConfigurationException e) {

			e.printStackTrace();
		}
		JourneyInfo type=new JourneyInfo();
		type.setTrainNum(1234231l);
		type.setTrainName("TELANAGANA EXPRESS");
		type.setJourneyDate(calendar);
		type.setTo("Hyderabad");
		type.setFrom("Jhansi");
		
		PassengerInfo passengerInfoType=new PassengerInfo();
		passengerInfoType.setPassengerName("Rituraj");
		passengerInfoType.setPassengerAge(20);
		passengerInfoType.setAdharNumber("7634567894556");
		passengerInfoType.setPanNumber("cnbj123343j");
		
		
		
		ERailImplService eRailServiceImpl=new ERailImplService();
		ERailService eRailService=eRailServiceImpl.getPort(ERailService.class);
		TicketInfo	responseType =	eRailService.bookTrainTicket(passengerInfoType,type);
		
		System.out.println(responseType);
	}
}
