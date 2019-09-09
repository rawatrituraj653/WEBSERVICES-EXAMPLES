package com.travel.binding.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;


import com.travel.binding.TravelAgency;

public class TravelUnMarshaller {

	public static void main(String[] args) throws Exception {
		
		SchemaFactory factory= SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		Schema schema=factory.newSchema(new File("Travel.xsd"));
		
		JAXBContext ctx=JAXBContext.newInstance("com.travel.binding");
		Unmarshaller unmarshaller=ctx.createUnmarshaller();
		unmarshaller.setSchema(schema);
		Object obj= unmarshaller.unmarshal(new File("Travel.xml"));
		
		if(obj instanceof TravelAgency) {
			System.out.println("Scucess");
			TravelAgency agency=(TravelAgency) obj;
			System.out.println(agency);
		}else {
		
			System.out.println(obj);
		}
	
	}
	
}
