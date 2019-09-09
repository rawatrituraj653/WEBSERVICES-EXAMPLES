package com.nit.beans;

import java.io.FileReader;

import javax.xml.stream.XMLInputFactory;
import javax.xml.stream.XMLStreamReader;

public class StaxParserEx {
	
	public static void main(String[] args) throws Exception{
		boolean id=false;
		boolean name=false;
		boolean aname=false;
		boolean aemail=false;		
		XMLInputFactory factory=XMLInputFactory.newInstance();
		XMLStreamReader reader=factory.createXMLStreamReader(new FileReader("Book.xml"));
		
		while(reader.hasNext()) {
			int it=reader.next();
			if(reader.isStartElement()) {
				String qname=reader.getLocalName();
				if(qname.equals("book")) {
					System.out.println("Start Element: "+qname);
					String type=reader.getAttributeValue(0);
					System.out.println("Book Type is:"+type);
				}
				else if(qname.equals("id")) {
					id=true;
				}
				else if(qname.equals("name")) {
					name=true;
				}
				else if(qname.equals("author")) {
					String gender=reader.getAttributeValue(0);
					String company=reader.getAttributeValue(1);
					System.out.println("Author start :"+qname);
					System.out.println("Author Company: "+company);
					System.out.println("Author Gender: "+gender);
				}
				else if(qname.equals("aname")) {
					aname=true;
				}
				else if(qname.equals("aemail")) {
					aemail=true;
				}
				
			}
			else if(reader.isCharacters()) {
				String text=reader.getText();
				if(id) {
					System.out.println("Book Id : "+text);
					id=false;
				}
				else if(name) {
					System.out.println("Book Name: "+text);
					name=false;
				}
				else if(aname) {
					System.out.println("Book Author Name:"+text);
					aname=false;
				}
				else if(aemail) {
					System.out.println("Book Author Email:"+text);
					aemail=false;
				}				
			}
			else if(reader.isEndElement()) {
				if(reader.getLocalName().equals("book"))	{
				System.out.println("Book End Element: "+reader.getLocalName());
				}
				else if(reader.getLocalName().equals("author")) {
				System.out.println("Author End Element: "+reader.getLocalName());	
				}
			}	
		}	
	}
}
