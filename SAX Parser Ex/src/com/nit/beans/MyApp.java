package com.nit.beans;

import java.io.File;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;

import com.nit.handler.BookHandler;


public class MyApp {
	
	public static void main(String[] args)  {
	
		try {
		SAXParserFactory factory =SAXParserFactory.newInstance();
		SAXParser parser= factory.newSAXParser();
		parser.parse(new File("Book.xml"), new BookHandler());
		}catch (Exception e) {
			System.err.println("Some Exception occured : "+e);
		}
	}
		
}

