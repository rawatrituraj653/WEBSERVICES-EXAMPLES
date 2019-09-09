package com.nit.test;

import java.io.File;

import javax.xml.XMLConstants;
import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import javax.xml.transform.stream.StreamSource;
import javax.xml.validation.Schema;
import javax.xml.validation.SchemaFactory;
import javax.xml.validation.Validator;

import com.nit.handler.POHandler;

public class MyApp {

	public static void main(String[] args) {
		MyApp app=new MyApp();
		if(app.doValidate()) {
		try {
		SAXParserFactory saxParserFactory=SAXParserFactory.newInstance();
		SAXParser parser=saxParserFactory.newSAXParser();
		parser.parse(new File("PO.xml"),new POHandler());
		}
		catch (Exception e) {
			System.out.println("exception found :\n"+e);
		}
	}
		else {
			System.out.println("XML Is not Valid as per XSD");
		}	
	}
	public boolean doValidate() {
		boolean isValid=true;
		try {
		SchemaFactory factory=SchemaFactory.newInstance(XMLConstants.W3C_XML_SCHEMA_NS_URI);
		
		Schema schema =factory.newSchema(new StreamSource(new File("PO.xsd")));
		Validator validator =schema.newValidator();
			
			validator.validate(new StreamSource(new File("PO.xml")));
		}catch (Exception e) {
			System.out.println(e);
			isValid=false;
		}
		return isValid;
	}

}
