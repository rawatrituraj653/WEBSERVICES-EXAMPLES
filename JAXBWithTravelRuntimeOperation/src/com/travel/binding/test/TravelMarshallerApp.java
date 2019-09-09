package com.travel.binding.test;


import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;

import com.travel.binding.DomesticFlightType;
import com.travel.binding.InternationalFlightType;
import com.travel.binding.TravelAgency;

public class TravelMarshallerApp {

	public static void main(String[] args) throws Exception {
		
		DomesticFlightType domesticFlightType=new DomesticFlightType();
		domesticFlightType.setFlightId("AIR2312RE");
		domesticFlightType.setPilotName("James Root");
		domesticFlightType.setFrom("Indore");
		domesticFlightType.setTo("Hyderabad");
		
		System.out.println(domesticFlightType);
		InternationalFlightType flightType=new InternationalFlightType();
		flightType.setFlightId("QAT12ERW");
		flightType.setPilotName("SMith Clark");
		flightType.setFrom("London");
		flightType.setTo("New Delhi");
		flightType.setAgentId("SPR1232EW");

		System.out.println(flightType);

	
		TravelAgency agency=new TravelAgency();
		agency.getDomesticFlight().add(domesticFlightType);
		agency.getInternationalFlight().add(flightType);
		System.out.println(agency);
		
		JAXBContext ctx=JAXBContext.newInstance("com.travel.binding");
		Marshaller marshaller=ctx.createMarshaller();
		marshaller.marshal(agency,new File("Tavel.xml"));
	
		System.out.println("Programme Ends Sucessfully");
		
	}
}
