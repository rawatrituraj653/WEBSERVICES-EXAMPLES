package com.nit.handler;

import org.xml.sax.Attributes;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

public class BookHandler extends DefaultHandler{

private boolean id;
private boolean name;
private boolean price;
	
		@Override
		public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
		if("book".equals(qName)) {
			System.out.println("Book Type  is: "+attributes.getValue("type"));
			System.out.println("Book Author  is: "+attributes.getValue("author"));
		}
			else if("id".equals(qName)) {
				id=true;
			}
			else if("name".equals(qName)){
				name=true;
			}
			else if("price".equals(qName))
				price=true;
		}
		@Override
		public void characters(char[] ch, int start, int length) throws SAXException {
		if(id) {
			System.out.println("Book Id  is: "+new String(ch,start,length));	
			id=false;
		}
		else if(name){
				System.out.println("Book Name is: "+new String(ch,start,length));
				name=false;
		}
		else if(price) {
			System.out.println("Book price is: "+Double.parseDouble(new String (ch,start,length)));
			price=false;
		}
		
		}			
}