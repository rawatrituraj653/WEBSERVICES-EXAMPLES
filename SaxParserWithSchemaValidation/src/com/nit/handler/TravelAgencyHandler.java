package com.nit.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.ext.DefaultHandler2;

import com.nit.model.InternationalFlight;

public class TravelAgencyHandler extends DefaultHandler2{
	private boolean flightId;
	private boolean pilotName;
	private boolean to;
	private boolean from;
	private boolean agentId;

	private InternationalFlight flight;
	
	@Override
	public void startDocument() throws SAXException {
	System.out.println("******Document Started*********");
	}
	
	@Override
	public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
	if("international-flight".equals(qName)) {
		flight=new InternationalFlight();
	}
	else if("flight-id".equals(qName) ) {
		flightId=true;
	}
	else if("pilot-name".equals(qName) ) {
		pilotName=true;
	}
	else if("to".equals(qName)) {
		to=true;
	}
	else if("from".equals(qName)) {
		from=true;
	}
	else if("agent-id".equals(qName)) {
		agentId=true;
	}	
		
	}
	@Override
	public void characters(char[] ch, int start, int length) throws SAXException {
		if(flightId) {
			flight.setFlightId(new String(ch,start,length));
			flightId=false;
		}
		else if(pilotName) {
			flight.setPilotName(new String(ch, start, length));
			pilotName=false;
	}
		else if(from) {
			flight.setFrom(new String(ch,start,length));
			from=false;
		}	
		else if(to) {
			flight.setTo(new String(ch,start,length));
			to=false;
		}	
		else if(agentId) {
			flight.setAgentId(Integer.parseInt(new String(ch,start,length)));
			agentId=false;
		}
	}
	@Override
	public void endElement(String uri, String localName, String qName) throws SAXException {
	}
	
	@Override
	public void endDocument() throws SAXException {
		System.out.println(flight);
		System.out.println("********End Document***************");
	}
}
