package com.nit.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import com.nit.handler.TravelAgencyHandler;

public class MyApp {

	public static void main(String[] args) {
		boolean isValid=doValidate();
		try {
		if(isValid) {
			SAXParserFactory factory=SAXParserFactory.newInstance();
			SAXParser parser= factory.newSAXParser();
			parser.parse(new File("travel-agency.xml"), new TravelAgencyHandler());
		}
		}catch (Exception e) {
			System.err.println("problem in parser Creation\n"+e);
		}
	}

	public  static boolean doValidate() {
		boolean isValid=true;
		try {
			SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
			
			Schema schema=factory.newSchema(new File("travel-agency.xsd"));
				
			Validator validator=schema.newValidator();
		
			validator.validate(new StreamSource(new File("travel-agency.xml")));
		} catch (Exception e) {
			isValid=false;
		System.err.println(e);
		}
		return isValid;
	}
}

